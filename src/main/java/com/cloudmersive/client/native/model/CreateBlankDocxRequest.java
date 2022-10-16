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
 * Input to a Create Blank Word Document request
 */
@ApiModel(description = "Input to a Create Blank Word Document request")
@JsonPropertyOrder({
  CreateBlankDocxRequest.JSON_PROPERTY_INITIAL_TEXT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class CreateBlankDocxRequest {
  public static final String JSON_PROPERTY_INITIAL_TEXT = "InitialText";
  private String initialText;

  public CreateBlankDocxRequest() { 
  }

  public CreateBlankDocxRequest initialText(String initialText) {
    this.initialText = initialText;
    return this;
  }

   /**
   * Optional; initial text to include in the document
   * @return initialText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; initial text to include in the document")
  @JsonProperty(JSON_PROPERTY_INITIAL_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitialText() {
    return initialText;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialText(String initialText) {
    this.initialText = initialText;
  }


  /**
   * Return true if this CreateBlankDocxRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBlankDocxRequest createBlankDocxRequest = (CreateBlankDocxRequest) o;
    return Objects.equals(this.initialText, createBlankDocxRequest.initialText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBlankDocxRequest {\n");
    sb.append("    initialText: ").append(toIndentedString(initialText)).append("\n");
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

