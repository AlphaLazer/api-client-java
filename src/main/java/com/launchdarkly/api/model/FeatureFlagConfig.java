/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.10
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.api.model.Fallthrough;
import com.launchdarkly.api.model.Prerequisite;
import com.launchdarkly.api.model.Rule;
import com.launchdarkly.api.model.Target;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-04T04:08:35.481Z")
public class FeatureFlagConfig {
  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("salt")
  private String salt = null;

  @SerializedName("sel")
  private String sel = null;

  @SerializedName("lastModified")
  private Long lastModified = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("targets")
  private List<Target> targets = null;

  @SerializedName("goalIds")
  private List<String> goalIds = null;

  @SerializedName("rules")
  private List<Rule> rules = null;

  @SerializedName("fallthrough")
  private Fallthrough fallthrough = null;

  @SerializedName("offVariation")
  private Integer offVariation = null;

  @SerializedName("prerequisites")
  private List<Prerequisite> prerequisites = null;

  @SerializedName("trackEvents")
  private Boolean trackEvents = null;

  public FeatureFlagConfig on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Get on
   * @return on
  **/
  @ApiModelProperty(value = "")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public FeatureFlagConfig archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @ApiModelProperty(value = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public FeatureFlagConfig salt(String salt) {
    this.salt = salt;
    return this;
  }

   /**
   * Get salt
   * @return salt
  **/
  @ApiModelProperty(example = "YWx0ZXJuYXRlLnBhZ2U=", value = "")
  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public FeatureFlagConfig sel(String sel) {
    this.sel = sel;
    return this;
  }

   /**
   * Get sel
   * @return sel
  **/
  @ApiModelProperty(example = "45501b9314dc4641841af774cb038b96", value = "")
  public String getSel() {
    return sel;
  }

  public void setSel(String sel) {
    this.sel = sel;
  }

  public FeatureFlagConfig lastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(example = "1469326565348", value = "")
  public Long getLastModified() {
    return lastModified;
  }

  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }

  public FeatureFlagConfig version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "65", value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FeatureFlagConfig targets(List<Target> targets) {
    this.targets = targets;
    return this;
  }

  public FeatureFlagConfig addTargetsItem(Target targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<Target>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @ApiModelProperty(value = "")
  public List<Target> getTargets() {
    return targets;
  }

  public void setTargets(List<Target> targets) {
    this.targets = targets;
  }

  public FeatureFlagConfig goalIds(List<String> goalIds) {
    this.goalIds = goalIds;
    return this;
  }

  public FeatureFlagConfig addGoalIdsItem(String goalIdsItem) {
    if (this.goalIds == null) {
      this.goalIds = new ArrayList<String>();
    }
    this.goalIds.add(goalIdsItem);
    return this;
  }

   /**
   * Get goalIds
   * @return goalIds
  **/
  @ApiModelProperty(example = "[\"d7239405bd89c930e885aa76\",\"405bc930e88d7239d895aa76\"]", value = "")
  public List<String> getGoalIds() {
    return goalIds;
  }

  public void setGoalIds(List<String> goalIds) {
    this.goalIds = goalIds;
  }

  public FeatureFlagConfig rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public FeatureFlagConfig addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  public FeatureFlagConfig fallthrough(Fallthrough fallthrough) {
    this.fallthrough = fallthrough;
    return this;
  }

   /**
   * Get fallthrough
   * @return fallthrough
  **/
  @ApiModelProperty(value = "")
  public Fallthrough getFallthrough() {
    return fallthrough;
  }

  public void setFallthrough(Fallthrough fallthrough) {
    this.fallthrough = fallthrough;
  }

  public FeatureFlagConfig offVariation(Integer offVariation) {
    this.offVariation = offVariation;
    return this;
  }

   /**
   * Get offVariation
   * @return offVariation
  **/
  @ApiModelProperty(value = "")
  public Integer getOffVariation() {
    return offVariation;
  }

  public void setOffVariation(Integer offVariation) {
    this.offVariation = offVariation;
  }

  public FeatureFlagConfig prerequisites(List<Prerequisite> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }

  public FeatureFlagConfig addPrerequisitesItem(Prerequisite prerequisitesItem) {
    if (this.prerequisites == null) {
      this.prerequisites = new ArrayList<Prerequisite>();
    }
    this.prerequisites.add(prerequisitesItem);
    return this;
  }

   /**
   * Get prerequisites
   * @return prerequisites
  **/
  @ApiModelProperty(value = "")
  public List<Prerequisite> getPrerequisites() {
    return prerequisites;
  }

  public void setPrerequisites(List<Prerequisite> prerequisites) {
    this.prerequisites = prerequisites;
  }

  public FeatureFlagConfig trackEvents(Boolean trackEvents) {
    this.trackEvents = trackEvents;
    return this;
  }

   /**
   * Set to true to send detailed event information for this flag.
   * @return trackEvents
  **/
  @ApiModelProperty(example = "false", value = "Set to true to send detailed event information for this flag.")
  public Boolean isTrackEvents() {
    return trackEvents;
  }

  public void setTrackEvents(Boolean trackEvents) {
    this.trackEvents = trackEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagConfig featureFlagConfig = (FeatureFlagConfig) o;
    return Objects.equals(this.on, featureFlagConfig.on) &&
        Objects.equals(this.archived, featureFlagConfig.archived) &&
        Objects.equals(this.salt, featureFlagConfig.salt) &&
        Objects.equals(this.sel, featureFlagConfig.sel) &&
        Objects.equals(this.lastModified, featureFlagConfig.lastModified) &&
        Objects.equals(this.version, featureFlagConfig.version) &&
        Objects.equals(this.targets, featureFlagConfig.targets) &&
        Objects.equals(this.goalIds, featureFlagConfig.goalIds) &&
        Objects.equals(this.rules, featureFlagConfig.rules) &&
        Objects.equals(this.fallthrough, featureFlagConfig.fallthrough) &&
        Objects.equals(this.offVariation, featureFlagConfig.offVariation) &&
        Objects.equals(this.prerequisites, featureFlagConfig.prerequisites) &&
        Objects.equals(this.trackEvents, featureFlagConfig.trackEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on, archived, salt, sel, lastModified, version, targets, goalIds, rules, fallthrough, offVariation, prerequisites, trackEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagConfig {\n");
    
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    sel: ").append(toIndentedString(sel)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    goalIds: ").append(toIndentedString(goalIds)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    fallthrough: ").append(toIndentedString(fallthrough)).append("\n");
    sb.append("    offVariation: ").append(toIndentedString(offVariation)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
    sb.append("    trackEvents: ").append(toIndentedString(trackEvents)).append("\n");
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

