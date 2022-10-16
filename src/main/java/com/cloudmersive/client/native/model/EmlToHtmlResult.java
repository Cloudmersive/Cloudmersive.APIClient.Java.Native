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
import com.cloudmersive.client.native.model.EmlAttachment;
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
 * Result of converting an EML file to HTML string
 */
@ApiModel(description = "Result of converting an EML file to HTML string")
@JsonPropertyOrder({
  EmlToHtmlResult.JSON_PROPERTY_SUCCESSFUL,
  EmlToHtmlResult.JSON_PROPERTY_CONTENT,
  EmlToHtmlResult.JSON_PROPERTY_BODY,
  EmlToHtmlResult.JSON_PROPERTY_FROM,
  EmlToHtmlResult.JSON_PROPERTY_TO,
  EmlToHtmlResult.JSON_PROPERTY_CC,
  EmlToHtmlResult.JSON_PROPERTY_DATE_SENT,
  EmlToHtmlResult.JSON_PROPERTY_SUBJECT,
  EmlToHtmlResult.JSON_PROPERTY_ATTACHMENTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class EmlToHtmlResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private String content;

  public static final String JSON_PROPERTY_BODY = "Body";
  private String body;

  public static final String JSON_PROPERTY_FROM = "From";
  private String from;

  public static final String JSON_PROPERTY_TO = "To";
  private String to;

  public static final String JSON_PROPERTY_CC = "Cc";
  private String cc;

  public static final String JSON_PROPERTY_DATE_SENT = "DateSent";
  private String dateSent;

  public static final String JSON_PROPERTY_SUBJECT = "Subject";
  private String subject;

  public static final String JSON_PROPERTY_ATTACHMENTS = "Attachments";
  private List<EmlAttachment> attachments = null;

  public EmlToHtmlResult() { 
  }

  public EmlToHtmlResult successful(Boolean successful) {
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


  public EmlToHtmlResult content(String content) {
    this.content = content;
    return this;
  }

   /**
   * An HTML string version of the EML file
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An HTML string version of the EML file")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public EmlToHtmlResult body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The main body of the EML file&#39;s email as an HTML string
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The main body of the EML file's email as an HTML string")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public EmlToHtmlResult from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The From sender of the EML file&#39;s email
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The From sender of the EML file's email")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(String from) {
    this.from = from;
  }


  public EmlToHtmlResult to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The To recipients of the EML file&#39;s email
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The To recipients of the EML file's email")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(String to) {
    this.to = to;
  }


  public EmlToHtmlResult cc(String cc) {
    this.cc = cc;
    return this;
  }

   /**
   * The CC recipients of the EML file&#39;s email
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CC recipients of the EML file's email")
  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCc() {
    return cc;
  }


  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCc(String cc) {
    this.cc = cc;
  }


  public EmlToHtmlResult dateSent(String dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * The date and time that the EML file&#39;s email was sent
   * @return dateSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the EML file's email was sent")
  @JsonProperty(JSON_PROPERTY_DATE_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateSent() {
    return dateSent;
  }


  @JsonProperty(JSON_PROPERTY_DATE_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateSent(String dateSent) {
    this.dateSent = dateSent;
  }


  public EmlToHtmlResult subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the EML file&#39;s email
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject of the EML file's email")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmlToHtmlResult attachments(List<EmlAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EmlToHtmlResult addAttachmentsItem(EmlAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of all attachments for the EML file
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all attachments for the EML file")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmlAttachment> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(List<EmlAttachment> attachments) {
    this.attachments = attachments;
  }


  /**
   * Return true if this EmlToHtmlResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmlToHtmlResult emlToHtmlResult = (EmlToHtmlResult) o;
    return Objects.equals(this.successful, emlToHtmlResult.successful) &&
        Objects.equals(this.content, emlToHtmlResult.content) &&
        Objects.equals(this.body, emlToHtmlResult.body) &&
        Objects.equals(this.from, emlToHtmlResult.from) &&
        Objects.equals(this.to, emlToHtmlResult.to) &&
        Objects.equals(this.cc, emlToHtmlResult.cc) &&
        Objects.equals(this.dateSent, emlToHtmlResult.dateSent) &&
        Objects.equals(this.subject, emlToHtmlResult.subject) &&
        Objects.equals(this.attachments, emlToHtmlResult.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, content, body, from, to, cc, dateSent, subject, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmlToHtmlResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

