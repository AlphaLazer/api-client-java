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
import com.launchdarkly.api.model.FeatureFlagApprovalRequestReview;
import com.launchdarkly.api.model.FeatureFlagApprovalRequestReviewStatus;
import com.launchdarkly.api.model.SemanticPatchInstruction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagApprovalRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T02:54:39.973Z")
public class FeatureFlagApprovalRequest {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("_version")
  private Integer version = null;

  @SerializedName("creationDate")
  private Integer creationDate = null;

  @SerializedName("requestorId")
  private String requestorId = null;

  @SerializedName("reviewStatus")
  private FeatureFlagApprovalRequestReviewStatus reviewStatus = null;

  /**
   * | Name     | Description | | --------:| ----------- | | pending  | the feature flag approval request has not been applied yet | | completed| the feature flag approval request has been applied successfully | | failed   | the feature flag approval request has been applied but the changes were not applied successfully | 
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

  @SerializedName("allReviews")
  private List<FeatureFlagApprovalRequestReview> allReviews = null;

  @SerializedName("notifyMemberIds")
  private List<String> notifyMemberIds = null;

  @SerializedName("instructions")
  private SemanticPatchInstruction instructions = null;

  public FeatureFlagApprovalRequest id(String id) {
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

  public FeatureFlagApprovalRequest version(Integer version) {
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

  public FeatureFlagApprovalRequest creationDate(Integer creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the date the approval request was requested
   * @return creationDate
  **/
  @ApiModelProperty(value = "A unix epoch time in milliseconds specifying the date the approval request was requested")
  public Integer getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Integer creationDate) {
    this.creationDate = creationDate;
  }

  public FeatureFlagApprovalRequest requestorId(String requestorId) {
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

  public FeatureFlagApprovalRequest reviewStatus(FeatureFlagApprovalRequestReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @ApiModelProperty(value = "")
  public FeatureFlagApprovalRequestReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(FeatureFlagApprovalRequestReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public FeatureFlagApprovalRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * | Name     | Description | | --------:| ----------- | | pending  | the feature flag approval request has not been applied yet | | completed| the feature flag approval request has been applied successfully | | failed   | the feature flag approval request has been applied but the changes were not applied successfully | 
   * @return status
  **/
  @ApiModelProperty(value = "| Name     | Description | | --------:| ----------- | | pending  | the feature flag approval request has not been applied yet | | completed| the feature flag approval request has been applied successfully | | failed   | the feature flag approval request has been applied but the changes were not applied successfully | ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FeatureFlagApprovalRequest appliedByMemberID(String appliedByMemberID) {
    this.appliedByMemberID = appliedByMemberID;
    return this;
  }

   /**
   * The id of the member that applied the approval request
   * @return appliedByMemberID
  **/
  @ApiModelProperty(value = "The id of the member that applied the approval request")
  public String getAppliedByMemberID() {
    return appliedByMemberID;
  }

  public void setAppliedByMemberID(String appliedByMemberID) {
    this.appliedByMemberID = appliedByMemberID;
  }

  public FeatureFlagApprovalRequest appliedDate(Integer appliedDate) {
    this.appliedDate = appliedDate;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the date the approval request was applied
   * @return appliedDate
  **/
  @ApiModelProperty(value = "A unix epoch time in milliseconds specifying the date the approval request was applied")
  public Integer getAppliedDate() {
    return appliedDate;
  }

  public void setAppliedDate(Integer appliedDate) {
    this.appliedDate = appliedDate;
  }

  public FeatureFlagApprovalRequest allReviews(List<FeatureFlagApprovalRequestReview> allReviews) {
    this.allReviews = allReviews;
    return this;
  }

  public FeatureFlagApprovalRequest addAllReviewsItem(FeatureFlagApprovalRequestReview allReviewsItem) {
    if (this.allReviews == null) {
      this.allReviews = new ArrayList<FeatureFlagApprovalRequestReview>();
    }
    this.allReviews.add(allReviewsItem);
    return this;
  }

   /**
   * Get allReviews
   * @return allReviews
  **/
  @ApiModelProperty(value = "")
  public List<FeatureFlagApprovalRequestReview> getAllReviews() {
    return allReviews;
  }

  public void setAllReviews(List<FeatureFlagApprovalRequestReview> allReviews) {
    this.allReviews = allReviews;
  }

  public FeatureFlagApprovalRequest notifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
    return this;
  }

  public FeatureFlagApprovalRequest addNotifyMemberIdsItem(String notifyMemberIdsItem) {
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

  public FeatureFlagApprovalRequest instructions(SemanticPatchInstruction instructions) {
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
    FeatureFlagApprovalRequest featureFlagApprovalRequest = (FeatureFlagApprovalRequest) o;
    return Objects.equals(this.id, featureFlagApprovalRequest.id) &&
        Objects.equals(this.version, featureFlagApprovalRequest.version) &&
        Objects.equals(this.creationDate, featureFlagApprovalRequest.creationDate) &&
        Objects.equals(this.requestorId, featureFlagApprovalRequest.requestorId) &&
        Objects.equals(this.reviewStatus, featureFlagApprovalRequest.reviewStatus) &&
        Objects.equals(this.status, featureFlagApprovalRequest.status) &&
        Objects.equals(this.appliedByMemberID, featureFlagApprovalRequest.appliedByMemberID) &&
        Objects.equals(this.appliedDate, featureFlagApprovalRequest.appliedDate) &&
        Objects.equals(this.allReviews, featureFlagApprovalRequest.allReviews) &&
        Objects.equals(this.notifyMemberIds, featureFlagApprovalRequest.notifyMemberIds) &&
        Objects.equals(this.instructions, featureFlagApprovalRequest.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, creationDate, requestorId, reviewStatus, status, appliedByMemberID, appliedDate, allReviews, notifyMemberIds, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagApprovalRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    appliedByMemberID: ").append(toIndentedString(appliedByMemberID)).append("\n");
    sb.append("    appliedDate: ").append(toIndentedString(appliedDate)).append("\n");
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

