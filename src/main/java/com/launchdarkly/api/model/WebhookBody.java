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
import com.launchdarkly.api.model.Statements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:49:38.633Z")
public class WebhookBody {
  @SerializedName("url")
  private String url = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("sign")
  private Boolean sign = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("statements")
  private Statements statements = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public WebhookBody url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the remote webhook.
   * @return url
  **/
  @ApiModelProperty(example = "https://example.com/example", required = true, value = "The URL of the remote webhook.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookBody secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.
   * @return secret
  **/
  @ApiModelProperty(example = "<password>", value = "If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public WebhookBody sign(Boolean sign) {
    this.sign = sign;
    return this;
  }

   /**
   * If sign is false, the webhook will not include a signature header, and the secret can be omitted.
   * @return sign
  **/
  @ApiModelProperty(required = true, value = "If sign is false, the webhook will not include a signature header, and the secret can be omitted.")
  public Boolean isSign() {
    return sign;
  }

  public void setSign(Boolean sign) {
    this.sign = sign;
  }

  public WebhookBody on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether this webhook is enabled or not.
   * @return on
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether this webhook is enabled or not.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public WebhookBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the webhook.
   * @return name
  **/
  @ApiModelProperty(example = "Example hook", value = "The name of the webhook.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebhookBody statements(Statements statements) {
    this.statements = statements;
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")
  public Statements getStatements() {
    return statements;
  }

  public void setStatements(Statements statements) {
    this.statements = statements;
  }

  public WebhookBody tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WebhookBody addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags for the webhook.
   * @return tags
  **/
  @ApiModelProperty(example = "[]", value = "Tags for the webhook.")
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
    WebhookBody webhookBody = (WebhookBody) o;
    return Objects.equals(this.url, webhookBody.url) &&
        Objects.equals(this.secret, webhookBody.secret) &&
        Objects.equals(this.sign, webhookBody.sign) &&
        Objects.equals(this.on, webhookBody.on) &&
        Objects.equals(this.name, webhookBody.name) &&
        Objects.equals(this.statements, webhookBody.statements) &&
        Objects.equals(this.tags, webhookBody.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secret, sign, on, name, statements, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBody {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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

