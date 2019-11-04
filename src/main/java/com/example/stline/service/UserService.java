package com.example.stline.service;

import com.example.stline.dto.UserDTO;

import java.util.List;

public interface UserService extends BaseService {

    UserDTO create(UserDTO post);

    UserDTO update(UserDTO post);

    UserDTO get(Long id);

    List<UserDTO> getAll();

    boolean remove(Long id);
}
