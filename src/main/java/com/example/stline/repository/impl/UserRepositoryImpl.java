package com.example.stline.repository.impl;

import com.example.stline.db.tables.records.UsersRecord;
import com.example.stline.entity.User;
import com.example.stline.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;

import org.springframework.stereotype.Repository;

import static com.example.stline.db.tables.Users.USERS;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository {

    private final DSLContext dsl;

    private Long insert(User user) {
        UsersRecord UsersRecord = dsl.insertInto(USERS, USERS.NAME, USERS.LOGIN, USERS.PASSWORD, USERS.ROLE)
                .values(user.getUserName(),user.getEmail(),user.getPassword(),user.getRole())
                .returning(USERS.ID)
                .fetchOne();
        user.setId(UsersRecord.getValue(USERS.ID));
        return UsersRecord.getValue(USERS.ID);

    }

    @Override
    public User create(User user) {
        log.info(user.toString());
        return getById(insert(user));
    }

    @Override
    public User getByNick(String nick) {
        return dsl.selectFrom(USERS)
                .where(USERS.NAME.eq(nick))
                .fetchOne(r->fillOut(r));
    }

    @Override
    public User getById(Long id) {
       return dsl.selectFrom(USERS)
                .where(USERS.ID.eq(id))
                .fetchOne(this::fillOut);
    }

//    @Override
//    public Long searchUserIdByUserNick(String nick) {
//        try{
//            log.info("start");
//        UsersRecord usersRecord = dsl.selectFrom(USERS).where(USERS.NAME.eq(nick)).fetchOne();
//        log.info(usersRecord.getLogin()+" "+usersRecord.getId());
//        return usersRecord.getId();
//        }catch (Exception ex){
//            log.error(ex.getMessage());
//            return 0L;
//        }
//    }

    private User fillOut(UsersRecord r){
        User user= new User();
        user.setId(r.get(0,Long.class));
        user.setUserName(r.get(1,String.class));
        user.setEmail(r.get(2,String.class));
        user.setPassword(r.get(3,String.class));
        user.setRole(r.get(4,Long.class));
        return  user;
    }
}
