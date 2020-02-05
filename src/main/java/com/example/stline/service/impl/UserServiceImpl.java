package com.example.stline.service.impl;

import com.example.stline.entity.User;
import com.example.stline.entity.UserRole;
import com.example.stline.mapper.UserMapper;
import com.example.stline.repository.UserRepository;
import com.example.stline.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserDetailsService, UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String nick) throws UsernameNotFoundException {
        UserDetails user= mapper.toDto(repository.getByNick(nick));
        org.springframework.security.core.userdetails.User.UserBuilder builder;
            builder = org.springframework.security.core.userdetails.User.withUsername(user.getUsername());
            builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
            builder.roles("USER");

        return builder.build();
        }

    @Override
    public UserDetails create(User user){
        user.setRole(UserRole.USER.getId());
        return mapper.toDto(repository.create(user));
    }

    @Override
    public UserDetails getByNick(String nick){
        return mapper.toDto(repository.getByNick(nick));
    }

    @Override
    public UserDetails getById(Long id){
        return mapper.toDto(repository.getById(id));
    }

    @Override
    public Long searchUserIdByUserNick(String nick) {
//        log.info("service "+nick);
//        return repository.searchUserIdByUserNick(nick);
        return repository.getByNick(nick).getId();
    }

}
