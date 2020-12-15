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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DestinationBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T02:54:39.973Z")
public class DestinationBody {
  @SerializedName("name")
  private String name = null;

  /**
   * The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    GOOGLE_PUBSUB("google-pubsub"),
    
    KINESIS("kinesis"),
    
    MPARTICLE("mparticle"),
    
    SEGMENT("segment");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("kind")
  private KindEnum kind = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("on")
  private Boolean on = null;

  public DestinationBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-readable name for your data export destination.
   * @return name
  **/
  @ApiModelProperty(example = "Example Google Pub/Sub Destination", required = true, value = "A human-readable name for your data export destination.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DestinationBody kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.
   * @return kind
  **/
  @ApiModelProperty(example = "google-pubsub", required = true, value = "The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public DestinationBody config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * destination-specific configuration.
   * @return config
  **/
  @ApiModelProperty(example = "{\"project\":\"cool-project\",\"topic\":\"test\"}", required = true, value = "destination-specific configuration.")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public DestinationBody on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether the data export destination is on or not.
   * @return on
  **/
  @ApiModelProperty(example = "true", value = "Whether the data export destination is on or not.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationBody destinationBody = (DestinationBody) o;
    return Objects.equals(this.name, destinationBody.name) &&
        Objects.equals(this.kind, destinationBody.kind) &&
        Objects.equals(this.config, destinationBody.config) &&
        Objects.equals(this.on, destinationBody.on);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, kind, config, on);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
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

