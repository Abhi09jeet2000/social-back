package com.insta.instaback.Controller;

import com.insta.instaback.Entity.Comment;
import com.insta.instaback.Repository.CommentRepo;
import com.insta.instaback.Repository.UserRepo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CommentController {
  @Autowired
  CommentRepo commentRepo;

  @Autowired
  UserRepo userRepo;

  @PostMapping("/comment")
  private Comment submitUserComment(@RequestBody Comment comment) {
    return commentRepo.save(comment);
  }

  @GetMapping("/comment/{postId}")
  private ArrayList<Comment> getCommentsForPost(@PathVariable String postId) {
    ArrayList<Comment> commentList = commentRepo.findByPostId(postId);
    for (int i = 0; i < commentList.size(); i++) {
      Comment comment = commentList.get(i);
      comment.setUserName(
        userRepo.findByUserId(comment.getUserId()).getUserName()
      );
    }
    return commentList;
  }
}
