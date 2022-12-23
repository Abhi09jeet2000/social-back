package com.insta.instaback.Repository;

import com.insta.instaback.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
  // Users save(Users user);
  Users findByUserId(String userId);
  Users findByUserName(String userName);
}
