/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Linguistic parse request
 */
@ApiModel(description = "Linguistic parse request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:02.388-07:00")
public class ParseRequest {
  @SerializedName("InputString")
  private String inputString = null;

  public ParseRequest inputString(String inputString) {
    this.inputString = inputString;
    return this;
  }

   /**
   * Input string to linguistically parse
   * @return inputString
  **/
  @ApiModelProperty(value = "Input string to linguistically parse")
  public String getInputString() {
    return inputString;
  }

  public void setInputString(String inputString) {
    this.inputString = inputString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseRequest parseRequest = (ParseRequest) o;
    return Objects.equals(this.inputString, parseRequest.inputString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseRequest {\n");
    
    sb.append("    inputString: ").append(toIndentedString(inputString)).append("\n");
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
