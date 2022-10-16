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
import com.cloudmersive.client.native.model.XlsxWorksheet;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Input to a Clear Cell in XLSX Worksheet request
 */
@ApiModel(description = "Input to a Clear Cell in XLSX Worksheet request")
@JsonPropertyOrder({
  ClearXlsxCellRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  ClearXlsxCellRequest.JSON_PROPERTY_INPUT_FILE_URL,
  ClearXlsxCellRequest.JSON_PROPERTY_WORKSHEET_TO_UPDATE,
  ClearXlsxCellRequest.JSON_PROPERTY_ROW_INDEX,
  ClearXlsxCellRequest.JSON_PROPERTY_CELL_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class ClearXlsxCellRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_UPDATE = "WorksheetToUpdate";
  private XlsxWorksheet worksheetToUpdate;

  public static final String JSON_PROPERTY_ROW_INDEX = "RowIndex";
  private Integer rowIndex;

  public static final String JSON_PROPERTY_CELL_INDEX = "CellIndex";
  private Integer cellIndex;

  public ClearXlsxCellRequest() { 
  }

  public ClearXlsxCellRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public ClearXlsxCellRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public ClearXlsxCellRequest worksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
    return this;
  }

   /**
   * Get worksheetToUpdate
   * @return worksheetToUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToUpdate() {
    return worksheetToUpdate;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
  }


  public ClearXlsxCellRequest rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * 0-based index of the row, 0, 1, 2, ... to clear
   * @return rowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row, 0, 1, 2, ... to clear")
  @JsonProperty(JSON_PROPERTY_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRowIndex() {
    return rowIndex;
  }


  @JsonProperty(JSON_PROPERTY_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  public ClearXlsxCellRequest cellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * 0-based index of the cell, 0, 1, 2, ... in the row to clear
   * @return cellIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the cell, 0, 1, 2, ... in the row to clear")
  @JsonProperty(JSON_PROPERTY_CELL_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCellIndex() {
    return cellIndex;
  }


  @JsonProperty(JSON_PROPERTY_CELL_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }


  /**
   * Return true if this ClearXlsxCellRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearXlsxCellRequest clearXlsxCellRequest = (ClearXlsxCellRequest) o;
    return Arrays.equals(this.inputFileBytes, clearXlsxCellRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, clearXlsxCellRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToUpdate, clearXlsxCellRequest.worksheetToUpdate) &&
        Objects.equals(this.rowIndex, clearXlsxCellRequest.rowIndex) &&
        Objects.equals(this.cellIndex, clearXlsxCellRequest.cellIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToUpdate, rowIndex, cellIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearXlsxCellRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToUpdate: ").append(toIndentedString(worksheetToUpdate)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
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

