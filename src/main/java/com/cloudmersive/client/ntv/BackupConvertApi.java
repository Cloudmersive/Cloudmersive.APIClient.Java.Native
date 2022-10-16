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

package com.cloudmersive.client.ntv;

import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Pair;

import java.io.File;
import com.cloudmersive.client.ntv.model.MssqlBakEnumerateTablesResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:56:54.012690700-07:00[America/Los_Angeles]")
public class BackupConvertApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public BackupConvertApi() {
    this(new ApiClient());
  }

  public BackupConvertApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Lists all tables stored in a SQL Server Backup (.BAK) file
   * 
   * @param inputFile Input file to perform the operation on (optional)
   * @return MssqlBakEnumerateTablesResult
   * @throws ApiException if fails to make API call
   */
  public MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(File inputFile) throws ApiException {
    ApiResponse<MssqlBakEnumerateTablesResult> localVarResponse = dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(inputFile);
    return localVarResponse.getData();
  }

  /**
   * Lists all tables stored in a SQL Server Backup (.BAK) file
   * 
   * @param inputFile Input file to perform the operation on (optional)
   * @return ApiResponse&lt;MssqlBakEnumerateTablesResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MssqlBakEnumerateTablesResult> dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(File inputFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = dataintegrationBackupConvertMssqlBakGetTablesPostRequestBuilder(inputFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("dataintegrationBackupConvertMssqlBakGetTablesPost", localVarResponse);
        }
        return new ApiResponse<MssqlBakEnumerateTablesResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MssqlBakEnumerateTablesResult>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder dataintegrationBackupConvertMssqlBakGetTablesPostRequestBuilder(File inputFile) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dataintegration/backup/convert/mssql/bak/get/tables";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
   * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
   * @param tableName Name of the table to return (optional)
   * @param inputFile Input file to perform the operation on (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File dataintegrationBackupConvertMssqlBakToCsvPost(String tableName, File inputFile) throws ApiException {
    ApiResponse<File> localVarResponse = dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(tableName, inputFile);
    return localVarResponse.getData();
  }

  /**
   * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
   * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
   * @param tableName Name of the table to return (optional)
   * @param inputFile Input file to perform the operation on (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(String tableName, File inputFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = dataintegrationBackupConvertMssqlBakToCsvPostRequestBuilder(tableName, inputFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("dataintegrationBackupConvertMssqlBakToCsvPost", localVarResponse);
        }
        return new ApiResponse<File>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<File>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder dataintegrationBackupConvertMssqlBakToCsvPostRequestBuilder(String tableName, File inputFile) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dataintegration/backup/convert/mssql/bak/to/csv";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (tableName != null) {
      localVarRequestBuilder.header("tableName", tableName.toString());
    }
    localVarRequestBuilder.header("Accept", "text/csv");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}