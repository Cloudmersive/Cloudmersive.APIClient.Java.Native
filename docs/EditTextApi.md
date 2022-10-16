# EditTextApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editTextBase64Decode**](EditTextApi.md#editTextBase64Decode) | **POST** /convert/edit/text/encoding/base64/decode | Base 64 decode, convert base 64 string to binary content |
| [**editTextBase64DecodeWithHttpInfo**](EditTextApi.md#editTextBase64DecodeWithHttpInfo) | **POST** /convert/edit/text/encoding/base64/decode | Base 64 decode, convert base 64 string to binary content |
| [**editTextBase64Detect**](EditTextApi.md#editTextBase64Detect) | **POST** /convert/edit/text/encoding/base64/detect | Detect, check if text string is base 64 encoded |
| [**editTextBase64DetectWithHttpInfo**](EditTextApi.md#editTextBase64DetectWithHttpInfo) | **POST** /convert/edit/text/encoding/base64/detect | Detect, check if text string is base 64 encoded |
| [**editTextBase64Encode**](EditTextApi.md#editTextBase64Encode) | **POST** /convert/edit/text/encoding/base64/encode | Base 64 encode, convert binary or file data to a text string |
| [**editTextBase64EncodeWithHttpInfo**](EditTextApi.md#editTextBase64EncodeWithHttpInfo) | **POST** /convert/edit/text/encoding/base64/encode | Base 64 encode, convert binary or file data to a text string |
| [**editTextChangeLineEndings**](EditTextApi.md#editTextChangeLineEndings) | **POST** /convert/edit/text/line-endings/change | Set, change line endings of a text file |
| [**editTextChangeLineEndingsWithHttpInfo**](EditTextApi.md#editTextChangeLineEndingsWithHttpInfo) | **POST** /convert/edit/text/line-endings/change | Set, change line endings of a text file |
| [**editTextDetectLineEndings**](EditTextApi.md#editTextDetectLineEndings) | **POST** /convert/edit/text/line-endings/detect | Detect line endings of a text file |
| [**editTextDetectLineEndingsWithHttpInfo**](EditTextApi.md#editTextDetectLineEndingsWithHttpInfo) | **POST** /convert/edit/text/line-endings/detect | Detect line endings of a text file |
| [**editTextFindRegex**](EditTextApi.md#editTextFindRegex) | **POST** /convert/edit/text/find/regex | Find a regular expression regex in text input |
| [**editTextFindRegexWithHttpInfo**](EditTextApi.md#editTextFindRegexWithHttpInfo) | **POST** /convert/edit/text/find/regex | Find a regular expression regex in text input |
| [**editTextFindSimple**](EditTextApi.md#editTextFindSimple) | **POST** /convert/edit/text/find/string | Find a string in text input |
| [**editTextFindSimpleWithHttpInfo**](EditTextApi.md#editTextFindSimpleWithHttpInfo) | **POST** /convert/edit/text/find/string | Find a string in text input |
| [**editTextRemoveAllWhitespace**](EditTextApi.md#editTextRemoveAllWhitespace) | **POST** /convert/edit/text/remove/whitespace/all | Remove whitespace from text string |
| [**editTextRemoveAllWhitespaceWithHttpInfo**](EditTextApi.md#editTextRemoveAllWhitespaceWithHttpInfo) | **POST** /convert/edit/text/remove/whitespace/all | Remove whitespace from text string |
| [**editTextRemoveHtml**](EditTextApi.md#editTextRemoveHtml) | **POST** /convert/edit/text/remove/html | Remove HTML from text string |
| [**editTextRemoveHtmlWithHttpInfo**](EditTextApi.md#editTextRemoveHtmlWithHttpInfo) | **POST** /convert/edit/text/remove/html | Remove HTML from text string |
| [**editTextReplaceRegex**](EditTextApi.md#editTextReplaceRegex) | **POST** /convert/edit/text/replace/regex | Replace a string in text with a regex regular expression string |
| [**editTextReplaceRegexWithHttpInfo**](EditTextApi.md#editTextReplaceRegexWithHttpInfo) | **POST** /convert/edit/text/replace/regex | Replace a string in text with a regex regular expression string |
| [**editTextReplaceSimple**](EditTextApi.md#editTextReplaceSimple) | **POST** /convert/edit/text/replace/string | Replace a string in text with another string value |
| [**editTextReplaceSimpleWithHttpInfo**](EditTextApi.md#editTextReplaceSimpleWithHttpInfo) | **POST** /convert/edit/text/replace/string | Replace a string in text with another string value |
| [**editTextTextEncodingDetect**](EditTextApi.md#editTextTextEncodingDetect) | **POST** /convert/edit/text/encoding/detect | Detect text encoding of file |
| [**editTextTextEncodingDetectWithHttpInfo**](EditTextApi.md#editTextTextEncodingDetectWithHttpInfo) | **POST** /convert/edit/text/encoding/detect | Detect text encoding of file |
| [**editTextTrimWhitespace**](EditTextApi.md#editTextTrimWhitespace) | **POST** /convert/edit/text/remove/whitespace/trim | Trim leading and trailing whitespace from text string |
| [**editTextTrimWhitespaceWithHttpInfo**](EditTextApi.md#editTextTrimWhitespaceWithHttpInfo) | **POST** /convert/edit/text/remove/whitespace/trim | Trim leading and trailing whitespace from text string |



## editTextBase64Decode

> Base64DecodeResponse editTextBase64Decode(request)

Base 64 decode, convert base 64 string to binary content

Decodes / converts base 64 UTF-8 text string to binary content

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        Base64DecodeRequest request = new Base64DecodeRequest(); // Base64DecodeRequest | Input request
        try {
            Base64DecodeResponse result = apiInstance.editTextBase64Decode(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextBase64Decode");
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
| **request** | [**Base64DecodeRequest**](Base64DecodeRequest.md)| Input request | |

### Return type

[**Base64DecodeResponse**](Base64DecodeResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextBase64DecodeWithHttpInfo

> ApiResponse<Base64DecodeResponse> editTextBase64Decode editTextBase64DecodeWithHttpInfo(request)

Base 64 decode, convert base 64 string to binary content

Decodes / converts base 64 UTF-8 text string to binary content

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        Base64DecodeRequest request = new Base64DecodeRequest(); // Base64DecodeRequest | Input request
        try {
            ApiResponse<Base64DecodeResponse> response = apiInstance.editTextBase64DecodeWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextBase64Decode");
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
| **request** | [**Base64DecodeRequest**](Base64DecodeRequest.md)| Input request | |

### Return type

ApiResponse<[**Base64DecodeResponse**](Base64DecodeResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextBase64Detect

> Base64DetectResponse editTextBase64Detect(request)

Detect, check if text string is base 64 encoded

Checks, detects if input string is base 64 encoded

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        Base64DetectRequest request = new Base64DetectRequest(); // Base64DetectRequest | Input request
        try {
            Base64DetectResponse result = apiInstance.editTextBase64Detect(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextBase64Detect");
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
| **request** | [**Base64DetectRequest**](Base64DetectRequest.md)| Input request | |

### Return type

[**Base64DetectResponse**](Base64DetectResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextBase64DetectWithHttpInfo

> ApiResponse<Base64DetectResponse> editTextBase64Detect editTextBase64DetectWithHttpInfo(request)

Detect, check if text string is base 64 encoded

Checks, detects if input string is base 64 encoded

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        Base64DetectRequest request = new Base64DetectRequest(); // Base64DetectRequest | Input request
        try {
            ApiResponse<Base64DetectResponse> response = apiInstance.editTextBase64DetectWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextBase64Detect");
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
| **request** | [**Base64DetectRequest**](Base64DetectRequest.md)| Input request | |

### Return type

ApiResponse<[**Base64DetectResponse**](Base64DetectResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextBase64Encode

> Base64EncodeResponse editTextBase64Encode(request)

Base 64 encode, convert binary or file data to a text string

Encodes / converts binary or file data to a text string

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        Base64EncodeRequest request = new Base64EncodeRequest(); // Base64EncodeRequest | Input request
        try {
            Base64EncodeResponse result = apiInstance.editTextBase64Encode(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextBase64Encode");
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
| **request** | [**Base64EncodeRequest**](Base64EncodeRequest.md)| Input request | |

### Return type

[**Base64EncodeResponse**](Base64EncodeResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextBase64EncodeWithHttpInfo

> ApiResponse<Base64EncodeResponse> editTextBase64Encode editTextBase64EncodeWithHttpInfo(request)

Base 64 encode, convert binary or file data to a text string

Encodes / converts binary or file data to a text string

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        Base64EncodeRequest request = new Base64EncodeRequest(); // Base64EncodeRequest | Input request
        try {
            ApiResponse<Base64EncodeResponse> response = apiInstance.editTextBase64EncodeWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextBase64Encode");
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
| **request** | [**Base64EncodeRequest**](Base64EncodeRequest.md)| Input request | |

### Return type

ApiResponse<[**Base64EncodeResponse**](Base64EncodeResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextChangeLineEndings

> ChangeLineEndingResponse editTextChangeLineEndings(lineEndingType, inputFile)

Set, change line endings of a text file

Sets the line ending type of a text file; set to Windows, Unix or Mac.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        String lineEndingType = "lineEndingType_example"; // String | Required; 'Windows' will use carriage return and line feed, 'Unix' will use newline, and 'Mac' will use carriage return
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ChangeLineEndingResponse result = apiInstance.editTextChangeLineEndings(lineEndingType, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextChangeLineEndings");
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
| **lineEndingType** | **String**| Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return | |
| **inputFile** | **File**| Input file to perform the operation on. | |

### Return type

[**ChangeLineEndingResponse**](ChangeLineEndingResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextChangeLineEndingsWithHttpInfo

> ApiResponse<ChangeLineEndingResponse> editTextChangeLineEndings editTextChangeLineEndingsWithHttpInfo(lineEndingType, inputFile)

Set, change line endings of a text file

Sets the line ending type of a text file; set to Windows, Unix or Mac.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        String lineEndingType = "lineEndingType_example"; // String | Required; 'Windows' will use carriage return and line feed, 'Unix' will use newline, and 'Mac' will use carriage return
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ApiResponse<ChangeLineEndingResponse> response = apiInstance.editTextChangeLineEndingsWithHttpInfo(lineEndingType, inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextChangeLineEndings");
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
| **lineEndingType** | **String**| Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return | |
| **inputFile** | **File**| Input file to perform the operation on. | |

### Return type

ApiResponse<[**ChangeLineEndingResponse**](ChangeLineEndingResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextDetectLineEndings

> DetectLineEndingsResponse editTextDetectLineEndings(inputFile)

Detect line endings of a text file

Detect line ending type (Windows, Unix or Mac) of an input file.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            DetectLineEndingsResponse result = apiInstance.editTextDetectLineEndings(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextDetectLineEndings");
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

[**DetectLineEndingsResponse**](DetectLineEndingsResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextDetectLineEndingsWithHttpInfo

> ApiResponse<DetectLineEndingsResponse> editTextDetectLineEndings editTextDetectLineEndingsWithHttpInfo(inputFile)

Detect line endings of a text file

Detect line ending type (Windows, Unix or Mac) of an input file.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ApiResponse<DetectLineEndingsResponse> response = apiInstance.editTextDetectLineEndingsWithHttpInfo(inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextDetectLineEndings");
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

ApiResponse<[**DetectLineEndingsResponse**](DetectLineEndingsResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextFindRegex

> FindStringRegexResponse editTextFindRegex(request)

Find a regular expression regex in text input

Find all occurrences of the input regular expression in the input content, and returns the matches

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        FindStringRegexRequest request = new FindStringRegexRequest(); // FindStringRegexRequest | Input request
        try {
            FindStringRegexResponse result = apiInstance.editTextFindRegex(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextFindRegex");
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
| **request** | [**FindStringRegexRequest**](FindStringRegexRequest.md)| Input request | |

### Return type

[**FindStringRegexResponse**](FindStringRegexResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextFindRegexWithHttpInfo

> ApiResponse<FindStringRegexResponse> editTextFindRegex editTextFindRegexWithHttpInfo(request)

Find a regular expression regex in text input

Find all occurrences of the input regular expression in the input content, and returns the matches

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        FindStringRegexRequest request = new FindStringRegexRequest(); // FindStringRegexRequest | Input request
        try {
            ApiResponse<FindStringRegexResponse> response = apiInstance.editTextFindRegexWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextFindRegex");
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
| **request** | [**FindStringRegexRequest**](FindStringRegexRequest.md)| Input request | |

### Return type

ApiResponse<[**FindStringRegexResponse**](FindStringRegexResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextFindSimple

> FindStringSimpleResponse editTextFindSimple(request)

Find a string in text input

Finds all occurrences of the input string in the input content, and returns the matches

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        FindStringSimpleRequest request = new FindStringSimpleRequest(); // FindStringSimpleRequest | Input request
        try {
            FindStringSimpleResponse result = apiInstance.editTextFindSimple(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextFindSimple");
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
| **request** | [**FindStringSimpleRequest**](FindStringSimpleRequest.md)| Input request | |

### Return type

[**FindStringSimpleResponse**](FindStringSimpleResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextFindSimpleWithHttpInfo

> ApiResponse<FindStringSimpleResponse> editTextFindSimple editTextFindSimpleWithHttpInfo(request)

Find a string in text input

Finds all occurrences of the input string in the input content, and returns the matches

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        FindStringSimpleRequest request = new FindStringSimpleRequest(); // FindStringSimpleRequest | Input request
        try {
            ApiResponse<FindStringSimpleResponse> response = apiInstance.editTextFindSimpleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextFindSimple");
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
| **request** | [**FindStringSimpleRequest**](FindStringSimpleRequest.md)| Input request | |

### Return type

ApiResponse<[**FindStringSimpleResponse**](FindStringSimpleResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextRemoveAllWhitespace

> RemoveWhitespaceFromTextResponse editTextRemoveAllWhitespace(request)

Remove whitespace from text string

Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        RemoveWhitespaceFromTextRequest request = new RemoveWhitespaceFromTextRequest(); // RemoveWhitespaceFromTextRequest | Input request
        try {
            RemoveWhitespaceFromTextResponse result = apiInstance.editTextRemoveAllWhitespace(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextRemoveAllWhitespace");
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
| **request** | [**RemoveWhitespaceFromTextRequest**](RemoveWhitespaceFromTextRequest.md)| Input request | |

### Return type

[**RemoveWhitespaceFromTextResponse**](RemoveWhitespaceFromTextResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextRemoveAllWhitespaceWithHttpInfo

> ApiResponse<RemoveWhitespaceFromTextResponse> editTextRemoveAllWhitespace editTextRemoveAllWhitespaceWithHttpInfo(request)

Remove whitespace from text string

Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        RemoveWhitespaceFromTextRequest request = new RemoveWhitespaceFromTextRequest(); // RemoveWhitespaceFromTextRequest | Input request
        try {
            ApiResponse<RemoveWhitespaceFromTextResponse> response = apiInstance.editTextRemoveAllWhitespaceWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextRemoveAllWhitespace");
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
| **request** | [**RemoveWhitespaceFromTextRequest**](RemoveWhitespaceFromTextRequest.md)| Input request | |

### Return type

ApiResponse<[**RemoveWhitespaceFromTextResponse**](RemoveWhitespaceFromTextResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextRemoveHtml

> RemoveHtmlFromTextResponse editTextRemoveHtml(request)

Remove HTML from text string

Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        RemoveHtmlFromTextRequest request = new RemoveHtmlFromTextRequest(); // RemoveHtmlFromTextRequest | Input request
        try {
            RemoveHtmlFromTextResponse result = apiInstance.editTextRemoveHtml(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextRemoveHtml");
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
| **request** | [**RemoveHtmlFromTextRequest**](RemoveHtmlFromTextRequest.md)| Input request | |

### Return type

[**RemoveHtmlFromTextResponse**](RemoveHtmlFromTextResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextRemoveHtmlWithHttpInfo

> ApiResponse<RemoveHtmlFromTextResponse> editTextRemoveHtml editTextRemoveHtmlWithHttpInfo(request)

Remove HTML from text string

Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        RemoveHtmlFromTextRequest request = new RemoveHtmlFromTextRequest(); // RemoveHtmlFromTextRequest | Input request
        try {
            ApiResponse<RemoveHtmlFromTextResponse> response = apiInstance.editTextRemoveHtmlWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextRemoveHtml");
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
| **request** | [**RemoveHtmlFromTextRequest**](RemoveHtmlFromTextRequest.md)| Input request | |

### Return type

ApiResponse<[**RemoveHtmlFromTextResponse**](RemoveHtmlFromTextResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextReplaceRegex

> ReplaceStringRegexResponse editTextReplaceRegex(request)

Replace a string in text with a regex regular expression string

Replaces all occurrences of the input regular expression regex string in the input content, and returns the result

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        ReplaceStringRegexRequest request = new ReplaceStringRegexRequest(); // ReplaceStringRegexRequest | Input request
        try {
            ReplaceStringRegexResponse result = apiInstance.editTextReplaceRegex(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextReplaceRegex");
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
| **request** | [**ReplaceStringRegexRequest**](ReplaceStringRegexRequest.md)| Input request | |

### Return type

[**ReplaceStringRegexResponse**](ReplaceStringRegexResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextReplaceRegexWithHttpInfo

> ApiResponse<ReplaceStringRegexResponse> editTextReplaceRegex editTextReplaceRegexWithHttpInfo(request)

Replace a string in text with a regex regular expression string

Replaces all occurrences of the input regular expression regex string in the input content, and returns the result

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        ReplaceStringRegexRequest request = new ReplaceStringRegexRequest(); // ReplaceStringRegexRequest | Input request
        try {
            ApiResponse<ReplaceStringRegexResponse> response = apiInstance.editTextReplaceRegexWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextReplaceRegex");
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
| **request** | [**ReplaceStringRegexRequest**](ReplaceStringRegexRequest.md)| Input request | |

### Return type

ApiResponse<[**ReplaceStringRegexResponse**](ReplaceStringRegexResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextReplaceSimple

> ReplaceStringSimpleResponse editTextReplaceSimple(request)

Replace a string in text with another string value

Replaces all occurrences of the input string in the input content, and returns the result

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        ReplaceStringSimpleRequest request = new ReplaceStringSimpleRequest(); // ReplaceStringSimpleRequest | Input request
        try {
            ReplaceStringSimpleResponse result = apiInstance.editTextReplaceSimple(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextReplaceSimple");
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
| **request** | [**ReplaceStringSimpleRequest**](ReplaceStringSimpleRequest.md)| Input request | |

### Return type

[**ReplaceStringSimpleResponse**](ReplaceStringSimpleResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextReplaceSimpleWithHttpInfo

> ApiResponse<ReplaceStringSimpleResponse> editTextReplaceSimple editTextReplaceSimpleWithHttpInfo(request)

Replace a string in text with another string value

Replaces all occurrences of the input string in the input content, and returns the result

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        ReplaceStringSimpleRequest request = new ReplaceStringSimpleRequest(); // ReplaceStringSimpleRequest | Input request
        try {
            ApiResponse<ReplaceStringSimpleResponse> response = apiInstance.editTextReplaceSimpleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextReplaceSimple");
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
| **request** | [**ReplaceStringSimpleRequest**](ReplaceStringSimpleRequest.md)| Input request | |

### Return type

ApiResponse<[**ReplaceStringSimpleResponse**](ReplaceStringSimpleResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextTextEncodingDetect

> TextEncodingDetectResponse editTextTextEncodingDetect(inputFile)

Detect text encoding of file

Checks text encoding of file

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            TextEncodingDetectResponse result = apiInstance.editTextTextEncodingDetect(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextTextEncodingDetect");
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

[**TextEncodingDetectResponse**](TextEncodingDetectResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextTextEncodingDetectWithHttpInfo

> ApiResponse<TextEncodingDetectResponse> editTextTextEncodingDetect editTextTextEncodingDetectWithHttpInfo(inputFile)

Detect text encoding of file

Checks text encoding of file

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ApiResponse<TextEncodingDetectResponse> response = apiInstance.editTextTextEncodingDetectWithHttpInfo(inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextTextEncodingDetect");
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

ApiResponse<[**TextEncodingDetectResponse**](TextEncodingDetectResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## editTextTrimWhitespace

> RemoveWhitespaceFromTextResponse editTextTrimWhitespace(request)

Trim leading and trailing whitespace from text string

Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        RemoveWhitespaceFromTextRequest request = new RemoveWhitespaceFromTextRequest(); // RemoveWhitespaceFromTextRequest | Input request
        try {
            RemoveWhitespaceFromTextResponse result = apiInstance.editTextTrimWhitespace(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextTrimWhitespace");
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
| **request** | [**RemoveWhitespaceFromTextRequest**](RemoveWhitespaceFromTextRequest.md)| Input request | |

### Return type

[**RemoveWhitespaceFromTextResponse**](RemoveWhitespaceFromTextResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## editTextTrimWhitespaceWithHttpInfo

> ApiResponse<RemoveWhitespaceFromTextResponse> editTextTrimWhitespace editTextTrimWhitespaceWithHttpInfo(request)

Trim leading and trailing whitespace from text string

Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.EditTextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EditTextApi apiInstance = new EditTextApi(defaultClient);
        RemoveWhitespaceFromTextRequest request = new RemoveWhitespaceFromTextRequest(); // RemoveWhitespaceFromTextRequest | Input request
        try {
            ApiResponse<RemoveWhitespaceFromTextResponse> response = apiInstance.editTextTrimWhitespaceWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EditTextApi#editTextTrimWhitespace");
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
| **request** | [**RemoveWhitespaceFromTextRequest**](RemoveWhitespaceFromTextRequest.md)| Input request | |

### Return type

ApiResponse<[**RemoveWhitespaceFromTextResponse**](RemoveWhitespaceFromTextResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

