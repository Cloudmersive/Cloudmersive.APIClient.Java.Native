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
import com.cloudmersive.client.native.model.TextDocumentLine;
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
 * The result of splitting a Text document into separate lines
 */
@ApiModel(description = "The result of splitting a Text document into separate lines")
@JsonPropertyOrder({
  SplitTextDocumentByLinesResult.JSON_PROPERTY_RESULT_LINES,
  SplitTextDocumentByLinesResult.JSON_PROPERTY_SUCCESSFUL,
  SplitTextDocumentByLinesResult.JSON_PROPERTY_LINE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class SplitTextDocumentByLinesResult {
  public static final String JSON_PROPERTY_RESULT_LINES = "ResultLines";
  private List<TextDocumentLine> resultLines = null;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_LINE_COUNT = "LineCount";
  private Integer lineCount;

  public SplitTextDocumentByLinesResult() { 
  }

  public SplitTextDocumentByLinesResult resultLines(List<TextDocumentLine> resultLines) {
    this.resultLines = resultLines;
    return this;
  }

  public SplitTextDocumentByLinesResult addResultLinesItem(TextDocumentLine resultLinesItem) {
    if (this.resultLines == null) {
      this.resultLines = new ArrayList<>();
    }
    this.resultLines.add(resultLinesItem);
    return this;
  }

   /**
   * Get resultLines
   * @return resultLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TextDocumentLine> getResultLines() {
    return resultLines;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultLines(List<TextDocumentLine> resultLines) {
    this.resultLines = resultLines;
  }


  public SplitTextDocumentByLinesResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
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


  public SplitTextDocumentByLinesResult lineCount(Integer lineCount) {
    this.lineCount = lineCount;
    return this;
  }

   /**
   * The count of lines in the text file
   * @return lineCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of lines in the text file")
  @JsonProperty(JSON_PROPERTY_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLineCount() {
    return lineCount;
  }


  @JsonProperty(JSON_PROPERTY_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineCount(Integer lineCount) {
    this.lineCount = lineCount;
  }


  /**
   * Return true if this SplitTextDocumentByLinesResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTextDocumentByLinesResult splitTextDocumentByLinesResult = (SplitTextDocumentByLinesResult) o;
    return Objects.equals(this.resultLines, splitTextDocumentByLinesResult.resultLines) &&
        Objects.equals(this.successful, splitTextDocumentByLinesResult.successful) &&
        Objects.equals(this.lineCount, splitTextDocumentByLinesResult.lineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultLines, successful, lineCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTextDocumentByLinesResult {\n");
    sb.append("    resultLines: ").append(toIndentedString(resultLines)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
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

