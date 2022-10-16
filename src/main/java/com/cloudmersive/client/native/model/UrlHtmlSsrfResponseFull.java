/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of checking a URL for HTML-embedded SSRF threats
 */
@ApiModel(description = "Result of checking a URL for HTML-embedded SSRF threats")
@JsonPropertyOrder({
  UrlHtmlSsrfResponseFull.JSON_PROPERTY_CLEAN_U_R_L,
  UrlHtmlSsrfResponseFull.JSON_PROPERTY_HTTP_RESPONSE_CODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:50.092931600-07:00[America/Los_Angeles]")
public class UrlHtmlSsrfResponseFull {
  public static final String JSON_PROPERTY_CLEAN_U_R_L = "CleanURL";
  private Boolean cleanURL;

  public static final String JSON_PROPERTY_HTTP_RESPONSE_CODE = "HttpResponseCode";
  private Integer httpResponseCode;

  public UrlHtmlSsrfResponseFull() { 
  }

  public UrlHtmlSsrfResponseFull cleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
    return this;
  }

   /**
   * True if the URL is clean, false if it is at risk of containing an SSRF threat or attack
   * @return cleanURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the URL is clean, false if it is at risk of containing an SSRF threat or attack")
  @JsonProperty(JSON_PROPERTY_CLEAN_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleanURL() {
    return cleanURL;
  }


  @JsonProperty(JSON_PROPERTY_CLEAN_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
  }


  public UrlHtmlSsrfResponseFull httpResponseCode(Integer httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
    return this;
  }

   /**
   * HTTP response code from the URL
   * @return httpResponseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP response code from the URL")
  @JsonProperty(JSON_PROPERTY_HTTP_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpResponseCode() {
    return httpResponseCode;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpResponseCode(Integer httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
  }


  /**
   * Return true if this UrlHtmlSsrfResponseFull object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlHtmlSsrfResponseFull urlHtmlSsrfResponseFull = (UrlHtmlSsrfResponseFull) o;
    return Objects.equals(this.cleanURL, urlHtmlSsrfResponseFull.cleanURL) &&
        Objects.equals(this.httpResponseCode, urlHtmlSsrfResponseFull.httpResponseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanURL, httpResponseCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlHtmlSsrfResponseFull {\n");
    sb.append("    cleanURL: ").append(toIndentedString(cleanURL)).append("\n");
    sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
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

