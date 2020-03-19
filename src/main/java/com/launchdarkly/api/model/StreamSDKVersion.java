/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.32
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
import com.launchdarkly.api.model.StreamBySDKLinks;
import com.launchdarkly.api.model.StreamSDKVersionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StreamSDKVersion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-19T21:29:46.236Z")
public class StreamSDKVersion {
  @SerializedName("_links")
  private StreamBySDKLinks links = null;

  @SerializedName("sdkVersions")
  private List<StreamSDKVersionData> sdkVersions = null;

  public StreamSDKVersion links(StreamBySDKLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public StreamBySDKLinks getLinks() {
    return links;
  }

  public void setLinks(StreamBySDKLinks links) {
    this.links = links;
  }

  public StreamSDKVersion sdkVersions(List<StreamSDKVersionData> sdkVersions) {
    this.sdkVersions = sdkVersions;
    return this;
  }

  public StreamSDKVersion addSdkVersionsItem(StreamSDKVersionData sdkVersionsItem) {
    if (this.sdkVersions == null) {
      this.sdkVersions = new ArrayList<StreamSDKVersionData>();
    }
    this.sdkVersions.add(sdkVersionsItem);
    return this;
  }

   /**
   * Get sdkVersions
   * @return sdkVersions
  **/
  @ApiModelProperty(value = "")
  public List<StreamSDKVersionData> getSdkVersions() {
    return sdkVersions;
  }

  public void setSdkVersions(List<StreamSDKVersionData> sdkVersions) {
    this.sdkVersions = sdkVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamSDKVersion streamSDKVersion = (StreamSDKVersion) o;
    return Objects.equals(this.links, streamSDKVersion.links) &&
        Objects.equals(this.sdkVersions, streamSDKVersion.sdkVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, sdkVersions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamSDKVersion {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    sdkVersions: ").append(toIndentedString(sdkVersions)).append("\n");
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

