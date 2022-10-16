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
 * Converted page as an image
 */
@ApiModel(description = "Converted page as an image")
@JsonPropertyOrder({
  PageConversionResult.JSON_PROPERTY_FILENAME,
  PageConversionResult.JSON_PROPERTY_FILE_BYTES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:52.110310500-07:00[America/Los_Angeles]")
public class PageConversionResult {
  public static final String JSON_PROPERTY_FILENAME = "Filename";
  private String filename;

  public static final String JSON_PROPERTY_FILE_BYTES = "FileBytes";
  private byte[] fileBytes;

  public PageConversionResult() { 
  }

  public PageConversionResult filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * File name of the image in the converted file format
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File name of the image in the converted file format")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public PageConversionResult fileBytes(byte[] fileBytes) {
    this.fileBytes = fileBytes;
    return this;
  }

   /**
   * File bytes (contents) of the image in converted file format
   * @return fileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File bytes (contents) of the image in converted file format")
  @JsonProperty(JSON_PROPERTY_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getFileBytes() {
    return fileBytes;
  }


  @JsonProperty(JSON_PROPERTY_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileBytes(byte[] fileBytes) {
    this.fileBytes = fileBytes;
  }


  /**
   * Return true if this PageConversionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageConversionResult pageConversionResult = (PageConversionResult) o;
    return Objects.equals(this.filename, pageConversionResult.filename) &&
        Arrays.equals(this.fileBytes, pageConversionResult.fileBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, Arrays.hashCode(fileBytes));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageConversionResult {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileBytes: ").append(toIndentedString(fileBytes)).append("\n");
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

