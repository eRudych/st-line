package com.example.stline.service;

import com.example.stline.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    UserDetails create(User user);

    UserDetails getByNick(String nick);

    UserDetails getById(Long id);

    Long searchUserIdByUserNick(String nick);
}
