package com.example.gtc.src.post.repository;

import com.example.gtc.src.post.entity.Photo;
import com.example.gtc.src.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<Post,Long> {
}
