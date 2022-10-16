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
import com.cloudmersive.client.native.model.DocxTableSingleTableFill;
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
  DocxTableTableFillMultiRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DocxTableTableFillMultiRequest.JSON_PROPERTY_INPUT_FILE_DATA,
  DocxTableTableFillMultiRequest.JSON_PROPERTY_TABLES_TO_FILL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:52.110310500-07:00[America/Los_Angeles]")
public class DocxTableTableFillMultiRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_INPUT_FILE_DATA = "InputFileData";
  private byte[] inputFileData;

  public static final String JSON_PROPERTY_TABLES_TO_FILL = "TablesToFill";
  private List<DocxTableSingleTableFill> tablesToFill = null;

  public DocxTableTableFillMultiRequest() { 
  }

  public DocxTableTableFillMultiRequest inputFileUrl(String inputFileUrl) {
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


  public DocxTableTableFillMultiRequest inputFileData(byte[] inputFileData) {
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


  public DocxTableTableFillMultiRequest tablesToFill(List<DocxTableSingleTableFill> tablesToFill) {
    this.tablesToFill = tablesToFill;
    return this;
  }

  public DocxTableTableFillMultiRequest addTablesToFillItem(DocxTableSingleTableFill tablesToFillItem) {
    if (this.tablesToFill == null) {
      this.tablesToFill = new ArrayList<>();
    }
    this.tablesToFill.add(tablesToFillItem);
    return this;
  }

   /**
   * Tables and datasets to fill into the document
   * @return tablesToFill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tables and datasets to fill into the document")
  @JsonProperty(JSON_PROPERTY_TABLES_TO_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTableSingleTableFill> getTablesToFill() {
    return tablesToFill;
  }


  @JsonProperty(JSON_PROPERTY_TABLES_TO_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTablesToFill(List<DocxTableSingleTableFill> tablesToFill) {
    this.tablesToFill = tablesToFill;
  }


  /**
   * Return true if this DocxTableTableFillMultiRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillMultiRequest docxTableTableFillMultiRequest = (DocxTableTableFillMultiRequest) o;
    return Objects.equals(this.inputFileUrl, docxTableTableFillMultiRequest.inputFileUrl) &&
        Arrays.equals(this.inputFileData, docxTableTableFillMultiRequest.inputFileData) &&
        Objects.equals(this.tablesToFill, docxTableTableFillMultiRequest.tablesToFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileUrl, Arrays.hashCode(inputFileData), tablesToFill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillMultiRequest {\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    inputFileData: ").append(toIndentedString(inputFileData)).append("\n");
    sb.append("    tablesToFill: ").append(toIndentedString(tablesToFill)).append("\n");
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

