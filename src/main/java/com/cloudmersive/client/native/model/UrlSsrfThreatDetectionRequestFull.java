/*
 * securityapi
 * The security APIs help you detect and block security threats.
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request to determine if a URL is an SSRF threat check
 */
@ApiModel(description = "Request to determine if a URL is an SSRF threat check")
@JsonPropertyOrder({
  UrlSsrfThreatDetectionRequestFull.JSON_PROPERTY_U_R_L,
  UrlSsrfThreatDetectionRequestFull.JSON_PROPERTY_BLOCKED_DOMAINS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:34:21.930465900-07:00[America/Los_Angeles]")
public class UrlSsrfThreatDetectionRequestFull {
  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_BLOCKED_DOMAINS = "BlockedDomains";
  private List<String> blockedDomains = null;

  public UrlSsrfThreatDetectionRequestFull() { 
  }

  public UrlSsrfThreatDetectionRequestFull URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL to validate
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to validate")
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


  public UrlSsrfThreatDetectionRequestFull blockedDomains(List<String> blockedDomains) {
    this.blockedDomains = blockedDomains;
    return this;
  }

  public UrlSsrfThreatDetectionRequestFull addBlockedDomainsItem(String blockedDomainsItem) {
    if (this.blockedDomains == null) {
      this.blockedDomains = new ArrayList<>();
    }
    this.blockedDomains.add(blockedDomainsItem);
    return this;
  }

   /**
   * Top level domains that you do not want to allow access to, e.g. mydomain.com - will block all subdomains as well
   * @return blockedDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Top level domains that you do not want to allow access to, e.g. mydomain.com - will block all subdomains as well")
  @JsonProperty(JSON_PROPERTY_BLOCKED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBlockedDomains() {
    return blockedDomains;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedDomains(List<String> blockedDomains) {
    this.blockedDomains = blockedDomains;
  }


  /**
   * Return true if this UrlSsrfThreatDetectionRequestFull object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfThreatDetectionRequestFull urlSsrfThreatDetectionRequestFull = (UrlSsrfThreatDetectionRequestFull) o;
    return Objects.equals(this.URL, urlSsrfThreatDetectionRequestFull.URL) &&
        Objects.equals(this.blockedDomains, urlSsrfThreatDetectionRequestFull.blockedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, blockedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfThreatDetectionRequestFull {\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    blockedDomains: ").append(toIndentedString(blockedDomains)).append("\n");
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

