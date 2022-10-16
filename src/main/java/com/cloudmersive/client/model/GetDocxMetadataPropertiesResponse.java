/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.DocxMetadataCustomProperty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Result of running a DocxGetMetadataProperties command
 */
@ApiModel(description = "Result of running a DocxGetMetadataProperties command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:39.601-07:00")
public class GetDocxMetadataPropertiesResponse {
  @SerializedName("Company")
  private String company = null;

  @SerializedName("Manager")
  private String manager = null;

  @SerializedName("ApplicationVersion")
  private String applicationVersion = null;

  @SerializedName("WordCount")
  private Long wordCount = null;

  @SerializedName("LineCount")
  private Long lineCount = null;

  @SerializedName("ParagraphCount")
  private Long paragraphCount = null;

  @SerializedName("PageCount")
  private Long pageCount = null;

  @SerializedName("CustomProperties")
  private List<DocxMetadataCustomProperty> customProperties = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  public GetDocxMetadataPropertiesResponse company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the Company that authored the document, if available
   * @return company
  **/
  @ApiModelProperty(value = "Name of the Company that authored the document, if available")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public GetDocxMetadataPropertiesResponse manager(String manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Name of the Manager that authored the document, if available
   * @return manager
  **/
  @ApiModelProperty(value = "Name of the Manager that authored the document, if available")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public GetDocxMetadataPropertiesResponse applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Application version that authored the document, if available
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "Application version that authored the document, if available")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public GetDocxMetadataPropertiesResponse wordCount(Long wordCount) {
    this.wordCount = wordCount;
    return this;
  }

   /**
   * Word count of the document
   * @return wordCount
  **/
  @ApiModelProperty(value = "Word count of the document")
  public Long getWordCount() {
    return wordCount;
  }

  public void setWordCount(Long wordCount) {
    this.wordCount = wordCount;
  }

  public GetDocxMetadataPropertiesResponse lineCount(Long lineCount) {
    this.lineCount = lineCount;
    return this;
  }

   /**
   * Line count of the document
   * @return lineCount
  **/
  @ApiModelProperty(value = "Line count of the document")
  public Long getLineCount() {
    return lineCount;
  }

  public void setLineCount(Long lineCount) {
    this.lineCount = lineCount;
  }

  public GetDocxMetadataPropertiesResponse paragraphCount(Long paragraphCount) {
    this.paragraphCount = paragraphCount;
    return this;
  }

   /**
   * Paragraph count of the document
   * @return paragraphCount
  **/
  @ApiModelProperty(value = "Paragraph count of the document")
  public Long getParagraphCount() {
    return paragraphCount;
  }

  public void setParagraphCount(Long paragraphCount) {
    this.paragraphCount = paragraphCount;
  }

  public GetDocxMetadataPropertiesResponse pageCount(Long pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Page count of the document
   * @return pageCount
  **/
  @ApiModelProperty(value = "Page count of the document")
  public Long getPageCount() {
    return pageCount;
  }

  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }

  public GetDocxMetadataPropertiesResponse customProperties(List<DocxMetadataCustomProperty> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public GetDocxMetadataPropertiesResponse addCustomPropertiesItem(DocxMetadataCustomProperty customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<DocxMetadataCustomProperty>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

   /**
   * Custom properties applied to the document
   * @return customProperties
  **/
  @ApiModelProperty(value = "Custom properties applied to the document")
  public List<DocxMetadataCustomProperty> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(List<DocxMetadataCustomProperty> customProperties) {
    this.customProperties = customProperties;
  }

  public GetDocxMetadataPropertiesResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxMetadataPropertiesResponse getDocxMetadataPropertiesResponse = (GetDocxMetadataPropertiesResponse) o;
    return Objects.equals(this.company, getDocxMetadataPropertiesResponse.company) &&
        Objects.equals(this.manager, getDocxMetadataPropertiesResponse.manager) &&
        Objects.equals(this.applicationVersion, getDocxMetadataPropertiesResponse.applicationVersion) &&
        Objects.equals(this.wordCount, getDocxMetadataPropertiesResponse.wordCount) &&
        Objects.equals(this.lineCount, getDocxMetadataPropertiesResponse.lineCount) &&
        Objects.equals(this.paragraphCount, getDocxMetadataPropertiesResponse.paragraphCount) &&
        Objects.equals(this.pageCount, getDocxMetadataPropertiesResponse.pageCount) &&
        Objects.equals(this.customProperties, getDocxMetadataPropertiesResponse.customProperties) &&
        Objects.equals(this.successful, getDocxMetadataPropertiesResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, manager, applicationVersion, wordCount, lineCount, paragraphCount, pageCount, customProperties, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxMetadataPropertiesResponse {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
    sb.append("    paragraphCount: ").append(toIndentedString(paragraphCount)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

