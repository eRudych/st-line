package com.example.stline.repository.impl;

import com.example.stline.db.public_.tables.records.MessagesRecord;
import com.example.stline.entity.Message;
import com.example.stline.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.stline.db.public_.tables.Messages.MESSAGES;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MessageRepositoryImpl implements MessageRepository {

    private final DSLContext dsl;

    private Integer insert(Message message) {
        MessagesRecord messagesRecord = dsl.insertInto(MESSAGES, MESSAGES.NAME, MESSAGES.PHONE, MESSAGES.MESSAGE)
                .values(message.getName(), message.getPhone(), message.getMessage())
                .returning(MESSAGES.ID)
                .fetchOne();
        log.info("Insert into db: {}", message.toString());
        return messagesRecord.getValue(MESSAGES.ID);
    }

    @Override
    public boolean create(Message message) {
        try {
            insert(message);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean remove(Long id) {
        try {
            dsl.deleteFrom(MESSAGES)
                    .where(MESSAGES.ID.eq(Math.toIntExact(id))).execute();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public List<Message> getAll() {
        return dsl.selectFrom(MESSAGES)
                .fetchInto(Message.class);
    }
}
