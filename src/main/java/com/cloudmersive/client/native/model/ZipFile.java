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
 * Representation of a file in a zip file
 */
@ApiModel(description = "Representation of a file in a zip file")
@JsonPropertyOrder({
  ZipFile.JSON_PROPERTY_FILE_NAME,
  ZipFile.JSON_PROPERTY_FILE_CONTENTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class ZipFile {
  public static final String JSON_PROPERTY_FILE_NAME = "FileName";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_CONTENTS = "FileContents";
  private byte[] fileContents;

  public ZipFile() { 
  }

  public ZipFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of this file
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of this file")
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


  public ZipFile fileContents(byte[] fileContents) {
    this.fileContents = fileContents;
    return this;
  }

   /**
   * Contents of this file
   * @return fileContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents of this file")
  @JsonProperty(JSON_PROPERTY_FILE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getFileContents() {
    return fileContents;
  }


  @JsonProperty(JSON_PROPERTY_FILE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileContents(byte[] fileContents) {
    this.fileContents = fileContents;
  }


  /**
   * Return true if this ZipFile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipFile zipFile = (ZipFile) o;
    return Objects.equals(this.fileName, zipFile.fileName) &&
        Arrays.equals(this.fileContents, zipFile.fileContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, Arrays.hashCode(fileContents));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipFile {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileContents: ").append(toIndentedString(fileContents)).append("\n");
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

