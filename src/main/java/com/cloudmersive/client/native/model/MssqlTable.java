/*
 * dataintegrationapi
 * Easily and directly query database backup files, convert into other file formats.
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
 * Details about a SQL Server Table
 */
@ApiModel(description = "Details about a SQL Server Table")
@JsonPropertyOrder({
  MssqlTable.JSON_PROPERTY_SCHEMA_NAME,
  MssqlTable.JSON_PROPERTY_TABLE_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:34:15.571628700-07:00[America/Los_Angeles]")
public class MssqlTable {
  public static final String JSON_PROPERTY_SCHEMA_NAME = "schemaName";
  private String schemaName;

  public static final String JSON_PROPERTY_TABLE_NAME = "tableName";
  private String tableName;

  public MssqlTable() { 
  }

  public MssqlTable schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Name of the schema containing the table
   * @return schemaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the schema containing the table")
  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaName() {
    return schemaName;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public MssqlTable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Name of the table
   * @return tableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the table")
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTableName() {
    return tableName;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  /**
   * Return true if this MssqlTable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MssqlTable mssqlTable = (MssqlTable) o;
    return Objects.equals(this.schemaName, mssqlTable.schemaName) &&
        Objects.equals(this.tableName, mssqlTable.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MssqlTable {\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

