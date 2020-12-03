/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.9.2
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
 * FeatureFlagChangeRequestReviewConfigBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-03T00:55:33.026Z")
public class FeatureFlagChangeRequestReviewConfigBody {
  /**
   * Either approve or decline change request
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    APPROVE("approve"),
    
    DECLINE("decline");

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

  @SerializedName("comment")
  private String comment = null;

  public FeatureFlagChangeRequestReviewConfigBody kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Either approve or decline change request
   * @return kind
  **/
  @ApiModelProperty(example = "approve", required = true, value = "Either approve or decline change request")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public FeatureFlagChangeRequestReviewConfigBody comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * comment will be included in audit log item for change.
   * @return comment
  **/
  @ApiModelProperty(example = "This is a comment string", value = "comment will be included in audit log item for change.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagChangeRequestReviewConfigBody featureFlagChangeRequestReviewConfigBody = (FeatureFlagChangeRequestReviewConfigBody) o;
    return Objects.equals(this.kind, featureFlagChangeRequestReviewConfigBody.kind) &&
        Objects.equals(this.comment, featureFlagChangeRequestReviewConfigBody.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagChangeRequestReviewConfigBody {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
