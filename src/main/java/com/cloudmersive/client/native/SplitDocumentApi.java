/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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

import java.io.File;
import com.cloudmersive.client.native.model.SplitDocxDocumentResult;
import com.cloudmersive.client.native.model.SplitPdfResult;
import com.cloudmersive.client.native.model.SplitPptxPresentationResult;
import com.cloudmersive.client.native.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.native.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.native.model.SplitXlsxWorksheetResult;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:26:27.275021200-07:00[America/Los_Angeles]")
public class SplitDocumentApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SplitDocumentApi() {
    this(new ApiClient());
  }

  public SplitDocumentApi(ApiClient apiClient) {
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
   * Split a single Word Document DOCX into Separate Documents by Page
   * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. (optional)
   * @return SplitDocxDocumentResult
   * @throws ApiException if fails to make API call
   */
  public SplitDocxDocumentResult splitDocumentDocx(File inputFile, Boolean returnDocumentContents) throws ApiException {
    ApiResponse<SplitDocxDocumentResult> localVarResponse = splitDocumentDocxWithHttpInfo(inputFile, returnDocumentContents);
    return localVarResponse.getData();
  }

  /**
   * Split a single Word Document DOCX into Separate Documents by Page
   * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. (optional)
   * @return ApiResponse&lt;SplitDocxDocumentResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SplitDocxDocumentResult> splitDocumentDocxWithHttpInfo(File inputFile, Boolean returnDocumentContents) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = splitDocumentDocxRequestBuilder(inputFile, returnDocumentContents);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("splitDocumentDocx", localVarResponse);
        }
        return new ApiResponse<SplitDocxDocumentResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SplitDocxDocumentResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder splitDocumentDocxRequestBuilder(File inputFile, Boolean returnDocumentContents) throws ApiException {
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling splitDocumentDocx");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/convert/split/docx";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (returnDocumentContents != null) {
      localVarRequestBuilder.header("returnDocumentContents", returnDocumentContents.toString());
    }
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
   * Split a PDF file into separate PDF files, one per page
   * Split an input PDF file into separate pages, comprised of one PDF file per page.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. (optional)
   * @return SplitPdfResult
   * @throws ApiException if fails to make API call
   */
  public SplitPdfResult splitDocumentPdfByPage(File inputFile, Boolean returnDocumentContents) throws ApiException {
    ApiResponse<SplitPdfResult> localVarResponse = splitDocumentPdfByPageWithHttpInfo(inputFile, returnDocumentContents);
    return localVarResponse.getData();
  }

  /**
   * Split a PDF file into separate PDF files, one per page
   * Split an input PDF file into separate pages, comprised of one PDF file per page.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. (optional)
   * @return ApiResponse&lt;SplitPdfResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SplitPdfResult> splitDocumentPdfByPageWithHttpInfo(File inputFile, Boolean returnDocumentContents) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = splitDocumentPdfByPageRequestBuilder(inputFile, returnDocumentContents);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("splitDocumentPdfByPage", localVarResponse);
        }
        return new ApiResponse<SplitPdfResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SplitPdfResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder splitDocumentPdfByPageRequestBuilder(File inputFile, Boolean returnDocumentContents) throws ApiException {
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling splitDocumentPdfByPage");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/convert/split/pdf";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (returnDocumentContents != null) {
      localVarRequestBuilder.header("returnDocumentContents", returnDocumentContents.toString());
    }
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
   * Split a single PowerPoint Presentation PPTX into Separate Slides
   * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. (optional)
   * @return SplitPptxPresentationResult
   * @throws ApiException if fails to make API call
   */
  public SplitPptxPresentationResult splitDocumentPptx(File inputFile, Boolean returnDocumentContents) throws ApiException {
    ApiResponse<SplitPptxPresentationResult> localVarResponse = splitDocumentPptxWithHttpInfo(inputFile, returnDocumentContents);
    return localVarResponse.getData();
  }

  /**
   * Split a single PowerPoint Presentation PPTX into Separate Slides
   * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. (optional)
   * @return ApiResponse&lt;SplitPptxPresentationResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SplitPptxPresentationResult> splitDocumentPptxWithHttpInfo(File inputFile, Boolean returnDocumentContents) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = splitDocumentPptxRequestBuilder(inputFile, returnDocumentContents);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("splitDocumentPptx", localVarResponse);
        }
        return new ApiResponse<SplitPptxPresentationResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SplitPptxPresentationResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder splitDocumentPptxRequestBuilder(File inputFile, Boolean returnDocumentContents) throws ApiException {
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling splitDocumentPptx");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/convert/split/pptx";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (returnDocumentContents != null) {
      localVarRequestBuilder.header("returnDocumentContents", returnDocumentContents.toString());
    }
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
   * Split a single Text file (txt) into lines
   * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
   * @param inputFile Input file to perform the operation on. (required)
   * @return SplitTextDocumentByLinesResult
   * @throws ApiException if fails to make API call
   */
  public SplitTextDocumentByLinesResult splitDocumentTxtByLine(File inputFile) throws ApiException {
    ApiResponse<SplitTextDocumentByLinesResult> localVarResponse = splitDocumentTxtByLineWithHttpInfo(inputFile);
    return localVarResponse.getData();
  }

  /**
   * Split a single Text file (txt) into lines
   * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
   * @param inputFile Input file to perform the operation on. (required)
   * @return ApiResponse&lt;SplitTextDocumentByLinesResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SplitTextDocumentByLinesResult> splitDocumentTxtByLineWithHttpInfo(File inputFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = splitDocumentTxtByLineRequestBuilder(inputFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("splitDocumentTxtByLine", localVarResponse);
        }
        return new ApiResponse<SplitTextDocumentByLinesResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SplitTextDocumentByLinesResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder splitDocumentTxtByLineRequestBuilder(File inputFile) throws ApiException {
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling splitDocumentTxtByLine");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/convert/split/txt/by-line";

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
   * Split a single Text file (txt) by a string delimiter
   * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
   * @param splitDelimiter Required; String to split up the input file on (required)
   * @param inputFile Input file to perform the operation on. (required)
   * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output (optional)
   * @return SplitTextDocumentByStringResult
   * @throws ApiException if fails to make API call
   */
  public SplitTextDocumentByStringResult splitDocumentTxtByString(String splitDelimiter, File inputFile, Boolean skipEmptyElements) throws ApiException {
    ApiResponse<SplitTextDocumentByStringResult> localVarResponse = splitDocumentTxtByStringWithHttpInfo(splitDelimiter, inputFile, skipEmptyElements);
    return localVarResponse.getData();
  }

  /**
   * Split a single Text file (txt) by a string delimiter
   * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
   * @param splitDelimiter Required; String to split up the input file on (required)
   * @param inputFile Input file to perform the operation on. (required)
   * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output (optional)
   * @return ApiResponse&lt;SplitTextDocumentByStringResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SplitTextDocumentByStringResult> splitDocumentTxtByStringWithHttpInfo(String splitDelimiter, File inputFile, Boolean skipEmptyElements) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = splitDocumentTxtByStringRequestBuilder(splitDelimiter, inputFile, skipEmptyElements);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("splitDocumentTxtByString", localVarResponse);
        }
        return new ApiResponse<SplitTextDocumentByStringResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SplitTextDocumentByStringResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder splitDocumentTxtByStringRequestBuilder(String splitDelimiter, File inputFile, Boolean skipEmptyElements) throws ApiException {
    // verify the required parameter 'splitDelimiter' is set
    if (splitDelimiter == null) {
      throw new ApiException(400, "Missing the required parameter 'splitDelimiter' when calling splitDocumentTxtByString");
    }
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling splitDocumentTxtByString");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/convert/split/txt/by-string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (splitDelimiter != null) {
      localVarRequestBuilder.header("splitDelimiter", splitDelimiter.toString());
    }
    if (skipEmptyElements != null) {
      localVarRequestBuilder.header("skipEmptyElements", skipEmptyElements.toString());
    }
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
   * Split a single Excel XLSX into Separate Worksheets
   * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. (optional)
   * @return SplitXlsxWorksheetResult
   * @throws ApiException if fails to make API call
   */
  public SplitXlsxWorksheetResult splitDocumentXlsx(File inputFile, Boolean returnDocumentContents) throws ApiException {
    ApiResponse<SplitXlsxWorksheetResult> localVarResponse = splitDocumentXlsxWithHttpInfo(inputFile, returnDocumentContents);
    return localVarResponse.getData();
  }

  /**
   * Split a single Excel XLSX into Separate Worksheets
   * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
   * @param inputFile Input file to perform the operation on. (required)
   * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. (optional)
   * @return ApiResponse&lt;SplitXlsxWorksheetResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SplitXlsxWorksheetResult> splitDocumentXlsxWithHttpInfo(File inputFile, Boolean returnDocumentContents) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = splitDocumentXlsxRequestBuilder(inputFile, returnDocumentContents);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("splitDocumentXlsx", localVarResponse);
        }
        return new ApiResponse<SplitXlsxWorksheetResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SplitXlsxWorksheetResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder splitDocumentXlsxRequestBuilder(File inputFile, Boolean returnDocumentContents) throws ApiException {
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling splitDocumentXlsx");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/convert/split/xlsx";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (returnDocumentContents != null) {
      localVarRequestBuilder.header("returnDocumentContents", returnDocumentContents.toString());
    }
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