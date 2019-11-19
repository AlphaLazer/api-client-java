/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.23
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.api.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:49:38.633Z")
public class UserRecord {
  @SerializedName("lastPing")
  private String lastPing = null;

  @SerializedName("environmentId")
  private String environmentId = null;

  @SerializedName("ownerId")
  private String ownerId = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("avatar")
  private String avatar = null;

  public UserRecord lastPing(String lastPing) {
    this.lastPing = lastPing;
    return this;
  }

   /**
   * Get lastPing
   * @return lastPing
  **/
  @ApiModelProperty(example = "2015-03-03T02:37:22.492Z", value = "")
  public String getLastPing() {
    return lastPing;
  }

  public void setLastPing(String lastPing) {
    this.lastPing = lastPing;
  }

  public UserRecord environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Get environmentId
   * @return environmentId
  **/
  @ApiModelProperty(example = "54ac2d97de674204ddd61096", value = "")
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public UserRecord ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public UserRecord user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserRecord avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(example = "https://s3.amazonaws.com/uifaces/faces/twitter/shylockjoy/73.jpg", value = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRecord userRecord = (UserRecord) o;
    return Objects.equals(this.lastPing, userRecord.lastPing) &&
        Objects.equals(this.environmentId, userRecord.environmentId) &&
        Objects.equals(this.ownerId, userRecord.ownerId) &&
        Objects.equals(this.user, userRecord.user) &&
        Objects.equals(this.avatar, userRecord.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPing, environmentId, ownerId, user, avatar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRecord {\n");
    
    sb.append("    lastPing: ").append(toIndentedString(lastPing)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

