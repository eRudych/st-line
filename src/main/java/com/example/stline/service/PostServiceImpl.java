package com.example.stline.service;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;
import com.example.stline.factory.service.ServiceType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements BaseService {
    @Override
    public ServiceType getType() {
        return ServiceType.POST;
    }

    public PostDTO create(Post post) {
        return null;
    }

    public PostDTO update(Post post) {
        return null;
    }

    public boolean remove(long id) {
        return false;
    }


    public PostDTO get(long id) {

        return null;
    }

    public List getAll() {
        return null;
    }

}
