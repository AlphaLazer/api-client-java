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
import com.launchdarkly.api.model.IntegrationLinks;
import com.launchdarkly.api.model.IntegrationSubscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Integration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:53:40.380Z")
public class Integration {
  @SerializedName("_links")
  private IntegrationLinks links = null;

  @SerializedName("items")
  private List<IntegrationSubscription> items = null;

  public Integration links(IntegrationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public IntegrationLinks getLinks() {
    return links;
  }

  public void setLinks(IntegrationLinks links) {
    this.links = links;
  }

  public Integration items(List<IntegrationSubscription> items) {
    this.items = items;
    return this;
  }

  public Integration addItemsItem(IntegrationSubscription itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<IntegrationSubscription>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<IntegrationSubscription> getItems() {
    return items;
  }

  public void setItems(List<IntegrationSubscription> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Integration integration = (Integration) o;
    return Objects.equals(this.links, integration.links) &&
        Objects.equals(this.items, integration.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Integration {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
