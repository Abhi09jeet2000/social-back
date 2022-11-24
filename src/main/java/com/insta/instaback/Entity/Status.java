package com.insta.instaback.Entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String statusId;
  private String userId;
  private String userName;
  private String path;
  private Timestamp timeStamp;

  public Status() {
    super();
  }

  public Status(
    String statusId,
    String userId,
    String userName,
    String path,
    Timestamp timeStamp
  ) {
    this.statusId = statusId;
    this.userId = userId;
    this.userName = userName;
    this.path = path;
    this.timeStamp = timeStamp;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Timestamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Timestamp timeStamp) {
    this.timeStamp = timeStamp;
  }

  @Override
  public String toString() {
    return (
      "Status [statusId=" +
      statusId +
      ", userId=" +
      userId +
      ", userName=" +
      userName +
      ", path=" +
      path +
      ", timeStamp=" +
      timeStamp +
      "]"
    );
  }
}
