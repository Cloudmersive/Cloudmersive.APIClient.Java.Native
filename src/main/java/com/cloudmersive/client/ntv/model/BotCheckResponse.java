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
 * Result of performing a Bot check on an IP address
 */
@ApiModel(description = "Result of performing a Bot check on an IP address")
@JsonPropertyOrder({
  BotCheckResponse.JSON_PROPERTY_IS_BOT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:56:16.404307500-07:00[America/Los_Angeles]")
public class BotCheckResponse {
  public static final String JSON_PROPERTY_IS_BOT = "IsBot";
  private Boolean isBot;

  public BotCheckResponse() { 
  }

  public BotCheckResponse isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

   /**
   * True if the input IP address is a Bot or Robot, false otherwise
   * @return isBot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input IP address is a Bot or Robot, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_BOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBot() {
    return isBot;
  }


  @JsonProperty(JSON_PROPERTY_IS_BOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }


  /**
   * Return true if this BotCheckResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotCheckResponse botCheckResponse = (BotCheckResponse) o;
    return Objects.equals(this.isBot, botCheckResponse.isBot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotCheckResponse {\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
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
