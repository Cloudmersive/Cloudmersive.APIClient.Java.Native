/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:56:27.286931100-07:00[America/Los_Angeles]")
public class GenerateBarcodeApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public GenerateBarcodeApi() {
    this(new ApiClient());
  }

  public GenerateBarcodeApi(ApiClient apiClient) {
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
   * Generate a EAN-13 code barcode as PNG file
   * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
   * @param value Barcode value to generate from (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] generateBarcodeEAN13(String value) throws ApiException {
    ApiResponse<byte[]> localVarResponse = generateBarcodeEAN13WithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Generate a EAN-13 code barcode as PNG file
   * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
   * @param value Barcode value to generate from (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> generateBarcodeEAN13WithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = generateBarcodeEAN13RequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("generateBarcodeEAN13", localVarResponse);
        }
        return new ApiResponse<byte[]>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<byte[]>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder generateBarcodeEAN13RequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeEAN13");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/barcode/generate/ean-13";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
   * Generate a EAN-8 code barcode as PNG file
   * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
   * @param value Barcode value to generate from (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] generateBarcodeEAN8(String value) throws ApiException {
    ApiResponse<byte[]> localVarResponse = generateBarcodeEAN8WithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Generate a EAN-8 code barcode as PNG file
   * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
   * @param value Barcode value to generate from (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> generateBarcodeEAN8WithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = generateBarcodeEAN8RequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("generateBarcodeEAN8", localVarResponse);
        }
        return new ApiResponse<byte[]>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<byte[]>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder generateBarcodeEAN8RequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeEAN8");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/barcode/generate/ean-8";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
   * Generate a QR code barcode as PNG file
   * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
   * @param value QR code text to convert into the QR code barcode (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] generateBarcodeQRCode(String value) throws ApiException {
    ApiResponse<byte[]> localVarResponse = generateBarcodeQRCodeWithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Generate a QR code barcode as PNG file
   * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
   * @param value QR code text to convert into the QR code barcode (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> generateBarcodeQRCodeWithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = generateBarcodeQRCodeRequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("generateBarcodeQRCode", localVarResponse);
        }
        return new ApiResponse<byte[]>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<byte[]>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder generateBarcodeQRCodeRequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeQRCode");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/barcode/generate/qrcode";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
   * Generate a UPC-A code barcode as PNG file
   * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
   * @param value UPC-A barcode value to generate from (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] generateBarcodeUPCA(String value) throws ApiException {
    ApiResponse<byte[]> localVarResponse = generateBarcodeUPCAWithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Generate a UPC-A code barcode as PNG file
   * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
   * @param value UPC-A barcode value to generate from (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> generateBarcodeUPCAWithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = generateBarcodeUPCARequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("generateBarcodeUPCA", localVarResponse);
        }
        return new ApiResponse<byte[]>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<byte[]>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder generateBarcodeUPCARequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeUPCA");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/barcode/generate/upc-a";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
   * Generate a UPC-E code barcode as PNG file
   * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
   * @param value UPC-E barcode value to generate from (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] generateBarcodeUPCE(String value) throws ApiException {
    ApiResponse<byte[]> localVarResponse = generateBarcodeUPCEWithHttpInfo(value);
    return localVarResponse.getData();
  }

  /**
   * Generate a UPC-E code barcode as PNG file
   * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
   * @param value UPC-E barcode value to generate from (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> generateBarcodeUPCEWithHttpInfo(String value) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = generateBarcodeUPCERequestBuilder(value);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("generateBarcodeUPCE", localVarResponse);
        }
        return new ApiResponse<byte[]>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<byte[]>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder generateBarcodeUPCERequestBuilder(String value) throws ApiException {
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeUPCE");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/barcode/generate/upc-e";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
