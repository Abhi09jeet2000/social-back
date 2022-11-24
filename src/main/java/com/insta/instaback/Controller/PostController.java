package com.insta.instaback.Controller;

import com.insta.instaback.Entity.Post;
import com.insta.instaback.Repository.PostRepo;
import com.insta.instaback.Repository.UserRepo;
import java.util.ArrayList;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {
  @Autowired
  PostRepo postRepo;

  @Autowired
  UserRepo userRepo;

  @PostMapping("/post")
  private Post submitUserPost(@RequestBody Post post) {
    return postRepo.save(post);
  }

  @GetMapping("/post")
  private ArrayList<Post> getAllPost() {
    ArrayList<Post> postList = (ArrayList<Post>) postRepo.findAll();

    for (int i = 0; i < postList.size(); i++) {
      Post post = postList.get(i);
      post.setUserName(userRepo.findByUserId(post.getUserId()).getUserName());
    }
    Collections.sort(postList, (a, b) -> b.getId() - a.getId());
    return postList;
  }
}
