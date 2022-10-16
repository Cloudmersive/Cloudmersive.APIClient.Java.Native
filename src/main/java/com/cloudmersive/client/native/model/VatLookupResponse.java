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
 * VatLookupResponse
 */
@JsonPropertyOrder({
  VatLookupResponse.JSON_PROPERTY_COUNTRY_CODE,
  VatLookupResponse.JSON_PROPERTY_VAT_NUMBER,
  VatLookupResponse.JSON_PROPERTY_IS_VALID,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_NAME,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_ADDRESS,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_BUILDING,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_STREET_NUMBER,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_STREET,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_CITY,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_STATE_OR_PROVINCE,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_POSTAL_CODE,
  VatLookupResponse.JSON_PROPERTY_BUSINESS_COUNTRY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:25:52.145220700-07:00[America/Los_Angeles]")
public class VatLookupResponse {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_VAT_NUMBER = "VatNumber";
  private String vatNumber;

  public static final String JSON_PROPERTY_IS_VALID = "IsValid";
  private Boolean isValid;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "BusinessName";
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_ADDRESS = "BusinessAddress";
  private String businessAddress;

  public static final String JSON_PROPERTY_BUSINESS_BUILDING = "BusinessBuilding";
  private String businessBuilding;

  public static final String JSON_PROPERTY_BUSINESS_STREET_NUMBER = "BusinessStreetNumber";
  private String businessStreetNumber;

  public static final String JSON_PROPERTY_BUSINESS_STREET = "BusinessStreet";
  private String businessStreet;

  public static final String JSON_PROPERTY_BUSINESS_CITY = "BusinessCity";
  private String businessCity;

  public static final String JSON_PROPERTY_BUSINESS_STATE_OR_PROVINCE = "BusinessStateOrProvince";
  private String businessStateOrProvince;

  public static final String JSON_PROPERTY_BUSINESS_POSTAL_CODE = "BusinessPostalCode";
  private String businessPostalCode;

  public static final String JSON_PROPERTY_BUSINESS_COUNTRY = "BusinessCountry";
  private String businessCountry;

  public VatLookupResponse() { 
  }

  public VatLookupResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter country code
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter country code")
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


  public VatLookupResponse vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * VAT number
   * @return vatNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VAT number")
  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVatNumber() {
    return vatNumber;
  }


  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }


  public VatLookupResponse isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * True if the VAT code is valid, false otherwise
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the VAT code is valid, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsValid() {
    return isValid;
  }


  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public VatLookupResponse businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the business")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public VatLookupResponse businessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Business address as a single string
   * @return businessAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Business address as a single string")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessAddress() {
    return businessAddress;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
  }


  public VatLookupResponse businessBuilding(String businessBuilding) {
    this.businessBuilding = businessBuilding;
    return this;
  }

   /**
   * For the business address, the name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null.
   * @return businessBuilding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, the name of the building, house or structure if applicable, such as \"Cloudmersive Building 2\".  This will often by null.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessBuilding() {
    return businessBuilding;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessBuilding(String businessBuilding) {
    this.businessBuilding = businessBuilding;
  }


  public VatLookupResponse businessStreetNumber(String businessStreetNumber) {
    this.businessStreetNumber = businessStreetNumber;
    return this;
  }

   /**
   * For the business address, the street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses.
   * @return businessStreetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, the street number or house number of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"1600\".  This value will typically be populated for most addresses.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessStreetNumber() {
    return businessStreetNumber;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessStreetNumber(String businessStreetNumber) {
    this.businessStreetNumber = businessStreetNumber;
  }


  public VatLookupResponse businessStreet(String businessStreet) {
    this.businessStreet = businessStreet;
    return this;
  }

   /**
   * For the business address, the name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;.
   * @return businessStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, the name of the street or road of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"Pennsylvania Avenue NW\".")
  @JsonProperty(JSON_PROPERTY_BUSINESS_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessStreet() {
    return businessStreet;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessStreet(String businessStreet) {
    this.businessStreet = businessStreet;
  }


  public VatLookupResponse businessCity(String businessCity) {
    this.businessCity = businessCity;
    return this;
  }

   /**
   * For the business address, the city of the address.
   * @return businessCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, the city of the address.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessCity() {
    return businessCity;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessCity(String businessCity) {
    this.businessCity = businessCity;
  }


  public VatLookupResponse businessStateOrProvince(String businessStateOrProvince) {
    this.businessStateOrProvince = businessStateOrProvince;
    return this;
  }

   /**
   * For the business address, the state or province of the address.
   * @return businessStateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, the state or province of the address.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessStateOrProvince() {
    return businessStateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessStateOrProvince(String businessStateOrProvince) {
    this.businessStateOrProvince = businessStateOrProvince;
  }


  public VatLookupResponse businessPostalCode(String businessPostalCode) {
    this.businessPostalCode = businessPostalCode;
    return this;
  }

   /**
   * For the business address, the postal code or zip code of the address.
   * @return businessPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, the postal code or zip code of the address.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessPostalCode() {
    return businessPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessPostalCode(String businessPostalCode) {
    this.businessPostalCode = businessPostalCode;
  }


  public VatLookupResponse businessCountry(String businessCountry) {
    this.businessCountry = businessCountry;
    return this;
  }

   /**
   * For the business address, country of the address, if present in the address.  If not included in the address it will be null.
   * @return businessCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For the business address, country of the address, if present in the address.  If not included in the address it will be null.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessCountry() {
    return businessCountry;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessCountry(String businessCountry) {
    this.businessCountry = businessCountry;
  }


  /**
   * Return true if this VatLookupResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatLookupResponse vatLookupResponse = (VatLookupResponse) o;
    return Objects.equals(this.countryCode, vatLookupResponse.countryCode) &&
        Objects.equals(this.vatNumber, vatLookupResponse.vatNumber) &&
        Objects.equals(this.isValid, vatLookupResponse.isValid) &&
        Objects.equals(this.businessName, vatLookupResponse.businessName) &&
        Objects.equals(this.businessAddress, vatLookupResponse.businessAddress) &&
        Objects.equals(this.businessBuilding, vatLookupResponse.businessBuilding) &&
        Objects.equals(this.businessStreetNumber, vatLookupResponse.businessStreetNumber) &&
        Objects.equals(this.businessStreet, vatLookupResponse.businessStreet) &&
        Objects.equals(this.businessCity, vatLookupResponse.businessCity) &&
        Objects.equals(this.businessStateOrProvince, vatLookupResponse.businessStateOrProvince) &&
        Objects.equals(this.businessPostalCode, vatLookupResponse.businessPostalCode) &&
        Objects.equals(this.businessCountry, vatLookupResponse.businessCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, vatNumber, isValid, businessName, businessAddress, businessBuilding, businessStreetNumber, businessStreet, businessCity, businessStateOrProvince, businessPostalCode, businessCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatLookupResponse {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessBuilding: ").append(toIndentedString(businessBuilding)).append("\n");
    sb.append("    businessStreetNumber: ").append(toIndentedString(businessStreetNumber)).append("\n");
    sb.append("    businessStreet: ").append(toIndentedString(businessStreet)).append("\n");
    sb.append("    businessCity: ").append(toIndentedString(businessCity)).append("\n");
    sb.append("    businessStateOrProvince: ").append(toIndentedString(businessStateOrProvince)).append("\n");
    sb.append("    businessPostalCode: ").append(toIndentedString(businessPostalCode)).append("\n");
    sb.append("    businessCountry: ").append(toIndentedString(businessCountry)).append("\n");
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
