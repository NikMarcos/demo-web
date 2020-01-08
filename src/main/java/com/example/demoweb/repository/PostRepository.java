package com.example.demoweb.repository;
import com.example.demoweb.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Integer> {
}