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


package com.cloudmersive.client.ntv.model;

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
 * Result of performing a IP threat check on an IP address
 */
@ApiModel(description = "Result of performing a IP threat check on an IP address")
@JsonPropertyOrder({
  IPThreatDetectionResponse.JSON_PROPERTY_IS_THREAT,
  IPThreatDetectionResponse.JSON_PROPERTY_THREAT_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:57:00.969536800-07:00[America/Los_Angeles]")
public class IPThreatDetectionResponse {
  public static final String JSON_PROPERTY_IS_THREAT = "IsThreat";
  private Boolean isThreat;

  public static final String JSON_PROPERTY_THREAT_TYPE = "ThreatType";
  private String threatType;

  public IPThreatDetectionResponse() { 
  }

  public IPThreatDetectionResponse isThreat(Boolean isThreat) {
    this.isThreat = isThreat;
    return this;
  }

   /**
   * True if the input IP address is a threat, false otherwise
   * @return isThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input IP address is a threat, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsThreat() {
    return isThreat;
  }


  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }


  public IPThreatDetectionResponse threatType(String threatType) {
    this.threatType = threatType;
    return this;
  }

   /**
   * Specifies the type of IP threat; possible values include Blocklist, Botnet, WebBot
   * @return threatType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of IP threat; possible values include Blocklist, Botnet, WebBot")
  @JsonProperty(JSON_PROPERTY_THREAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreatType() {
    return threatType;
  }


  @JsonProperty(JSON_PROPERTY_THREAT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreatType(String threatType) {
    this.threatType = threatType;
  }


  /**
   * Return true if this IPThreatDetectionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPThreatDetectionResponse ipThreatDetectionResponse = (IPThreatDetectionResponse) o;
    return Objects.equals(this.isThreat, ipThreatDetectionResponse.isThreat) &&
        Objects.equals(this.threatType, ipThreatDetectionResponse.threatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isThreat, threatType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPThreatDetectionResponse {\n");
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
    sb.append("    threatType: ").append(toIndentedString(threatType)).append("\n");
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

