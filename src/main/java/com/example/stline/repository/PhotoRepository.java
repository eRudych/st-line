package com.example.stline.repository;

import com.example.stline.entity.Photo;
import com.example.stline.entity.Product;

import java.util.List;

public interface PhotoRepository extends BaseRepository{
    List<Photo> getAll(Product product);
}
