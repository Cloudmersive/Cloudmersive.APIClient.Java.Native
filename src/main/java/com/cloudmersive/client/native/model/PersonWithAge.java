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
import com.cloudmersive.client.native.model.Face;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A person identified in an image age classification operation
 */
@ApiModel(description = "A person identified in an image age classification operation")
@JsonPropertyOrder({
  PersonWithAge.JSON_PROPERTY_FACE_LOCATION,
  PersonWithAge.JSON_PROPERTY_AGE_CLASSIFICATION_CONFIDENCE,
  PersonWithAge.JSON_PROPERTY_AGE_CLASS,
  PersonWithAge.JSON_PROPERTY_AGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:04.530778700-07:00[America/Los_Angeles]")
public class PersonWithAge {
  public static final String JSON_PROPERTY_FACE_LOCATION = "FaceLocation";
  private Face faceLocation;

  public static final String JSON_PROPERTY_AGE_CLASSIFICATION_CONFIDENCE = "AgeClassificationConfidence";
  private Double ageClassificationConfidence;

  public static final String JSON_PROPERTY_AGE_CLASS = "AgeClass";
  private String ageClass;

  public static final String JSON_PROPERTY_AGE = "Age";
  private Double age;

  public PersonWithAge() { 
  }

  public PersonWithAge faceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
    return this;
  }

   /**
   * Get faceLocation
   * @return faceLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Face getFaceLocation() {
    return faceLocation;
  }


  @JsonProperty(JSON_PROPERTY_FACE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
  }


  public PersonWithAge ageClassificationConfidence(Double ageClassificationConfidence) {
    this.ageClassificationConfidence = ageClassificationConfidence;
    return this;
  }

   /**
   * Confidence level of age classification; possible values are between 0.0 and 1.0; higher is better, with values &amp;gt; 0.50 being high confidence results
   * @return ageClassificationConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confidence level of age classification; possible values are between 0.0 and 1.0; higher is better, with values &gt; 0.50 being high confidence results")
  @JsonProperty(JSON_PROPERTY_AGE_CLASSIFICATION_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAgeClassificationConfidence() {
    return ageClassificationConfidence;
  }


  @JsonProperty(JSON_PROPERTY_AGE_CLASSIFICATION_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgeClassificationConfidence(Double ageClassificationConfidence) {
    this.ageClassificationConfidence = ageClassificationConfidence;
  }


  public PersonWithAge ageClass(String ageClass) {
    this.ageClass = ageClass;
    return this;
  }

   /**
   * The person&#39;s age range classification result in years; possible values are \&quot;0-2\&quot;, \&quot;4-6\&quot;, \&quot;8-13\&quot;, \&quot;15-20\&quot;, \&quot;25-32\&quot;, \&quot;38-43\&quot;, \&quot;48-53\&quot;, \&quot;60+\&quot;
   * @return ageClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person's age range classification result in years; possible values are \"0-2\", \"4-6\", \"8-13\", \"15-20\", \"25-32\", \"38-43\", \"48-53\", \"60+\"")
  @JsonProperty(JSON_PROPERTY_AGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgeClass() {
    return ageClass;
  }


  @JsonProperty(JSON_PROPERTY_AGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgeClass(String ageClass) {
    this.ageClass = ageClass;
  }


  public PersonWithAge age(Double age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAge() {
    return age;
  }


  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAge(Double age) {
    this.age = age;
  }


  /**
   * Return true if this PersonWithAge object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonWithAge personWithAge = (PersonWithAge) o;
    return Objects.equals(this.faceLocation, personWithAge.faceLocation) &&
        Objects.equals(this.ageClassificationConfidence, personWithAge.ageClassificationConfidence) &&
        Objects.equals(this.ageClass, personWithAge.ageClass) &&
        Objects.equals(this.age, personWithAge.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceLocation, ageClassificationConfidence, ageClass, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonWithAge {\n");
    sb.append("    faceLocation: ").append(toIndentedString(faceLocation)).append("\n");
    sb.append("    ageClassificationConfidence: ").append(toIndentedString(ageClassificationConfidence)).append("\n");
    sb.append("    ageClass: ").append(toIndentedString(ageClass)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

