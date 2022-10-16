/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.ntv.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.cloudmersive.client.ntv.model.FormTableDefinition;
import com.cloudmersive.client.ntv.model.TableRowResult;
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
 * The result of reading a table via OCR from a form
 */
@ApiModel(description = "The result of reading a table via OCR from a form")
@JsonPropertyOrder({
  TableResult.JSON_PROPERTY_TABLE_DEFINITION,
  TableResult.JSON_PROPERTY_TABLE_ROWS_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:56:24.231889100-07:00[America/Los_Angeles]")
public class TableResult {
  public static final String JSON_PROPERTY_TABLE_DEFINITION = "TableDefinition";
  private FormTableDefinition tableDefinition;

  public static final String JSON_PROPERTY_TABLE_ROWS_RESULT = "TableRowsResult";
  private List<TableRowResult> tableRowsResult = null;

  public TableResult() { 
  }

  public TableResult tableDefinition(FormTableDefinition tableDefinition) {
    this.tableDefinition = tableDefinition;
    return this;
  }

   /**
   * Get tableDefinition
   * @return tableDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABLE_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormTableDefinition getTableDefinition() {
    return tableDefinition;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableDefinition(FormTableDefinition tableDefinition) {
    this.tableDefinition = tableDefinition;
  }


  public TableResult tableRowsResult(List<TableRowResult> tableRowsResult) {
    this.tableRowsResult = tableRowsResult;
    return this;
  }

  public TableResult addTableRowsResultItem(TableRowResult tableRowsResultItem) {
    if (this.tableRowsResult == null) {
      this.tableRowsResult = new ArrayList<>();
    }
    this.tableRowsResult.add(tableRowsResultItem);
    return this;
  }

   /**
   * Rows of data in the table
   * @return tableRowsResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rows of data in the table")
  @JsonProperty(JSON_PROPERTY_TABLE_ROWS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableRowResult> getTableRowsResult() {
    return tableRowsResult;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_ROWS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableRowsResult(List<TableRowResult> tableRowsResult) {
    this.tableRowsResult = tableRowsResult;
  }


  /**
   * Return true if this TableResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResult tableResult = (TableResult) o;
    return Objects.equals(this.tableDefinition, tableResult.tableDefinition) &&
        Objects.equals(this.tableRowsResult, tableResult.tableRowsResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableDefinition, tableRowsResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResult {\n");
    sb.append("    tableDefinition: ").append(toIndentedString(tableDefinition)).append("\n");
    sb.append("    tableRowsResult: ").append(toIndentedString(tableRowsResult)).append("\n");
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
