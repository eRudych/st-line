package com.example.stline.repository.impl;

import com.example.stline.entity.Photo;
import com.example.stline.entity.Product;
import com.example.stline.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.stline.db.public_.tables.Photos.PHOTOS;

@Repository
@RequiredArgsConstructor
@Slf4j
public class PhotoRepositoryImpl implements PhotoRepository {

    private final DSLContext dsl;

    @Override
    public List<Photo> getAll(Product product) {
        return dsl.selectFrom(PHOTOS)
                .where(PHOTOS.PRODUCT.eq(Math.toIntExact(product.getId())))
                .fetchInto(Photo.class);
    }
}
