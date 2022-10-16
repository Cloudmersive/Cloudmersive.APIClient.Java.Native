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
 * Input lead contact; fill in known fields to extend them with matched field values
 */
@ApiModel(description = "Input lead contact; fill in known fields to extend them with matched field values")
@JsonPropertyOrder({
  LeadEnrichmentRequest.JSON_PROPERTY_CONTACT_BUSINESS_EMAIL,
  LeadEnrichmentRequest.JSON_PROPERTY_CONTACT_FIRST_NAME,
  LeadEnrichmentRequest.JSON_PROPERTY_CONTACT_LAST_NAME,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_NAME,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_DOMAIN_NAME,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_HOUSE_NUMBER,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_STREET,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_CITY,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_POSTAL_CODE,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_COUNTRY,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_COUNTRY_CODE,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_TELEPHONE,
  LeadEnrichmentRequest.JSON_PROPERTY_COMPANY_V_A_T_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:32.375774100-07:00[America/Los_Angeles]")
public class LeadEnrichmentRequest {
  public static final String JSON_PROPERTY_CONTACT_BUSINESS_EMAIL = "ContactBusinessEmail";
  private String contactBusinessEmail;

  public static final String JSON_PROPERTY_CONTACT_FIRST_NAME = "ContactFirstName";
  private String contactFirstName;

  public static final String JSON_PROPERTY_CONTACT_LAST_NAME = "ContactLastName";
  private String contactLastName;

  public static final String JSON_PROPERTY_COMPANY_NAME = "CompanyName";
  private String companyName;

  public static final String JSON_PROPERTY_COMPANY_DOMAIN_NAME = "CompanyDomainName";
  private String companyDomainName;

  public static final String JSON_PROPERTY_COMPANY_HOUSE_NUMBER = "CompanyHouseNumber";
  private String companyHouseNumber;

  public static final String JSON_PROPERTY_COMPANY_STREET = "CompanyStreet";
  private String companyStreet;

  public static final String JSON_PROPERTY_COMPANY_CITY = "CompanyCity";
  private String companyCity;

  public static final String JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE = "CompanyStateOrProvince";
  private String companyStateOrProvince;

  public static final String JSON_PROPERTY_COMPANY_POSTAL_CODE = "CompanyPostalCode";
  private String companyPostalCode;

  public static final String JSON_PROPERTY_COMPANY_COUNTRY = "CompanyCountry";
  private String companyCountry;

  public static final String JSON_PROPERTY_COMPANY_COUNTRY_CODE = "CompanyCountryCode";
  private String companyCountryCode;

  public static final String JSON_PROPERTY_COMPANY_TELEPHONE = "CompanyTelephone";
  private String companyTelephone;

  public static final String JSON_PROPERTY_COMPANY_V_A_T_NUMBER = "CompanyVATNumber";
  private String companyVATNumber;

  public LeadEnrichmentRequest() { 
  }

  public LeadEnrichmentRequest contactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
    return this;
  }

   /**
   * The person&#39;s business email address for the lead
   * @return contactBusinessEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person's business email address for the lead")
  @JsonProperty(JSON_PROPERTY_CONTACT_BUSINESS_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactBusinessEmail() {
    return contactBusinessEmail;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_BUSINESS_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
  }


  public LeadEnrichmentRequest contactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * The person&#39;s first name for the lead
   * @return contactFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person's first name for the lead")
  @JsonProperty(JSON_PROPERTY_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactFirstName() {
    return contactFirstName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }


  public LeadEnrichmentRequest contactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * The person&#39;s last name for the lead
   * @return contactLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person's last name for the lead")
  @JsonProperty(JSON_PROPERTY_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactLastName() {
    return contactLastName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }


  public LeadEnrichmentRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company for the lead
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public LeadEnrichmentRequest companyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
    return this;
  }

   /**
   * Domain name / website for the lead
   * @return companyDomainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Domain name / website for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyDomainName() {
    return companyDomainName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
  }


  public LeadEnrichmentRequest companyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
    return this;
  }

   /**
   * House number of the address of the company for the lead
   * @return companyHouseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "House number of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyHouseNumber() {
    return companyHouseNumber;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
  }


  public LeadEnrichmentRequest companyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
    return this;
  }

   /**
   * Street name of the address of the company for the lead
   * @return companyStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street name of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyStreet() {
    return companyStreet;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
  }


  public LeadEnrichmentRequest companyCity(String companyCity) {
    this.companyCity = companyCity;
    return this;
  }

   /**
   * City of the address of the company for the lead
   * @return companyCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCity() {
    return companyCity;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCity(String companyCity) {
    this.companyCity = companyCity;
  }


  public LeadEnrichmentRequest companyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
    return this;
  }

   /**
   * State or Province of the address of the company for the lead
   * @return companyStateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State or Province of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyStateOrProvince() {
    return companyStateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
  }


  public LeadEnrichmentRequest companyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
    return this;
  }

   /**
   * Postal Code of the address of the company for the lead
   * @return companyPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal Code of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyPostalCode() {
    return companyPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
  }


  public LeadEnrichmentRequest companyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
    return this;
  }

   /**
   * Country of the address of the company for the lead
   * @return companyCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCountry() {
    return companyCountry;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
  }


  public LeadEnrichmentRequest companyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
    return this;
  }

   /**
   * Country Code (2-letter ISO 3166-1) of the address of the company for the lead
   * @return companyCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country Code (2-letter ISO 3166-1) of the address of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCountryCode() {
    return companyCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
  }


  public LeadEnrichmentRequest companyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
    return this;
  }

   /**
   * Telephone of the company office for the lead
   * @return companyTelephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Telephone of the company office for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyTelephone() {
    return companyTelephone;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
  }


  public LeadEnrichmentRequest companyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
    return this;
  }

   /**
   * VAT number of the company for the lead
   * @return companyVATNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VAT number of the company for the lead")
  @JsonProperty(JSON_PROPERTY_COMPANY_V_A_T_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyVATNumber() {
    return companyVATNumber;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_V_A_T_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
  }


  /**
   * Return true if this LeadEnrichmentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadEnrichmentRequest leadEnrichmentRequest = (LeadEnrichmentRequest) o;
    return Objects.equals(this.contactBusinessEmail, leadEnrichmentRequest.contactBusinessEmail) &&
        Objects.equals(this.contactFirstName, leadEnrichmentRequest.contactFirstName) &&
        Objects.equals(this.contactLastName, leadEnrichmentRequest.contactLastName) &&
        Objects.equals(this.companyName, leadEnrichmentRequest.companyName) &&
        Objects.equals(this.companyDomainName, leadEnrichmentRequest.companyDomainName) &&
        Objects.equals(this.companyHouseNumber, leadEnrichmentRequest.companyHouseNumber) &&
        Objects.equals(this.companyStreet, leadEnrichmentRequest.companyStreet) &&
        Objects.equals(this.companyCity, leadEnrichmentRequest.companyCity) &&
        Objects.equals(this.companyStateOrProvince, leadEnrichmentRequest.companyStateOrProvince) &&
        Objects.equals(this.companyPostalCode, leadEnrichmentRequest.companyPostalCode) &&
        Objects.equals(this.companyCountry, leadEnrichmentRequest.companyCountry) &&
        Objects.equals(this.companyCountryCode, leadEnrichmentRequest.companyCountryCode) &&
        Objects.equals(this.companyTelephone, leadEnrichmentRequest.companyTelephone) &&
        Objects.equals(this.companyVATNumber, leadEnrichmentRequest.companyVATNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactBusinessEmail, contactFirstName, contactLastName, companyName, companyDomainName, companyHouseNumber, companyStreet, companyCity, companyStateOrProvince, companyPostalCode, companyCountry, companyCountryCode, companyTelephone, companyVATNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadEnrichmentRequest {\n");
    sb.append("    contactBusinessEmail: ").append(toIndentedString(contactBusinessEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDomainName: ").append(toIndentedString(companyDomainName)).append("\n");
    sb.append("    companyHouseNumber: ").append(toIndentedString(companyHouseNumber)).append("\n");
    sb.append("    companyStreet: ").append(toIndentedString(companyStreet)).append("\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("    companyStateOrProvince: ").append(toIndentedString(companyStateOrProvince)).append("\n");
    sb.append("    companyPostalCode: ").append(toIndentedString(companyPostalCode)).append("\n");
    sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
    sb.append("    companyCountryCode: ").append(toIndentedString(companyCountryCode)).append("\n");
    sb.append("    companyTelephone: ").append(toIndentedString(companyTelephone)).append("\n");
    sb.append("    companyVATNumber: ").append(toIndentedString(companyVATNumber)).append("\n");
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

