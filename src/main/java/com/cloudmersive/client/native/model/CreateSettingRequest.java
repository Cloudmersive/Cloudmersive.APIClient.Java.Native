/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
 * Request to create a setting
 */
@ApiModel(description = "Request to create a setting")
@JsonPropertyOrder({
  CreateSettingRequest.JSON_PROPERTY_BUCKET_I_D,
  CreateSettingRequest.JSON_PROPERTY_BUCKET_SECRET_KEY,
  CreateSettingRequest.JSON_PROPERTY_SETTING_NAME,
  CreateSettingRequest.JSON_PROPERTY_SETTING_TYPE,
  CreateSettingRequest.JSON_PROPERTY_SETTING_VALUE,
  CreateSettingRequest.JSON_PROPERTY_SETTING_DESCRIPTION,
  CreateSettingRequest.JSON_PROPERTY_SETTING_TAGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:37.435096700-07:00[America/Los_Angeles]")
public class CreateSettingRequest {
  public static final String JSON_PROPERTY_BUCKET_I_D = "BucketID";
  private String bucketID;

  public static final String JSON_PROPERTY_BUCKET_SECRET_KEY = "BucketSecretKey";
  private String bucketSecretKey;

  public static final String JSON_PROPERTY_SETTING_NAME = "SettingName";
  private String settingName;

  public static final String JSON_PROPERTY_SETTING_TYPE = "SettingType";
  private String settingType;

  public static final String JSON_PROPERTY_SETTING_VALUE = "SettingValue";
  private Object settingValue;

  public static final String JSON_PROPERTY_SETTING_DESCRIPTION = "SettingDescription";
  private String settingDescription;

  public static final String JSON_PROPERTY_SETTING_TAGS = "SettingTags";
  private String settingTags;

  public CreateSettingRequest() { 
  }

  public CreateSettingRequest bucketID(String bucketID) {
    this.bucketID = bucketID;
    return this;
  }

   /**
   * BucketID of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BucketID of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
  @JsonProperty(JSON_PROPERTY_BUCKET_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucketID() {
    return bucketID;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SecretKey of the bucket to place the setting in; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
  @JsonProperty(JSON_PROPERTY_BUCKET_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucketSecretKey() {
    return bucketSecretKey;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the setting to create")
  @JsonProperty(JSON_PROPERTY_SETTING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSettingName() {
    return settingName;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of setting to create; possible values are STRING, JSON")
  @JsonProperty(JSON_PROPERTY_SETTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSettingType() {
    return settingType;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Initial value of the setting")
  @JsonProperty(JSON_PROPERTY_SETTING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSettingValue() {
    return settingValue;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the setting")
  @JsonProperty(JSON_PROPERTY_SETTING_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSettingDescription() {
    return settingDescription;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags to apply to the setting")
  @JsonProperty(JSON_PROPERTY_SETTING_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSettingTags() {
    return settingTags;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettingTags(String settingTags) {
    this.settingTags = settingTags;
  }


  /**
   * Return true if this CreateSettingRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

