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
import com.cloudmersive.client.native.model.TaskOutputReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Query string parameter
 */
@ApiModel(description = "Query string parameter")
@JsonPropertyOrder({
  HttpGetParameter.JSON_PROPERTY_PARAMETER_NAME,
  HttpGetParameter.JSON_PROPERTY_PARAMETER_VALUE,
  HttpGetParameter.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:37.435096700-07:00[America/Los_Angeles]")
public class HttpGetParameter {
  public static final String JSON_PROPERTY_PARAMETER_NAME = "ParameterName";
  private String parameterName;

  public static final String JSON_PROPERTY_PARAMETER_VALUE = "ParameterValue";
  private String parameterValue;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;

  public HttpGetParameter() { 
  }

  public HttpGetParameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the parameter
   * @return parameterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the parameter")
  @JsonProperty(JSON_PROPERTY_PARAMETER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterName() {
    return parameterName;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public HttpGetParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Value of the parameter
   * @return parameterValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the parameter")
  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterValue() {
    return parameterValue;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  public HttpGetParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Get useOutputFromPreviousTask
   * @return useOutputFromPreviousTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }


  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  /**
   * Return true if this HttpGetParameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpGetParameter httpGetParameter = (HttpGetParameter) o;
    return Objects.equals(this.parameterName, httpGetParameter.parameterName) &&
        Objects.equals(this.parameterValue, httpGetParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpGetParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterValue, useOutputFromPreviousTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpGetParameter {\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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

