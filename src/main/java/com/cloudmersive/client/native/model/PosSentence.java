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
import com.cloudmersive.client.native.model.PosTaggedWord;
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
 * Sentence in a POS tag result
 */
@ApiModel(description = "Sentence in a POS tag result")
@JsonPropertyOrder({
  PosSentence.JSON_PROPERTY_WORDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:33:37.055407600-07:00[America/Los_Angeles]")
public class PosSentence {
  public static final String JSON_PROPERTY_WORDS = "Words";
  private List<PosTaggedWord> words = null;

  public PosSentence() { 
  }

  public PosSentence words(List<PosTaggedWord> words) {
    this.words = words;
    return this;
  }

  public PosSentence addWordsItem(PosTaggedWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Words in the sentence
   * @return words
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Words in the sentence")
  @JsonProperty(JSON_PROPERTY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PosTaggedWord> getWords() {
    return words;
  }


  @JsonProperty(JSON_PROPERTY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWords(List<PosTaggedWord> words) {
    this.words = words;
  }


  /**
   * Return true if this PosSentence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosSentence posSentence = (PosSentence) o;
    return Objects.equals(this.words, posSentence.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(words);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosSentence {\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

