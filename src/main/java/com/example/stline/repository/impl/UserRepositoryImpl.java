package com.example.stline.repository.impl;

import com.example.stline.entity.User;
import com.example.stline.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;


//import static com.example.stline.db.public_.tables.Users.USERS;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User create(User post) {
        return null;
    }

    @Override
    public User update(User post) {
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }
}
