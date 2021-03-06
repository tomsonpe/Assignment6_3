package com.assignmenttp.service.employees.video;

import android.content.Intent;
import android.test.AndroidTestCase;

import com.assignmenttp.config.util.App;
import com.assignmenttp.domain.address.Address;
import com.assignmenttp.domain.employees.videos.Video;
import com.assignmenttp.repository.employees.video.VideoRepository;
import com.assignmenttp.repository.employees.video.implem.VideoRepositoryImplem;
import com.assignmenttp.service.customer.employees.video.UpdateVideoTakerService;
import com.assignmenttp.service.customer.employees.video.implem.UpdateVideoTaker;

import junit.framework.Assert;

/**
 * Created by Administrator on 2016/06/07.
 */
public class UpdateVideoServiceTest extends AndroidTestCase {
    private UpdateVideoTakerService service;
    private VideoRepository repo;
    private Video video;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        repo = new VideoRepositoryImplem(this.getContext());
    }
    public void testDeleteVideoTaker() throws Exception{
        Long id;
        Intent intent = new Intent(App.getContext(), UpdateVideoTaker.class);
        UpdateVideoTakerService  video = new UpdateVideoTaker();
        Address address =new Address.Builder()
                .postalCode("7100")
                .streetName("Katali Street")
                .suburb("Mfuleni")
                .build();
        Video videos = new Video.Builder()
                .first("Encore")
                .last("Tomson")
                .address(address)
                .build();

        video.updateVideoTaker(App.getContext(), videos);
        App.getContext().startService(intent);
        id = videos.getId();

        Assert.assertNotNull("CREATE", videos);;
    }
}
