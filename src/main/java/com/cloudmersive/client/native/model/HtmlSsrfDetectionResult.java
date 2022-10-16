/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of performing an XXE threat detection operation
 */
@ApiModel(description = "Result of performing an XXE threat detection operation")
@JsonPropertyOrder({
  HtmlSsrfDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  HtmlSsrfDetectionResult.JSON_PROPERTY_CONTAINED_THREATS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:32.375774100-07:00[America/Los_Angeles]")
public class HtmlSsrfDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTAINED_THREATS = "ContainedThreats";
  private Boolean containedThreats;

  public HtmlSsrfDetectionResult() { 
  }

  public HtmlSsrfDetectionResult successful(Boolean successful) {
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


  public HtmlSsrfDetectionResult containedThreats(Boolean containedThreats) {
    this.containedThreats = containedThreats;
    return this;
  }

   /**
   * True if the input contained SSRF threats, false otherwise
   * @return containedThreats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained SSRF threats, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_THREATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedThreats() {
    return containedThreats;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_THREATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedThreats(Boolean containedThreats) {
    this.containedThreats = containedThreats;
  }


  /**
   * Return true if this HtmlSsrfDetectionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlSsrfDetectionResult htmlSsrfDetectionResult = (HtmlSsrfDetectionResult) o;
    return Objects.equals(this.successful, htmlSsrfDetectionResult.successful) &&
        Objects.equals(this.containedThreats, htmlSsrfDetectionResult.containedThreats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedThreats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSsrfDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedThreats: ").append(toIndentedString(containedThreats)).append("\n");
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

