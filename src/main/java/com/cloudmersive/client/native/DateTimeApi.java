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

import com.cloudmersive.client.native.model.DateTimeNaturalLanguageParseRequest;
import com.cloudmersive.client.native.model.DateTimeNowResult;
import com.cloudmersive.client.native.model.DateTimeStandardizedParseRequest;
import com.cloudmersive.client.native.model.DateTimeStandardizedParseResponse;
import com.cloudmersive.client.native.model.GetPublicHolidaysRequest;
import com.cloudmersive.client.native.model.PublicHolidaysResponse;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:25:52.145220700-07:00[America/Los_Angeles]")
public class DateTimeApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public DateTimeApi() {
    this(new ApiClient());
  }

  public DateTimeApi(ApiClient apiClient) {
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
   * Get current date and time as of now
   * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
   * @return DateTimeNowResult
   * @throws ApiException if fails to make API call
   */
  public DateTimeNowResult dateTimeGetNowSimple() throws ApiException {
    ApiResponse<DateTimeNowResult> localVarResponse = dateTimeGetNowSimpleWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Get current date and time as of now
   * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
   * @return ApiResponse&lt;DateTimeNowResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DateTimeNowResult> dateTimeGetNowSimpleWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = dateTimeGetNowSimpleRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("dateTimeGetNowSimple", localVarResponse);
        }
        return new ApiResponse<DateTimeNowResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DateTimeNowResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder dateTimeGetNowSimpleRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/date-time/get/now";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Get public holidays in the specified country and year
   * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
   * @param input Input request (required)
   * @return PublicHolidaysResponse
   * @throws ApiException if fails to make API call
   */
  public PublicHolidaysResponse dateTimeGetPublicHolidays(GetPublicHolidaysRequest input) throws ApiException {
    ApiResponse<PublicHolidaysResponse> localVarResponse = dateTimeGetPublicHolidaysWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Get public holidays in the specified country and year
   * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
   * @param input Input request (required)
   * @return ApiResponse&lt;PublicHolidaysResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicHolidaysResponse> dateTimeGetPublicHolidaysWithHttpInfo(GetPublicHolidaysRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = dateTimeGetPublicHolidaysRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("dateTimeGetPublicHolidays", localVarResponse);
        }
        return new ApiResponse<PublicHolidaysResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PublicHolidaysResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder dateTimeGetPublicHolidaysRequestBuilder(GetPublicHolidaysRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling dateTimeGetPublicHolidays");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/date-time/get/holidays";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(input);
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
   * Parses a free-form natural language date and time string into a date and time
   * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
   * @param input Input request (required)
   * @return DateTimeStandardizedParseResponse
   * @throws ApiException if fails to make API call
   */
  public DateTimeStandardizedParseResponse dateTimeParseNaturalLanguageDateTime(DateTimeNaturalLanguageParseRequest input) throws ApiException {
    ApiResponse<DateTimeStandardizedParseResponse> localVarResponse = dateTimeParseNaturalLanguageDateTimeWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Parses a free-form natural language date and time string into a date and time
   * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
   * @param input Input request (required)
   * @return ApiResponse&lt;DateTimeStandardizedParseResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DateTimeStandardizedParseResponse> dateTimeParseNaturalLanguageDateTimeWithHttpInfo(DateTimeNaturalLanguageParseRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = dateTimeParseNaturalLanguageDateTimeRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("dateTimeParseNaturalLanguageDateTime", localVarResponse);
        }
        return new ApiResponse<DateTimeStandardizedParseResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DateTimeStandardizedParseResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder dateTimeParseNaturalLanguageDateTimeRequestBuilder(DateTimeNaturalLanguageParseRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/date-time/parse/date-time/natural-language";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(input);
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
   * Parses a standardized date and time string into a date and time
   * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
   * @param input Input request (required)
   * @return DateTimeStandardizedParseResponse
   * @throws ApiException if fails to make API call
   */
  public DateTimeStandardizedParseResponse dateTimeParseStandardDateTime(DateTimeStandardizedParseRequest input) throws ApiException {
    ApiResponse<DateTimeStandardizedParseResponse> localVarResponse = dateTimeParseStandardDateTimeWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Parses a standardized date and time string into a date and time
   * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
   * @param input Input request (required)
   * @return ApiResponse&lt;DateTimeStandardizedParseResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DateTimeStandardizedParseResponse> dateTimeParseStandardDateTimeWithHttpInfo(DateTimeStandardizedParseRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = dateTimeParseStandardDateTimeRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("dateTimeParseStandardDateTime", localVarResponse);
        }
        return new ApiResponse<DateTimeStandardizedParseResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DateTimeStandardizedParseResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder dateTimeParseStandardDateTimeRequestBuilder(DateTimeStandardizedParseRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling dateTimeParseStandardDateTime");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/date-time/parse/date-time/structured";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(input);
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
