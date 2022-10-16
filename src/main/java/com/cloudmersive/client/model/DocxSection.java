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
import java.util.ArrayList;
import java.util.List;

/**
 * Section of a Word Document (DOCX)
 */
@ApiModel(description = "Section of a Word Document (DOCX)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:39.601-07:00")
public class DocxSection {
  @SerializedName("StartingPageNumbers")
  private List<Integer> startingPageNumbers = null;

  @SerializedName("Path")
  private String path = null;

  public DocxSection startingPageNumbers(List<Integer> startingPageNumbers) {
    this.startingPageNumbers = startingPageNumbers;
    return this;
  }

  public DocxSection addStartingPageNumbersItem(Integer startingPageNumbersItem) {
    if (this.startingPageNumbers == null) {
      this.startingPageNumbers = new ArrayList<Integer>();
    }
    this.startingPageNumbers.add(startingPageNumbersItem);
    return this;
  }

   /**
   * Page numbers that the section starts at, typically just one
   * @return startingPageNumbers
  **/
  @ApiModelProperty(value = "Page numbers that the section starts at, typically just one")
  public List<Integer> getStartingPageNumbers() {
    return startingPageNumbers;
  }

  public void setStartingPageNumbers(List<Integer> startingPageNumbers) {
    this.startingPageNumbers = startingPageNumbers;
  }

  public DocxSection path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSection docxSection = (DocxSection) o;
    return Objects.equals(this.startingPageNumbers, docxSection.startingPageNumbers) &&
        Objects.equals(this.path, docxSection.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startingPageNumbers, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSection {\n");
    
    sb.append("    startingPageNumbers: ").append(toIndentedString(startingPageNumbers)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

