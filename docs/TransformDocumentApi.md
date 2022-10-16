# TransformDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transformDocumentDocxReplace**](TransformDocumentApi.md#transformDocumentDocxReplace) | **POST** /convert/transform/docx/replace-all | Replace string in Word DOCX document, return result |
| [**transformDocumentDocxReplaceWithHttpInfo**](TransformDocumentApi.md#transformDocumentDocxReplaceWithHttpInfo) | **POST** /convert/transform/docx/replace-all | Replace string in Word DOCX document, return result |
| [**transformDocumentDocxReplaceEditSession**](TransformDocumentApi.md#transformDocumentDocxReplaceEditSession) | **POST** /convert/transform/docx/replace-all/edit-session | Replace string in Word DOCX document, return edit session |
| [**transformDocumentDocxReplaceEditSessionWithHttpInfo**](TransformDocumentApi.md#transformDocumentDocxReplaceEditSessionWithHttpInfo) | **POST** /convert/transform/docx/replace-all/edit-session | Replace string in Word DOCX document, return edit session |
| [**transformDocumentDocxTableFillIn**](TransformDocumentApi.md#transformDocumentDocxTableFillIn) | **POST** /convert/transform/docx/table/fill/data | Fill in data in a table in a Word DOCX document, return result |
| [**transformDocumentDocxTableFillInWithHttpInfo**](TransformDocumentApi.md#transformDocumentDocxTableFillInWithHttpInfo) | **POST** /convert/transform/docx/table/fill/data | Fill in data in a table in a Word DOCX document, return result |
| [**transformDocumentDocxTableFillInEditSession**](TransformDocumentApi.md#transformDocumentDocxTableFillInEditSession) | **POST** /convert/transform/docx/table/fill/data/edit-session | Fill in data in a table in a Word DOCX document, return edit session |
| [**transformDocumentDocxTableFillInEditSessionWithHttpInfo**](TransformDocumentApi.md#transformDocumentDocxTableFillInEditSessionWithHttpInfo) | **POST** /convert/transform/docx/table/fill/data/edit-session | Fill in data in a table in a Word DOCX document, return edit session |
| [**transformDocumentDocxTableFillInMulti**](TransformDocumentApi.md#transformDocumentDocxTableFillInMulti) | **POST** /convert/transform/docx/table/fill/data/multi | Fill in data in multiple tables in a Word DOCX document, return result |
| [**transformDocumentDocxTableFillInMultiWithHttpInfo**](TransformDocumentApi.md#transformDocumentDocxTableFillInMultiWithHttpInfo) | **POST** /convert/transform/docx/table/fill/data/multi | Fill in data in multiple tables in a Word DOCX document, return result |
| [**transformDocumentPptxReplace**](TransformDocumentApi.md#transformDocumentPptxReplace) | **POST** /convert/transform/pptx/replace-all | Replace string in PowerPoint PPTX presentation, return result |
| [**transformDocumentPptxReplaceWithHttpInfo**](TransformDocumentApi.md#transformDocumentPptxReplaceWithHttpInfo) | **POST** /convert/transform/pptx/replace-all | Replace string in PowerPoint PPTX presentation, return result |



## transformDocumentDocxReplace

> byte[] transformDocumentDocxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in Word DOCX document, return result

Replace all instances of a string in an Office Word Document (docx)

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.transformDocumentDocxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplace");
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
| **matchString** | **String**| String to search for and match against, to be replaced | |
| **replaceString** | **String**| String to replace the matched values with | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional] |
| **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## transformDocumentDocxReplaceWithHttpInfo

> ApiResponse<byte[]> transformDocumentDocxReplace transformDocumentDocxReplaceWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in Word DOCX document, return result

Replace all instances of a string in an Office Word Document (docx)

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            ApiResponse<byte[]> response = apiInstance.transformDocumentDocxReplaceWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplace");
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
| **matchString** | **String**| String to search for and match against, to be replaced | |
| **replaceString** | **String**| String to replace the matched values with | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional] |
| **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

ApiResponse<**byte[]**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## transformDocumentDocxReplaceEditSession

> DocumentTransformEditSession transformDocumentDocxReplaceEditSession(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in Word DOCX document, return edit session

Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            DocumentTransformEditSession result = apiInstance.transformDocumentDocxReplaceEditSession(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplaceEditSession");
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
| **matchString** | **String**| String to search for and match against, to be replaced | |
| **replaceString** | **String**| String to replace the matched values with | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional] |
| **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

[**DocumentTransformEditSession**](DocumentTransformEditSession.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## transformDocumentDocxReplaceEditSessionWithHttpInfo

> ApiResponse<DocumentTransformEditSession> transformDocumentDocxReplaceEditSession transformDocumentDocxReplaceEditSessionWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in Word DOCX document, return edit session

Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            ApiResponse<DocumentTransformEditSession> response = apiInstance.transformDocumentDocxReplaceEditSessionWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplaceEditSession");
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
| **matchString** | **String**| String to search for and match against, to be replaced | |
| **replaceString** | **String**| String to replace the matched values with | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional] |
| **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

ApiResponse<[**DocumentTransformEditSession**](DocumentTransformEditSession.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## transformDocumentDocxTableFillIn

> byte[] transformDocumentDocxTableFillIn(request)

Fill in data in a table in a Word DOCX document, return result

Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        DocxTableTableFillRequest request = new DocxTableTableFillRequest(); // DocxTableTableFillRequest | 
        try {
            byte[] result = apiInstance.transformDocumentDocxTableFillIn(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillIn");
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
| **request** | [**DocxTableTableFillRequest**](DocxTableTableFillRequest.md)|  | |

### Return type

**byte[]**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## transformDocumentDocxTableFillInWithHttpInfo

> ApiResponse<byte[]> transformDocumentDocxTableFillIn transformDocumentDocxTableFillInWithHttpInfo(request)

Fill in data in a table in a Word DOCX document, return result

Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        DocxTableTableFillRequest request = new DocxTableTableFillRequest(); // DocxTableTableFillRequest | 
        try {
            ApiResponse<byte[]> response = apiInstance.transformDocumentDocxTableFillInWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillIn");
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
| **request** | [**DocxTableTableFillRequest**](DocxTableTableFillRequest.md)|  | |

### Return type

ApiResponse<**byte[]**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## transformDocumentDocxTableFillInEditSession

> DocumentTransformEditSession transformDocumentDocxTableFillInEditSession(request)

Fill in data in a table in a Word DOCX document, return edit session

Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        DocxTableTableFillRequest request = new DocxTableTableFillRequest(); // DocxTableTableFillRequest | 
        try {
            DocumentTransformEditSession result = apiInstance.transformDocumentDocxTableFillInEditSession(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillInEditSession");
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
| **request** | [**DocxTableTableFillRequest**](DocxTableTableFillRequest.md)|  | |

### Return type

[**DocumentTransformEditSession**](DocumentTransformEditSession.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## transformDocumentDocxTableFillInEditSessionWithHttpInfo

> ApiResponse<DocumentTransformEditSession> transformDocumentDocxTableFillInEditSession transformDocumentDocxTableFillInEditSessionWithHttpInfo(request)

Fill in data in a table in a Word DOCX document, return edit session

Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        DocxTableTableFillRequest request = new DocxTableTableFillRequest(); // DocxTableTableFillRequest | 
        try {
            ApiResponse<DocumentTransformEditSession> response = apiInstance.transformDocumentDocxTableFillInEditSessionWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillInEditSession");
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
| **request** | [**DocxTableTableFillRequest**](DocxTableTableFillRequest.md)|  | |

### Return type

ApiResponse<[**DocumentTransformEditSession**](DocumentTransformEditSession.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## transformDocumentDocxTableFillInMulti

> byte[] transformDocumentDocxTableFillInMulti(request)

Fill in data in multiple tables in a Word DOCX document, return result

Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        DocxTableTableFillMultiRequest request = new DocxTableTableFillMultiRequest(); // DocxTableTableFillMultiRequest | 
        try {
            byte[] result = apiInstance.transformDocumentDocxTableFillInMulti(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillInMulti");
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
| **request** | [**DocxTableTableFillMultiRequest**](DocxTableTableFillMultiRequest.md)|  | |

### Return type

**byte[]**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## transformDocumentDocxTableFillInMultiWithHttpInfo

> ApiResponse<byte[]> transformDocumentDocxTableFillInMulti transformDocumentDocxTableFillInMultiWithHttpInfo(request)

Fill in data in multiple tables in a Word DOCX document, return result

Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        DocxTableTableFillMultiRequest request = new DocxTableTableFillMultiRequest(); // DocxTableTableFillMultiRequest | 
        try {
            ApiResponse<byte[]> response = apiInstance.transformDocumentDocxTableFillInMultiWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillInMulti");
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
| **request** | [**DocxTableTableFillMultiRequest**](DocxTableTableFillMultiRequest.md)|  | |

### Return type

ApiResponse<**byte[]**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## transformDocumentPptxReplace

> byte[] transformDocumentPptxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in PowerPoint PPTX presentation, return result

Replace all instances of a string in an Office PowerPoint Document (pptx)

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            byte[] result = apiInstance.transformDocumentPptxReplace(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentPptxReplace");
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
| **matchString** | **String**| String to search for and match against, to be replaced | |
| **replaceString** | **String**| String to replace the matched values with | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional] |
| **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

**byte[]**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## transformDocumentPptxReplaceWithHttpInfo

> ApiResponse<byte[]> transformDocumentPptxReplace transformDocumentPptxReplaceWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile)

Replace string in PowerPoint PPTX presentation, return result

Replace all instances of a string in an Office PowerPoint Document (pptx)

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.TransformDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TransformDocumentApi apiInstance = new TransformDocumentApi(defaultClient);
        String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
        String replaceString = "replaceString_example"; // String | String to replace the matched values with
        String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
        Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
        File inputFile = new File("/path/to/file"); // File | Optional: Input file to perform the operation on.
        try {
            ApiResponse<byte[]> response = apiInstance.transformDocumentPptxReplaceWithHttpInfo(matchString, replaceString, inputFileUrl, matchCase, inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformDocumentApi#transformDocumentPptxReplace");
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
| **matchString** | **String**| String to search for and match against, to be replaced | |
| **replaceString** | **String**| String to replace the matched values with | |
| **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional] |
| **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional] |
| **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional] |

### Return type

ApiResponse<**byte[]**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

