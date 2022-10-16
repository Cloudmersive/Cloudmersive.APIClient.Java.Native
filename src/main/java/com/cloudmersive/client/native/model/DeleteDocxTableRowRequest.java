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
 * Input to a delete DOCX table row request
 */
@ApiModel(description = "Input to a delete DOCX table row request")
@JsonPropertyOrder({
  DeleteDocxTableRowRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  DeleteDocxTableRowRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DeleteDocxTableRowRequest.JSON_PROPERTY_TABLE_PATH,
  DeleteDocxTableRowRequest.JSON_PROPERTY_TABLE_ROW_ROW_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class DeleteDocxTableRowRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_TABLE_PATH = "TablePath";
  private String tablePath;

  public static final String JSON_PROPERTY_TABLE_ROW_ROW_INDEX = "TableRowRowIndex";
  private Integer tableRowRowIndex;

  public DeleteDocxTableRowRequest() { 
  }

  public DeleteDocxTableRowRequest inputFileBytes(byte[] inputFileBytes) {
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


  public DeleteDocxTableRowRequest inputFileUrl(String inputFileUrl) {
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


  public DeleteDocxTableRowRequest tablePath(String tablePath) {
    this.tablePath = tablePath;
    return this;
  }

   /**
   * Path to the table to delete the row from
   * @return tablePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the table to delete the row from")
  @JsonProperty(JSON_PROPERTY_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTablePath() {
    return tablePath;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTablePath(String tablePath) {
    this.tablePath = tablePath;
  }


  public DeleteDocxTableRowRequest tableRowRowIndex(Integer tableRowRowIndex) {
    this.tableRowRowIndex = tableRowRowIndex;
    return this;
  }

   /**
   * 0-based index of the row to delete (e.g. 0, 1, 2, ...) in the table
   * @return tableRowRowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row to delete (e.g. 0, 1, 2, ...) in the table")
  @JsonProperty(JSON_PROPERTY_TABLE_ROW_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTableRowRowIndex() {
    return tableRowRowIndex;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_ROW_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableRowRowIndex(Integer tableRowRowIndex) {
    this.tableRowRowIndex = tableRowRowIndex;
  }


  /**
   * Return true if this DeleteDocxTableRowRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDocxTableRowRequest deleteDocxTableRowRequest = (DeleteDocxTableRowRequest) o;
    return Arrays.equals(this.inputFileBytes, deleteDocxTableRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, deleteDocxTableRowRequest.inputFileUrl) &&
        Objects.equals(this.tablePath, deleteDocxTableRowRequest.tablePath) &&
        Objects.equals(this.tableRowRowIndex, deleteDocxTableRowRequest.tableRowRowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, tablePath, tableRowRowIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDocxTableRowRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    tablePath: ").append(toIndentedString(tablePath)).append("\n");
    sb.append("    tableRowRowIndex: ").append(toIndentedString(tableRowRowIndex)).append("\n");
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

