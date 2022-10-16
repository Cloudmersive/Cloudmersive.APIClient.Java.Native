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
import com.cloudmersive.client.native.model.ConvertedJpgPage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Result of converting a RTF input to a JPG array
 */
@ApiModel(description = "Result of converting a RTF input to a JPG array")
@JsonPropertyOrder({
  RtfToJpgResult.JSON_PROPERTY_SUCCESSFUL,
  RtfToJpgResult.JSON_PROPERTY_JPG_RESULT_PAGES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class RtfToJpgResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_JPG_RESULT_PAGES = "JpgResultPages";
  private List<ConvertedJpgPage> jpgResultPages = null;

  public RtfToJpgResult() { 
  }

  public RtfToJpgResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public RtfToJpgResult jpgResultPages(List<ConvertedJpgPage> jpgResultPages) {
    this.jpgResultPages = jpgResultPages;
    return this;
  }

  public RtfToJpgResult addJpgResultPagesItem(ConvertedJpgPage jpgResultPagesItem) {
    if (this.jpgResultPages == null) {
      this.jpgResultPages = new ArrayList<>();
    }
    this.jpgResultPages.add(jpgResultPagesItem);
    return this;
  }

   /**
   * Array of converted pages
   * @return jpgResultPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of converted pages")
  @JsonProperty(JSON_PROPERTY_JPG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConvertedJpgPage> getJpgResultPages() {
    return jpgResultPages;
  }


  @JsonProperty(JSON_PROPERTY_JPG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJpgResultPages(List<ConvertedJpgPage> jpgResultPages) {
    this.jpgResultPages = jpgResultPages;
  }


  /**
   * Return true if this RtfToJpgResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtfToJpgResult rtfToJpgResult = (RtfToJpgResult) o;
    return Objects.equals(this.successful, rtfToJpgResult.successful) &&
        Objects.equals(this.jpgResultPages, rtfToJpgResult.jpgResultPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, jpgResultPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtfToJpgResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    jpgResultPages: ").append(toIndentedString(jpgResultPages)).append("\n");
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

