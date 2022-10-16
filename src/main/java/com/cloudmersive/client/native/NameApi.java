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

import com.cloudmersive.client.native.model.FirstNameValidationRequest;
import com.cloudmersive.client.native.model.FirstNameValidationResponse;
import com.cloudmersive.client.native.model.FullNameValidationRequest;
import com.cloudmersive.client.native.model.FullNameValidationResponse;
import com.cloudmersive.client.native.model.GetGenderRequest;
import com.cloudmersive.client.native.model.GetGenderResponse;
import com.cloudmersive.client.native.model.LastNameValidationRequest;
import com.cloudmersive.client.native.model.LastNameValidationResponse;
import com.cloudmersive.client.native.model.ValidateIdentifierRequest;
import com.cloudmersive.client.native.model.ValidateIdentifierResponse;

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
public class NameApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public NameApi() {
    this(new ApiClient());
  }

  public NameApi(ApiClient apiClient) {
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
   * Get the gender of a first name
   * Determines the gender of a first name (given name)
   * @param input Gender request information (required)
   * @return GetGenderResponse
   * @throws ApiException if fails to make API call
   */
  public GetGenderResponse nameGetGender(GetGenderRequest input) throws ApiException {
    ApiResponse<GetGenderResponse> localVarResponse = nameGetGenderWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Get the gender of a first name
   * Determines the gender of a first name (given name)
   * @param input Gender request information (required)
   * @return ApiResponse&lt;GetGenderResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetGenderResponse> nameGetGenderWithHttpInfo(GetGenderRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = nameGetGenderRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("nameGetGender", localVarResponse);
        }
        return new ApiResponse<GetGenderResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetGenderResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder nameGetGenderRequestBuilder(GetGenderRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling nameGetGender");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/name/get-gender";

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
   * Validate a code identifier
   * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
   * @param input Identifier validation request information (required)
   * @return ValidateIdentifierResponse
   * @throws ApiException if fails to make API call
   */
  public ValidateIdentifierResponse nameIdentifier(ValidateIdentifierRequest input) throws ApiException {
    ApiResponse<ValidateIdentifierResponse> localVarResponse = nameIdentifierWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Validate a code identifier
   * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
   * @param input Identifier validation request information (required)
   * @return ApiResponse&lt;ValidateIdentifierResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ValidateIdentifierResponse> nameIdentifierWithHttpInfo(ValidateIdentifierRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = nameIdentifierRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("nameIdentifier", localVarResponse);
        }
        return new ApiResponse<ValidateIdentifierResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ValidateIdentifierResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder nameIdentifierRequestBuilder(ValidateIdentifierRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling nameIdentifier");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/name/identifier";

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
   * Validate a first name
   * Determines if a string is a valid first name (given name)
   * @param input Validation request information (required)
   * @return FirstNameValidationResponse
   * @throws ApiException if fails to make API call
   */
  public FirstNameValidationResponse nameValidateFirstName(FirstNameValidationRequest input) throws ApiException {
    ApiResponse<FirstNameValidationResponse> localVarResponse = nameValidateFirstNameWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Validate a first name
   * Determines if a string is a valid first name (given name)
   * @param input Validation request information (required)
   * @return ApiResponse&lt;FirstNameValidationResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FirstNameValidationResponse> nameValidateFirstNameWithHttpInfo(FirstNameValidationRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = nameValidateFirstNameRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("nameValidateFirstName", localVarResponse);
        }
        return new ApiResponse<FirstNameValidationResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<FirstNameValidationResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder nameValidateFirstNameRequestBuilder(FirstNameValidationRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling nameValidateFirstName");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/name/first";

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
   * Parse and validate a full name
   * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
   * @param input Validation request information (required)
   * @return FullNameValidationResponse
   * @throws ApiException if fails to make API call
   */
  public FullNameValidationResponse nameValidateFullName(FullNameValidationRequest input) throws ApiException {
    ApiResponse<FullNameValidationResponse> localVarResponse = nameValidateFullNameWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Parse and validate a full name
   * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
   * @param input Validation request information (required)
   * @return ApiResponse&lt;FullNameValidationResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FullNameValidationResponse> nameValidateFullNameWithHttpInfo(FullNameValidationRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = nameValidateFullNameRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("nameValidateFullName", localVarResponse);
        }
        return new ApiResponse<FullNameValidationResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<FullNameValidationResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder nameValidateFullNameRequestBuilder(FullNameValidationRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling nameValidateFullName");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/name/full-name";

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
   * Validate a last name
   * Determines if a string is a valid last name (surname)
   * @param input Validation request information (required)
   * @return LastNameValidationResponse
   * @throws ApiException if fails to make API call
   */
  public LastNameValidationResponse nameValidateLastName(LastNameValidationRequest input) throws ApiException {
    ApiResponse<LastNameValidationResponse> localVarResponse = nameValidateLastNameWithHttpInfo(input);
    return localVarResponse.getData();
  }

  /**
   * Validate a last name
   * Determines if a string is a valid last name (surname)
   * @param input Validation request information (required)
   * @return ApiResponse&lt;LastNameValidationResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LastNameValidationResponse> nameValidateLastNameWithHttpInfo(LastNameValidationRequest input) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = nameValidateLastNameRequestBuilder(input);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("nameValidateLastName", localVarResponse);
        }
        return new ApiResponse<LastNameValidationResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<LastNameValidationResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder nameValidateLastNameRequestBuilder(LastNameValidationRequest input) throws ApiException {
    // verify the required parameter 'input' is set
    if (input == null) {
      throw new ApiException(400, "Missing the required parameter 'input' when calling nameValidateLastName");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/validate/name/last";

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
