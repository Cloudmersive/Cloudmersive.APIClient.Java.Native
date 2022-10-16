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
 * Input to a string replacement request
 */
@ApiModel(description = "Input to a string replacement request")
@JsonPropertyOrder({
  ReplaceStringRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  ReplaceStringRequest.JSON_PROPERTY_INPUT_FILE_URL,
  ReplaceStringRequest.JSON_PROPERTY_MATCH_STRING,
  ReplaceStringRequest.JSON_PROPERTY_REPLACE_STRING,
  ReplaceStringRequest.JSON_PROPERTY_MATCH_CASE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class ReplaceStringRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_MATCH_STRING = "MatchString";
  private String matchString;

  public static final String JSON_PROPERTY_REPLACE_STRING = "ReplaceString";
  private String replaceString;

  public static final String JSON_PROPERTY_MATCH_CASE = "MatchCase";
  private Boolean matchCase;

  public ReplaceStringRequest() { 
  }

  public ReplaceStringRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public ReplaceStringRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public ReplaceStringRequest matchString(String matchString) {
    this.matchString = matchString;
    return this;
  }

   /**
   * String to search for and match against, to be replaced
   * @return matchString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String to search for and match against, to be replaced")
  @JsonProperty(JSON_PROPERTY_MATCH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchString() {
    return matchString;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }


  public ReplaceStringRequest replaceString(String replaceString) {
    this.replaceString = replaceString;
    return this;
  }

   /**
   * String to replace the matched values with
   * @return replaceString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String to replace the matched values with")
  @JsonProperty(JSON_PROPERTY_REPLACE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplaceString() {
    return replaceString;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplaceString(String replaceString) {
    this.replaceString = replaceString;
  }


  public ReplaceStringRequest matchCase(Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

   /**
   * True if the case should be matched, false for case insensitive match
   * @return matchCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the case should be matched, false for case insensitive match")
  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMatchCase() {
    return matchCase;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }


  /**
   * Return true if this ReplaceStringRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringRequest replaceStringRequest = (ReplaceStringRequest) o;
    return Arrays.equals(this.inputFileBytes, replaceStringRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, replaceStringRequest.inputFileUrl) &&
        Objects.equals(this.matchString, replaceStringRequest.matchString) &&
        Objects.equals(this.replaceString, replaceStringRequest.replaceString) &&
        Objects.equals(this.matchCase, replaceStringRequest.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, matchString, replaceString, matchCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
    sb.append("    replaceString: ").append(toIndentedString(replaceString)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
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

