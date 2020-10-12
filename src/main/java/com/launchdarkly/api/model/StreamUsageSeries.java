/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.7.0
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
 * StreamUsageSeries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T20:59:14.915Z")
public class StreamUsageSeries {
  @SerializedName("0")
  private Long _0 = null;

  @SerializedName("time")
  private Long time = null;

  public StreamUsageSeries _0(Long _0) {
    this._0 = _0;
    return this;
  }

   /**
   * A key corresponding to a time series data point.
   * @return _0
  **/
  @ApiModelProperty(example = "0", value = "A key corresponding to a time series data point.")
  public Long get0() {
    return _0;
  }

  public void set0(Long _0) {
    this._0 = _0;
  }

  public StreamUsageSeries time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the creation time of this flag.
   * @return time
  **/
  @ApiModelProperty(example = "1551740400000", value = "A unix epoch time in milliseconds specifying the creation time of this flag.")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamUsageSeries streamUsageSeries = (StreamUsageSeries) o;
    return Objects.equals(this._0, streamUsageSeries._0) &&
        Objects.equals(this.time, streamUsageSeries.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamUsageSeries {\n");
    
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

