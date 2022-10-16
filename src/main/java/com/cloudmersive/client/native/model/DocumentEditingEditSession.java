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
 * Active document editing session result.  To retrieve the document, use the Finish Editing API.
 */
@ApiModel(description = "Active document editing session result.  To retrieve the document, use the Finish Editing API.")
@JsonPropertyOrder({
  DocumentEditingEditSession.JSON_PROPERTY_SUCCESSFUL,
  DocumentEditingEditSession.JSON_PROPERTY_EDIT_SESSION_U_R_L
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class DocumentEditingEditSession {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_EDIT_SESSION_U_R_L = "EditSessionURL";
  private String editSessionURL;

  public DocumentEditingEditSession() { 
  }

  public DocumentEditingEditSession successful(Boolean successful) {
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


  public DocumentEditingEditSession editSessionURL(String editSessionURL) {
    this.editSessionURL = editSessionURL;
    return this;
  }

   /**
   * Document editing session URL; in-memory temporary cache link with TTL (Time-to-Live expiration) of 30 minutes.  To retrieve the document, use the Finish Editing API.
   * @return editSessionURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document editing session URL; in-memory temporary cache link with TTL (Time-to-Live expiration) of 30 minutes.  To retrieve the document, use the Finish Editing API.")
  @JsonProperty(JSON_PROPERTY_EDIT_SESSION_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditSessionURL() {
    return editSessionURL;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_SESSION_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditSessionURL(String editSessionURL) {
    this.editSessionURL = editSessionURL;
  }


  /**
   * Return true if this DocumentEditingEditSession object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentEditingEditSession documentEditingEditSession = (DocumentEditingEditSession) o;
    return Objects.equals(this.successful, documentEditingEditSession.successful) &&
        Objects.equals(this.editSessionURL, documentEditingEditSession.editSessionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, editSessionURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEditingEditSession {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    editSessionURL: ").append(toIndentedString(editSessionURL)).append("\n");
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
