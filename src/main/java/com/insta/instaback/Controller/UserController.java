package com.insta.instaback.Controller;

import com.insta.instaback.Entity.Users;
import com.insta.instaback.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
  @Autowired
  UserRepo userRepo;

  @PostMapping("/users")
  private boolean submitUser(@RequestBody Users user) {
    userRepo.save(user);
    return true;
  }

  @GetMapping("users/{userId}")
  private Users getUserDetail(@PathVariable String userId) {
    return userRepo.findByUserId(userId);
    // return new Users();
  }

  @PutMapping("/users/profile")
  private Users updateProfile(@RequestBody Users users) {
    Users user = userRepo.findByUserId(users.getUserId());
    if (users != null) {
      user.setProfileImage(users.getProfileImage());
    }
    System.out.println(user.getProfileImage());

    return userRepo.save(user);
  }

  @GetMapping("/users/username/{userName}")
  private Users getUserByUserName(@PathVariable String userName) {
    // System.out.println(userRepo.findByUserName(userName));
    return userRepo.findByUserName(userName);
  }
}
