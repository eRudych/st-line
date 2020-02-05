package com.example.stline.repository;

import com.example.stline.entity.User;

public interface UserRepository {
    User create(User User);

    User getByNick(String nick);

    User getById(Long id);

//    Long searchUserIdByUserNick(String nick);
}
