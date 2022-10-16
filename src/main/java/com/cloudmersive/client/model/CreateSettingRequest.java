/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
 * Request to create a setting
 */
@ApiModel(description = "Request to create a setting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:20:10.111-07:00")
public class CreateSettingRequest {
  @SerializedName("BucketID")
  private String bucketID = null;

  @SerializedName("BucketSecretKey")
  private String bucketSecretKey = null;

  @SerializedName("SettingName")
  private String settingName = null;

  @SerializedName("SettingType")
  private String settingType = null;

  @SerializedName("SettingValue")
  private Object settingValue = null;

  @SerializedName("SettingDescription")
  private String settingDescription = null;

  @SerializedName("SettingTags")
  private String settingTags = null;

  public CreateSettingRequest bucketID(String bucketID) {
    this.bucketID = bucketID;
    return this;
  }

   /**
   * BucketID of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketID
  **/
  @ApiModelProperty(value = "BucketID of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
  public String getBucketID() {
    return bucketID;
  }

  public void setBucketID(String bucketID) {
    this.bucketID = bucketID;
  }

  public CreateSettingRequest bucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
    return this;
  }

   /**
   * SecretKey of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketSecretKey
  **/
  @ApiModelProperty(value = "SecretKey of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
  public String getBucketSecretKey() {
    return bucketSecretKey;
  }

  public void setBucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
  }

  public CreateSettingRequest settingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

   /**
   * Name of the setting to create
   * @return settingName
  **/
  @ApiModelProperty(value = "Name of the setting to create")
  public String getSettingName() {
    return settingName;
  }

  public void setSettingName(String settingName) {
    this.settingName = settingName;
  }

  public CreateSettingRequest settingType(String settingType) {
    this.settingType = settingType;
    return this;
  }

   /**
   * Type of setting to create; possible values are STRING, JSON
   * @return settingType
  **/
  @ApiModelProperty(value = "Type of setting to create; possible values are STRING, JSON")
  public String getSettingType() {
    return settingType;
  }

  public void setSettingType(String settingType) {
    this.settingType = settingType;
  }

  public CreateSettingRequest settingValue(Object settingValue) {
    this.settingValue = settingValue;
    return this;
  }

   /**
   * Initial value of the setting
   * @return settingValue
  **/
  @ApiModelProperty(value = "Initial value of the setting")
  public Object getSettingValue() {
    return settingValue;
  }

  public void setSettingValue(Object settingValue) {
    this.settingValue = settingValue;
  }

  public CreateSettingRequest settingDescription(String settingDescription) {
    this.settingDescription = settingDescription;
    return this;
  }

   /**
   * Description of the setting
   * @return settingDescription
  **/
  @ApiModelProperty(value = "Description of the setting")
  public String getSettingDescription() {
    return settingDescription;
  }

  public void setSettingDescription(String settingDescription) {
    this.settingDescription = settingDescription;
  }

  public CreateSettingRequest settingTags(String settingTags) {
    this.settingTags = settingTags;
    return this;
  }

   /**
   * Tags to apply to the setting
   * @return settingTags
  **/
  @ApiModelProperty(value = "Tags to apply to the setting")
  public String getSettingTags() {
    return settingTags;
  }

  public void setSettingTags(String settingTags) {
    this.settingTags = settingTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSettingRequest createSettingRequest = (CreateSettingRequest) o;
    return Objects.equals(this.bucketID, createSettingRequest.bucketID) &&
        Objects.equals(this.bucketSecretKey, createSettingRequest.bucketSecretKey) &&
        Objects.equals(this.settingName, createSettingRequest.settingName) &&
        Objects.equals(this.settingType, createSettingRequest.settingType) &&
        Objects.equals(this.settingValue, createSettingRequest.settingValue) &&
        Objects.equals(this.settingDescription, createSettingRequest.settingDescription) &&
        Objects.equals(this.settingTags, createSettingRequest.settingTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketID, bucketSecretKey, settingName, settingType, settingValue, settingDescription, settingTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSettingRequest {\n");
    
    sb.append("    bucketID: ").append(toIndentedString(bucketID)).append("\n");
    sb.append("    bucketSecretKey: ").append(toIndentedString(bucketSecretKey)).append("\n");
    sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
    sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
    sb.append("    settingValue: ").append(toIndentedString(settingValue)).append("\n");
    sb.append("    settingDescription: ").append(toIndentedString(settingDescription)).append("\n");
    sb.append("    settingTags: ").append(toIndentedString(settingTags)).append("\n");
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

