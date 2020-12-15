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
import com.launchdarkly.api.model.Links;
import com.launchdarkly.api.model.UserFlagSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserFlagSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T02:54:39.973Z")
public class UserFlagSettings {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("items")
  private Map<String, UserFlagSetting> items = null;

  public UserFlagSettings links(Links links) {
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

  public UserFlagSettings items(Map<String, UserFlagSetting> items) {
    this.items = items;
    return this;
  }

  public UserFlagSettings putItemsItem(String key, UserFlagSetting itemsItem) {
    if (this.items == null) {
      this.items = new HashMap<String, UserFlagSetting>();
    }
    this.items.put(key, itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "{\"sort.order\":{\"_links\":{\"self\":{\"href\":\"/api/v2/users/lacuna/production/Abbie_Braun/flags/sort.order\",\"type\":\"application/json\"},\"_value\":true}},\"alternate.page\":{\"_links\":{\"self\":{\"href\":\"/api/v2/users/lacuna/production/Abbie_Braun/flags/alternate.page\",\"type\":\"application/json\"}},\"_value\":\"false,\"}}", value = "")
  public Map<String, UserFlagSetting> getItems() {
    return items;
  }

  public void setItems(Map<String, UserFlagSetting> items) {
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
    UserFlagSettings userFlagSettings = (UserFlagSettings) o;
    return Objects.equals(this.links, userFlagSettings.links) &&
        Objects.equals(this.items, userFlagSettings.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFlagSettings {\n");
    
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

