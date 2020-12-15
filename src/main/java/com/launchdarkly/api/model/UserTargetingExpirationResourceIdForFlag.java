/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 4.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserTargetingExpirationResourceIdForFlag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T02:54:39.973Z")
public class UserTargetingExpirationResourceIdForFlag {
  @SerializedName("kind")
  private String kind = null;

  @SerializedName("projectKey")
  private String projectKey = null;

  @SerializedName("environmentKey")
  private String environmentKey = null;

  @SerializedName("flagKey")
  private String flagKey = null;

  @SerializedName("key")
  private String key = null;

  public UserTargetingExpirationResourceIdForFlag kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public UserTargetingExpirationResourceIdForFlag projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @ApiModelProperty(value = "")
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public UserTargetingExpirationResourceIdForFlag environmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

   /**
   * Get environmentKey
   * @return environmentKey
  **/
  @ApiModelProperty(value = "")
  public String getEnvironmentKey() {
    return environmentKey;
  }

  public void setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
  }

  public UserTargetingExpirationResourceIdForFlag flagKey(String flagKey) {
    this.flagKey = flagKey;
    return this;
  }

   /**
   * Get flagKey
   * @return flagKey
  **/
  @ApiModelProperty(value = "")
  public String getFlagKey() {
    return flagKey;
  }

  public void setFlagKey(String flagKey) {
    this.flagKey = flagKey;
  }

  public UserTargetingExpirationResourceIdForFlag key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTargetingExpirationResourceIdForFlag userTargetingExpirationResourceIdForFlag = (UserTargetingExpirationResourceIdForFlag) o;
    return Objects.equals(this.kind, userTargetingExpirationResourceIdForFlag.kind) &&
        Objects.equals(this.projectKey, userTargetingExpirationResourceIdForFlag.projectKey) &&
        Objects.equals(this.environmentKey, userTargetingExpirationResourceIdForFlag.environmentKey) &&
        Objects.equals(this.flagKey, userTargetingExpirationResourceIdForFlag.flagKey) &&
        Objects.equals(this.key, userTargetingExpirationResourceIdForFlag.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, projectKey, environmentKey, flagKey, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTargetingExpirationResourceIdForFlag {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    environmentKey: ").append(toIndentedString(environmentKey)).append("\n");
    sb.append("    flagKey: ").append(toIndentedString(flagKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

