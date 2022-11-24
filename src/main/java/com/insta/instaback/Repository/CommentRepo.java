package com.insta.instaback.Repository;

import com.insta.instaback.Entity.Comment;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Integer> {
  ArrayList<Comment> findByPostId(String postId);
}
