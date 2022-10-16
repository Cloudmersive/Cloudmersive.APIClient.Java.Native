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
 * Details of the HTML to PNG request
 */
@ApiModel(description = "Details of the HTML to PNG request")
@JsonPropertyOrder({
  HtmlToPngRequest.JSON_PROPERTY_HTML,
  HtmlToPngRequest.JSON_PROPERTY_EXTRA_LOADING_WAIT,
  HtmlToPngRequest.JSON_PROPERTY_SCREENSHOT_WIDTH,
  HtmlToPngRequest.JSON_PROPERTY_SCREENSHOT_HEIGHT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class HtmlToPngRequest {
  public static final String JSON_PROPERTY_HTML = "Html";
  private String html;

  public static final String JSON_PROPERTY_EXTRA_LOADING_WAIT = "ExtraLoadingWait";
  private Integer extraLoadingWait;

  public static final String JSON_PROPERTY_SCREENSHOT_WIDTH = "ScreenshotWidth";
  private Integer screenshotWidth;

  public static final String JSON_PROPERTY_SCREENSHOT_HEIGHT = "ScreenshotHeight";
  private Integer screenshotHeight;

  public HtmlToPngRequest() { 
  }

  public HtmlToPngRequest html(String html) {
    this.html = html;
    return this;
  }

   /**
   * HTML to render to PNG (screenshot)
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTML to render to PNG (screenshot)")
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtml() {
    return html;
  }


  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtml(String html) {
    this.html = html;
  }


  public HtmlToPngRequest extraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites. Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 30000 milliseconds (30 seconds).
   * @return extraLoadingWait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites. Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 30000 milliseconds (30 seconds).")
  @JsonProperty(JSON_PROPERTY_EXTRA_LOADING_WAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_LOADING_WAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
  }


  public HtmlToPngRequest screenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
    return this;
  }

   /**
   * Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot
   * @return screenshotWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot")
  @JsonProperty(JSON_PROPERTY_SCREENSHOT_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScreenshotWidth() {
    return screenshotWidth;
  }


  @JsonProperty(JSON_PROPERTY_SCREENSHOT_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScreenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
  }


  public HtmlToPngRequest screenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
    return this;
  }

   /**
   * Optional: Height of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot
   * @return screenshotHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Height of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot")
  @JsonProperty(JSON_PROPERTY_SCREENSHOT_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScreenshotHeight() {
    return screenshotHeight;
  }


  @JsonProperty(JSON_PROPERTY_SCREENSHOT_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScreenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
  }


  /**
   * Return true if this HtmlToPngRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlToPngRequest htmlToPngRequest = (HtmlToPngRequest) o;
    return Objects.equals(this.html, htmlToPngRequest.html) &&
        Objects.equals(this.extraLoadingWait, htmlToPngRequest.extraLoadingWait) &&
        Objects.equals(this.screenshotWidth, htmlToPngRequest.screenshotWidth) &&
        Objects.equals(this.screenshotHeight, htmlToPngRequest.screenshotHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, extraLoadingWait, screenshotWidth, screenshotHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlToPngRequest {\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
    sb.append("    screenshotWidth: ").append(toIndentedString(screenshotWidth)).append("\n");
    sb.append("    screenshotHeight: ").append(toIndentedString(screenshotHeight)).append("\n");
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
