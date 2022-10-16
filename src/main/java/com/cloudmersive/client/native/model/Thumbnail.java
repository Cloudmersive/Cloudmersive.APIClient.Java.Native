/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.native.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Result of converting a single document page to a PNG thumbnail
 */
@ApiModel(description = "Result of converting a single document page to a PNG thumbnail")
@JsonPropertyOrder({
  Thumbnail.JSON_PROPERTY_INDEX,
  Thumbnail.JSON_PROPERTY_CONTENT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class Thumbnail {
  public static final String JSON_PROPERTY_INDEX = "Index";
  private Integer index;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private byte[] content;

  public Thumbnail() { 
  }

  public Thumbnail index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Index of this thumbnail
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of this thumbnail")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public Thumbnail content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * A PNG thumbnail of the document page
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A PNG thumbnail of the document page")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(byte[] content) {
    this.content = content;
  }


  /**
   * Return true if this Thumbnail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thumbnail thumbnail = (Thumbnail) o;
    return Objects.equals(this.index, thumbnail.index) &&
        Arrays.equals(this.content, thumbnail.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, Arrays.hashCode(content));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thumbnail {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

