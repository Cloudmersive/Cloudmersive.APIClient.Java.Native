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
import com.cloudmersive.client.native.model.DocxText;
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
 * A content run in a Word Document (DOCX) file
 */
@ApiModel(description = "A content run in a Word Document (DOCX) file")
@JsonPropertyOrder({
  DocxRun.JSON_PROPERTY_RUN_INDEX,
  DocxRun.JSON_PROPERTY_PATH,
  DocxRun.JSON_PROPERTY_TEXT_ITEMS,
  DocxRun.JSON_PROPERTY_BOLD,
  DocxRun.JSON_PROPERTY_ITALIC,
  DocxRun.JSON_PROPERTY_UNDERLINE,
  DocxRun.JSON_PROPERTY_FONT_FAMILY,
  DocxRun.JSON_PROPERTY_FONT_SIZE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class DocxRun {
  public static final String JSON_PROPERTY_RUN_INDEX = "RunIndex";
  private Integer runIndex;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_TEXT_ITEMS = "TextItems";
  private List<DocxText> textItems = null;

  public static final String JSON_PROPERTY_BOLD = "Bold";
  private Boolean bold;

  public static final String JSON_PROPERTY_ITALIC = "Italic";
  private Boolean italic;

  public static final String JSON_PROPERTY_UNDERLINE = "Underline";
  private String underline;

  public static final String JSON_PROPERTY_FONT_FAMILY = "FontFamily";
  private String fontFamily;

  public static final String JSON_PROPERTY_FONT_SIZE = "FontSize";
  private String fontSize;

  public DocxRun() { 
  }

  public DocxRun runIndex(Integer runIndex) {
    this.runIndex = runIndex;
    return this;
  }

   /**
   * Index of the run, 0-based
   * @return runIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of the run, 0-based")
  @JsonProperty(JSON_PROPERTY_RUN_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRunIndex() {
    return runIndex;
  }


  @JsonProperty(JSON_PROPERTY_RUN_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunIndex(Integer runIndex) {
    this.runIndex = runIndex;
  }


  public DocxRun path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this Run object; leave blank for creation
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this Run object; leave blank for creation")
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


  public DocxRun textItems(List<DocxText> textItems) {
    this.textItems = textItems;
    return this;
  }

  public DocxRun addTextItemsItem(DocxText textItemsItem) {
    if (this.textItems == null) {
      this.textItems = new ArrayList<>();
    }
    this.textItems.add(textItemsItem);
    return this;
  }

   /**
   * Text items inside the run; this is where the actual text content is stored
   * @return textItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text items inside the run; this is where the actual text content is stored")
  @JsonProperty(JSON_PROPERTY_TEXT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxText> getTextItems() {
    return textItems;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextItems(List<DocxText> textItems) {
    this.textItems = textItems;
  }


  public DocxRun bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * True to make the text bold, false otherwise
   * @return bold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to make the text bold, false otherwise")
  @JsonProperty(JSON_PROPERTY_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBold() {
    return bold;
  }


  @JsonProperty(JSON_PROPERTY_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBold(Boolean bold) {
    this.bold = bold;
  }


  public DocxRun italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * True to make the text italic, false otherwise
   * @return italic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to make the text italic, false otherwise")
  @JsonProperty(JSON_PROPERTY_ITALIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getItalic() {
    return italic;
  }


  @JsonProperty(JSON_PROPERTY_ITALIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItalic(Boolean italic) {
    this.italic = italic;
  }


  public DocxRun underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Underline mode for the text; possible values are: Words, Double, Thick, Dotted, DottedHeavy, Dash, DashedHeavy, DashLong, DashLongHeavy, DotDash, DashDotHeavy, DotDotDash, DashDotDotHeavy, Wave, WavyHeavy, WavyDouble, None
   * @return underline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Underline mode for the text; possible values are: Words, Double, Thick, Dotted, DottedHeavy, Dash, DashedHeavy, DashLong, DashLongHeavy, DotDash, DashDotHeavy, DotDotDash, DashDotDotHeavy, Wave, WavyHeavy, WavyDouble, None")
  @JsonProperty(JSON_PROPERTY_UNDERLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnderline() {
    return underline;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderline(String underline) {
    this.underline = underline;
  }


  public DocxRun fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font Family name for the text, e.g. \&quot;Arial\&quot; or \&quot;Times New Roman\&quot;
   * @return fontFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font Family name for the text, e.g. \"Arial\" or \"Times New Roman\"")
  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontFamily() {
    return fontFamily;
  }


  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  public DocxRun fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size in font points (e.g. \&quot;24\&quot;)
   * @return fontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font size in font points (e.g. \"24\")")
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontSize() {
    return fontSize;
  }


  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * Return true if this DocxRun object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxRun docxRun = (DocxRun) o;
    return Objects.equals(this.runIndex, docxRun.runIndex) &&
        Objects.equals(this.path, docxRun.path) &&
        Objects.equals(this.textItems, docxRun.textItems) &&
        Objects.equals(this.bold, docxRun.bold) &&
        Objects.equals(this.italic, docxRun.italic) &&
        Objects.equals(this.underline, docxRun.underline) &&
        Objects.equals(this.fontFamily, docxRun.fontFamily) &&
        Objects.equals(this.fontSize, docxRun.fontSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runIndex, path, textItems, bold, italic, underline, fontFamily, fontSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxRun {\n");
    sb.append("    runIndex: ").append(toIndentedString(runIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    textItems: ").append(toIndentedString(textItems)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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

