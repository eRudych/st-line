package com.example.stline.service.impl;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;
import com.example.stline.mapper.PostMapper;
import com.example.stline.repository.PostRepository;
import com.example.stline.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class PostServiceImpl implements PostService {

    private final PostRepository repository;
    private final PostMapper mapper;

    @Override
    @Transactional
    public Post create(PostDTO postDTO) {
        log.info("create post "+ postDTO.toString());
        return repository.create(mapper.toEntity(postDTO));
    }

    @Override
    @Transactional
    public Post update(Post post) {
        if(repository.update(post))
            return repository.get(post.getId());
        return null;
    }

    @Override
    public Post get(Long id) {
        return repository.get(id);
    }

    @Override
    public List<Post> getAll() {
        return repository.getAll();
    }

    @Override
    @Transactional
    public boolean remove(Long id) {
        log.info("remove post "+id);
        return repository.remove(id);
    }
}
