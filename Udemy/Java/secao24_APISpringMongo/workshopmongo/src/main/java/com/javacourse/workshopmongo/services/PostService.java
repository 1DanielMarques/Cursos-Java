package com.javacourse.workshopmongo.services;

import com.javacourse.workshopmongo.domain.Post;
import com.javacourse.workshopmongo.repositories.PostRepository;
import com.javacourse.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> Post = repository.findById(id);
        return Post.orElseThrow(() -> new ObjectNotFoundException(id));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }


}
