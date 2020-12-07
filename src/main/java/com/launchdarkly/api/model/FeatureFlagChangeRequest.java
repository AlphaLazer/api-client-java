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
import com.launchdarkly.api.model.FeatureFlagChangeRequestReview;
import com.launchdarkly.api.model.FeatureFlagChangeRequestReviewStatus;
import com.launchdarkly.api.model.SemanticPatchInstruction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagChangeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-07T19:03:17.730Z")
public class FeatureFlagChangeRequest {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("_version")
  private Integer version = null;

  @SerializedName("creationDate")
  private Integer creationDate = null;

  @SerializedName("requestorId")
  private String requestorId = null;

  @SerializedName("reviewStatus")
  private FeatureFlagChangeRequestReviewStatus reviewStatus = null;

  /**
   * | Name     | Description | | --------:| ----------- | | pending  | the feature flag change request has not been applied yet | | completed| the feature flag change request has been applied successfully | | failed   | the feature flag change request has been applied but the changes were not applied successfully | 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    COMPLETED("completed"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("appliedByMemberID")
  private String appliedByMemberID = null;

  @SerializedName("appliedDate")
  private Integer appliedDate = null;

  @SerializedName("currentReviewsByMemberId")
  private FeatureFlagChangeRequestReview currentReviewsByMemberId = null;

  @SerializedName("allReviews")
  private List<FeatureFlagChangeRequestReview> allReviews = null;

  @SerializedName("notifyMemberIds")
  private List<String> notifyMemberIds = null;

  @SerializedName("instructions")
  private SemanticPatchInstruction instructions = null;

  public FeatureFlagChangeRequest id(String id) {
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

  public FeatureFlagChangeRequest version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FeatureFlagChangeRequest creationDate(Integer creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the date the change request was requested
   * @return creationDate
  **/
  @ApiModelProperty(value = "A unix epoch time in milliseconds specifying the date the change request was requested")
  public Integer getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Integer creationDate) {
    this.creationDate = creationDate;
  }

  public FeatureFlagChangeRequest requestorId(String requestorId) {
    this.requestorId = requestorId;
    return this;
  }

   /**
   * The id of the member that requested the change
   * @return requestorId
  **/
  @ApiModelProperty(value = "The id of the member that requested the change")
  public String getRequestorId() {
    return requestorId;
  }

  public void setRequestorId(String requestorId) {
    this.requestorId = requestorId;
  }

  public FeatureFlagChangeRequest reviewStatus(FeatureFlagChangeRequestReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @ApiModelProperty(value = "")
  public FeatureFlagChangeRequestReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(FeatureFlagChangeRequestReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public FeatureFlagChangeRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * | Name     | Description | | --------:| ----------- | | pending  | the feature flag change request has not been applied yet | | completed| the feature flag change request has been applied successfully | | failed   | the feature flag change request has been applied but the changes were not applied successfully | 
   * @return status
  **/
  @ApiModelProperty(value = "| Name     | Description | | --------:| ----------- | | pending  | the feature flag change request has not been applied yet | | completed| the feature flag change request has been applied successfully | | failed   | the feature flag change request has been applied but the changes were not applied successfully | ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FeatureFlagChangeRequest appliedByMemberID(String appliedByMemberID) {
    this.appliedByMemberID = appliedByMemberID;
    return this;
  }

   /**
   * The id of the member that applied the change request
   * @return appliedByMemberID
  **/
  @ApiModelProperty(value = "The id of the member that applied the change request")
  public String getAppliedByMemberID() {
    return appliedByMemberID;
  }

  public void setAppliedByMemberID(String appliedByMemberID) {
    this.appliedByMemberID = appliedByMemberID;
  }

  public FeatureFlagChangeRequest appliedDate(Integer appliedDate) {
    this.appliedDate = appliedDate;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the date the change request was applied
   * @return appliedDate
  **/
  @ApiModelProperty(value = "A unix epoch time in milliseconds specifying the date the change request was applied")
  public Integer getAppliedDate() {
    return appliedDate;
  }

  public void setAppliedDate(Integer appliedDate) {
    this.appliedDate = appliedDate;
  }

  public FeatureFlagChangeRequest currentReviewsByMemberId(FeatureFlagChangeRequestReview currentReviewsByMemberId) {
    this.currentReviewsByMemberId = currentReviewsByMemberId;
    return this;
  }

   /**
   * Get currentReviewsByMemberId
   * @return currentReviewsByMemberId
  **/
  @ApiModelProperty(value = "")
  public FeatureFlagChangeRequestReview getCurrentReviewsByMemberId() {
    return currentReviewsByMemberId;
  }

  public void setCurrentReviewsByMemberId(FeatureFlagChangeRequestReview currentReviewsByMemberId) {
    this.currentReviewsByMemberId = currentReviewsByMemberId;
  }

  public FeatureFlagChangeRequest allReviews(List<FeatureFlagChangeRequestReview> allReviews) {
    this.allReviews = allReviews;
    return this;
  }

  public FeatureFlagChangeRequest addAllReviewsItem(FeatureFlagChangeRequestReview allReviewsItem) {
    if (this.allReviews == null) {
      this.allReviews = new ArrayList<FeatureFlagChangeRequestReview>();
    }
    this.allReviews.add(allReviewsItem);
    return this;
  }

   /**
   * Get allReviews
   * @return allReviews
  **/
  @ApiModelProperty(value = "")
  public List<FeatureFlagChangeRequestReview> getAllReviews() {
    return allReviews;
  }

  public void setAllReviews(List<FeatureFlagChangeRequestReview> allReviews) {
    this.allReviews = allReviews;
  }

  public FeatureFlagChangeRequest notifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
    return this;
  }

  public FeatureFlagChangeRequest addNotifyMemberIdsItem(String notifyMemberIdsItem) {
    if (this.notifyMemberIds == null) {
      this.notifyMemberIds = new ArrayList<String>();
    }
    this.notifyMemberIds.add(notifyMemberIdsItem);
    return this;
  }

   /**
   * Get notifyMemberIds
   * @return notifyMemberIds
  **/
  @ApiModelProperty(example = "[\"memberId\",\"memberId2\"]", value = "")
  public List<String> getNotifyMemberIds() {
    return notifyMemberIds;
  }

  public void setNotifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
  }

  public FeatureFlagChangeRequest instructions(SemanticPatchInstruction instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @ApiModelProperty(value = "")
  public SemanticPatchInstruction getInstructions() {
    return instructions;
  }

  public void setInstructions(SemanticPatchInstruction instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagChangeRequest featureFlagChangeRequest = (FeatureFlagChangeRequest) o;
    return Objects.equals(this.id, featureFlagChangeRequest.id) &&
        Objects.equals(this.version, featureFlagChangeRequest.version) &&
        Objects.equals(this.creationDate, featureFlagChangeRequest.creationDate) &&
        Objects.equals(this.requestorId, featureFlagChangeRequest.requestorId) &&
        Objects.equals(this.reviewStatus, featureFlagChangeRequest.reviewStatus) &&
        Objects.equals(this.status, featureFlagChangeRequest.status) &&
        Objects.equals(this.appliedByMemberID, featureFlagChangeRequest.appliedByMemberID) &&
        Objects.equals(this.appliedDate, featureFlagChangeRequest.appliedDate) &&
        Objects.equals(this.currentReviewsByMemberId, featureFlagChangeRequest.currentReviewsByMemberId) &&
        Objects.equals(this.allReviews, featureFlagChangeRequest.allReviews) &&
        Objects.equals(this.notifyMemberIds, featureFlagChangeRequest.notifyMemberIds) &&
        Objects.equals(this.instructions, featureFlagChangeRequest.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, creationDate, requestorId, reviewStatus, status, appliedByMemberID, appliedDate, currentReviewsByMemberId, allReviews, notifyMemberIds, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagChangeRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    appliedByMemberID: ").append(toIndentedString(appliedByMemberID)).append("\n");
    sb.append("    appliedDate: ").append(toIndentedString(appliedDate)).append("\n");
    sb.append("    currentReviewsByMemberId: ").append(toIndentedString(currentReviewsByMemberId)).append("\n");
    sb.append("    allReviews: ").append(toIndentedString(allReviews)).append("\n");
    sb.append("    notifyMemberIds: ").append(toIndentedString(notifyMemberIds)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

