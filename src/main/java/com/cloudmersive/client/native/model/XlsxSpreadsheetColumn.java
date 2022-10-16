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
import com.cloudmersive.client.native.model.XlsxSpreadsheetCell;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Column in an Excel spreadsheet worksheet
 */
@ApiModel(description = "Column in an Excel spreadsheet worksheet")
@JsonPropertyOrder({
  XlsxSpreadsheetColumn.JSON_PROPERTY_PATH,
  XlsxSpreadsheetColumn.JSON_PROPERTY_HEADING_CELL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class XlsxSpreadsheetColumn {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_HEADING_CELL = "HeadingCell";
  private XlsxSpreadsheetCell headingCell;

  public XlsxSpreadsheetColumn() { 
  }

  public XlsxSpreadsheetColumn path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
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


  public XlsxSpreadsheetColumn headingCell(XlsxSpreadsheetCell headingCell) {
    this.headingCell = headingCell;
    return this;
  }

   /**
   * Get headingCell
   * @return headingCell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEADING_CELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxSpreadsheetCell getHeadingCell() {
    return headingCell;
  }


  @JsonProperty(JSON_PROPERTY_HEADING_CELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadingCell(XlsxSpreadsheetCell headingCell) {
    this.headingCell = headingCell;
  }


  /**
   * Return true if this XlsxSpreadsheetColumn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSpreadsheetColumn xlsxSpreadsheetColumn = (XlsxSpreadsheetColumn) o;
    return Objects.equals(this.path, xlsxSpreadsheetColumn.path) &&
        Objects.equals(this.headingCell, xlsxSpreadsheetColumn.headingCell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, headingCell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSpreadsheetColumn {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    headingCell: ").append(toIndentedString(headingCell)).append("\n");
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

