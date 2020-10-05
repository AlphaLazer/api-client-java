/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.6.0
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
import com.launchdarkly.api.model.ScheduledChangesFeatureFlagConflict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagScheduledChangesConflictsInstructions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-05T21:01:14.302Z")
public class FeatureFlagScheduledChangesConflictsInstructions {
  @SerializedName("kind")
  private String kind = null;

  @SerializedName("conflicts")
  private List<ScheduledChangesFeatureFlagConflict> conflicts = null;

  public FeatureFlagScheduledChangesConflictsInstructions kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The name of the modification you would like to perform on a resource.
   * @return kind
  **/
  @ApiModelProperty(example = "removeUserTargets", value = "The name of the modification you would like to perform on a resource.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public FeatureFlagScheduledChangesConflictsInstructions conflicts(List<ScheduledChangesFeatureFlagConflict> conflicts) {
    this.conflicts = conflicts;
    return this;
  }

  public FeatureFlagScheduledChangesConflictsInstructions addConflictsItem(ScheduledChangesFeatureFlagConflict conflictsItem) {
    if (this.conflicts == null) {
      this.conflicts = new ArrayList<ScheduledChangesFeatureFlagConflict>();
    }
    this.conflicts.add(conflictsItem);
    return this;
  }

   /**
   * Get conflicts
   * @return conflicts
  **/
  @ApiModelProperty(value = "")
  public List<ScheduledChangesFeatureFlagConflict> getConflicts() {
    return conflicts;
  }

  public void setConflicts(List<ScheduledChangesFeatureFlagConflict> conflicts) {
    this.conflicts = conflicts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagScheduledChangesConflictsInstructions featureFlagScheduledChangesConflictsInstructions = (FeatureFlagScheduledChangesConflictsInstructions) o;
    return Objects.equals(this.kind, featureFlagScheduledChangesConflictsInstructions.kind) &&
        Objects.equals(this.conflicts, featureFlagScheduledChangesConflictsInstructions.conflicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, conflicts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagScheduledChangesConflictsInstructions {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
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

