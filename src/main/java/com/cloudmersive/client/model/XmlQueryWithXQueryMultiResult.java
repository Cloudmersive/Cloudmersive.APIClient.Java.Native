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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of performing an XQuery operation on multiple XML documents.
 */
@ApiModel(description = "Result of performing an XQuery operation on multiple XML documents.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:39.601-07:00")
public class XmlQueryWithXQueryMultiResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ResultingXml")
  private String resultingXml = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  public XmlQueryWithXQueryMultiResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public XmlQueryWithXQueryMultiResult resultingXml(String resultingXml) {
    this.resultingXml = resultingXml;
    return this;
  }

   /**
   * Resulting XML result output
   * @return resultingXml
  **/
  @ApiModelProperty(value = "Resulting XML result output")
  public String getResultingXml() {
    return resultingXml;
  }

  public void setResultingXml(String resultingXml) {
    this.resultingXml = resultingXml;
  }

  public XmlQueryWithXQueryMultiResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * If an error occurs, additional details on the error
   * @return errorMessage
  **/
  @ApiModelProperty(value = "If an error occurs, additional details on the error")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlQueryWithXQueryMultiResult xmlQueryWithXQueryMultiResult = (XmlQueryWithXQueryMultiResult) o;
    return Objects.equals(this.successful, xmlQueryWithXQueryMultiResult.successful) &&
        Objects.equals(this.resultingXml, xmlQueryWithXQueryMultiResult.resultingXml) &&
        Objects.equals(this.errorMessage, xmlQueryWithXQueryMultiResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXml, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlQueryWithXQueryMultiResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXml: ").append(toIndentedString(resultingXml)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
