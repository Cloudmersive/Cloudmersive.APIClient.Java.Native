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


package com.cloudmersive.client.native.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.cloudmersive.client.native.model.OcrPhotoTextElement;
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
 * The recognition result of one cell in one row in a table of a form
 */
@ApiModel(description = "The recognition result of one cell in one row in a table of a form")
@JsonPropertyOrder({
  TableCellResult.JSON_PROPERTY_COLUMN_I_D,
  TableCellResult.JSON_PROPERTY_CELL_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:40.650093200-07:00[America/Los_Angeles]")
public class TableCellResult {
  public static final String JSON_PROPERTY_COLUMN_I_D = "ColumnID";
  private String columnID;

  public static final String JSON_PROPERTY_CELL_VALUES = "CellValues";
  private List<OcrPhotoTextElement> cellValues = null;

  public TableCellResult() { 
  }

  public TableCellResult columnID(String columnID) {
    this.columnID = columnID;
    return this;
  }

   /**
   * The ID of the column
   * @return columnID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the column")
  @JsonProperty(JSON_PROPERTY_COLUMN_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColumnID() {
    return columnID;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnID(String columnID) {
    this.columnID = columnID;
  }


  public TableCellResult cellValues(List<OcrPhotoTextElement> cellValues) {
    this.cellValues = cellValues;
    return this;
  }

  public TableCellResult addCellValuesItem(OcrPhotoTextElement cellValuesItem) {
    if (this.cellValues == null) {
      this.cellValues = new ArrayList<>();
    }
    this.cellValues.add(cellValuesItem);
    return this;
  }

   /**
   * Result cell value(s) extracted
   * @return cellValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result cell value(s) extracted")
  @JsonProperty(JSON_PROPERTY_CELL_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrPhotoTextElement> getCellValues() {
    return cellValues;
  }


  @JsonProperty(JSON_PROPERTY_CELL_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellValues(List<OcrPhotoTextElement> cellValues) {
    this.cellValues = cellValues;
  }


  /**
   * Return true if this TableCellResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCellResult tableCellResult = (TableCellResult) o;
    return Objects.equals(this.columnID, tableCellResult.columnID) &&
        Objects.equals(this.cellValues, tableCellResult.cellValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnID, cellValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCellResult {\n");
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    cellValues: ").append(toIndentedString(cellValues)).append("\n");
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

