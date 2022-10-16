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
 * Result of running the URL website to Text operation
 */
@ApiModel(description = "Result of running the URL website to Text operation")
@JsonPropertyOrder({
  UrlToTextResponse.JSON_PROPERTY_SUCCESSFUL,
  UrlToTextResponse.JSON_PROPERTY_TEXT_CONTENT_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class UrlToTextResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_CONTENT_RESULT = "TextContentResult";
  private String textContentResult;

  public UrlToTextResponse() { 
  }

  public UrlToTextResponse successful(Boolean successful) {
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


  public UrlToTextResponse textContentResult(String textContentResult) {
    this.textContentResult = textContentResult;
    return this;
  }

   /**
   * Text content result from the URL website input
   * @return textContentResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text content result from the URL website input")
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
   * Return true if this UrlToTextResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlToTextResponse urlToTextResponse = (UrlToTextResponse) o;
    return Objects.equals(this.successful, urlToTextResponse.successful) &&
        Objects.equals(this.textContentResult, urlToTextResponse.textContentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textContentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlToTextResponse {\n");
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
