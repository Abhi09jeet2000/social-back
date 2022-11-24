package com.insta.instaback.Repository;

import com.insta.instaback.Entity.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends CrudRepository<Status, Integer> {}
