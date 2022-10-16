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
 * Result of replacing a string
 */
@ApiModel(description = "Result of replacing a string")
@JsonPropertyOrder({
  ReplaceStringSimpleResponse.JSON_PROPERTY_SUCCESSFUL,
  ReplaceStringSimpleResponse.JSON_PROPERTY_TEXT_CONTENT_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class ReplaceStringSimpleResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_CONTENT_RESULT = "TextContentResult";
  private String textContentResult;

  public ReplaceStringSimpleResponse() { 
  }

  public ReplaceStringSimpleResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
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


  public ReplaceStringSimpleResponse textContentResult(String textContentResult) {
    this.textContentResult = textContentResult;
    return this;
  }

   /**
   * Result of performing a replace string operation
   * @return textContentResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result of performing a replace string operation")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContentResult() {
    return textContentResult;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContentResult(String textContentResult) {
    this.textContentResult = textContentResult;
  }


  /**
   * Return true if this ReplaceStringSimpleResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringSimpleResponse replaceStringSimpleResponse = (ReplaceStringSimpleResponse) o;
    return Objects.equals(this.successful, replaceStringSimpleResponse.successful) &&
        Objects.equals(this.textContentResult, replaceStringSimpleResponse.textContentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textContentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringSimpleResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textContentResult: ").append(toIndentedString(textContentResult)).append("\n");
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

