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
 * Output of a hate speech analysis operation
 */
@ApiModel(description = "Output of a hate speech analysis operation")
@JsonPropertyOrder({
  HateSpeechAnalysisResponse.JSON_PROPERTY_SUCCESSFUL,
  HateSpeechAnalysisResponse.JSON_PROPERTY_HATE_SPEECH_SCORE_RESULT,
  HateSpeechAnalysisResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:25:56.674263100-07:00[America/Los_Angeles]")
public class HateSpeechAnalysisResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_HATE_SPEECH_SCORE_RESULT = "HateSpeechScoreResult";
  private Double hateSpeechScoreResult;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;

  public HateSpeechAnalysisResponse() { 
  }

  public HateSpeechAnalysisResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the profanity detection operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the profanity detection operation was successful, false otherwise")
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


  public HateSpeechAnalysisResponse hateSpeechScoreResult(Double hateSpeechScoreResult) {
    this.hateSpeechScoreResult = hateSpeechScoreResult;
    return this;
  }

   /**
   * Hate speech classification score between 0.0 and 1.0 where scores closer to zero have a low probability of being hate speech language, while scores close to 1.0 have a high probability of being hate speech language.  Values above 0.8 have a very high probability of being hate speech.
   * @return hateSpeechScoreResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hate speech classification score between 0.0 and 1.0 where scores closer to zero have a low probability of being hate speech language, while scores close to 1.0 have a high probability of being hate speech language.  Values above 0.8 have a very high probability of being hate speech.")
  @JsonProperty(JSON_PROPERTY_HATE_SPEECH_SCORE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getHateSpeechScoreResult() {
    return hateSpeechScoreResult;
  }


  @JsonProperty(JSON_PROPERTY_HATE_SPEECH_SCORE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHateSpeechScoreResult(Double hateSpeechScoreResult) {
    this.hateSpeechScoreResult = hateSpeechScoreResult;
  }


  public HateSpeechAnalysisResponse sentenceCount(Integer sentenceCount) {
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
   * Return true if this HateSpeechAnalysisResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateSpeechAnalysisResponse hateSpeechAnalysisResponse = (HateSpeechAnalysisResponse) o;
    return Objects.equals(this.successful, hateSpeechAnalysisResponse.successful) &&
        Objects.equals(this.hateSpeechScoreResult, hateSpeechAnalysisResponse.hateSpeechScoreResult) &&
        Objects.equals(this.sentenceCount, hateSpeechAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, hateSpeechScoreResult, sentenceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateSpeechAnalysisResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    hateSpeechScoreResult: ").append(toIndentedString(hateSpeechScoreResult)).append("\n");
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

