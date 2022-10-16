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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Output of a sentiment analysis operation
 */
@ApiModel(description = "Output of a sentiment analysis operation")
@JsonPropertyOrder({
  SentimentAnalysisResponse.JSON_PROPERTY_SUCCESSFUL,
  SentimentAnalysisResponse.JSON_PROPERTY_SENTIMENT_CLASSIFICATION_RESULT,
  SentimentAnalysisResponse.JSON_PROPERTY_SENTIMENT_SCORE_RESULT,
  SentimentAnalysisResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:37.055407600-07:00[America/Los_Angeles]")
public class SentimentAnalysisResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_SENTIMENT_CLASSIFICATION_RESULT = "SentimentClassificationResult";
  private String sentimentClassificationResult;

  public static final String JSON_PROPERTY_SENTIMENT_SCORE_RESULT = "SentimentScoreResult";
  private Double sentimentScoreResult;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;

  public SentimentAnalysisResponse() { 
  }

  public SentimentAnalysisResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the sentiment analysis operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the sentiment analysis operation was successful, false otherwise")
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


  public SentimentAnalysisResponse sentimentClassificationResult(String sentimentClassificationResult) {
    this.sentimentClassificationResult = sentimentClassificationResult;
    return this;
  }

   /**
   * Classification of input text into a sentiment classification; possible values are \&quot;Positive\&quot;, \&quot;Negative\&quot; or \&quot;Neutral\&quot;
   * @return sentimentClassificationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Classification of input text into a sentiment classification; possible values are \"Positive\", \"Negative\" or \"Neutral\"")
  @JsonProperty(JSON_PROPERTY_SENTIMENT_CLASSIFICATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentimentClassificationResult() {
    return sentimentClassificationResult;
  }


  @JsonProperty(JSON_PROPERTY_SENTIMENT_CLASSIFICATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentimentClassificationResult(String sentimentClassificationResult) {
    this.sentimentClassificationResult = sentimentClassificationResult;
  }


  public SentimentAnalysisResponse sentimentScoreResult(Double sentimentScoreResult) {
    this.sentimentScoreResult = sentimentScoreResult;
    return this;
  }

   /**
   * Sentiment classification score between -1.0 and +1.0 where scores less than 0 are negative sentiment, scores greater than 0 are positive sentiment and scores close to 0 are neutral.  The greater the value deviates from 0.0 the stronger the sentiment, with +1.0 and -1.0 being maximum positive and negative sentiment, respectively.
   * @return sentimentScoreResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sentiment classification score between -1.0 and +1.0 where scores less than 0 are negative sentiment, scores greater than 0 are positive sentiment and scores close to 0 are neutral.  The greater the value deviates from 0.0 the stronger the sentiment, with +1.0 and -1.0 being maximum positive and negative sentiment, respectively.")
  @JsonProperty(JSON_PROPERTY_SENTIMENT_SCORE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSentimentScoreResult() {
    return sentimentScoreResult;
  }


  @JsonProperty(JSON_PROPERTY_SENTIMENT_SCORE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentimentScoreResult(Double sentimentScoreResult) {
    this.sentimentScoreResult = sentimentScoreResult;
  }


  public SentimentAnalysisResponse sentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Number of sentences in input text
   * @return sentenceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of sentences in input text")
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
   * Return true if this SentimentAnalysisResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentAnalysisResponse sentimentAnalysisResponse = (SentimentAnalysisResponse) o;
    return Objects.equals(this.successful, sentimentAnalysisResponse.successful) &&
        Objects.equals(this.sentimentClassificationResult, sentimentAnalysisResponse.sentimentClassificationResult) &&
        Objects.equals(this.sentimentScoreResult, sentimentAnalysisResponse.sentimentScoreResult) &&
        Objects.equals(this.sentenceCount, sentimentAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, sentimentClassificationResult, sentimentScoreResult, sentenceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentAnalysisResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    sentimentClassificationResult: ").append(toIndentedString(sentimentClassificationResult)).append("\n");
    sb.append("    sentimentScoreResult: ").append(toIndentedString(sentimentScoreResult)).append("\n");
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

