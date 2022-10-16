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
 * Result of performing an Insecure Deserialization JSON protection operation
 */
@ApiModel(description = "Result of performing an Insecure Deserialization JSON protection operation")
@JsonPropertyOrder({
  StringAutomaticThreatDetection.JSON_PROPERTY_SUCCESSFUL,
  StringAutomaticThreatDetection.JSON_PROPERTY_CLEAN_RESULT,
  StringAutomaticThreatDetection.JSON_PROPERTY_CONTAINED_JSON_INSECURE_DESERIALIZATION_ATTACK,
  StringAutomaticThreatDetection.JSON_PROPERTY_CONTAINED_XSS_THREAT,
  StringAutomaticThreatDetection.JSON_PROPERTY_CONTAINED_XXE_THREAT,
  StringAutomaticThreatDetection.JSON_PROPERTY_CONTAINED_SQL_INJECTION_THREAT,
  StringAutomaticThreatDetection.JSON_PROPERTY_CONTAINED_SSRF_THREAT,
  StringAutomaticThreatDetection.JSON_PROPERTY_IS_X_M_L,
  StringAutomaticThreatDetection.JSON_PROPERTY_IS_J_S_O_N,
  StringAutomaticThreatDetection.JSON_PROPERTY_IS_U_R_L,
  StringAutomaticThreatDetection.JSON_PROPERTY_ORIGINAL_INPUT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:34:21.930465900-07:00[America/Los_Angeles]")
public class StringAutomaticThreatDetection {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CLEAN_RESULT = "CleanResult";
  private Boolean cleanResult;

  public static final String JSON_PROPERTY_CONTAINED_JSON_INSECURE_DESERIALIZATION_ATTACK = "ContainedJsonInsecureDeserializationAttack";
  private Boolean containedJsonInsecureDeserializationAttack;

  public static final String JSON_PROPERTY_CONTAINED_XSS_THREAT = "ContainedXssThreat";
  private Boolean containedXssThreat;

  public static final String JSON_PROPERTY_CONTAINED_XXE_THREAT = "ContainedXxeThreat";
  private Boolean containedXxeThreat;

  public static final String JSON_PROPERTY_CONTAINED_SQL_INJECTION_THREAT = "ContainedSqlInjectionThreat";
  private Boolean containedSqlInjectionThreat;

  public static final String JSON_PROPERTY_CONTAINED_SSRF_THREAT = "ContainedSsrfThreat";
  private Boolean containedSsrfThreat;

  public static final String JSON_PROPERTY_IS_X_M_L = "IsXML";
  private Boolean isXML;

  public static final String JSON_PROPERTY_IS_J_S_O_N = "IsJSON";
  private Boolean isJSON;

  public static final String JSON_PROPERTY_IS_U_R_L = "IsURL";
  private Boolean isURL;

  public static final String JSON_PROPERTY_ORIGINAL_INPUT = "OriginalInput";
  private String originalInput;

  public StringAutomaticThreatDetection() { 
  }

  public StringAutomaticThreatDetection successful(Boolean successful) {
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


  public StringAutomaticThreatDetection cleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * Get cleanResult
   * @return cleanResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLEAN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleanResult() {
    return cleanResult;
  }


  @JsonProperty(JSON_PROPERTY_CLEAN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }


  public StringAutomaticThreatDetection containedJsonInsecureDeserializationAttack(Boolean containedJsonInsecureDeserializationAttack) {
    this.containedJsonInsecureDeserializationAttack = containedJsonInsecureDeserializationAttack;
    return this;
  }

   /**
   * True if the input contained Insecure Deserialization JSON, false otherwise
   * @return containedJsonInsecureDeserializationAttack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained Insecure Deserialization JSON, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_JSON_INSECURE_DESERIALIZATION_ATTACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedJsonInsecureDeserializationAttack() {
    return containedJsonInsecureDeserializationAttack;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_JSON_INSECURE_DESERIALIZATION_ATTACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedJsonInsecureDeserializationAttack(Boolean containedJsonInsecureDeserializationAttack) {
    this.containedJsonInsecureDeserializationAttack = containedJsonInsecureDeserializationAttack;
  }


  public StringAutomaticThreatDetection containedXssThreat(Boolean containedXssThreat) {
    this.containedXssThreat = containedXssThreat;
    return this;
  }

   /**
   * True if the input contained XSS attack, false otherwise
   * @return containedXssThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained XSS attack, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_XSS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedXssThreat() {
    return containedXssThreat;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_XSS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedXssThreat(Boolean containedXssThreat) {
    this.containedXssThreat = containedXssThreat;
  }


  public StringAutomaticThreatDetection containedXxeThreat(Boolean containedXxeThreat) {
    this.containedXxeThreat = containedXxeThreat;
    return this;
  }

   /**
   * True if the input contained XXE attack, false otherwise
   * @return containedXxeThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained XXE attack, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_XXE_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedXxeThreat() {
    return containedXxeThreat;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_XXE_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedXxeThreat(Boolean containedXxeThreat) {
    this.containedXxeThreat = containedXxeThreat;
  }


  public StringAutomaticThreatDetection containedSqlInjectionThreat(Boolean containedSqlInjectionThreat) {
    this.containedSqlInjectionThreat = containedSqlInjectionThreat;
    return this;
  }

   /**
   * True if the input contained SQL Injection attack, false otherwise
   * @return containedSqlInjectionThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained SQL Injection attack, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_SQL_INJECTION_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedSqlInjectionThreat() {
    return containedSqlInjectionThreat;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_SQL_INJECTION_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedSqlInjectionThreat(Boolean containedSqlInjectionThreat) {
    this.containedSqlInjectionThreat = containedSqlInjectionThreat;
  }


  public StringAutomaticThreatDetection containedSsrfThreat(Boolean containedSsrfThreat) {
    this.containedSsrfThreat = containedSsrfThreat;
    return this;
  }

   /**
   * True if the input contained an Server-Side Request Forgery (SSRF) URL attack, false otherwise
   * @return containedSsrfThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input contained an Server-Side Request Forgery (SSRF) URL attack, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINED_SSRF_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainedSsrfThreat() {
    return containedSsrfThreat;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINED_SSRF_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainedSsrfThreat(Boolean containedSsrfThreat) {
    this.containedSsrfThreat = containedSsrfThreat;
  }


  public StringAutomaticThreatDetection isXML(Boolean isXML) {
    this.isXML = isXML;
    return this;
  }

   /**
   * True if the input string is XML, false otherwise
   * @return isXML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input string is XML, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_X_M_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsXML() {
    return isXML;
  }


  @JsonProperty(JSON_PROPERTY_IS_X_M_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsXML(Boolean isXML) {
    this.isXML = isXML;
  }


  public StringAutomaticThreatDetection isJSON(Boolean isJSON) {
    this.isJSON = isJSON;
    return this;
  }

   /**
   * True if the input string is JSON, false otherwise
   * @return isJSON
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input string is JSON, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_J_S_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsJSON() {
    return isJSON;
  }


  @JsonProperty(JSON_PROPERTY_IS_J_S_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsJSON(Boolean isJSON) {
    this.isJSON = isJSON;
  }


  public StringAutomaticThreatDetection isURL(Boolean isURL) {
    this.isURL = isURL;
    return this;
  }

   /**
   * True if the input string is a URL, false otherwise
   * @return isURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input string is a URL, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsURL() {
    return isURL;
  }


  @JsonProperty(JSON_PROPERTY_IS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsURL(Boolean isURL) {
    this.isURL = isURL;
  }


  public StringAutomaticThreatDetection originalInput(String originalInput) {
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


  /**
   * Return true if this StringAutomaticThreatDetection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringAutomaticThreatDetection stringAutomaticThreatDetection = (StringAutomaticThreatDetection) o;
    return Objects.equals(this.successful, stringAutomaticThreatDetection.successful) &&
        Objects.equals(this.cleanResult, stringAutomaticThreatDetection.cleanResult) &&
        Objects.equals(this.containedJsonInsecureDeserializationAttack, stringAutomaticThreatDetection.containedJsonInsecureDeserializationAttack) &&
        Objects.equals(this.containedXssThreat, stringAutomaticThreatDetection.containedXssThreat) &&
        Objects.equals(this.containedXxeThreat, stringAutomaticThreatDetection.containedXxeThreat) &&
        Objects.equals(this.containedSqlInjectionThreat, stringAutomaticThreatDetection.containedSqlInjectionThreat) &&
        Objects.equals(this.containedSsrfThreat, stringAutomaticThreatDetection.containedSsrfThreat) &&
        Objects.equals(this.isXML, stringAutomaticThreatDetection.isXML) &&
        Objects.equals(this.isJSON, stringAutomaticThreatDetection.isJSON) &&
        Objects.equals(this.isURL, stringAutomaticThreatDetection.isURL) &&
        Objects.equals(this.originalInput, stringAutomaticThreatDetection.originalInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cleanResult, containedJsonInsecureDeserializationAttack, containedXssThreat, containedXxeThreat, containedSqlInjectionThreat, containedSsrfThreat, isXML, isJSON, isURL, originalInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringAutomaticThreatDetection {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    containedJsonInsecureDeserializationAttack: ").append(toIndentedString(containedJsonInsecureDeserializationAttack)).append("\n");
    sb.append("    containedXssThreat: ").append(toIndentedString(containedXssThreat)).append("\n");
    sb.append("    containedXxeThreat: ").append(toIndentedString(containedXxeThreat)).append("\n");
    sb.append("    containedSqlInjectionThreat: ").append(toIndentedString(containedSqlInjectionThreat)).append("\n");
    sb.append("    containedSsrfThreat: ").append(toIndentedString(containedSsrfThreat)).append("\n");
    sb.append("    isXML: ").append(toIndentedString(isXML)).append("\n");
    sb.append("    isJSON: ").append(toIndentedString(isJSON)).append("\n");
    sb.append("    isURL: ").append(toIndentedString(isURL)).append("\n");
    sb.append("    originalInput: ").append(toIndentedString(originalInput)).append("\n");
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

