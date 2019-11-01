package com.example.stline.service;

import com.example.stline.entity.Photo;
import com.example.stline.factory.service.ServiceType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements BaseService {
    @Override
    public ServiceType getType() {
        return ServiceType.PHOTO;
    }

    public List getPhotos(Photo photo){return null;}

}
