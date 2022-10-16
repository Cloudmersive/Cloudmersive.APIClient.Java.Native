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
import com.cloudmersive.client.native.model.XlsxSpreadsheetRow;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Result of running a Get-Worksheets command
 */
@ApiModel(description = "Result of running a Get-Worksheets command")
@JsonPropertyOrder({
  GetXlsxRowsAndCellsResponse.JSON_PROPERTY_SUCCESSFUL,
  GetXlsxRowsAndCellsResponse.JSON_PROPERTY_ROWS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class GetXlsxRowsAndCellsResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ROWS = "Rows";
  private List<XlsxSpreadsheetRow> rows = null;

  public GetXlsxRowsAndCellsResponse() { 
  }

  public GetXlsxRowsAndCellsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public GetXlsxRowsAndCellsResponse rows(List<XlsxSpreadsheetRow> rows) {
    this.rows = rows;
    return this;
  }

  public GetXlsxRowsAndCellsResponse addRowsItem(XlsxSpreadsheetRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Spreadsheet Rows in the Excel XLSX document
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Spreadsheet Rows in the Excel XLSX document")
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XlsxSpreadsheetRow> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRows(List<XlsxSpreadsheetRow> rows) {
    this.rows = rows;
  }


  /**
   * Return true if this GetXlsxRowsAndCellsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxRowsAndCellsResponse getXlsxRowsAndCellsResponse = (GetXlsxRowsAndCellsResponse) o;
    return Objects.equals(this.successful, getXlsxRowsAndCellsResponse.successful) &&
        Objects.equals(this.rows, getXlsxRowsAndCellsResponse.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxRowsAndCellsResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

