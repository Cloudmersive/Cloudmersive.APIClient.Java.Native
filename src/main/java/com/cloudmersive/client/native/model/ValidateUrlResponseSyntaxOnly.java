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
 * Result of validating a URL with syntax only
 */
@ApiModel(description = "Result of validating a URL with syntax only")
@JsonPropertyOrder({
  ValidateUrlResponseSyntaxOnly.JSON_PROPERTY_VALID_U_R_L,
  ValidateUrlResponseSyntaxOnly.JSON_PROPERTY_WELL_FORMED_U_R_L,
  ValidateUrlResponseSyntaxOnly.JSON_PROPERTY_TOP_LEVEL_DOMAIN_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:25:52.145220700-07:00[America/Los_Angeles]")
public class ValidateUrlResponseSyntaxOnly {
  public static final String JSON_PROPERTY_VALID_U_R_L = "ValidURL";
  private Boolean validURL;

  public static final String JSON_PROPERTY_WELL_FORMED_U_R_L = "WellFormedURL";
  private String wellFormedURL;

  public static final String JSON_PROPERTY_TOP_LEVEL_DOMAIN_NAME = "TopLevelDomainName";
  private String topLevelDomainName;

  public ValidateUrlResponseSyntaxOnly() { 
  }

  public ValidateUrlResponseSyntaxOnly validURL(Boolean validURL) {
    this.validURL = validURL;
    return this;
  }

   /**
   * True if the URL is valid, false otherwise
   * @return validURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the URL is valid, false otherwise")
  @JsonProperty(JSON_PROPERTY_VALID_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidURL() {
    return validURL;
  }


  @JsonProperty(JSON_PROPERTY_VALID_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidURL(Boolean validURL) {
    this.validURL = validURL;
  }


  public ValidateUrlResponseSyntaxOnly wellFormedURL(String wellFormedURL) {
    this.wellFormedURL = wellFormedURL;
    return this;
  }

   /**
   * Well-formed version of the URL
   * @return wellFormedURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Well-formed version of the URL")
  @JsonProperty(JSON_PROPERTY_WELL_FORMED_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWellFormedURL() {
    return wellFormedURL;
  }


  @JsonProperty(JSON_PROPERTY_WELL_FORMED_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWellFormedURL(String wellFormedURL) {
    this.wellFormedURL = wellFormedURL;
  }


  public ValidateUrlResponseSyntaxOnly topLevelDomainName(String topLevelDomainName) {
    this.topLevelDomainName = topLevelDomainName;
    return this;
  }

   /**
   * The top-level domain name of the URL, e.g. mydomain.com
   * @return topLevelDomainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The top-level domain name of the URL, e.g. mydomain.com")
  @JsonProperty(JSON_PROPERTY_TOP_LEVEL_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopLevelDomainName() {
    return topLevelDomainName;
  }


  @JsonProperty(JSON_PROPERTY_TOP_LEVEL_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopLevelDomainName(String topLevelDomainName) {
    this.topLevelDomainName = topLevelDomainName;
  }


  /**
   * Return true if this ValidateUrlResponseSyntaxOnly object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateUrlResponseSyntaxOnly validateUrlResponseSyntaxOnly = (ValidateUrlResponseSyntaxOnly) o;
    return Objects.equals(this.validURL, validateUrlResponseSyntaxOnly.validURL) &&
        Objects.equals(this.wellFormedURL, validateUrlResponseSyntaxOnly.wellFormedURL) &&
        Objects.equals(this.topLevelDomainName, validateUrlResponseSyntaxOnly.topLevelDomainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validURL, wellFormedURL, topLevelDomainName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateUrlResponseSyntaxOnly {\n");
    sb.append("    validURL: ").append(toIndentedString(validURL)).append("\n");
    sb.append("    wellFormedURL: ").append(toIndentedString(wellFormedURL)).append("\n");
    sb.append("    topLevelDomainName: ").append(toIndentedString(topLevelDomainName)).append("\n");
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

