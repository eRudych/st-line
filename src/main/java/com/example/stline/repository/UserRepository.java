package com.example.stline.repository;

import com.example.stline.entity.User;

import java.util.List;

public interface UserRepository extends BaseRepository{
    User create(User user);

    boolean update(User user);

    User get(Long id);

    User getByName(String name);

    List<User> getAll();

    boolean remove(Long id);
}
