/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.20
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
 * StreamUsageMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-01T18:23:24.409Z")
public class StreamUsageMetadata {
  @SerializedName("sdk")
  private String sdk = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("source")
  private String source = null;

  public StreamUsageMetadata sdk(String sdk) {
    this.sdk = sdk;
    return this;
  }

   /**
   * The language of the sdk
   * @return sdk
  **/
  @ApiModelProperty(example = "ruby", value = "The language of the sdk")
  public String getSdk() {
    return sdk;
  }

  public void setSdk(String sdk) {
    this.sdk = sdk;
  }

  public StreamUsageMetadata version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the SDK
   * @return version
  **/
  @ApiModelProperty(example = "5.4.3", value = "The version of the SDK")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public StreamUsageMetadata source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "server", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamUsageMetadata streamUsageMetadata = (StreamUsageMetadata) o;
    return Objects.equals(this.sdk, streamUsageMetadata.sdk) &&
        Objects.equals(this.version, streamUsageMetadata.version) &&
        Objects.equals(this.source, streamUsageMetadata.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdk, version, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamUsageMetadata {\n");
    
    sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

