package com.insta.instaback.Controller;

import com.insta.instaback.Entity.Status;
import com.insta.instaback.Repository.StatusRepo;
import com.insta.instaback.Repository.UserRepo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StatusController {
  @Autowired
  StatusRepo statusRepo;

  @Autowired
  UserRepo userRepo;

  @PostMapping("/status")
  private Status submitStatus(@RequestBody Status status) {
    return statusRepo.save(status);
    // return new Status();
  }

  @GetMapping("/status")
  private ArrayList<Status> getAllStatus() {
    ArrayList<Status> statusList = (ArrayList<Status>) statusRepo.findAll();
    for (int i = 0; i < statusList.size(); i++) {
      Status status = statusList.get(i);
      status.setUserName(
        userRepo.findByUserId(status.getUserId()).getUserName()
      );
    }

    return statusList;
  }
}
