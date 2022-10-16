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


package com.cloudmersive.client.ntv.model;

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
 * Request to Validate a City and State or Province in a country
 */
@ApiModel(description = "Request to Validate a City and State or Province in a country")
@JsonPropertyOrder({
  ValidateCityRequest.JSON_PROPERTY_CITY,
  ValidateCityRequest.JSON_PROPERTY_STATE_OR_PROVINCE,
  ValidateCityRequest.JSON_PROPERTY_COUNTRY_FULL_NAME,
  ValidateCityRequest.JSON_PROPERTY_COUNTRY_CODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:56:16.404307500-07:00[America/Los_Angeles]")
public class ValidateCityRequest {
  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "StateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;

  public ValidateCityRequest() { 
  }

  public ValidateCityRequest city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Required: City of the address to validate, such as &#39;San Francisco&#39; or &#39;London&#39;
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required: City of the address to validate, such as 'San Francisco' or 'London'")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public ValidateCityRequest stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * Required: State or province of the address to validate, such as &#39;California&#39; or &#39;CA&#39;
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required: State or province of the address to validate, such as 'California' or 'CA'")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public ValidateCityRequest countryFullName(String countryFullName) {
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


  public ValidateCityRequest countryCode(String countryCode) {
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
   * Return true if this ValidateCityRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateCityRequest validateCityRequest = (ValidateCityRequest) o;
    return Objects.equals(this.city, validateCityRequest.city) &&
        Objects.equals(this.stateOrProvince, validateCityRequest.stateOrProvince) &&
        Objects.equals(this.countryFullName, validateCityRequest.countryFullName) &&
        Objects.equals(this.countryCode, validateCityRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, stateOrProvince, countryFullName, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateCityRequest {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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
