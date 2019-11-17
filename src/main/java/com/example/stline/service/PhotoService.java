package com.example.stline.service;

import com.example.stline.dto.PhotoDTO;
import com.example.stline.entity.Photo;
import com.example.stline.entity.Product;

import java.util.List;

public interface PhotoService extends BaseService {

    List<Photo> getAll(Product product);
}
