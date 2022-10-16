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
 * A worksheet (tab) in an Excel (XLSX) spreadsheet
 */
@ApiModel(description = "A worksheet (tab) in an Excel (XLSX) spreadsheet")
@JsonPropertyOrder({
  XlsxWorksheet.JSON_PROPERTY_PATH,
  XlsxWorksheet.JSON_PROPERTY_WORKSHEET_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class XlsxWorksheet {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_WORKSHEET_NAME = "WorksheetName";
  private String worksheetName;

  public XlsxWorksheet() { 
  }

  public XlsxWorksheet path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new worksheets
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new worksheets")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public XlsxWorksheet worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * User-facing name of the worksheet tab
   * @return worksheetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User-facing name of the worksheet tab")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorksheetName() {
    return worksheetName;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }


  /**
   * Return true if this XlsxWorksheet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxWorksheet xlsxWorksheet = (XlsxWorksheet) o;
    return Objects.equals(this.path, xlsxWorksheet.path) &&
        Objects.equals(this.worksheetName, xlsxWorksheet.worksheetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, worksheetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxWorksheet {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
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

