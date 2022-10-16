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
import com.cloudmersive.client.native.model.DocxParagraph;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Input to a Insert Paragraph request
 */
@ApiModel(description = "Input to a Insert Paragraph request")
@JsonPropertyOrder({
  InsertDocxInsertParagraphRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  InsertDocxInsertParagraphRequest.JSON_PROPERTY_INPUT_FILE_URL,
  InsertDocxInsertParagraphRequest.JSON_PROPERTY_PARAGRAPH_TO_INSERT,
  InsertDocxInsertParagraphRequest.JSON_PROPERTY_INSERT_PLACEMENT,
  InsertDocxInsertParagraphRequest.JSON_PROPERTY_INSERT_PATH
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class InsertDocxInsertParagraphRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_PARAGRAPH_TO_INSERT = "ParagraphToInsert";
  private DocxParagraph paragraphToInsert;

  public static final String JSON_PROPERTY_INSERT_PLACEMENT = "InsertPlacement";
  private String insertPlacement;

  public static final String JSON_PROPERTY_INSERT_PATH = "InsertPath";
  private String insertPath;

  public InsertDocxInsertParagraphRequest() { 
  }

  public InsertDocxInsertParagraphRequest inputFileBytes(byte[] inputFileBytes) {
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


  public InsertDocxInsertParagraphRequest inputFileUrl(String inputFileUrl) {
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


  public InsertDocxInsertParagraphRequest paragraphToInsert(DocxParagraph paragraphToInsert) {
    this.paragraphToInsert = paragraphToInsert;
    return this;
  }

   /**
   * Get paragraphToInsert
   * @return paragraphToInsert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAGRAPH_TO_INSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocxParagraph getParagraphToInsert() {
    return paragraphToInsert;
  }


  @JsonProperty(JSON_PROPERTY_PARAGRAPH_TO_INSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParagraphToInsert(DocxParagraph paragraphToInsert) {
    this.paragraphToInsert = paragraphToInsert;
  }


  public InsertDocxInsertParagraphRequest insertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
    return this;
  }

   /**
   * Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)
   * @return insertPlacement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)")
  @JsonProperty(JSON_PROPERTY_INSERT_PLACEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsertPlacement() {
    return insertPlacement;
  }


  @JsonProperty(JSON_PROPERTY_INSERT_PLACEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
  }


  public InsertDocxInsertParagraphRequest insertPath(String insertPath) {
    this.insertPath = insertPath;
    return this;
  }

   /**
   * Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject
   * @return insertPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject")
  @JsonProperty(JSON_PROPERTY_INSERT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsertPath() {
    return insertPath;
  }


  @JsonProperty(JSON_PROPERTY_INSERT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertPath(String insertPath) {
    this.insertPath = insertPath;
  }


  /**
   * Return true if this InsertDocxInsertParagraphRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertDocxInsertParagraphRequest insertDocxInsertParagraphRequest = (InsertDocxInsertParagraphRequest) o;
    return Arrays.equals(this.inputFileBytes, insertDocxInsertParagraphRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, insertDocxInsertParagraphRequest.inputFileUrl) &&
        Objects.equals(this.paragraphToInsert, insertDocxInsertParagraphRequest.paragraphToInsert) &&
        Objects.equals(this.insertPlacement, insertDocxInsertParagraphRequest.insertPlacement) &&
        Objects.equals(this.insertPath, insertDocxInsertParagraphRequest.insertPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, paragraphToInsert, insertPlacement, insertPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertDocxInsertParagraphRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    paragraphToInsert: ").append(toIndentedString(paragraphToInsert)).append("\n");
    sb.append("    insertPlacement: ").append(toIndentedString(insertPlacement)).append("\n");
    sb.append("    insertPath: ").append(toIndentedString(insertPath)).append("\n");
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

