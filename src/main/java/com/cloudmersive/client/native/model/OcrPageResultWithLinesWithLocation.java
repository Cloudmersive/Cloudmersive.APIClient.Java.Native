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
import com.cloudmersive.client.native.model.OcrLineElement;
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
 * OCR results of a page, including lines of text and their location
 */
@ApiModel(description = "OCR results of a page, including lines of text and their location")
@JsonPropertyOrder({
  OcrPageResultWithLinesWithLocation.JSON_PROPERTY_PAGE_NUMBER,
  OcrPageResultWithLinesWithLocation.JSON_PROPERTY_SUCCESSFUL,
  OcrPageResultWithLinesWithLocation.JSON_PROPERTY_LINES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:58.200774700-07:00[America/Los_Angeles]")
public class OcrPageResultWithLinesWithLocation {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_LINES = "Lines";
  private List<OcrLineElement> lines = null;

  public OcrPageResultWithLinesWithLocation() { 
  }

  public OcrPageResultWithLinesWithLocation pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public OcrPageResultWithLinesWithLocation successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
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


  public OcrPageResultWithLinesWithLocation lines(List<OcrLineElement> lines) {
    this.lines = lines;
    return this;
  }

  public OcrPageResultWithLinesWithLocation addLinesItem(OcrLineElement linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return lines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Word elements in the image")
  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrLineElement> getLines() {
    return lines;
  }


  @JsonProperty(JSON_PROPERTY_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLines(List<OcrLineElement> lines) {
    this.lines = lines;
  }


  /**
   * Return true if this OcrPageResultWithLinesWithLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPageResultWithLinesWithLocation ocrPageResultWithLinesWithLocation = (OcrPageResultWithLinesWithLocation) o;
    return Objects.equals(this.pageNumber, ocrPageResultWithLinesWithLocation.pageNumber) &&
        Objects.equals(this.successful, ocrPageResultWithLinesWithLocation.successful) &&
        Objects.equals(this.lines, ocrPageResultWithLinesWithLocation.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, successful, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResultWithLinesWithLocation {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

