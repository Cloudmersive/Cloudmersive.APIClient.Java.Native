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
 * Request to Validate a Postal Code
 */
@ApiModel(description = "Request to Validate a Postal Code")
@JsonPropertyOrder({
  ValidatePostalCodeRequest.JSON_PROPERTY_POSTAL_CODE,
  ValidatePostalCodeRequest.JSON_PROPERTY_COUNTRY_FULL_NAME,
  ValidatePostalCodeRequest.JSON_PROPERTY_COUNTRY_CODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:32.375774100-07:00[America/Los_Angeles]")
public class ValidatePostalCodeRequest {
  public static final String JSON_PROPERTY_POSTAL_CODE = "PostalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;

  public ValidatePostalCodeRequest() { 
  }

  public ValidatePostalCodeRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Required: Zip code or postal code of the address to validate, such as &#39;94597&#39;
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required: Zip code or postal code of the address to validate, such as '94597'")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ValidatePostalCodeRequest countryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Optional (recommended); Name of the country, such as &#39;United States&#39;.  If left blank, and CountryCode is also left blank, will default to United States.  Global countries are supported.
   * @return countryFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional (recommended); Name of the country, such as 'United States'.  If left blank, and CountryCode is also left blank, will default to United States.  Global countries are supported.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryFullName() {
    return countryFullName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }


  public ValidatePostalCodeRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Optional; two-letter country code (Two-letter ISO 3166-1 country code) of the country.  If left blank, and CountryFullName is also left blank, will default to United States.  Global countries are supported.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; two-letter country code (Two-letter ISO 3166-1 country code) of the country.  If left blank, and CountryFullName is also left blank, will default to United States.  Global countries are supported.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * Return true if this ValidatePostalCodeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatePostalCodeRequest validatePostalCodeRequest = (ValidatePostalCodeRequest) o;
    return Objects.equals(this.postalCode, validatePostalCodeRequest.postalCode) &&
        Objects.equals(this.countryFullName, validatePostalCodeRequest.countryFullName) &&
        Objects.equals(this.countryCode, validatePostalCodeRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, countryFullName, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePostalCodeRequest {\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

