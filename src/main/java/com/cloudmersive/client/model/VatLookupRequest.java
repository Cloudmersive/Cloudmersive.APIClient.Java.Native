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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a VAT lookup request
 */
@ApiModel(description = "Input to a VAT lookup request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:18:43.585-07:00")
public class VatLookupRequest {
  @SerializedName("VatCode")
  private String vatCode = null;

  public VatLookupRequest vatCode(String vatCode) {
    this.vatCode = vatCode;
    return this;
  }

   /**
   * VAT code to lookup; example \&quot;CZ25123891\&quot;
   * @return vatCode
  **/
  @ApiModelProperty(value = "VAT code to lookup; example \"CZ25123891\"")
  public String getVatCode() {
    return vatCode;
  }

  public void setVatCode(String vatCode) {
    this.vatCode = vatCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatLookupRequest vatLookupRequest = (VatLookupRequest) o;
    return Objects.equals(this.vatCode, vatLookupRequest.vatCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vatCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatLookupRequest {\n");
    
    sb.append("    vatCode: ").append(toIndentedString(vatCode)).append("\n");
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
