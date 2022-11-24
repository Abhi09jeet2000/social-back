package com.insta.instaback.Entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String postId;

  private String userId;

  private String postPath;

  private String userName;

  private Timestamp timestamp;

  private int likeCount;

  public Post() {}

  public Post(
    String postId,
    String userId,
    String userName,
    String postPath,
    Timestamp timestamp,
    int likeCount
  ) {
    this.postId = postId;
    this.userId = userId;
    this.userName = userName;
    this.postPath = postPath;
    this.timestamp = timestamp;
    this.likeCount = likeCount;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPostPath() {
    return postPath;
  }

  public void setPostPath(String postPath) {
    this.postPath = postPath;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public int getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(int likeCount) {
    this.likeCount = likeCount;
  }

  @Override
  public String toString() {
    return (
      "Post [postId=" +
      postId +
      ", userId=" +
      userId +
      ", userName=" +
      userName +
      ", postPath=" +
      postPath +
      ", timestamp=" +
      timestamp +
      ", likeCount=" +
      likeCount +
      "]"
    );
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
