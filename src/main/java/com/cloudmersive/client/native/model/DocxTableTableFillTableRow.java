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
import com.cloudmersive.client.native.model.DocxTableTableFillTableCell;
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
 * Row data to fill in to the DOCX Table
 */
@ApiModel(description = "Row data to fill in to the DOCX Table")
@JsonPropertyOrder({
  DocxTableTableFillTableRow.JSON_PROPERTY_CELLS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class DocxTableTableFillTableRow {
  public static final String JSON_PROPERTY_CELLS = "Cells";
  private List<DocxTableTableFillTableCell> cells = null;

  public DocxTableTableFillTableRow() { 
  }

  public DocxTableTableFillTableRow cells(List<DocxTableTableFillTableCell> cells) {
    this.cells = cells;
    return this;
  }

  public DocxTableTableFillTableRow addCellsItem(DocxTableTableFillTableCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells in the row to fill in
   * @return cells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cells in the row to fill in")
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTableTableFillTableCell> getCells() {
    return cells;
  }


  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCells(List<DocxTableTableFillTableCell> cells) {
    this.cells = cells;
  }


  /**
   * Return true if this DocxTableTableFillTableRow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillTableRow docxTableTableFillTableRow = (DocxTableTableFillTableRow) o;
    return Objects.equals(this.cells, docxTableTableFillTableRow.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillTableRow {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

