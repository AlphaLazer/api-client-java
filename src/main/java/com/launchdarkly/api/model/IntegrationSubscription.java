/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.10.0
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
import com.launchdarkly.api.model.HierarchicalLinks;
import com.launchdarkly.api.model.IntegrationSubscriptionStatus;
import com.launchdarkly.api.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-07T19:03:17.730Z")
public class IntegrationSubscription {
  @SerializedName("_links")
  private HierarchicalLinks links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("statements")
  private List<Statement> statements = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("_status")
  private IntegrationSubscriptionStatus status = null;

  public IntegrationSubscription links(HierarchicalLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public HierarchicalLinks getLinks() {
    return links;
  }

  public void setLinks(HierarchicalLinks links) {
    this.links = links;
  }

  public IntegrationSubscription id(String id) {
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

  public IntegrationSubscription kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The type of integration associated with this configuration.
   * @return kind
  **/
  @ApiModelProperty(example = "datadog", value = "The type of integration associated with this configuration.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IntegrationSubscription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user-defined name associated with this configuration.
   * @return name
  **/
  @ApiModelProperty(example = "V2", value = "The user-defined name associated with this configuration.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IntegrationSubscription config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * A key-value mapping of configuration fields.
   * @return config
  **/
  @ApiModelProperty(example = "{\"apiKey\":\"582**************************116\",\"hostURL\":\"https://api.datadoghq.com\"}", value = "A key-value mapping of configuration fields.")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public IntegrationSubscription statements(List<Statement> statements) {
    this.statements = statements;
    return this;
  }

  public IntegrationSubscription addStatementsItem(Statement statementsItem) {
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

  public IntegrationSubscription on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether or not the integration is currently active.
   * @return on
  **/
  @ApiModelProperty(example = "true", value = "Whether or not the integration is currently active.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public IntegrationSubscription tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IntegrationSubscription addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * An array of tags for this integration configuration.
   * @return tags
  **/
  @ApiModelProperty(value = "An array of tags for this integration configuration.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public IntegrationSubscription status(IntegrationSubscriptionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public IntegrationSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(IntegrationSubscriptionStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationSubscription integrationSubscription = (IntegrationSubscription) o;
    return Objects.equals(this.links, integrationSubscription.links) &&
        Objects.equals(this.id, integrationSubscription.id) &&
        Objects.equals(this.kind, integrationSubscription.kind) &&
        Objects.equals(this.name, integrationSubscription.name) &&
        Objects.equals(this.config, integrationSubscription.config) &&
        Objects.equals(this.statements, integrationSubscription.statements) &&
        Objects.equals(this.on, integrationSubscription.on) &&
        Objects.equals(this.tags, integrationSubscription.tags) &&
        Objects.equals(this.status, integrationSubscription.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, kind, name, config, statements, on, tags, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationSubscription {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

