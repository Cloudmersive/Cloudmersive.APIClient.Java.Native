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
 * Input to a Get Cell by cell identifier request
 */
@ApiModel(description = "Input to a Get Cell by cell identifier request")
@JsonPropertyOrder({
  GetXlsxCellByIdentifierRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  GetXlsxCellByIdentifierRequest.JSON_PROPERTY_INPUT_FILE_URL,
  GetXlsxCellByIdentifierRequest.JSON_PROPERTY_WORKSHEET_TO_QUERY,
  GetXlsxCellByIdentifierRequest.JSON_PROPERTY_CELL_IDENTIFIER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class GetXlsxCellByIdentifierRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_QUERY = "WorksheetToQuery";
  private XlsxWorksheet worksheetToQuery;

  public static final String JSON_PROPERTY_CELL_IDENTIFIER = "CellIdentifier";
  private String cellIdentifier;

  public GetXlsxCellByIdentifierRequest() { 
  }

  public GetXlsxCellByIdentifierRequest inputFileBytes(byte[] inputFileBytes) {
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


  public GetXlsxCellByIdentifierRequest inputFileUrl(String inputFileUrl) {
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


  public GetXlsxCellByIdentifierRequest worksheetToQuery(XlsxWorksheet worksheetToQuery) {
    this.worksheetToQuery = worksheetToQuery;
    return this;
  }

   /**
   * Get worksheetToQuery
   * @return worksheetToQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToQuery() {
    return worksheetToQuery;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetToQuery(XlsxWorksheet worksheetToQuery) {
    this.worksheetToQuery = worksheetToQuery;
  }


  public GetXlsxCellByIdentifierRequest cellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
    return this;
  }

   /**
   * Required; Excel cell identifier, e.g. A1, B22, C33, etc.
   * @return cellIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required; Excel cell identifier, e.g. A1, B22, C33, etc.")
  @JsonProperty(JSON_PROPERTY_CELL_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellIdentifier() {
    return cellIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_CELL_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
  }


  /**
   * Return true if this GetXlsxCellByIdentifierRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxCellByIdentifierRequest getXlsxCellByIdentifierRequest = (GetXlsxCellByIdentifierRequest) o;
    return Arrays.equals(this.inputFileBytes, getXlsxCellByIdentifierRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, getXlsxCellByIdentifierRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToQuery, getXlsxCellByIdentifierRequest.worksheetToQuery) &&
        Objects.equals(this.cellIdentifier, getXlsxCellByIdentifierRequest.cellIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToQuery, cellIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxCellByIdentifierRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToQuery: ").append(toIndentedString(worksheetToQuery)).append("\n");
    sb.append("    cellIdentifier: ").append(toIndentedString(cellIdentifier)).append("\n");
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

