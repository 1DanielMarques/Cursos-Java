package com.javacourse.workshopmongo.repositories;

import com.javacourse.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends MongoRepository<Post, String> {

    @Query("{ 'title': {$regex: ?0, $options: 'i' } }")
    List<Post> searchByTItle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);

}
