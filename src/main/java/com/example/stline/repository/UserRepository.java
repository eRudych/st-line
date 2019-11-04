package com.example.stline.repository;

import com.example.stline.entity.User;

import java.util.List;

public interface UserRepository extends BaseRepository{
    User create(User post);

    User update(User post);

    User get(Long id);

    List<User> getAll();

    boolean remove(Long id);
}
