/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.5.0
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
import com.launchdarkly.api.model.CopyActions;
import com.launchdarkly.api.model.FeatureFlagCopyObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagCopyBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T21:01:29.182Z")
public class FeatureFlagCopyBody {
  @SerializedName("source")
  private FeatureFlagCopyObject source = null;

  @SerializedName("target")
  private FeatureFlagCopyObject target = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("includedActions")
  private List<CopyActions> includedActions = null;

  @SerializedName("excludedActions")
  private List<CopyActions> excludedActions = null;

  public FeatureFlagCopyBody source(FeatureFlagCopyObject source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public FeatureFlagCopyObject getSource() {
    return source;
  }

  public void setSource(FeatureFlagCopyObject source) {
    this.source = source;
  }

  public FeatureFlagCopyBody target(FeatureFlagCopyObject target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public FeatureFlagCopyObject getTarget() {
    return target;
  }

  public void setTarget(FeatureFlagCopyObject target) {
    this.target = target;
  }

  public FeatureFlagCopyBody comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * comment will be included in audit log item for change.
   * @return comment
  **/
  @ApiModelProperty(example = "This is a comment string", value = "comment will be included in audit log item for change.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public FeatureFlagCopyBody includedActions(List<CopyActions> includedActions) {
    this.includedActions = includedActions;
    return this;
  }

  public FeatureFlagCopyBody addIncludedActionsItem(CopyActions includedActionsItem) {
    if (this.includedActions == null) {
      this.includedActions = new ArrayList<CopyActions>();
    }
    this.includedActions.add(includedActionsItem);
    return this;
  }

   /**
   * Define the parts of the flag configuration that will be copied.
   * @return includedActions
  **/
  @ApiModelProperty(value = "Define the parts of the flag configuration that will be copied.")
  public List<CopyActions> getIncludedActions() {
    return includedActions;
  }

  public void setIncludedActions(List<CopyActions> includedActions) {
    this.includedActions = includedActions;
  }

  public FeatureFlagCopyBody excludedActions(List<CopyActions> excludedActions) {
    this.excludedActions = excludedActions;
    return this;
  }

  public FeatureFlagCopyBody addExcludedActionsItem(CopyActions excludedActionsItem) {
    if (this.excludedActions == null) {
      this.excludedActions = new ArrayList<CopyActions>();
    }
    this.excludedActions.add(excludedActionsItem);
    return this;
  }

   /**
   * Define the parts of the flag configuration that will not be copied.
   * @return excludedActions
  **/
  @ApiModelProperty(value = "Define the parts of the flag configuration that will not be copied.")
  public List<CopyActions> getExcludedActions() {
    return excludedActions;
  }

  public void setExcludedActions(List<CopyActions> excludedActions) {
    this.excludedActions = excludedActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagCopyBody featureFlagCopyBody = (FeatureFlagCopyBody) o;
    return Objects.equals(this.source, featureFlagCopyBody.source) &&
        Objects.equals(this.target, featureFlagCopyBody.target) &&
        Objects.equals(this.comment, featureFlagCopyBody.comment) &&
        Objects.equals(this.includedActions, featureFlagCopyBody.includedActions) &&
        Objects.equals(this.excludedActions, featureFlagCopyBody.excludedActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target, comment, includedActions, excludedActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagCopyBody {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    includedActions: ").append(toIndentedString(includedActions)).append("\n");
    sb.append("    excludedActions: ").append(toIndentedString(excludedActions)).append("\n");
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

