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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DestinationSegment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-05T21:01:14.302Z")
public class DestinationSegment {
  @SerializedName("writeKey")
  private String writeKey = null;

  public DestinationSegment writeKey(String writeKey) {
    this.writeKey = writeKey;
    return this;
  }

   /**
   * Get writeKey
   * @return writeKey
  **/
  @ApiModelProperty(example = "segmentWriteKey", value = "")
  public String getWriteKey() {
    return writeKey;
  }

  public void setWriteKey(String writeKey) {
    this.writeKey = writeKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationSegment destinationSegment = (DestinationSegment) o;
    return Objects.equals(this.writeKey, destinationSegment.writeKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writeKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationSegment {\n");
    
    sb.append("    writeKey: ").append(toIndentedString(writeKey)).append("\n");
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

