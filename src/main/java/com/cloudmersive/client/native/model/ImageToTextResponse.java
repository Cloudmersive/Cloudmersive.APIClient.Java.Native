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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Response from an OCR to text operation.  Includes the confience rating and converted text result.
 */
@ApiModel(description = "Response from an OCR to text operation.  Includes the confience rating and converted text result.")
@JsonPropertyOrder({
  ImageToTextResponse.JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL,
  ImageToTextResponse.JSON_PROPERTY_TEXT_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:40.650093200-07:00[America/Los_Angeles]")
public class ImageToTextResponse {
  public static final String JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL = "MeanConfidenceLevel";
  private Float meanConfidenceLevel;

  public static final String JSON_PROPERTY_TEXT_RESULT = "TextResult";
  private String textResult;

  public ImageToTextResponse() { 
  }

  public ImageToTextResponse meanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
    return this;
  }

   /**
   * Confidence level rating of the OCR operation; ratings above 80% are strong.
   * @return meanConfidenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confidence level rating of the OCR operation; ratings above 80% are strong.")
  @JsonProperty(JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMeanConfidenceLevel() {
    return meanConfidenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
  }


  public ImageToTextResponse textResult(String textResult) {
    this.textResult = textResult;
    return this;
  }

   /**
   * Converted text string from the image input.
   * @return textResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Converted text string from the image input.")
  @JsonProperty(JSON_PROPERTY_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextResult() {
    return textResult;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextResult(String textResult) {
    this.textResult = textResult;
  }


  /**
   * Return true if this ImageToTextResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageToTextResponse imageToTextResponse = (ImageToTextResponse) o;
    return Objects.equals(this.meanConfidenceLevel, imageToTextResponse.meanConfidenceLevel) &&
        Objects.equals(this.textResult, imageToTextResponse.textResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meanConfidenceLevel, textResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToTextResponse {\n");
    sb.append("    meanConfidenceLevel: ").append(toIndentedString(meanConfidenceLevel)).append("\n");
    sb.append("    textResult: ").append(toIndentedString(textResult)).append("\n");
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

