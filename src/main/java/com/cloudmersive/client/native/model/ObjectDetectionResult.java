/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.native.model.DetectedObject;
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
 * Result of detecting objects in an image
 */
@ApiModel(description = "Result of detecting objects in an image")
@JsonPropertyOrder({
  ObjectDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  ObjectDetectionResult.JSON_PROPERTY_OBJECTS,
  ObjectDetectionResult.JSON_PROPERTY_OBJECT_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:07.726634200-07:00[America/Los_Angeles]")
public class ObjectDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_OBJECTS = "Objects";
  private List<DetectedObject> objects = null;

  public static final String JSON_PROPERTY_OBJECT_COUNT = "ObjectCount";
  private Integer objectCount;

  public ObjectDetectionResult() { 
  }

  public ObjectDetectionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Was the image processed successfully?
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Was the image processed successfully?")
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


  public ObjectDetectionResult objects(List<DetectedObject> objects) {
    this.objects = objects;
    return this;
  }

  public ObjectDetectionResult addObjectsItem(DetectedObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Array of objects detected in the scene
   * @return objects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of objects detected in the scene")
  @JsonProperty(JSON_PROPERTY_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DetectedObject> getObjects() {
    return objects;
  }


  @JsonProperty(JSON_PROPERTY_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjects(List<DetectedObject> objects) {
    this.objects = objects;
  }


  public ObjectDetectionResult objectCount(Integer objectCount) {
    this.objectCount = objectCount;
    return this;
  }

   /**
   * Number of objects detected in the scene
   * @return objectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of objects detected in the scene")
  @JsonProperty(JSON_PROPERTY_OBJECT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getObjectCount() {
    return objectCount;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectCount(Integer objectCount) {
    this.objectCount = objectCount;
  }


  /**
   * Return true if this ObjectDetectionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectDetectionResult objectDetectionResult = (ObjectDetectionResult) o;
    return Objects.equals(this.successful, objectDetectionResult.successful) &&
        Objects.equals(this.objects, objectDetectionResult.objects) &&
        Objects.equals(this.objectCount, objectDetectionResult.objectCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, objects, objectCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    objectCount: ").append(toIndentedString(objectCount)).append("\n");
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

