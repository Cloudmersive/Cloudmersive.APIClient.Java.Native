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

package com.cloudmersive.client.native;

import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Pair;

import com.cloudmersive.client.native.model.CreateSettingRequest;
import com.cloudmersive.client.native.model.CreateSettingResponse;
import com.cloudmersive.client.native.model.ListSettingsRequest;
import com.cloudmersive.client.native.model.ListSettingsResponse;
import com.cloudmersive.client.native.model.UpdateSettingRequest;
import com.cloudmersive.client.native.model.UpdateSettingResponse;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:20.612268700-07:00[America/Los_Angeles]")
public class SettingsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SettingsApi() {
    this(new ApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
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
   * Create a setting in the specified bucket
   * 
   * @param request Request to perform the operation on (required)
   * @return CreateSettingResponse
   * @throws ApiException if fails to make API call
   */
  public CreateSettingResponse settingsCreateSetting(CreateSettingRequest request) throws ApiException {
    ApiResponse<CreateSettingResponse> localVarResponse = settingsCreateSettingWithHttpInfo(request);
    return localVarResponse.getData();
  }

  /**
   * Create a setting in the specified bucket
   * 
   * @param request Request to perform the operation on (required)
   * @return ApiResponse&lt;CreateSettingResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateSettingResponse> settingsCreateSettingWithHttpInfo(CreateSettingRequest request) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = settingsCreateSettingRequestBuilder(request);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("settingsCreateSetting", localVarResponse);
        }
        return new ApiResponse<CreateSettingResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CreateSettingResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder settingsCreateSettingRequestBuilder(CreateSettingRequest request) throws ApiException {
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling settingsCreateSetting");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/config/settings/create";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(request);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Enumerate the settings in a bucket
   * 
   * @param request Request to perform the operation on (required)
   * @return ListSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public ListSettingsResponse settingsListSettings(ListSettingsRequest request) throws ApiException {
    ApiResponse<ListSettingsResponse> localVarResponse = settingsListSettingsWithHttpInfo(request);
    return localVarResponse.getData();
  }

  /**
   * Enumerate the settings in a bucket
   * 
   * @param request Request to perform the operation on (required)
   * @return ApiResponse&lt;ListSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListSettingsResponse> settingsListSettingsWithHttpInfo(ListSettingsRequest request) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = settingsListSettingsRequestBuilder(request);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("settingsListSettings", localVarResponse);
        }
        return new ApiResponse<ListSettingsResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListSettingsResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder settingsListSettingsRequestBuilder(ListSettingsRequest request) throws ApiException {
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling settingsListSettings");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/config/settings/list";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(request);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Update a setting
   * 
   * @param request Request to perform the operation on (required)
   * @return UpdateSettingResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateSettingResponse settingsUpdateSetting(UpdateSettingRequest request) throws ApiException {
    ApiResponse<UpdateSettingResponse> localVarResponse = settingsUpdateSettingWithHttpInfo(request);
    return localVarResponse.getData();
  }

  /**
   * Update a setting
   * 
   * @param request Request to perform the operation on (required)
   * @return ApiResponse&lt;UpdateSettingResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UpdateSettingResponse> settingsUpdateSettingWithHttpInfo(UpdateSettingRequest request) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = settingsUpdateSettingRequestBuilder(request);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("settingsUpdateSetting", localVarResponse);
        }
        return new ApiResponse<UpdateSettingResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<UpdateSettingResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder settingsUpdateSettingRequestBuilder(UpdateSettingRequest request) throws ApiException {
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling settingsUpdateSetting");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/config/settings/update";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(request);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
