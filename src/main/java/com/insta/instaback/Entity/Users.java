package com.insta.instaback.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull
  private String userId;

  @Column(unique = true)
  private String userName;

  private String name;

  private String profileImage;

  public Users() {
    super();
  }

  public Users(
    @NotNull String userId,
    String userName,
    String name,
    String profileImage
  ) {
    this.userId = userId;
    this.userName = userName;
    this.name = name;
    this.profileImage = profileImage;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  @Override
  public String toString() {
    return (
      "Users [userId=" +
      userId +
      ", userName=" +
      userName +
      ", name=" +
      name +
      ", profileImage=" +
      profileImage +
      "]"
    );
  }
}
