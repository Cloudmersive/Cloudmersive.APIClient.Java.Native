/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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

import com.cloudmersive.client.native.model.AgeDetectionResult;
import com.cloudmersive.client.native.model.FaceCompareResponse;
import com.cloudmersive.client.native.model.FaceLocateResponse;
import com.cloudmersive.client.native.model.FaceLocateWithLandmarksResponse;
import java.io.File;
import com.cloudmersive.client.native.model.GenderDetectionResult;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:07.726634200-07:00[America/Los_Angeles]")
public class FaceApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public FaceApi() {
    this(new ApiClient());
  }

  public FaceApi(ApiClient apiClient) {
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
   * Compare and match faces
   * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
   * @param inputImage Image file to perform the operation on; this image can contain one or more faces which will be matched against face provided in the second image.  Common file formats such as PNG, JPEG are supported. (required)
   * @param matchFace Image of a single face to compare and match against. (required)
   * @return FaceCompareResponse
   * @throws ApiException if fails to make API call
   */
  public FaceCompareResponse faceCompare(File inputImage, File matchFace) throws ApiException {
    ApiResponse<FaceCompareResponse> localVarResponse = faceCompareWithHttpInfo(inputImage, matchFace);
    return localVarResponse.getData();
  }

  /**
   * Compare and match faces
   * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
   * @param inputImage Image file to perform the operation on; this image can contain one or more faces which will be matched against face provided in the second image.  Common file formats such as PNG, JPEG are supported. (required)
   * @param matchFace Image of a single face to compare and match against. (required)
   * @return ApiResponse&lt;FaceCompareResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaceCompareResponse> faceCompareWithHttpInfo(File inputImage, File matchFace) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceCompareRequestBuilder(inputImage, matchFace);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceCompare", localVarResponse);
        }
        return new ApiResponse<FaceCompareResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<FaceCompareResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder faceCompareRequestBuilder(File inputImage, File matchFace) throws ApiException {
    // verify the required parameter 'inputImage' is set
    if (inputImage == null) {
      throw new ApiException(400, "Missing the required parameter 'inputImage' when calling faceCompare");
    }
    // verify the required parameter 'matchFace' is set
    if (matchFace == null) {
      throw new ApiException(400, "Missing the required parameter 'matchFace' when calling faceCompare");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/compare-and-match";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

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
   * Crop image to face with square crop
   * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] faceCropFirst(File imageFile) throws ApiException {
    ApiResponse<byte[]> localVarResponse = faceCropFirstWithHttpInfo(imageFile);
    return localVarResponse.getData();
  }

  /**
   * Crop image to face with square crop
   * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> faceCropFirstWithHttpInfo(File imageFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceCropFirstRequestBuilder(imageFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceCropFirst", localVarResponse);
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

  private HttpRequest.Builder faceCropFirstRequestBuilder(File imageFile) throws ApiException {
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      throw new ApiException(400, "Missing the required parameter 'imageFile' when calling faceCropFirst");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/crop/first";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
   * Crop image to face with round crop
   * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] faceCropFirstRound(File imageFile) throws ApiException {
    ApiResponse<byte[]> localVarResponse = faceCropFirstRoundWithHttpInfo(imageFile);
    return localVarResponse.getData();
  }

  /**
   * Crop image to face with round crop
   * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> faceCropFirstRoundWithHttpInfo(File imageFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceCropFirstRoundRequestBuilder(imageFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceCropFirstRound", localVarResponse);
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

  private HttpRequest.Builder faceCropFirstRoundRequestBuilder(File imageFile) throws ApiException {
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      throw new ApiException(400, "Missing the required parameter 'imageFile' when calling faceCropFirstRound");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/crop/first/round";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/octet-stream");

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
   * Detect the age of people in an image
   * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return AgeDetectionResult
   * @throws ApiException if fails to make API call
   */
  public AgeDetectionResult faceDetectAge(File imageFile) throws ApiException {
    ApiResponse<AgeDetectionResult> localVarResponse = faceDetectAgeWithHttpInfo(imageFile);
    return localVarResponse.getData();
  }

  /**
   * Detect the age of people in an image
   * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return ApiResponse&lt;AgeDetectionResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgeDetectionResult> faceDetectAgeWithHttpInfo(File imageFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceDetectAgeRequestBuilder(imageFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceDetectAge", localVarResponse);
        }
        return new ApiResponse<AgeDetectionResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AgeDetectionResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder faceDetectAgeRequestBuilder(File imageFile) throws ApiException {
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      throw new ApiException(400, "Missing the required parameter 'imageFile' when calling faceDetectAge");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/detect-age";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

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
   * Detect the gender of people in an image
   * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return GenderDetectionResult
   * @throws ApiException if fails to make API call
   */
  public GenderDetectionResult faceDetectGender(File imageFile) throws ApiException {
    ApiResponse<GenderDetectionResult> localVarResponse = faceDetectGenderWithHttpInfo(imageFile);
    return localVarResponse.getData();
  }

  /**
   * Detect the gender of people in an image
   * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return ApiResponse&lt;GenderDetectionResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GenderDetectionResult> faceDetectGenderWithHttpInfo(File imageFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceDetectGenderRequestBuilder(imageFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceDetectGender", localVarResponse);
        }
        return new ApiResponse<GenderDetectionResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GenderDetectionResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder faceDetectGenderRequestBuilder(File imageFile) throws ApiException {
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      throw new ApiException(400, "Missing the required parameter 'imageFile' when calling faceDetectGender");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/detect-gender";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

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
   * Detect and find faces in an image
   * Locate the positions of all faces in an image
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return FaceLocateResponse
   * @throws ApiException if fails to make API call
   */
  public FaceLocateResponse faceLocate(File imageFile) throws ApiException {
    ApiResponse<FaceLocateResponse> localVarResponse = faceLocateWithHttpInfo(imageFile);
    return localVarResponse.getData();
  }

  /**
   * Detect and find faces in an image
   * Locate the positions of all faces in an image
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return ApiResponse&lt;FaceLocateResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaceLocateResponse> faceLocateWithHttpInfo(File imageFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceLocateRequestBuilder(imageFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceLocate", localVarResponse);
        }
        return new ApiResponse<FaceLocateResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<FaceLocateResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder faceLocateRequestBuilder(File imageFile) throws ApiException {
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      throw new ApiException(400, "Missing the required parameter 'imageFile' when calling faceLocate");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/locate";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

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
   * Detect and find faces and landmarks eyes and nose and mouth in image
   * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return FaceLocateWithLandmarksResponse
   * @throws ApiException if fails to make API call
   */
  public FaceLocateWithLandmarksResponse faceLocateWithLandmarks(File imageFile) throws ApiException {
    ApiResponse<FaceLocateWithLandmarksResponse> localVarResponse = faceLocateWithLandmarksWithHttpInfo(imageFile);
    return localVarResponse.getData();
  }

  /**
   * Detect and find faces and landmarks eyes and nose and mouth in image
   * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return ApiResponse&lt;FaceLocateWithLandmarksResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaceLocateWithLandmarksResponse> faceLocateWithLandmarksWithHttpInfo(File imageFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = faceLocateWithLandmarksRequestBuilder(imageFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("faceLocateWithLandmarks", localVarResponse);
        }
        return new ApiResponse<FaceLocateWithLandmarksResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<FaceLocateWithLandmarksResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder faceLocateWithLandmarksRequestBuilder(File imageFile) throws ApiException {
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      throw new ApiException(400, "Missing the required parameter 'imageFile' when calling faceLocateWithLandmarks");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/image/face/locate-with-landmarks";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, text/json, application/xml, text/xml");

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
