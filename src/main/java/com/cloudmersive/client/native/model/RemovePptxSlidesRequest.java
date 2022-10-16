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
 * Input to a Remove PowerPoint PPTX Presentation Slides request
 */
@ApiModel(description = "Input to a Remove PowerPoint PPTX Presentation Slides request")
@JsonPropertyOrder({
  RemovePptxSlidesRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  RemovePptxSlidesRequest.JSON_PROPERTY_INPUT_FILE_URL,
  RemovePptxSlidesRequest.JSON_PROPERTY_START_DELETE_SLIDE_NUMBER,
  RemovePptxSlidesRequest.JSON_PROPERTY_END_DELETE_SLIDE_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class RemovePptxSlidesRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_START_DELETE_SLIDE_NUMBER = "StartDeleteSlideNumber";
  private Integer startDeleteSlideNumber;

  public static final String JSON_PROPERTY_END_DELETE_SLIDE_NUMBER = "EndDeleteSlideNumber";
  private Integer endDeleteSlideNumber;

  public RemovePptxSlidesRequest() { 
  }

  public RemovePptxSlidesRequest inputFileBytes(byte[] inputFileBytes) {
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


  public RemovePptxSlidesRequest inputFileUrl(String inputFileUrl) {
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


  public RemovePptxSlidesRequest startDeleteSlideNumber(Integer startDeleteSlideNumber) {
    this.startDeleteSlideNumber = startDeleteSlideNumber;
    return this;
  }

   /**
   * Slide number (1-based) to start deleting slides; inclusive
   * @return startDeleteSlideNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Slide number (1-based) to start deleting slides; inclusive")
  @JsonProperty(JSON_PROPERTY_START_DELETE_SLIDE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartDeleteSlideNumber() {
    return startDeleteSlideNumber;
  }


  @JsonProperty(JSON_PROPERTY_START_DELETE_SLIDE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDeleteSlideNumber(Integer startDeleteSlideNumber) {
    this.startDeleteSlideNumber = startDeleteSlideNumber;
  }


  public RemovePptxSlidesRequest endDeleteSlideNumber(Integer endDeleteSlideNumber) {
    this.endDeleteSlideNumber = endDeleteSlideNumber;
    return this;
  }

   /**
   * Slide number (1-based) to stop deleting slides; inclusive
   * @return endDeleteSlideNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Slide number (1-based) to stop deleting slides; inclusive")
  @JsonProperty(JSON_PROPERTY_END_DELETE_SLIDE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndDeleteSlideNumber() {
    return endDeleteSlideNumber;
  }


  @JsonProperty(JSON_PROPERTY_END_DELETE_SLIDE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDeleteSlideNumber(Integer endDeleteSlideNumber) {
    this.endDeleteSlideNumber = endDeleteSlideNumber;
  }


  /**
   * Return true if this RemovePptxSlidesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovePptxSlidesRequest removePptxSlidesRequest = (RemovePptxSlidesRequest) o;
    return Arrays.equals(this.inputFileBytes, removePptxSlidesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removePptxSlidesRequest.inputFileUrl) &&
        Objects.equals(this.startDeleteSlideNumber, removePptxSlidesRequest.startDeleteSlideNumber) &&
        Objects.equals(this.endDeleteSlideNumber, removePptxSlidesRequest.endDeleteSlideNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, startDeleteSlideNumber, endDeleteSlideNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovePptxSlidesRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    startDeleteSlideNumber: ").append(toIndentedString(startDeleteSlideNumber)).append("\n");
    sb.append("    endDeleteSlideNumber: ").append(toIndentedString(endDeleteSlideNumber)).append("\n");
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

