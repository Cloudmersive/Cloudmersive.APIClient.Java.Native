/*
 * securityapi
 * The security APIs help you detect and block security threats.
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
 * Result of performing an XSS protection operation
 */
@ApiModel(description = "Result of performing an XSS protection operation")
@JsonPropertyOrder({
  StringXssProtectionResult.JSON_PROPERTY_SUCCESSFUL,
  StringXssProtectionResult.JSON_PROPERTY_CONTAINED_XSS,
  StringXssProtectionResult.JSON_PROPERTY_ORIGINAL_INPUT,
  StringXssProtectionResult.JSON_PROPERTY_NORMALIZED_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:42.827276700-07:00[America/Los_Angeles]")
public class StringXssProtectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTAINED_XSS = "ContainedXss";
  private Boolean containedXss;

  public static final String JSON_PROPERTY_ORIGINAL_INPUT = "OriginalInput";
  private String originalInput;

  public static final String JSON_PROPERTY_NORMALIZED_RESULT = "NormalizedResult";
  private String normalizedResult;

  public StringXssProtectionResult() { 
  }

  public StringXssProtectionResult successful(Boolean successful) {
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


  public StringXssProtectionResult containedXss(Boolean containedXss) {
    this.containedXss = containedXss;
    return this;
  }

   /**
   * True if the input contained XSS scripting, false otherwise
   * @return containedXss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained XSS scripting, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_XSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedXss() {
    return containedXss;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_XSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedXss(Boolean containedXss) {
    this.containedXss = containedXss;
  }


  public StringXssProtectionResult originalInput(String originalInput) {
    this.originalInput = originalInput;
    return this;
  }

   /**
   * Original input string
   * @return originalInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original input string")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalInput() {
    return originalInput;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalInput(String originalInput) {
    this.originalInput = originalInput;
  }


  public StringXssProtectionResult normalizedResult(String normalizedResult) {
    this.normalizedResult = normalizedResult;
    return this;
  }

   /**
   * Normalized string result, with XSS removed
   * @return normalizedResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Normalized string result, with XSS removed")
  @JsonProperty(JSON_PROPERTY_NORMALIZED_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalizedResult() {
    return normalizedResult;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZED_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedResult(String normalizedResult) {
    this.normalizedResult = normalizedResult;
  }


  /**
   * Return true if this StringXssProtectionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringXssProtectionResult stringXssProtectionResult = (StringXssProtectionResult) o;
    return Objects.equals(this.successful, stringXssProtectionResult.successful) &&
        Objects.equals(this.containedXss, stringXssProtectionResult.containedXss) &&
        Objects.equals(this.originalInput, stringXssProtectionResult.originalInput) &&
        Objects.equals(this.normalizedResult, stringXssProtectionResult.normalizedResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedXss, originalInput, normalizedResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringXssProtectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedXss: ").append(toIndentedString(containedXss)).append("\n");
    sb.append("    originalInput: ").append(toIndentedString(originalInput)).append("\n");
    sb.append("    normalizedResult: ").append(toIndentedString(normalizedResult)).append("\n");
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

