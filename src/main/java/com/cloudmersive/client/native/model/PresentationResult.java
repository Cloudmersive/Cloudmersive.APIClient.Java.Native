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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A single Excel XLSX file corresponding to one worksheet (tab) in the original spreadsheet
 */
@ApiModel(description = "A single Excel XLSX file corresponding to one worksheet (tab) in the original spreadsheet")
@JsonPropertyOrder({
  PresentationResult.JSON_PROPERTY_SLIDE_NUMBER,
  PresentationResult.JSON_PROPERTY_U_R_L,
  PresentationResult.JSON_PROPERTY_PRESENTATION_CONTENTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:52.110310500-07:00[America/Los_Angeles]")
public class PresentationResult {
  public static final String JSON_PROPERTY_SLIDE_NUMBER = "SlideNumber";
  private Integer slideNumber;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_PRESENTATION_CONTENTS = "PresentationContents";
  private byte[] presentationContents;

  public PresentationResult() { 
  }

  public PresentationResult slideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
    return this;
  }

   /**
   * Worksheet number of the converted page, starting with 1 for the left-most worksheet
   * @return slideNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Worksheet number of the converted page, starting with 1 for the left-most worksheet")
  @JsonProperty(JSON_PROPERTY_SLIDE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSlideNumber() {
    return slideNumber;
  }


  @JsonProperty(JSON_PROPERTY_SLIDE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
  }


  public PresentationResult URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL to the PPTX file of this slide; file is stored in an in-memory cache and will be deleted
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the PPTX file of this slide; file is stored in an in-memory cache and will be deleted")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }


  public PresentationResult presentationContents(byte[] presentationContents) {
    this.presentationContents = presentationContents;
    return this;
  }

   /**
   * Contents of the presentation in bytes
   * @return presentationContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents of the presentation in bytes")
  @JsonProperty(JSON_PROPERTY_PRESENTATION_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getPresentationContents() {
    return presentationContents;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationContents(byte[] presentationContents) {
    this.presentationContents = presentationContents;
  }


  /**
   * Return true if this PresentationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationResult presentationResult = (PresentationResult) o;
    return Objects.equals(this.slideNumber, presentationResult.slideNumber) &&
        Objects.equals(this.URL, presentationResult.URL) &&
        Arrays.equals(this.presentationContents, presentationResult.presentationContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slideNumber, URL, Arrays.hashCode(presentationContents));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationResult {\n");
    sb.append("    slideNumber: ").append(toIndentedString(slideNumber)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    presentationContents: ").append(toIndentedString(presentationContents)).append("\n");
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

