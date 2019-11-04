package com.example.stline.service;

import com.example.stline.dto.PhotoDTO;
import com.example.stline.entity.Product;

import java.util.List;

public interface PhotoService extends BaseService {

    List<PhotoDTO> getAll(Product product);
}
