/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * SentenceSegmentationResponse
 */
@JsonPropertyOrder({
  SentenceSegmentationResponse.JSON_PROPERTY_SUCCESSFUL,
  SentenceSegmentationResponse.JSON_PROPERTY_SENTENCES,
  SentenceSegmentationResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:54.155120600-07:00[America/Los_Angeles]")
public class SentenceSegmentationResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_SENTENCES = "Sentences";
  private List<String> sentences = null;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;

  public SentenceSegmentationResponse() { 
  }

  public SentenceSegmentationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SentenceSegmentationResponse sentences(List<String> sentences) {
    this.sentences = sentences;
    return this;
  }

  public SentenceSegmentationResponse addSentencesItem(String sentencesItem) {
    if (this.sentences == null) {
      this.sentences = new ArrayList<>();
    }
    this.sentences.add(sentencesItem);
    return this;
  }

   /**
   * Get sentences
   * @return sentences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENTENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSentences() {
    return sentences;
  }


  @JsonProperty(JSON_PROPERTY_SENTENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentences(List<String> sentences) {
    this.sentences = sentences;
  }


  public SentenceSegmentationResponse sentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Get sentenceCount
   * @return sentenceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENTENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentenceCount() {
    return sentenceCount;
  }


  @JsonProperty(JSON_PROPERTY_SENTENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
  }


  /**
   * Return true if this SentenceSegmentationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentenceSegmentationResponse sentenceSegmentationResponse = (SentenceSegmentationResponse) o;
    return Objects.equals(this.successful, sentenceSegmentationResponse.successful) &&
        Objects.equals(this.sentences, sentenceSegmentationResponse.sentences) &&
        Objects.equals(this.sentenceCount, sentenceSegmentationResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, sentences, sentenceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentenceSegmentationResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
    sb.append("    sentenceCount: ").append(toIndentedString(sentenceCount)).append("\n");
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

