/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Links;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Member
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-25T12:54:15.848-07:00")
public class Member {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("_pendingInvite")
  private Boolean pendingInvite = null;

  @SerializedName("isBeta")
  private Boolean isBeta = null;

  @SerializedName("customRoles")
  private List<String> customRoles = null;

  public Member links(Links links) {
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

  public Member id(String id) {
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

  public Member role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Member email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Member pendingInvite(Boolean pendingInvite) {
    this.pendingInvite = pendingInvite;
    return this;
  }

   /**
   * Get pendingInvite
   * @return pendingInvite
  **/
  @ApiModelProperty(value = "")
  public Boolean getPendingInvite() {
    return pendingInvite;
  }

  public void setPendingInvite(Boolean pendingInvite) {
    this.pendingInvite = pendingInvite;
  }

  public Member isBeta(Boolean isBeta) {
    this.isBeta = isBeta;
    return this;
  }

   /**
   * Get isBeta
   * @return isBeta
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsBeta() {
    return isBeta;
  }

  public void setIsBeta(Boolean isBeta) {
    this.isBeta = isBeta;
  }

  public Member customRoles(List<String> customRoles) {
    this.customRoles = customRoles;
    return this;
  }

  public Member addCustomRolesItem(String customRolesItem) {
    if (this.customRoles == null) {
      this.customRoles = new ArrayList<String>();
    }
    this.customRoles.add(customRolesItem);
    return this;
  }

   /**
   * Get customRoles
   * @return customRoles
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomRoles() {
    return customRoles;
  }

  public void setCustomRoles(List<String> customRoles) {
    this.customRoles = customRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.links, member.links) &&
        Objects.equals(this.id, member.id) &&
        Objects.equals(this.role, member.role) &&
        Objects.equals(this.email, member.email) &&
        Objects.equals(this.pendingInvite, member.pendingInvite) &&
        Objects.equals(this.isBeta, member.isBeta) &&
        Objects.equals(this.customRoles, member.customRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, role, email, pendingInvite, isBeta, customRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    pendingInvite: ").append(toIndentedString(pendingInvite)).append("\n");
    sb.append("    isBeta: ").append(toIndentedString(isBeta)).append("\n");
    sb.append("    customRoles: ").append(toIndentedString(customRoles)).append("\n");
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

