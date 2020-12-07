/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.10.0
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
import com.launchdarkly.api.model.FeatureFlagChangeRequestReviewStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FeatureFlagChangeRequestReview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-07T19:03:17.730Z")
public class FeatureFlagChangeRequestReview {
  @SerializedName("creationDate")
  private Integer creationDate = null;

  @SerializedName("kind")
  private FeatureFlagChangeRequestReviewStatus kind = null;

  @SerializedName("memberId")
  private String memberId = null;

  @SerializedName("_id")
  private String id = null;

  public FeatureFlagChangeRequestReview creationDate(Integer creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the date the change request was reviewed
   * @return creationDate
  **/
  @ApiModelProperty(value = "A unix epoch time in milliseconds specifying the date the change request was reviewed")
  public Integer getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Integer creationDate) {
    this.creationDate = creationDate;
  }

  public FeatureFlagChangeRequestReview kind(FeatureFlagChangeRequestReviewStatus kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public FeatureFlagChangeRequestReviewStatus getKind() {
    return kind;
  }

  public void setKind(FeatureFlagChangeRequestReviewStatus kind) {
    this.kind = kind;
  }

  public FeatureFlagChangeRequestReview memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @ApiModelProperty(value = "")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public FeatureFlagChangeRequestReview id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagChangeRequestReview featureFlagChangeRequestReview = (FeatureFlagChangeRequestReview) o;
    return Objects.equals(this.creationDate, featureFlagChangeRequestReview.creationDate) &&
        Objects.equals(this.kind, featureFlagChangeRequestReview.kind) &&
        Objects.equals(this.memberId, featureFlagChangeRequestReview.memberId) &&
        Objects.equals(this.id, featureFlagChangeRequestReview.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, kind, memberId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagChangeRequestReview {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

