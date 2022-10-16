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
 * Result of a last name validation operation
 */
@ApiModel(description = "Result of a last name validation operation")
@JsonPropertyOrder({
  LastNameValidationResponse.JSON_PROPERTY_SUCCESSFUL,
  LastNameValidationResponse.JSON_PROPERTY_VALIDATION_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:50.092931600-07:00[America/Los_Angeles]")
public class LastNameValidationResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_VALIDATION_RESULT = "ValidationResult";
  private String validationResult;

  public LastNameValidationResponse() { 
  }

  public LastNameValidationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the validation operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the validation operation was successful, false otherwise")
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


  public LastNameValidationResponse validationResult(String validationResult) {
    this.validationResult = validationResult;
    return this;
  }

   /**
   * Possible values are: ValidLastName, ValidUnknownLastName, InvalidSpamInput, InvalidCharacters, InvalidEmpty
   * @return validationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Possible values are: ValidLastName, ValidUnknownLastName, InvalidSpamInput, InvalidCharacters, InvalidEmpty")
  @JsonProperty(JSON_PROPERTY_VALIDATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidationResult() {
    return validationResult;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationResult(String validationResult) {
    this.validationResult = validationResult;
  }


  /**
   * Return true if this LastNameValidationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastNameValidationResponse lastNameValidationResponse = (LastNameValidationResponse) o;
    return Objects.equals(this.successful, lastNameValidationResponse.successful) &&
        Objects.equals(this.validationResult, lastNameValidationResponse.validationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, validationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastNameValidationResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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

