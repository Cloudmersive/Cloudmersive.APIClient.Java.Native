# SplitDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**splitDocumentDocx**](SplitDocumentApi.md#splitDocumentDocx) | **POST** /convert/split/docx | Split a single Word Document DOCX into Separate Documents by Page |
| [**splitDocumentDocxWithHttpInfo**](SplitDocumentApi.md#splitDocumentDocxWithHttpInfo) | **POST** /convert/split/docx | Split a single Word Document DOCX into Separate Documents by Page |
| [**splitDocumentPdfByPage**](SplitDocumentApi.md#splitDocumentPdfByPage) | **POST** /convert/split/pdf | Split a PDF file into separate PDF files, one per page |
| [**splitDocumentPdfByPageWithHttpInfo**](SplitDocumentApi.md#splitDocumentPdfByPageWithHttpInfo) | **POST** /convert/split/pdf | Split a PDF file into separate PDF files, one per page |
| [**splitDocumentPptx**](SplitDocumentApi.md#splitDocumentPptx) | **POST** /convert/split/pptx | Split a single PowerPoint Presentation PPTX into Separate Slides |
| [**splitDocumentPptxWithHttpInfo**](SplitDocumentApi.md#splitDocumentPptxWithHttpInfo) | **POST** /convert/split/pptx | Split a single PowerPoint Presentation PPTX into Separate Slides |
| [**splitDocumentTxtByLine**](SplitDocumentApi.md#splitDocumentTxtByLine) | **POST** /convert/split/txt/by-line | Split a single Text file (txt) into lines |
| [**splitDocumentTxtByLineWithHttpInfo**](SplitDocumentApi.md#splitDocumentTxtByLineWithHttpInfo) | **POST** /convert/split/txt/by-line | Split a single Text file (txt) into lines |
| [**splitDocumentTxtByString**](SplitDocumentApi.md#splitDocumentTxtByString) | **POST** /convert/split/txt/by-string | Split a single Text file (txt) by a string delimiter |
| [**splitDocumentTxtByStringWithHttpInfo**](SplitDocumentApi.md#splitDocumentTxtByStringWithHttpInfo) | **POST** /convert/split/txt/by-string | Split a single Text file (txt) by a string delimiter |
| [**splitDocumentXlsx**](SplitDocumentApi.md#splitDocumentXlsx) | **POST** /convert/split/xlsx | Split a single Excel XLSX into Separate Worksheets |
| [**splitDocumentXlsxWithHttpInfo**](SplitDocumentApi.md#splitDocumentXlsxWithHttpInfo) | **POST** /convert/split/xlsx | Split a single Excel XLSX into Separate Worksheets |



## splitDocumentDocx

> SplitDocxDocumentResult splitDocumentDocx(inputFile, returnDocumentContents)

Split a single Word Document DOCX into Separate Documents by Page

Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true.
        try {
            SplitDocxDocumentResult result = apiInstance.splitDocumentDocx(inputFile, returnDocumentContents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentDocx");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. | [optional] |

### Return type

[**SplitDocxDocumentResult**](SplitDocxDocumentResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## splitDocumentDocxWithHttpInfo

> ApiResponse<SplitDocxDocumentResult> splitDocumentDocx splitDocumentDocxWithHttpInfo(inputFile, returnDocumentContents)

Split a single Word Document DOCX into Separate Documents by Page

Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true.
        try {
            ApiResponse<SplitDocxDocumentResult> response = apiInstance.splitDocumentDocxWithHttpInfo(inputFile, returnDocumentContents);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentDocx");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. | [optional] |

### Return type

ApiResponse<[**SplitDocxDocumentResult**](SplitDocxDocumentResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## splitDocumentPdfByPage

> SplitPdfResult splitDocumentPdfByPage(inputFile, returnDocumentContents)

Split a PDF file into separate PDF files, one per page

Split an input PDF file into separate pages, comprised of one PDF file per page.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false.
        try {
            SplitPdfResult result = apiInstance.splitDocumentPdfByPage(inputFile, returnDocumentContents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentPdfByPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. | [optional] |

### Return type

[**SplitPdfResult**](SplitPdfResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## splitDocumentPdfByPageWithHttpInfo

> ApiResponse<SplitPdfResult> splitDocumentPdfByPage splitDocumentPdfByPageWithHttpInfo(inputFile, returnDocumentContents)

Split a PDF file into separate PDF files, one per page

Split an input PDF file into separate pages, comprised of one PDF file per page.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false.
        try {
            ApiResponse<SplitPdfResult> response = apiInstance.splitDocumentPdfByPageWithHttpInfo(inputFile, returnDocumentContents);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentPdfByPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. | [optional] |

### Return type

ApiResponse<[**SplitPdfResult**](SplitPdfResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## splitDocumentPptx

> SplitPptxPresentationResult splitDocumentPptx(inputFile, returnDocumentContents)

Split a single PowerPoint Presentation PPTX into Separate Slides

Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true.
        try {
            SplitPptxPresentationResult result = apiInstance.splitDocumentPptx(inputFile, returnDocumentContents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentPptx");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. | [optional] |

### Return type

[**SplitPptxPresentationResult**](SplitPptxPresentationResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## splitDocumentPptxWithHttpInfo

> ApiResponse<SplitPptxPresentationResult> splitDocumentPptx splitDocumentPptxWithHttpInfo(inputFile, returnDocumentContents)

Split a single PowerPoint Presentation PPTX into Separate Slides

Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true.
        try {
            ApiResponse<SplitPptxPresentationResult> response = apiInstance.splitDocumentPptxWithHttpInfo(inputFile, returnDocumentContents);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentPptx");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. | [optional] |

### Return type

ApiResponse<[**SplitPptxPresentationResult**](SplitPptxPresentationResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## splitDocumentTxtByLine

> SplitTextDocumentByLinesResult splitDocumentTxtByLine(inputFile)

Split a single Text file (txt) into lines

Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            SplitTextDocumentByLinesResult result = apiInstance.splitDocumentTxtByLine(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentTxtByLine");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |

### Return type

[**SplitTextDocumentByLinesResult**](SplitTextDocumentByLinesResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## splitDocumentTxtByLineWithHttpInfo

> ApiResponse<SplitTextDocumentByLinesResult> splitDocumentTxtByLine splitDocumentTxtByLineWithHttpInfo(inputFile)

Split a single Text file (txt) into lines

Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ApiResponse<SplitTextDocumentByLinesResult> response = apiInstance.splitDocumentTxtByLineWithHttpInfo(inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentTxtByLine");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |

### Return type

ApiResponse<[**SplitTextDocumentByLinesResult**](SplitTextDocumentByLinesResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## splitDocumentTxtByString

> SplitTextDocumentByStringResult splitDocumentTxtByString(splitDelimiter, inputFile, skipEmptyElements)

Split a single Text file (txt) by a string delimiter

Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        String splitDelimiter = "splitDelimiter_example"; // String | Required; String to split up the input file on
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean skipEmptyElements = true; // Boolean | Optional; If true, empty elements will be skipped in the output
        try {
            SplitTextDocumentByStringResult result = apiInstance.splitDocumentTxtByString(splitDelimiter, inputFile, skipEmptyElements);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentTxtByString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **splitDelimiter** | **String**| Required; String to split up the input file on | |
| **inputFile** | **File**| Input file to perform the operation on. | |
| **skipEmptyElements** | **Boolean**| Optional; If true, empty elements will be skipped in the output | [optional] |

### Return type

[**SplitTextDocumentByStringResult**](SplitTextDocumentByStringResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## splitDocumentTxtByStringWithHttpInfo

> ApiResponse<SplitTextDocumentByStringResult> splitDocumentTxtByString splitDocumentTxtByStringWithHttpInfo(splitDelimiter, inputFile, skipEmptyElements)

Split a single Text file (txt) by a string delimiter

Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        String splitDelimiter = "splitDelimiter_example"; // String | Required; String to split up the input file on
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean skipEmptyElements = true; // Boolean | Optional; If true, empty elements will be skipped in the output
        try {
            ApiResponse<SplitTextDocumentByStringResult> response = apiInstance.splitDocumentTxtByStringWithHttpInfo(splitDelimiter, inputFile, skipEmptyElements);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentTxtByString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **splitDelimiter** | **String**| Required; String to split up the input file on | |
| **inputFile** | **File**| Input file to perform the operation on. | |
| **skipEmptyElements** | **Boolean**| Optional; If true, empty elements will be skipped in the output | [optional] |

### Return type

ApiResponse<[**SplitTextDocumentByStringResult**](SplitTextDocumentByStringResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## splitDocumentXlsx

> SplitXlsxWorksheetResult splitDocumentXlsx(inputFile, returnDocumentContents)

Split a single Excel XLSX into Separate Worksheets

Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true.
        try {
            SplitXlsxWorksheetResult result = apiInstance.splitDocumentXlsx(inputFile, returnDocumentContents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentXlsx");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. | [optional] |

### Return type

[**SplitXlsxWorksheetResult**](SplitXlsxWorksheetResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## splitDocumentXlsxWithHttpInfo

> ApiResponse<SplitXlsxWorksheetResult> splitDocumentXlsx splitDocumentXlsxWithHttpInfo(inputFile, returnDocumentContents)

Split a single Excel XLSX into Separate Worksheets

Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.SplitDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        SplitDocumentApi apiInstance = new SplitDocumentApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true.
        try {
            ApiResponse<SplitXlsxWorksheetResult> response = apiInstance.splitDocumentXlsxWithHttpInfo(inputFile, returnDocumentContents);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SplitDocumentApi#splitDocumentXlsx");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFile** | **File**| Input file to perform the operation on. | |
| **returnDocumentContents** | **Boolean**| Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. | [optional] |

### Return type

ApiResponse<[**SplitXlsxWorksheetResult**](SplitXlsxWorksheetResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

