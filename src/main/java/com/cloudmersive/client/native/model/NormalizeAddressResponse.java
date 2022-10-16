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
 * Result of validating a street address
 */
@ApiModel(description = "Result of validating a street address")
@JsonPropertyOrder({
  NormalizeAddressResponse.JSON_PROPERTY_VALID_ADDRESS,
  NormalizeAddressResponse.JSON_PROPERTY_BUILDING,
  NormalizeAddressResponse.JSON_PROPERTY_STREET_NUMBER,
  NormalizeAddressResponse.JSON_PROPERTY_STREET,
  NormalizeAddressResponse.JSON_PROPERTY_CITY,
  NormalizeAddressResponse.JSON_PROPERTY_STATE_OR_PROVINCE,
  NormalizeAddressResponse.JSON_PROPERTY_POSTAL_CODE,
  NormalizeAddressResponse.JSON_PROPERTY_COUNTRY_FULL_NAME,
  NormalizeAddressResponse.JSON_PROPERTY_IS_O_TWO_LETTER_CODE,
  NormalizeAddressResponse.JSON_PROPERTY_LATITUDE,
  NormalizeAddressResponse.JSON_PROPERTY_LONGITUDE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:25:52.145220700-07:00[America/Los_Angeles]")
public class NormalizeAddressResponse {
  public static final String JSON_PROPERTY_VALID_ADDRESS = "ValidAddress";
  private Boolean validAddress;

  public static final String JSON_PROPERTY_BUILDING = "Building";
  private String building;

  public static final String JSON_PROPERTY_STREET_NUMBER = "StreetNumber";
  private String streetNumber;

  public static final String JSON_PROPERTY_STREET = "Street";
  private String street;

  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "StateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_POSTAL_CODE = "PostalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_IS_O_TWO_LETTER_CODE = "ISOTwoLetterCode";
  private String isOTwoLetterCode;

  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private Double longitude;

  public NormalizeAddressResponse() { 
  }

  public NormalizeAddressResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the address is valid, false otherwise
   * @return validAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the address is valid, false otherwise")
  @JsonProperty(JSON_PROPERTY_VALID_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidAddress() {
    return validAddress;
  }


  @JsonProperty(JSON_PROPERTY_VALID_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }


  public NormalizeAddressResponse building(String building) {
    this.building = building;
    return this;
  }

   /**
   * The name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null.
   * @return building
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the building, house or structure if applicable, such as \"Cloudmersive Building 2\".  This will often by null.")
  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuilding() {
    return building;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilding(String building) {
    this.building = building;
  }


  public NormalizeAddressResponse streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * The street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses.
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street number or house number of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"1600\".  This value will typically be populated for most addresses.")
  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetNumber() {
    return streetNumber;
  }


  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public NormalizeAddressResponse street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the street or road of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"Pennsylvania Avenue NW\".")
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  public NormalizeAddressResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the address.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city of the address.")
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


  public NormalizeAddressResponse stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The state or province of the address.
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province of the address.")
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


  public NormalizeAddressResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code or zip code of the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code or zip code of the address.")
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


  public NormalizeAddressResponse countryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Country of the address, if present in the address.  If not included in the address it will be null.
   * @return countryFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of the address, if present in the address.  If not included in the address it will be null.")
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


  public NormalizeAddressResponse isOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }


  public NormalizeAddressResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * If the address is valid, the degrees latitude of the validated address, null otherwise
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the address is valid, the degrees latitude of the validated address, null otherwise")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public NormalizeAddressResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * If the address is valid, the degrees longitude of the validated address, null otherwise
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the address is valid, the degrees longitude of the validated address, null otherwise")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  /**
   * Return true if this NormalizeAddressResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizeAddressResponse normalizeAddressResponse = (NormalizeAddressResponse) o;
    return Objects.equals(this.validAddress, normalizeAddressResponse.validAddress) &&
        Objects.equals(this.building, normalizeAddressResponse.building) &&
        Objects.equals(this.streetNumber, normalizeAddressResponse.streetNumber) &&
        Objects.equals(this.street, normalizeAddressResponse.street) &&
        Objects.equals(this.city, normalizeAddressResponse.city) &&
        Objects.equals(this.stateOrProvince, normalizeAddressResponse.stateOrProvince) &&
        Objects.equals(this.postalCode, normalizeAddressResponse.postalCode) &&
        Objects.equals(this.countryFullName, normalizeAddressResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, normalizeAddressResponse.isOTwoLetterCode) &&
        Objects.equals(this.latitude, normalizeAddressResponse.latitude) &&
        Objects.equals(this.longitude, normalizeAddressResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, building, streetNumber, street, city, stateOrProvince, postalCode, countryFullName, isOTwoLetterCode, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizeAddressResponse {\n");
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

