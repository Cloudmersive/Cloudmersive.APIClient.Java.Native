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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A cell in a Word Document (DOCX) file
 */
@ApiModel(description = "A cell in a Word Document (DOCX) file")
@JsonPropertyOrder({
  DocxTableCell.JSON_PROPERTY_CELL_INDEX,
  DocxTableCell.JSON_PROPERTY_PATH,
  DocxTableCell.JSON_PROPERTY_PARAGRAPHS,
  DocxTableCell.JSON_PROPERTY_CELL_SHADING_COLOR,
  DocxTableCell.JSON_PROPERTY_CELL_SHADING_FILL,
  DocxTableCell.JSON_PROPERTY_CELL_SHADING_PATTERN,
  DocxTableCell.JSON_PROPERTY_CELL_WIDTH_MODE,
  DocxTableCell.JSON_PROPERTY_CELL_WIDTH
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:52.110310500-07:00[America/Los_Angeles]")
public class DocxTableCell {
  public static final String JSON_PROPERTY_CELL_INDEX = "CellIndex";
  private Integer cellIndex;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_PARAGRAPHS = "Paragraphs";
  private List<DocxParagraph> paragraphs = null;

  public static final String JSON_PROPERTY_CELL_SHADING_COLOR = "CellShadingColor";
  private String cellShadingColor;

  public static final String JSON_PROPERTY_CELL_SHADING_FILL = "CellShadingFill";
  private String cellShadingFill;

  public static final String JSON_PROPERTY_CELL_SHADING_PATTERN = "CellShadingPattern";
  private String cellShadingPattern;

  public static final String JSON_PROPERTY_CELL_WIDTH_MODE = "CellWidthMode";
  private String cellWidthMode;

  public static final String JSON_PROPERTY_CELL_WIDTH = "CellWidth";
  private String cellWidth;

  public DocxTableCell() { 
  }

  public DocxTableCell cellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * The index of the cell, 0-based
   * @return cellIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the cell, 0-based")
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


  public DocxTableCell path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public DocxTableCell paragraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxTableCell addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * Paragraphs inside the cell; this is where the contents of the cell are stored
   * @return paragraphs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paragraphs inside the cell; this is where the contents of the cell are stored")
  @JsonProperty(JSON_PROPERTY_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }


  @JsonProperty(JSON_PROPERTY_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }


  public DocxTableCell cellShadingColor(String cellShadingColor) {
    this.cellShadingColor = cellShadingColor;
    return this;
  }

   /**
   * Color of the cell shading
   * @return cellShadingColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color of the cell shading")
  @JsonProperty(JSON_PROPERTY_CELL_SHADING_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellShadingColor() {
    return cellShadingColor;
  }


  @JsonProperty(JSON_PROPERTY_CELL_SHADING_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellShadingColor(String cellShadingColor) {
    this.cellShadingColor = cellShadingColor;
  }


  public DocxTableCell cellShadingFill(String cellShadingFill) {
    this.cellShadingFill = cellShadingFill;
    return this;
  }

   /**
   * Fill of the cell shading
   * @return cellShadingFill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fill of the cell shading")
  @JsonProperty(JSON_PROPERTY_CELL_SHADING_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellShadingFill() {
    return cellShadingFill;
  }


  @JsonProperty(JSON_PROPERTY_CELL_SHADING_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellShadingFill(String cellShadingFill) {
    this.cellShadingFill = cellShadingFill;
  }


  public DocxTableCell cellShadingPattern(String cellShadingPattern) {
    this.cellShadingPattern = cellShadingPattern;
    return this;
  }

   /**
   * Pattern of the cell shading
   * @return cellShadingPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pattern of the cell shading")
  @JsonProperty(JSON_PROPERTY_CELL_SHADING_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellShadingPattern() {
    return cellShadingPattern;
  }


  @JsonProperty(JSON_PROPERTY_CELL_SHADING_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellShadingPattern(String cellShadingPattern) {
    this.cellShadingPattern = cellShadingPattern;
  }


  public DocxTableCell cellWidthMode(String cellWidthMode) {
    this.cellWidthMode = cellWidthMode;
    return this;
  }

   /**
   * Width mode of the cell; can be auto (for automatic) or manual
   * @return cellWidthMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width mode of the cell; can be auto (for automatic) or manual")
  @JsonProperty(JSON_PROPERTY_CELL_WIDTH_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellWidthMode() {
    return cellWidthMode;
  }


  @JsonProperty(JSON_PROPERTY_CELL_WIDTH_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellWidthMode(String cellWidthMode) {
    this.cellWidthMode = cellWidthMode;
  }


  public DocxTableCell cellWidth(String cellWidth) {
    this.cellWidth = cellWidth;
    return this;
  }

   /**
   * Width of the cell
   * @return cellWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width of the cell")
  @JsonProperty(JSON_PROPERTY_CELL_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellWidth() {
    return cellWidth;
  }


  @JsonProperty(JSON_PROPERTY_CELL_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellWidth(String cellWidth) {
    this.cellWidth = cellWidth;
  }


  /**
   * Return true if this DocxTableCell object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableCell docxTableCell = (DocxTableCell) o;
    return Objects.equals(this.cellIndex, docxTableCell.cellIndex) &&
        Objects.equals(this.path, docxTableCell.path) &&
        Objects.equals(this.paragraphs, docxTableCell.paragraphs) &&
        Objects.equals(this.cellShadingColor, docxTableCell.cellShadingColor) &&
        Objects.equals(this.cellShadingFill, docxTableCell.cellShadingFill) &&
        Objects.equals(this.cellShadingPattern, docxTableCell.cellShadingPattern) &&
        Objects.equals(this.cellWidthMode, docxTableCell.cellWidthMode) &&
        Objects.equals(this.cellWidth, docxTableCell.cellWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellIndex, path, paragraphs, cellShadingColor, cellShadingFill, cellShadingPattern, cellWidthMode, cellWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableCell {\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    cellShadingColor: ").append(toIndentedString(cellShadingColor)).append("\n");
    sb.append("    cellShadingFill: ").append(toIndentedString(cellShadingFill)).append("\n");
    sb.append("    cellShadingPattern: ").append(toIndentedString(cellShadingPattern)).append("\n");
    sb.append("    cellWidthMode: ").append(toIndentedString(cellWidthMode)).append("\n");
    sb.append("    cellWidth: ").append(toIndentedString(cellWidth)).append("\n");
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

