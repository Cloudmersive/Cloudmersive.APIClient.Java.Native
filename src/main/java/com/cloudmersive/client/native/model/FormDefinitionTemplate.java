/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.native.model.FormFieldDefinition;
import com.cloudmersive.client.native.model.FormTableDefinition;
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
 * Definition of a form template; use a form template definition to recognize the fields in a form with Cloudmersive OCR
 */
@ApiModel(description = "Definition of a form template; use a form template definition to recognize the fields in a form with Cloudmersive OCR")
@JsonPropertyOrder({
  FormDefinitionTemplate.JSON_PROPERTY_FIELD_DEFINITIONS,
  FormDefinitionTemplate.JSON_PROPERTY_TABLE_DEFINITIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:58.200774700-07:00[America/Los_Angeles]")
public class FormDefinitionTemplate {
  public static final String JSON_PROPERTY_FIELD_DEFINITIONS = "FieldDefinitions";
  private List<FormFieldDefinition> fieldDefinitions = null;

  public static final String JSON_PROPERTY_TABLE_DEFINITIONS = "TableDefinitions";
  private List<FormTableDefinition> tableDefinitions = null;

  public FormDefinitionTemplate() { 
  }

  public FormDefinitionTemplate fieldDefinitions(List<FormFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
    return this;
  }

  public FormDefinitionTemplate addFieldDefinitionsItem(FormFieldDefinition fieldDefinitionsItem) {
    if (this.fieldDefinitions == null) {
      this.fieldDefinitions = new ArrayList<>();
    }
    this.fieldDefinitions.add(fieldDefinitionsItem);
    return this;
  }

   /**
   * Field definitions in the template; a field is comprised of a key/value pair
   * @return fieldDefinitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field definitions in the template; a field is comprised of a key/value pair")
  @JsonProperty(JSON_PROPERTY_FIELD_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FormFieldDefinition> getFieldDefinitions() {
    return fieldDefinitions;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldDefinitions(List<FormFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }


  public FormDefinitionTemplate tableDefinitions(List<FormTableDefinition> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
    return this;
  }

  public FormDefinitionTemplate addTableDefinitionsItem(FormTableDefinition tableDefinitionsItem) {
    if (this.tableDefinitions == null) {
      this.tableDefinitions = new ArrayList<>();
    }
    this.tableDefinitions.add(tableDefinitionsItem);
    return this;
  }

   /**
   * Table definitions in the template; a table is comprised of columns and rows and exists in a 2-dimensional layout; a common example of a table would be an invoice
   * @return tableDefinitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Table definitions in the template; a table is comprised of columns and rows and exists in a 2-dimensional layout; a common example of a table would be an invoice")
  @JsonProperty(JSON_PROPERTY_TABLE_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FormTableDefinition> getTableDefinitions() {
    return tableDefinitions;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableDefinitions(List<FormTableDefinition> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
  }


  /**
   * Return true if this FormDefinitionTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDefinitionTemplate formDefinitionTemplate = (FormDefinitionTemplate) o;
    return Objects.equals(this.fieldDefinitions, formDefinitionTemplate.fieldDefinitions) &&
        Objects.equals(this.tableDefinitions, formDefinitionTemplate.tableDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldDefinitions, tableDefinitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDefinitionTemplate {\n");
    sb.append("    fieldDefinitions: ").append(toIndentedString(fieldDefinitions)).append("\n");
    sb.append("    tableDefinitions: ").append(toIndentedString(tableDefinitions)).append("\n");
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

