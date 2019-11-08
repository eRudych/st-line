package com.example.stline.repository.impl;

import com.example.stline.db.public_.tables.records.UsersRecord;
import com.example.stline.entity.User;
import com.example.stline.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;


import static com.example.stline.db.public_.tables.Users.USERS;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository {

    private final DSLContext dsl;

    private Integer insert(User user) {
        UsersRecord messagesRecord = dsl.insertInto(USERS, USERS.LOGIN, USERS.NAME, USERS.PASSWORD, USERS.ROLE)
                .values(user.getLogin(), user.getName(), user.getPassword(), Math.toIntExact(user.getRole().getId()))
                .returning(USERS.ID)
                .fetchOne();
        log.info("Insert into db: {}", user.toString());
        return messagesRecord.getValue(USERS.ID);
    }
    @Override
    public User create(User user) {
        return get(Long.valueOf(insert(user)));
    }

    @Override
    public boolean update(User user) {
        try {
            dsl.update(USERS)
                    .set(USERS.ROLE, Math.toIntExact(user.getRole().getId()))
                    .set(USERS.LOGIN, user.getLogin())
                    .set(USERS.NAME, user.getName())
                    .set(USERS.PASSWORD, user.getPassword())
                    .where(USERS.ID.eq(Math.toIntExact(user.getId()))).execute();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public User get(Long id) {
        return dsl.selectFrom(USERS)
                .where(USERS.ID.eq(Math.toIntExact(id)))
                .fetchOneInto(User.class);
    }

    @Override
    public User getByName(String name) {
        return dsl.selectFrom(USERS)
                .where(USERS.NAME.eq(name))
                .fetchOneInto(User.class);
    }

    @Override
    public List<User> getAll() {
        return dsl.selectFrom(USERS)
                .fetchInto(User.class);
    }

    @Override
    public boolean remove(Long id) {
        try {
            dsl.selectFrom(USERS)
                    .where(USERS.ID.eq(Math.toIntExact(id)))
                    .fetchOneInto(User.class);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
