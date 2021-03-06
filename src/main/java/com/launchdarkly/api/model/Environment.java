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
import com.launchdarkly.api.model.EnvironmentApprovalSettings;
import com.launchdarkly.api.model.Links;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Environment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T02:54:39.973Z")
public class Environment {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("mobileKey")
  private String mobileKey = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("defaultTtl")
  private BigDecimal defaultTtl = null;

  @SerializedName("secureMode")
  private Boolean secureMode = null;

  @SerializedName("defaultTrackEvents")
  private Boolean defaultTrackEvents = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("requireComments")
  private Boolean requireComments = null;

  @SerializedName("confirmChanges")
  private Boolean confirmChanges = null;

  @SerializedName("approvalSettings")
  private EnvironmentApprovalSettings approvalSettings = null;

  public Environment links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Environment id(String id) {
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

  public Environment key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key for the environment.
   * @return key
  **/
  @ApiModelProperty(example = "production", value = "The key for the environment.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Environment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the environment.
   * @return name
  **/
  @ApiModelProperty(example = "Production", value = "The name of the environment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Environment apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The SDK key for backend LaunchDarkly SDKs.
   * @return apiKey
  **/
  @ApiModelProperty(example = "XXX", value = "The SDK key for backend LaunchDarkly SDKs.")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public Environment mobileKey(String mobileKey) {
    this.mobileKey = mobileKey;
    return this;
  }

   /**
   * The SDK key for mobile LaunchDarkly SDKs.
   * @return mobileKey
  **/
  @ApiModelProperty(example = "XXX", value = "The SDK key for mobile LaunchDarkly SDKs.")
  public String getMobileKey() {
    return mobileKey;
  }

  public void setMobileKey(String mobileKey) {
    this.mobileKey = mobileKey;
  }

  public Environment color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The swatch color for the environment.
   * @return color
  **/
  @ApiModelProperty(example = "417505", value = "The swatch color for the environment.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Environment defaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
    return this;
  }

   /**
   * The default TTL.
   * @return defaultTtl
  **/
  @ApiModelProperty(example = "0.0", value = "The default TTL.")
  public BigDecimal getDefaultTtl() {
    return defaultTtl;
  }

  public void setDefaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
  }

  public Environment secureMode(Boolean secureMode) {
    this.secureMode = secureMode;
    return this;
  }

   /**
   * Determines if this environment is in safe mode.
   * @return secureMode
  **/
  @ApiModelProperty(example = "false", value = "Determines if this environment is in safe mode.")
  public Boolean isSecureMode() {
    return secureMode;
  }

  public void setSecureMode(Boolean secureMode) {
    this.secureMode = secureMode;
  }

  public Environment defaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
    return this;
  }

   /**
   * Set to true to send detailed event information for new flags.
   * @return defaultTrackEvents
  **/
  @ApiModelProperty(example = "false", value = "Set to true to send detailed event information for new flags.")
  public Boolean isDefaultTrackEvents() {
    return defaultTrackEvents;
  }

  public void setDefaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
  }

  public Environment tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Environment addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * An array of tags for this environment.
   * @return tags
  **/
  @ApiModelProperty(value = "An array of tags for this environment.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Environment requireComments(Boolean requireComments) {
    this.requireComments = requireComments;
    return this;
  }

   /**
   * Determines if this environment requires comments for flag and segment changes.
   * @return requireComments
  **/
  @ApiModelProperty(example = "false", value = "Determines if this environment requires comments for flag and segment changes.")
  public Boolean isRequireComments() {
    return requireComments;
  }

  public void setRequireComments(Boolean requireComments) {
    this.requireComments = requireComments;
  }

  public Environment confirmChanges(Boolean confirmChanges) {
    this.confirmChanges = confirmChanges;
    return this;
  }

   /**
   * Determines if this environment requires confirmation for flag and segment changes.
   * @return confirmChanges
  **/
  @ApiModelProperty(example = "false", value = "Determines if this environment requires confirmation for flag and segment changes.")
  public Boolean isConfirmChanges() {
    return confirmChanges;
  }

  public void setConfirmChanges(Boolean confirmChanges) {
    this.confirmChanges = confirmChanges;
  }

  public Environment approvalSettings(EnvironmentApprovalSettings approvalSettings) {
    this.approvalSettings = approvalSettings;
    return this;
  }

   /**
   * Get approvalSettings
   * @return approvalSettings
  **/
  @ApiModelProperty(value = "")
  public EnvironmentApprovalSettings getApprovalSettings() {
    return approvalSettings;
  }

  public void setApprovalSettings(EnvironmentApprovalSettings approvalSettings) {
    this.approvalSettings = approvalSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.links, environment.links) &&
        Objects.equals(this.id, environment.id) &&
        Objects.equals(this.key, environment.key) &&
        Objects.equals(this.name, environment.name) &&
        Objects.equals(this.apiKey, environment.apiKey) &&
        Objects.equals(this.mobileKey, environment.mobileKey) &&
        Objects.equals(this.color, environment.color) &&
        Objects.equals(this.defaultTtl, environment.defaultTtl) &&
        Objects.equals(this.secureMode, environment.secureMode) &&
        Objects.equals(this.defaultTrackEvents, environment.defaultTrackEvents) &&
        Objects.equals(this.tags, environment.tags) &&
        Objects.equals(this.requireComments, environment.requireComments) &&
        Objects.equals(this.confirmChanges, environment.confirmChanges) &&
        Objects.equals(this.approvalSettings, environment.approvalSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, key, name, apiKey, mobileKey, color, defaultTtl, secureMode, defaultTrackEvents, tags, requireComments, confirmChanges, approvalSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    mobileKey: ").append(toIndentedString(mobileKey)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    defaultTtl: ").append(toIndentedString(defaultTtl)).append("\n");
    sb.append("    secureMode: ").append(toIndentedString(secureMode)).append("\n");
    sb.append("    defaultTrackEvents: ").append(toIndentedString(defaultTrackEvents)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    requireComments: ").append(toIndentedString(requireComments)).append("\n");
    sb.append("    confirmChanges: ").append(toIndentedString(confirmChanges)).append("\n");
    sb.append("    approvalSettings: ").append(toIndentedString(approvalSettings)).append("\n");
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

