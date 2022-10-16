/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CSV file result
 */
@ApiModel(description = "CSV file result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:39.601-07:00")
public class CsvFileResult {
  @SerializedName("Title")
  private String title = null;

  @SerializedName("FileContents")
  private byte[] fileContents = null;

  public CsvFileResult title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the CSV file
   * @return title
  **/
  @ApiModelProperty(value = "Title of the CSV file")
  public String getTitle() {
    return title;
  }

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
  @ApiModelProperty(value = "Contents of the CSV file")
  public byte[] getFileContents() {
    return fileContents;
  }

  public void setFileContents(byte[] fileContents) {
    this.fileContents = fileContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
