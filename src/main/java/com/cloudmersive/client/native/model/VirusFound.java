/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
 * Virus positively identified
 */
@ApiModel(description = "Virus positively identified")
@JsonPropertyOrder({
  VirusFound.JSON_PROPERTY_FILE_NAME,
  VirusFound.JSON_PROPERTY_VIRUS_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:33.579104100-07:00[America/Los_Angeles]")
public class VirusFound {
  public static final String JSON_PROPERTY_FILE_NAME = "FileName";
  private String fileName;

  public static final String JSON_PROPERTY_VIRUS_NAME = "VirusName";
  private String virusName;

  public VirusFound() { 
  }

  public VirusFound fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the file containing the virus
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the file containing the virus")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public VirusFound virusName(String virusName) {
    this.virusName = virusName;
    return this;
  }

   /**
   * Name of the virus that was found
   * @return virusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the virus that was found")
  @JsonProperty(JSON_PROPERTY_VIRUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirusName() {
    return virusName;
  }


  @JsonProperty(JSON_PROPERTY_VIRUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirusName(String virusName) {
    this.virusName = virusName;
  }


  /**
   * Return true if this VirusFound object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirusFound virusFound = (VirusFound) o;
    return Objects.equals(this.fileName, virusFound.fileName) &&
        Objects.equals(this.virusName, virusFound.virusName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, virusName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirusFound {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    virusName: ").append(toIndentedString(virusName)).append("\n");
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

