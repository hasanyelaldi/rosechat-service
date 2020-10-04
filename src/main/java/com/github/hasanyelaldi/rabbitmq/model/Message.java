package com.github.hasanyelaldi.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotEmpty;

public class Message implements Serializable {

  private String id;

  private String userId;
  private String arrivalUserId;

  private Date createDate;
  private Boolean seen;

  @NotEmpty
  private String messageInfo;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Boolean getSeen() {
    return seen;
  }

  public void setSeen(Boolean seen) {
    this.seen = seen;
  }

  public String getMessageInfo() {
    return messageInfo;
  }

  public void setMessageInfo(String messageInfo) {
    this.messageInfo = messageInfo;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getArrivalUserId() {
    return arrivalUserId;
  }

  public void setArrivalUserId(String arrivalUserId) {
    this.arrivalUserId = arrivalUserId;
  }

  @Override
  public String toString() {
    return "Message{" +
        "id='" + id + '\'' +
        ", createDate=" + createDate +
        ", seen=" + seen +
        ", message='" + messageInfo + '\'' +
        '}';
  }
}
