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
import com.launchdarkly.api.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StreamLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T02:54:39.973Z")
public class StreamLinks {
  @SerializedName("parent")
  private Link parent = null;

  @SerializedName("self")
  private Link self = null;

  @SerializedName("subseries")
  private List<Link> subseries = null;

  public StreamLinks parent(Link parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Link getParent() {
    return parent;
  }

  public void setParent(Link parent) {
    this.parent = parent;
  }

  public StreamLinks self(Link self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public Link getSelf() {
    return self;
  }

  public void setSelf(Link self) {
    this.self = self;
  }

  public StreamLinks subseries(List<Link> subseries) {
    this.subseries = subseries;
    return this;
  }

  public StreamLinks addSubseriesItem(Link subseriesItem) {
    if (this.subseries == null) {
      this.subseries = new ArrayList<Link>();
    }
    this.subseries.add(subseriesItem);
    return this;
  }

   /**
   * Links to endpoints that are in the request path.
   * @return subseries
  **/
  @ApiModelProperty(value = "Links to endpoints that are in the request path.")
  public List<Link> getSubseries() {
    return subseries;
  }

  public void setSubseries(List<Link> subseries) {
    this.subseries = subseries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamLinks streamLinks = (StreamLinks) o;
    return Objects.equals(this.parent, streamLinks.parent) &&
        Objects.equals(this.self, streamLinks.self) &&
        Objects.equals(this.subseries, streamLinks.subseries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, self, subseries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamLinks {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    subseries: ").append(toIndentedString(subseries)).append("\n");
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

