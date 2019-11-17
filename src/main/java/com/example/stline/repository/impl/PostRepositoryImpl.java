package com.example.stline.repository.impl;

import com.example.stline.db.tables.records.PostsRecord;
import com.example.stline.entity.Post;
import com.example.stline.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.stline.db.tables.Posts.POSTS;

@Repository
@RequiredArgsConstructor
@Slf4j
public class PostRepositoryImpl implements PostRepository {

    private final DSLContext dsl;

    private Long insert(Post post) {
        PostsRecord messagesRecord = dsl.insertInto(POSTS, POSTS.TITLE, POSTS.DESCRIPTION, POSTS.TEXT)
                .values(post.getTitle(), post.getDescription(), post.getText())
                .returning(POSTS.ID)
                .fetchOne();
        post.setId(messagesRecord.getValue( POSTS.ID));
        log.info("Insert into db: {}", post.toString());
        return messagesRecord.getValue(POSTS.ID);
    }

    @Override
    public Post create(Post post) {
        return get(insert(post));
    }

    @Override
    public boolean update(Post post) {
        try {
            dsl.update(POSTS)
                    .set(POSTS.TITLE, post.getTitle())
                    .set(POSTS.TEXT, post.getText())
                    .set(POSTS.DESCRIPTION, post.getDescription())
                    .where(POSTS.ID.eq(post.getId())).execute();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public Post get(Long id) {
        return dsl.selectFrom(POSTS)
                .where(POSTS.ID.eq(id))
                .fetchOneInto(Post.class);
    }

    @Override
    public List<Post> getAll() {
        return dsl.selectFrom(POSTS).orderBy(POSTS.ID.desc())
                .fetchInto(Post.class);
    }

    @Override
    public boolean remove(Long id) {
        log.info("remove post from db");
        try {
            dsl.selectFrom(POSTS)
                    .where(POSTS.ID.eq(id))
                    .fetchOneInto(Post.class);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
