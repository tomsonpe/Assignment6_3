package com.assignmenttp.service.customer.employees.photo;

import android.content.Context;

import com.assignmenttp.domain.employees.photo.Photo;

/**
 * Created by Administrator on 2016/06/07.
 */
public interface PhotoService {
    void addPhotoTakers(Context context,Photo photo);
    //void deletePhotoTaker(Context context,Photo photo);
}
