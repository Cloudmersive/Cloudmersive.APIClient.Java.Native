/*
 * securityapi
 * The security APIs help you detect and block security threats.
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

import com.cloudmersive.client.ntv.model.IPThreatDetectionResponse;
import com.cloudmersive.client.ntv.model.ThreatDetectionBotCheckResponse;
import com.cloudmersive.client.ntv.model.ThreatDetectionTorNodeResponse;
import com.cloudmersive.client.ntv.model.UrlSsrfThreatDetectionRequestFull;
import com.cloudmersive.client.ntv.model.UrlSsrfThreatDetectionResponseFull;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:57:00.969536800-07:00[America/Los_Angeles]")
public class NetworkThreatDetectionApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public NetworkThreatDetectionApi() {
    this(new ApiClient());
  }

  public NetworkThreatDetectionApi(ApiClient apiClient) {
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
   * Check a URL for Server-side Request Forgery (SSRF) threats
   * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
   * @param request Input URL request (required)
   * @return UrlSsrfThreatDetectionResponseFull
   * @throws ApiException if fails to make API call
   */
  public UrlSsrfThreatDetectionResponseFull networkThreatDetectionDetectSsrfUrl(UrlSsrfThreatDetectionRequestFull request) throws ApiException {
    ApiResponse<UrlSsrfThreatDetectionResponseFull> localVarResponse = networkThreatDetectionDetectSsrfUrlWithHttpInfo(request);
    return localVarResponse.getData();
  }

  /**
   * Check a URL for Server-side Request Forgery (SSRF) threats
   * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
   * @param request Input URL request (required)
   * @return ApiResponse&lt;UrlSsrfThreatDetectionResponseFull&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UrlSsrfThreatDetectionResponseFull> networkThreatDetectionDetectSsrfUrlWithHttpInfo(UrlSsrfThreatDetectionRequestFull request) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = networkThreatDetectionDetectSsrfUrlRequestBuilder(request);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("networkThreatDetectionDetectSsrfUrl", localVarResponse);
        }
        return new ApiResponse<UrlSsrfThreatDetectionResponseFull>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<UrlSsrfThreatDetectionResponseFull>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder networkThreatDetectionDetectSsrfUrlRequestBuilder(UrlSsrfThreatDetectionRequestFull request) throws ApiException {
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling networkThreatDetectionDetectSsrfUrl");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security/threat-detection/network/url/ssrf/detect";

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
   * Check if IP address is a Bot client threat
   * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
   * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return ThreatDetectionBotCheckResponse
   * @throws ApiException if fails to make API call
   */
  public ThreatDetectionBotCheckResponse networkThreatDetectionIsBot(String value) throws ApiException {
    ApiResponse<ThreatDetectionBotCheckResponse> localVarResponse = networkThreatDetectionIsBotWithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Check if IP address is a Bot client threat
   * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
   * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return ApiResponse&lt;ThreatDetectionBotCheckResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ThreatDetectionBotCheckResponse> networkThreatDetectionIsBotWithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = networkThreatDetectionIsBotRequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("networkThreatDetectionIsBot", localVarResponse);
        }
        return new ApiResponse<ThreatDetectionBotCheckResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ThreatDetectionBotCheckResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder networkThreatDetectionIsBotRequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling networkThreatDetectionIsBot");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security/threat-detection/network/ip/is-bot";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofString(value));
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Check if IP address is a known threat
   * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
   * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return IPThreatDetectionResponse
   * @throws ApiException if fails to make API call
   */
  public IPThreatDetectionResponse networkThreatDetectionIsThreat(String value) throws ApiException {
    ApiResponse<IPThreatDetectionResponse> localVarResponse = networkThreatDetectionIsThreatWithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Check if IP address is a known threat
   * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
   * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return ApiResponse&lt;IPThreatDetectionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IPThreatDetectionResponse> networkThreatDetectionIsThreatWithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = networkThreatDetectionIsThreatRequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("networkThreatDetectionIsThreat", localVarResponse);
        }
        return new ApiResponse<IPThreatDetectionResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<IPThreatDetectionResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder networkThreatDetectionIsThreatRequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling networkThreatDetectionIsThreat");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security/threat-detection/network/ip/is-threat";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofString(value));
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Check if IP address is a Tor node server
   * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
   * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return ThreatDetectionTorNodeResponse
   * @throws ApiException if fails to make API call
   */
  public ThreatDetectionTorNodeResponse networkThreatDetectionIsTorNode(String value) throws ApiException {
    ApiResponse<ThreatDetectionTorNodeResponse> localVarResponse = networkThreatDetectionIsTorNodeWithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Check if IP address is a Tor node server
   * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
   * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return ApiResponse&lt;ThreatDetectionTorNodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ThreatDetectionTorNodeResponse> networkThreatDetectionIsTorNodeWithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = networkThreatDetectionIsTorNodeRequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("networkThreatDetectionIsTorNode", localVarResponse);
        }
        return new ApiResponse<ThreatDetectionTorNodeResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ThreatDetectionTorNodeResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder networkThreatDetectionIsTorNodeRequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling networkThreatDetectionIsTorNode");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security/threat-detection/network/ip/is-tor-node";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofString(value));
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}