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
 * Syntactic validity of email address
 */
@ApiModel(description = "Syntactic validity of email address")
@JsonPropertyOrder({
  AddressVerifySyntaxOnlyResponse.JSON_PROPERTY_VALID_ADDRESS,
  AddressVerifySyntaxOnlyResponse.JSON_PROPERTY_DOMAIN,
  AddressVerifySyntaxOnlyResponse.JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER,
  AddressVerifySyntaxOnlyResponse.JSON_PROPERTY_IS_DISPOSABLE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:50.092931600-07:00[America/Los_Angeles]")
public class AddressVerifySyntaxOnlyResponse {
  public static final String JSON_PROPERTY_VALID_ADDRESS = "ValidAddress";
  private Boolean validAddress;

  public static final String JSON_PROPERTY_DOMAIN = "Domain";
  private String domain;

  public static final String JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER = "IsFreeEmailProvider";
  private Boolean isFreeEmailProvider;

  public static final String JSON_PROPERTY_IS_DISPOSABLE = "IsDisposable";
  private Boolean isDisposable;

  public AddressVerifySyntaxOnlyResponse() { 
  }

  public AddressVerifySyntaxOnlyResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the email address is syntactically valid, false if it is not
   * @return validAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the email address is syntactically valid, false if it is not")
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


  public AddressVerifySyntaxOnlyResponse domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain name of the email address
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Domain name of the email address")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public AddressVerifySyntaxOnlyResponse isFreeEmailProvider(Boolean isFreeEmailProvider) {
    this.isFreeEmailProvider = isFreeEmailProvider;
    return this;
  }

   /**
   * True if the email domain name is a free provider (typically a free to sign up web email provider for consumers / personal use), false otherwise.
   * @return isFreeEmailProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the email domain name is a free provider (typically a free to sign up web email provider for consumers / personal use), false otherwise.")
  @JsonProperty(JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFreeEmailProvider() {
    return isFreeEmailProvider;
  }


  @JsonProperty(JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFreeEmailProvider(Boolean isFreeEmailProvider) {
    this.isFreeEmailProvider = isFreeEmailProvider;
  }


  public AddressVerifySyntaxOnlyResponse isDisposable(Boolean isDisposable) {
    this.isDisposable = isDisposable;
    return this;
  }

   /**
   * True if the email address is a disposable email address, false otherwise; these disposable providers are not typically used to receive email and so will have a low likelihood of opening mail sent there.
   * @return isDisposable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the email address is a disposable email address, false otherwise; these disposable providers are not typically used to receive email and so will have a low likelihood of opening mail sent there.")
  @JsonProperty(JSON_PROPERTY_IS_DISPOSABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDisposable() {
    return isDisposable;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISPOSABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDisposable(Boolean isDisposable) {
    this.isDisposable = isDisposable;
  }


  /**
   * Return true if this AddressVerifySyntaxOnlyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressVerifySyntaxOnlyResponse addressVerifySyntaxOnlyResponse = (AddressVerifySyntaxOnlyResponse) o;
    return Objects.equals(this.validAddress, addressVerifySyntaxOnlyResponse.validAddress) &&
        Objects.equals(this.domain, addressVerifySyntaxOnlyResponse.domain) &&
        Objects.equals(this.isFreeEmailProvider, addressVerifySyntaxOnlyResponse.isFreeEmailProvider) &&
        Objects.equals(this.isDisposable, addressVerifySyntaxOnlyResponse.isDisposable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, domain, isFreeEmailProvider, isDisposable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressVerifySyntaxOnlyResponse {\n");
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    isFreeEmailProvider: ").append(toIndentedString(isFreeEmailProvider)).append("\n");
    sb.append("    isDisposable: ").append(toIndentedString(isDisposable)).append("\n");
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

