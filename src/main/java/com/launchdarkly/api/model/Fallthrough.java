/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.23
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
import com.launchdarkly.api.model.Rollout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fallthrough
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:49:38.633Z")
public class Fallthrough {
  @SerializedName("variation")
  private Integer variation = null;

  @SerializedName("rollout")
  private Rollout rollout = null;

  public Fallthrough variation(Integer variation) {
    this.variation = variation;
    return this;
  }

   /**
   * Get variation
   * @return variation
  **/
  @ApiModelProperty(value = "")
  public Integer getVariation() {
    return variation;
  }

  public void setVariation(Integer variation) {
    this.variation = variation;
  }

  public Fallthrough rollout(Rollout rollout) {
    this.rollout = rollout;
    return this;
  }

   /**
   * Get rollout
   * @return rollout
  **/
  @ApiModelProperty(value = "")
  public Rollout getRollout() {
    return rollout;
  }

  public void setRollout(Rollout rollout) {
    this.rollout = rollout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fallthrough fallthrough = (Fallthrough) o;
    return Objects.equals(this.variation, fallthrough.variation) &&
        Objects.equals(this.rollout, fallthrough.rollout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variation, rollout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fallthrough {\n");
    
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    rollout: ").append(toIndentedString(rollout)).append("\n");
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

