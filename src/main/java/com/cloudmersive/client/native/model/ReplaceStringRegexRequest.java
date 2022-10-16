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
 * Request to replace a regex string in a string
 */
@ApiModel(description = "Request to replace a regex string in a string")
@JsonPropertyOrder({
  ReplaceStringRegexRequest.JSON_PROPERTY_TEXT_CONTENT,
  ReplaceStringRegexRequest.JSON_PROPERTY_REGULAR_EXPRESSION_STRING,
  ReplaceStringRegexRequest.JSON_PROPERTY_REPLACE_WITH_STRING
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class ReplaceStringRegexRequest {
  public static final String JSON_PROPERTY_TEXT_CONTENT = "TextContent";
  private String textContent;

  public static final String JSON_PROPERTY_REGULAR_EXPRESSION_STRING = "RegularExpressionString";
  private String regularExpressionString;

  public static final String JSON_PROPERTY_REPLACE_WITH_STRING = "ReplaceWithString";
  private String replaceWithString;

  public ReplaceStringRegexRequest() { 
  }

  public ReplaceStringRegexRequest textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * Input text content
   * @return textContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input text content")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContent() {
    return textContent;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }


  public ReplaceStringRegexRequest regularExpressionString(String regularExpressionString) {
    this.regularExpressionString = regularExpressionString;
    return this;
  }

   /**
   * Target input regular expression (regex) string to match and be replaced; supports all regular expression values
   * @return regularExpressionString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target input regular expression (regex) string to match and be replaced; supports all regular expression values")
  @JsonProperty(JSON_PROPERTY_REGULAR_EXPRESSION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegularExpressionString() {
    return regularExpressionString;
  }


  @JsonProperty(JSON_PROPERTY_REGULAR_EXPRESSION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegularExpressionString(String regularExpressionString) {
    this.regularExpressionString = regularExpressionString;
  }


  public ReplaceStringRegexRequest replaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
    return this;
  }

   /**
   * Replacement for target string; supports referencing indexed regex matched values from RegularExpressionString, such as $1, $2, and so on
   * @return replaceWithString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replacement for target string; supports referencing indexed regex matched values from RegularExpressionString, such as $1, $2, and so on")
  @JsonProperty(JSON_PROPERTY_REPLACE_WITH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplaceWithString() {
    return replaceWithString;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_WITH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
  }


  /**
   * Return true if this ReplaceStringRegexRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringRegexRequest replaceStringRegexRequest = (ReplaceStringRegexRequest) o;
    return Objects.equals(this.textContent, replaceStringRegexRequest.textContent) &&
        Objects.equals(this.regularExpressionString, replaceStringRegexRequest.regularExpressionString) &&
        Objects.equals(this.replaceWithString, replaceStringRegexRequest.replaceWithString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, regularExpressionString, replaceWithString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringRegexRequest {\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    regularExpressionString: ").append(toIndentedString(regularExpressionString)).append("\n");
    sb.append("    replaceWithString: ").append(toIndentedString(replaceWithString)).append("\n");
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

