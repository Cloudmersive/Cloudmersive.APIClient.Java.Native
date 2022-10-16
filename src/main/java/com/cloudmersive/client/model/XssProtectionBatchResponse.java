/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
import com.cloudmersive.client.model.XssProtectionResult;
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
 * Result of performing a batch XSS protection operation
 */
@ApiModel(description = "Result of performing a batch XSS protection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:18:43.585-07:00")
public class XssProtectionBatchResponse {
  @SerializedName("ResultItems")
  private List<XssProtectionResult> resultItems = null;

  public XssProtectionBatchResponse resultItems(List<XssProtectionResult> resultItems) {
    this.resultItems = resultItems;
    return this;
  }

  public XssProtectionBatchResponse addResultItemsItem(XssProtectionResult resultItemsItem) {
    if (this.resultItems == null) {
      this.resultItems = new ArrayList<XssProtectionResult>();
    }
    this.resultItems.add(resultItemsItem);
    return this;
  }

   /**
   * Results from performing a batch XSS protection operation
   * @return resultItems
  **/
  @ApiModelProperty(value = "Results from performing a batch XSS protection operation")
  public List<XssProtectionResult> getResultItems() {
    return resultItems;
  }

  public void setResultItems(List<XssProtectionResult> resultItems) {
    this.resultItems = resultItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XssProtectionBatchResponse xssProtectionBatchResponse = (XssProtectionBatchResponse) o;
    return Objects.equals(this.resultItems, xssProtectionBatchResponse.resultItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XssProtectionBatchResponse {\n");
    
    sb.append("    resultItems: ").append(toIndentedString(resultItems)).append("\n");
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
