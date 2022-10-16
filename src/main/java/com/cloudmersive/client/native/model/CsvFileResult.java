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
 * CSV file result
 */
@ApiModel(description = "CSV file result")
@JsonPropertyOrder({
  CsvFileResult.JSON_PROPERTY_TITLE,
  CsvFileResult.JSON_PROPERTY_FILE_CONTENTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class CsvFileResult {
  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_FILE_CONTENTS = "FileContents";
  private byte[] fileContents;

  public CsvFileResult() { 
  }

  public CsvFileResult title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the CSV file
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the CSV file")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public CsvFileResult fileContents(byte[] fileContents) {
    this.fileContents = fileContents;
    return this;
  }

   /**
   * Contents of the CSV file
   * @return fileContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents of the CSV file")
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
   * Return true if this CsvFileResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvFileResult csvFileResult = (CsvFileResult) o;
    return Objects.equals(this.title, csvFileResult.title) &&
        Arrays.equals(this.fileContents, csvFileResult.fileContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, Arrays.hashCode(fileContents));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvFileResult {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

