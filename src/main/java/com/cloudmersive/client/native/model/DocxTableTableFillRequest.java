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
import com.cloudmersive.client.native.model.DocxTableTableFillTableRow;
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
 * Request to update data in a table in a Word DOCX Document
 */
@ApiModel(description = "Request to update data in a table in a Word DOCX Document")
@JsonPropertyOrder({
  DocxTableTableFillRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DocxTableTableFillRequest.JSON_PROPERTY_INPUT_FILE_DATA,
  DocxTableTableFillRequest.JSON_PROPERTY_TABLE_START_TAG,
  DocxTableTableFillRequest.JSON_PROPERTY_TABLE_END_TAG,
  DocxTableTableFillRequest.JSON_PROPERTY_DATA_TO_FILL_IN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:52.110310500-07:00[America/Los_Angeles]")
public class DocxTableTableFillRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_INPUT_FILE_DATA = "InputFileData";
  private byte[] inputFileData;

  public static final String JSON_PROPERTY_TABLE_START_TAG = "TableStartTag";
  private String tableStartTag;

  public static final String JSON_PROPERTY_TABLE_END_TAG = "TableEndTag";
  private String tableEndTag;

  public static final String JSON_PROPERTY_DATA_TO_FILL_IN = "DataToFillIn";
  private List<DocxTableTableFillTableRow> dataToFillIn = null;

  public DocxTableTableFillRequest() { 
  }

  public DocxTableTableFillRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional; Input URL of the document; use BeginEditing to create this
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; Input URL of the document; use BeginEditing to create this")
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


  public DocxTableTableFillRequest inputFileData(byte[] inputFileData) {
    this.inputFileData = inputFileData;
    return this;
  }

   /**
   * Optional; Input Word Document file content for the operation
   * @return inputFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; Input Word Document file content for the operation")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileData() {
    return inputFileData;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileData(byte[] inputFileData) {
    this.inputFileData = inputFileData;
  }


  public DocxTableTableFillRequest tableStartTag(String tableStartTag) {
    this.tableStartTag = tableStartTag;
    return this;
  }

   /**
   * Start tag that delineates the beginning of the table
   * @return tableStartTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start tag that delineates the beginning of the table")
  @JsonProperty(JSON_PROPERTY_TABLE_START_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTableStartTag() {
    return tableStartTag;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_START_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableStartTag(String tableStartTag) {
    this.tableStartTag = tableStartTag;
  }


  public DocxTableTableFillRequest tableEndTag(String tableEndTag) {
    this.tableEndTag = tableEndTag;
    return this;
  }

   /**
   * End tag that delineates the end of the table
   * @return tableEndTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End tag that delineates the end of the table")
  @JsonProperty(JSON_PROPERTY_TABLE_END_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTableEndTag() {
    return tableEndTag;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_END_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableEndTag(String tableEndTag) {
    this.tableEndTag = tableEndTag;
  }


  public DocxTableTableFillRequest dataToFillIn(List<DocxTableTableFillTableRow> dataToFillIn) {
    this.dataToFillIn = dataToFillIn;
    return this;
  }

  public DocxTableTableFillRequest addDataToFillInItem(DocxTableTableFillTableRow dataToFillInItem) {
    if (this.dataToFillIn == null) {
      this.dataToFillIn = new ArrayList<>();
    }
    this.dataToFillIn.add(dataToFillInItem);
    return this;
  }

   /**
   * Data set to populate the table with
   * @return dataToFillIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data set to populate the table with")
  @JsonProperty(JSON_PROPERTY_DATA_TO_FILL_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTableTableFillTableRow> getDataToFillIn() {
    return dataToFillIn;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TO_FILL_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataToFillIn(List<DocxTableTableFillTableRow> dataToFillIn) {
    this.dataToFillIn = dataToFillIn;
  }


  /**
   * Return true if this DocxTableTableFillRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillRequest docxTableTableFillRequest = (DocxTableTableFillRequest) o;
    return Objects.equals(this.inputFileUrl, docxTableTableFillRequest.inputFileUrl) &&
        Arrays.equals(this.inputFileData, docxTableTableFillRequest.inputFileData) &&
        Objects.equals(this.tableStartTag, docxTableTableFillRequest.tableStartTag) &&
        Objects.equals(this.tableEndTag, docxTableTableFillRequest.tableEndTag) &&
        Objects.equals(this.dataToFillIn, docxTableTableFillRequest.dataToFillIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileUrl, Arrays.hashCode(inputFileData), tableStartTag, tableEndTag, dataToFillIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillRequest {\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    inputFileData: ").append(toIndentedString(inputFileData)).append("\n");
    sb.append("    tableStartTag: ").append(toIndentedString(tableStartTag)).append("\n");
    sb.append("    tableEndTag: ").append(toIndentedString(tableEndTag)).append("\n");
    sb.append("    dataToFillIn: ").append(toIndentedString(dataToFillIn)).append("\n");
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

