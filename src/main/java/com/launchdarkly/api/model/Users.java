/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.3
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.api.model.Links;
import com.launchdarkly.api.model.UserRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Users
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-20T15:51:46.991-07:00")
public class Users {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("totalCount")
  private BigDecimal totalCount = null;

  @SerializedName("items")
  private List<UserRecord> items = null;

  public Users links(Links links) {
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

  public Users totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "3.0", value = "")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }

  public Users items(List<UserRecord> items) {
    this.items = items;
    return this;
  }

  public Users addItemsItem(UserRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<UserRecord>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<UserRecord> getItems() {
    return items;
  }

  public void setItems(List<UserRecord> items) {
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
    Users users = (Users) o;
    return Objects.equals(this.links, users.links) &&
        Objects.equals(this.totalCount, users.totalCount) &&
        Objects.equals(this.items, users.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

