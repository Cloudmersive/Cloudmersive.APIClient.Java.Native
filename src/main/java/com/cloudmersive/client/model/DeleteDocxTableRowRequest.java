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
 * Input to a delete DOCX table row request
 */
@ApiModel(description = "Input to a delete DOCX table row request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:39.601-07:00")
public class DeleteDocxTableRowRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("TablePath")
  private String tablePath = null;

  @SerializedName("TableRowRowIndex")
  private Integer tableRowRowIndex = null;

  public DeleteDocxTableRowRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

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
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

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
  @ApiModelProperty(value = "Path to the table to delete the row from")
  public String getTablePath() {
    return tablePath;
  }

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
  @ApiModelProperty(value = "0-based index of the row to delete (e.g. 0, 1, 2, ...) in the table")
  public Integer getTableRowRowIndex() {
    return tableRowRowIndex;
  }

  public void setTableRowRowIndex(Integer tableRowRowIndex) {
    this.tableRowRowIndex = tableRowRowIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
