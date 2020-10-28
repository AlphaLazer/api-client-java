/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.8.0
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
import com.launchdarkly.api.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:53:40.380Z")
public class SubscriptionBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("statements")
  private List<Statement> statements = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public SubscriptionBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-readable name for your subscription configuration.
   * @return name
  **/
  @ApiModelProperty(example = "Example Datadog Integration", required = true, value = "A human-readable name for your subscription configuration.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionBody statements(List<Statement> statements) {
    this.statements = statements;
    return this;
  }

  public SubscriptionBody addStatementsItem(Statement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<Statement>();
    }
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")
  public List<Statement> getStatements() {
    return statements;
  }

  public void setStatements(List<Statement> statements) {
    this.statements = statements;
  }

  public SubscriptionBody config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * Integration-specific configuration fields.
   * @return config
  **/
  @ApiModelProperty(example = "{\"apiKey\":\"582**************************116\",\"hostURL\":\"https://api.datadoghq.com\"}", required = true, value = "Integration-specific configuration fields.")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public SubscriptionBody on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether the integration subscription is active or not.
   * @return on
  **/
  @ApiModelProperty(example = "true", value = "Whether the integration subscription is active or not.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public SubscriptionBody tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SubscriptionBody addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags for the integration subscription.
   * @return tags
  **/
  @ApiModelProperty(example = "[]", value = "Tags for the integration subscription.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionBody subscriptionBody = (SubscriptionBody) o;
    return Objects.equals(this.name, subscriptionBody.name) &&
        Objects.equals(this.statements, subscriptionBody.statements) &&
        Objects.equals(this.config, subscriptionBody.config) &&
        Objects.equals(this.on, subscriptionBody.on) &&
        Objects.equals(this.tags, subscriptionBody.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, statements, config, on, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
