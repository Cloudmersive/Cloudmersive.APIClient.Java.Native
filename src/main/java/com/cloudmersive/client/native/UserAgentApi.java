/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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

import com.cloudmersive.client.native.model.UserAgentValidateRequest;
import com.cloudmersive.client.native.model.UserAgentValidateResponse;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:27:50.092931600-07:00[America/Los_Angeles]")
public class UserAgentApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public UserAgentApi() {
    this(new ApiClient());
  }

  public UserAgentApi(ApiClient apiClient) {
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
   * Parse an HTTP User-Agent string, identify robots
   * Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.
   * @param request Input parse request (required)
   * @return UserAgentValidateResponse
   * @throws ApiException if fails to make API call
   */
  public UserAgentValidateResponse userAgentParse(UserAgentValidateRequest request) throws ApiException {
    ApiResponse<UserAgentValidateResponse> localVarResponse = userAgentParseWithHttpInfo(request);
    return localVarResponse.getData();
  }

  /**
   * Parse an HTTP User-Agent string, identify robots
   * Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.
   * @param request Input parse request (required)
   * @return ApiResponse&lt;UserAgentValidateResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAgentValidateResponse> userAgentParseWithHttpInfo(UserAgentValidateRequest request) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = userAgentParseRequestBuilder(request);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("userAgentParse", localVarResponse);
        }
        return new ApiResponse<UserAgentValidateResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<UserAgentValidateResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder userAgentParseRequestBuilder(UserAgentValidateRequest request) throws ApiException {
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling userAgentParse");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/useragent/parse";

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
