package com.example.stline.repository.impl;

import com.example.stline.db.public_.tables.records.PostsRecord;
import com.example.stline.entity.Post;
import com.example.stline.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.stline.db.public_.tables.Posts.POSTS;

@Repository
@RequiredArgsConstructor
@Slf4j
public class PostRepositoryImpl implements PostRepository {

    private final DSLContext dsl;

    private Integer insert(Post post) {
        PostsRecord messagesRecord = dsl.insertInto(POSTS, POSTS.AUTHOR, POSTS.TITLE, POSTS.DESCRIPTION, POSTS.TEXT)
                .values(Math.toIntExact(post.getAuthor()), post.getTitle(), post.getDescription(), post.getText())
                .returning(POSTS.ID)
                .fetchOne();
        log.info("Insert into db: {}", post.toString());
        return messagesRecord.getValue(POSTS.ID);
    }

    @Override
    public Post create(Post post) {
        return get(Long.valueOf(insert(post)));
    }

    @Override
    public boolean update(Post post) {
        try {
            dsl.update(POSTS)
                    .set(POSTS.AUTHOR, Math.toIntExact(post.getAuthor()))
                    .set(POSTS.TITLE, post.getTitle())
                    .set(POSTS.TEXT, post.getText())
                    .set(POSTS.DESCRIPTION, post.getDescription())
                    .where(POSTS.ID.eq(Math.toIntExact(post.getId()))).execute();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public Post get(Long id) {
        return dsl.selectFrom(POSTS)
                .where(POSTS.ID.eq(Math.toIntExact(id)))
                .fetchOneInto(Post.class);
    }

    @Override
    public List<Post> getAll() {
        return dsl.selectFrom(POSTS)
                .fetchInto(Post.class);
    }

    @Override
    public boolean remove(Long id) {
        try {
            dsl.selectFrom(POSTS)
                    .where(POSTS.ID.eq(Math.toIntExact(id)))
                    .fetchOneInto(Post.class);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
