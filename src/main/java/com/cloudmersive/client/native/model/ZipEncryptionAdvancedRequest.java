/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Request to encrypt an existing Zip Archive file and protect it with a password
 */
@ApiModel(description = "Request to encrypt an existing Zip Archive file and protect it with a password")
@JsonPropertyOrder({
  ZipEncryptionAdvancedRequest.JSON_PROPERTY_INPUT_FILE_CONTENTS,
  ZipEncryptionAdvancedRequest.JSON_PROPERTY_PASSWORD,
  ZipEncryptionAdvancedRequest.JSON_PROPERTY_ENCRYPTION_ALGORITHM
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class ZipEncryptionAdvancedRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_CONTENTS = "InputFileContents";
  private byte[] inputFileContents;

  public static final String JSON_PROPERTY_PASSWORD = "Password";
  private String password;

  public static final String JSON_PROPERTY_ENCRYPTION_ALGORITHM = "EncryptionAlgorithm";
  private String encryptionAlgorithm;

  public ZipEncryptionAdvancedRequest() { 
  }

  public ZipEncryptionAdvancedRequest inputFileContents(byte[] inputFileContents) {
    this.inputFileContents = inputFileContents;
    return this;
  }

   /**
   * Input Zip File archive contents in bytes
   * @return inputFileContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input Zip File archive contents in bytes")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileContents() {
    return inputFileContents;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileContents(byte[] inputFileContents) {
    this.inputFileContents = inputFileContents;
  }


  public ZipEncryptionAdvancedRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password to place on the Zip file; the longer the password, the more secure
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password to place on the Zip file; the longer the password, the more secure")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public ZipEncryptionAdvancedRequest encryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
    return this;
  }

   /**
   * Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm).  Default is AES-256.
   * @return encryptionAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm).  Default is AES-256.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }


  /**
   * Return true if this ZipEncryptionAdvancedRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipEncryptionAdvancedRequest zipEncryptionAdvancedRequest = (ZipEncryptionAdvancedRequest) o;
    return Arrays.equals(this.inputFileContents, zipEncryptionAdvancedRequest.inputFileContents) &&
        Objects.equals(this.password, zipEncryptionAdvancedRequest.password) &&
        Objects.equals(this.encryptionAlgorithm, zipEncryptionAdvancedRequest.encryptionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileContents), password, encryptionAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipEncryptionAdvancedRequest {\n");
    sb.append("    inputFileContents: ").append(toIndentedString(inputFileContents)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
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

