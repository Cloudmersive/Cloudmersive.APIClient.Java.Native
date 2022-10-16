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
import com.cloudmersive.client.native.model.ConvertedPngPage;
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
 * Result of converting an ODP input to a PNG array
 */
@ApiModel(description = "Result of converting an ODP input to a PNG array")
@JsonPropertyOrder({
  OdpToPngResult.JSON_PROPERTY_SUCCESSFUL,
  OdpToPngResult.JSON_PROPERTY_PNG_RESULT_PAGES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:52.110310500-07:00[America/Los_Angeles]")
public class OdpToPngResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PNG_RESULT_PAGES = "PngResultPages";
  private List<ConvertedPngPage> pngResultPages = null;

  public OdpToPngResult() { 
  }

  public OdpToPngResult successful(Boolean successful) {
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


  public OdpToPngResult pngResultPages(List<ConvertedPngPage> pngResultPages) {
    this.pngResultPages = pngResultPages;
    return this;
  }

  public OdpToPngResult addPngResultPagesItem(ConvertedPngPage pngResultPagesItem) {
    if (this.pngResultPages == null) {
      this.pngResultPages = new ArrayList<>();
    }
    this.pngResultPages.add(pngResultPagesItem);
    return this;
  }

   /**
   * Array of converted pages
   * @return pngResultPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of converted pages")
  @JsonProperty(JSON_PROPERTY_PNG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConvertedPngPage> getPngResultPages() {
    return pngResultPages;
  }


  @JsonProperty(JSON_PROPERTY_PNG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPngResultPages(List<ConvertedPngPage> pngResultPages) {
    this.pngResultPages = pngResultPages;
  }


  /**
   * Return true if this OdpToPngResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OdpToPngResult odpToPngResult = (OdpToPngResult) o;
    return Objects.equals(this.successful, odpToPngResult.successful) &&
        Objects.equals(this.pngResultPages, odpToPngResult.pngResultPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pngResultPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdpToPngResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pngResultPages: ").append(toIndentedString(pngResultPages)).append("\n");
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

