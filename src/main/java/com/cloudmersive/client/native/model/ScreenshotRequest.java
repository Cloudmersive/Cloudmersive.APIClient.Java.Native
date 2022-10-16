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
 * Details of the screenshot request
 */
@ApiModel(description = "Details of the screenshot request")
@JsonPropertyOrder({
  ScreenshotRequest.JSON_PROPERTY_URL,
  ScreenshotRequest.JSON_PROPERTY_EXTRA_LOADING_WAIT,
  ScreenshotRequest.JSON_PROPERTY_SCREENSHOT_WIDTH,
  ScreenshotRequest.JSON_PROPERTY_SCREENSHOT_HEIGHT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class ScreenshotRequest {
  public static final String JSON_PROPERTY_URL = "Url";
  private String url;

  public static final String JSON_PROPERTY_EXTRA_LOADING_WAIT = "ExtraLoadingWait";
  private Integer extraLoadingWait;

  public static final String JSON_PROPERTY_SCREENSHOT_WIDTH = "ScreenshotWidth";
  private Integer screenshotWidth;

  public static final String JSON_PROPERTY_SCREENSHOT_HEIGHT = "ScreenshotHeight";
  private Integer screenshotHeight;

  public ScreenshotRequest() { 
  }

  public ScreenshotRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL address of the website to screenshot.  HTTP and HTTPS are both supported, as are custom ports.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL address of the website to screenshot.  HTTP and HTTPS are both supported, as are custom ports.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ScreenshotRequest extraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites.  Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 20000 milliseconds (20 seconds).
   * @return extraLoadingWait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites.  Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 20000 milliseconds (20 seconds).")
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


  public ScreenshotRequest screenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
    return this;
  }

   /**
   * Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024
   * @return screenshotWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024")
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


  public ScreenshotRequest screenshotHeight(Integer screenshotHeight) {
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
   * Return true if this ScreenshotRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotRequest screenshotRequest = (ScreenshotRequest) o;
    return Objects.equals(this.url, screenshotRequest.url) &&
        Objects.equals(this.extraLoadingWait, screenshotRequest.extraLoadingWait) &&
        Objects.equals(this.screenshotWidth, screenshotRequest.screenshotWidth) &&
        Objects.equals(this.screenshotHeight, screenshotRequest.screenshotHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, extraLoadingWait, screenshotWidth, screenshotHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

