# ConvertWebApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertWebHtmlToDocx**](ConvertWebApi.md#convertWebHtmlToDocx) | **POST** /convert/html/to/docx | Convert HTML to Word DOCX Document |
| [**convertWebHtmlToDocxWithHttpInfo**](ConvertWebApi.md#convertWebHtmlToDocxWithHttpInfo) | **POST** /convert/html/to/docx | Convert HTML to Word DOCX Document |
| [**convertWebHtmlToPdf**](ConvertWebApi.md#convertWebHtmlToPdf) | **POST** /convert/web/html/to/pdf | Convert HTML string to PDF |
| [**convertWebHtmlToPdfWithHttpInfo**](ConvertWebApi.md#convertWebHtmlToPdfWithHttpInfo) | **POST** /convert/web/html/to/pdf | Convert HTML string to PDF |
| [**convertWebHtmlToPng**](ConvertWebApi.md#convertWebHtmlToPng) | **POST** /convert/web/html/to/png | Convert HTML string to PNG screenshot |
| [**convertWebHtmlToPngWithHttpInfo**](ConvertWebApi.md#convertWebHtmlToPngWithHttpInfo) | **POST** /convert/web/html/to/png | Convert HTML string to PNG screenshot |
| [**convertWebHtmlToTxt**](ConvertWebApi.md#convertWebHtmlToTxt) | **POST** /convert/web/html/to/txt | Convert HTML string to text (txt) |
| [**convertWebHtmlToTxtWithHttpInfo**](ConvertWebApi.md#convertWebHtmlToTxtWithHttpInfo) | **POST** /convert/web/html/to/txt | Convert HTML string to text (txt) |
| [**convertWebMdToHtml**](ConvertWebApi.md#convertWebMdToHtml) | **POST** /convert/web/md/to/html | Convert Markdown to HTML |
| [**convertWebMdToHtmlWithHttpInfo**](ConvertWebApi.md#convertWebMdToHtmlWithHttpInfo) | **POST** /convert/web/md/to/html | Convert Markdown to HTML |
| [**convertWebUrlToPdf**](ConvertWebApi.md#convertWebUrlToPdf) | **POST** /convert/web/url/to/pdf | Convert a URL to PDF |
| [**convertWebUrlToPdfWithHttpInfo**](ConvertWebApi.md#convertWebUrlToPdfWithHttpInfo) | **POST** /convert/web/url/to/pdf | Convert a URL to PDF |
| [**convertWebUrlToScreenshot**](ConvertWebApi.md#convertWebUrlToScreenshot) | **POST** /convert/web/url/to/screenshot | Take screenshot of URL |
| [**convertWebUrlToScreenshotWithHttpInfo**](ConvertWebApi.md#convertWebUrlToScreenshotWithHttpInfo) | **POST** /convert/web/url/to/screenshot | Take screenshot of URL |
| [**convertWebUrlToTxt**](ConvertWebApi.md#convertWebUrlToTxt) | **POST** /convert/web/url/to/txt | Convert website URL page to text (txt) |
| [**convertWebUrlToTxtWithHttpInfo**](ConvertWebApi.md#convertWebUrlToTxtWithHttpInfo) | **POST** /convert/web/url/to/txt | Convert website URL page to text (txt) |



## convertWebHtmlToDocx

> byte[] convertWebHtmlToDocx(inputRequest)

Convert HTML to Word DOCX Document

Convert HTML to Office Word Document (DOCX) format

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToOfficeRequest inputRequest = new HtmlToOfficeRequest(); // HtmlToOfficeRequest | HTML input to convert to DOCX
        try {
            byte[] result = apiInstance.convertWebHtmlToDocx(inputRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToDocx");
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
| **inputRequest** | [**HtmlToOfficeRequest**](HtmlToOfficeRequest.md)| HTML input to convert to DOCX | |

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

## convertWebHtmlToDocxWithHttpInfo

> ApiResponse<byte[]> convertWebHtmlToDocx convertWebHtmlToDocxWithHttpInfo(inputRequest)

Convert HTML to Word DOCX Document

Convert HTML to Office Word Document (DOCX) format

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToOfficeRequest inputRequest = new HtmlToOfficeRequest(); // HtmlToOfficeRequest | HTML input to convert to DOCX
        try {
            ApiResponse<byte[]> response = apiInstance.convertWebHtmlToDocxWithHttpInfo(inputRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToDocx");
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
| **inputRequest** | [**HtmlToOfficeRequest**](HtmlToOfficeRequest.md)| HTML input to convert to DOCX | |

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


## convertWebHtmlToPdf

> byte[] convertWebHtmlToPdf(input)

Convert HTML string to PDF

Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToPdfRequest input = new HtmlToPdfRequest(); // HtmlToPdfRequest | HTML to PDF request parameters
        try {
            byte[] result = apiInstance.convertWebHtmlToPdf(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPdf");
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
| **input** | [**HtmlToPdfRequest**](HtmlToPdfRequest.md)| HTML to PDF request parameters | |

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

## convertWebHtmlToPdfWithHttpInfo

> ApiResponse<byte[]> convertWebHtmlToPdf convertWebHtmlToPdfWithHttpInfo(input)

Convert HTML string to PDF

Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToPdfRequest input = new HtmlToPdfRequest(); // HtmlToPdfRequest | HTML to PDF request parameters
        try {
            ApiResponse<byte[]> response = apiInstance.convertWebHtmlToPdfWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPdf");
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
| **input** | [**HtmlToPdfRequest**](HtmlToPdfRequest.md)| HTML to PDF request parameters | |

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


## convertWebHtmlToPng

> byte[] convertWebHtmlToPng(input)

Convert HTML string to PNG screenshot

Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToPngRequest input = new HtmlToPngRequest(); // HtmlToPngRequest | HTML to PNG request parameters
        try {
            byte[] result = apiInstance.convertWebHtmlToPng(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPng");
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
| **input** | [**HtmlToPngRequest**](HtmlToPngRequest.md)| HTML to PNG request parameters | |

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

## convertWebHtmlToPngWithHttpInfo

> ApiResponse<byte[]> convertWebHtmlToPng convertWebHtmlToPngWithHttpInfo(input)

Convert HTML string to PNG screenshot

Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToPngRequest input = new HtmlToPngRequest(); // HtmlToPngRequest | HTML to PNG request parameters
        try {
            ApiResponse<byte[]> response = apiInstance.convertWebHtmlToPngWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPng");
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
| **input** | [**HtmlToPngRequest**](HtmlToPngRequest.md)| HTML to PNG request parameters | |

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


## convertWebHtmlToTxt

> HtmlToTextResponse convertWebHtmlToTxt(input)

Convert HTML string to text (txt)

Converts an HTML string input into text (txt); extracts text from HTML

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToTextRequest input = new HtmlToTextRequest(); // HtmlToTextRequest | HTML to Text request parameters
        try {
            HtmlToTextResponse result = apiInstance.convertWebHtmlToTxt(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToTxt");
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
| **input** | [**HtmlToTextRequest**](HtmlToTextRequest.md)| HTML to Text request parameters | |

### Return type

[**HtmlToTextResponse**](HtmlToTextResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## convertWebHtmlToTxtWithHttpInfo

> ApiResponse<HtmlToTextResponse> convertWebHtmlToTxt convertWebHtmlToTxtWithHttpInfo(input)

Convert HTML string to text (txt)

Converts an HTML string input into text (txt); extracts text from HTML

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        HtmlToTextRequest input = new HtmlToTextRequest(); // HtmlToTextRequest | HTML to Text request parameters
        try {
            ApiResponse<HtmlToTextResponse> response = apiInstance.convertWebHtmlToTxtWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToTxt");
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
| **input** | [**HtmlToTextRequest**](HtmlToTextRequest.md)| HTML to Text request parameters | |

### Return type

ApiResponse<[**HtmlToTextResponse**](HtmlToTextResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## convertWebMdToHtml

> HtmlMdResult convertWebMdToHtml(inputFile)

Convert Markdown to HTML

Convert a markdown file (.md) to HTML

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            HtmlMdResult result = apiInstance.convertWebMdToHtml(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebMdToHtml");
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

[**HtmlMdResult**](HtmlMdResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## convertWebMdToHtmlWithHttpInfo

> ApiResponse<HtmlMdResult> convertWebMdToHtml convertWebMdToHtmlWithHttpInfo(inputFile)

Convert Markdown to HTML

Convert a markdown file (.md) to HTML

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on.
        try {
            ApiResponse<HtmlMdResult> response = apiInstance.convertWebMdToHtmlWithHttpInfo(inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebMdToHtml");
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

ApiResponse<[**HtmlMdResult**](HtmlMdResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## convertWebUrlToPdf

> byte[] convertWebUrlToPdf(input)

Convert a URL to PDF

Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        UrlToPdfRequest input = new UrlToPdfRequest(); // UrlToPdfRequest | URL to PDF request parameters
        try {
            byte[] result = apiInstance.convertWebUrlToPdf(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebUrlToPdf");
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
| **input** | [**UrlToPdfRequest**](UrlToPdfRequest.md)| URL to PDF request parameters | |

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

## convertWebUrlToPdfWithHttpInfo

> ApiResponse<byte[]> convertWebUrlToPdf convertWebUrlToPdfWithHttpInfo(input)

Convert a URL to PDF

Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        UrlToPdfRequest input = new UrlToPdfRequest(); // UrlToPdfRequest | URL to PDF request parameters
        try {
            ApiResponse<byte[]> response = apiInstance.convertWebUrlToPdfWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebUrlToPdf");
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
| **input** | [**UrlToPdfRequest**](UrlToPdfRequest.md)| URL to PDF request parameters | |

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


## convertWebUrlToScreenshot

> byte[] convertWebUrlToScreenshot(input)

Take screenshot of URL

Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | Screenshot request parameters
        try {
            byte[] result = apiInstance.convertWebUrlToScreenshot(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebUrlToScreenshot");
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
| **input** | [**ScreenshotRequest**](ScreenshotRequest.md)| Screenshot request parameters | |

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

## convertWebUrlToScreenshotWithHttpInfo

> ApiResponse<byte[]> convertWebUrlToScreenshot convertWebUrlToScreenshotWithHttpInfo(input)

Take screenshot of URL

Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | Screenshot request parameters
        try {
            ApiResponse<byte[]> response = apiInstance.convertWebUrlToScreenshotWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebUrlToScreenshot");
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
| **input** | [**ScreenshotRequest**](ScreenshotRequest.md)| Screenshot request parameters | |

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


## convertWebUrlToTxt

> UrlToTextResponse convertWebUrlToTxt(input)

Convert website URL page to text (txt)

Converts a website URL page into text (txt); extracts text from HTML

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        UrlToTextRequest input = new UrlToTextRequest(); // UrlToTextRequest | HTML to Text request parameters
        try {
            UrlToTextResponse result = apiInstance.convertWebUrlToTxt(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebUrlToTxt");
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
| **input** | [**UrlToTextRequest**](UrlToTextRequest.md)| HTML to Text request parameters | |

### Return type

[**UrlToTextResponse**](UrlToTextResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## convertWebUrlToTxtWithHttpInfo

> ApiResponse<UrlToTextResponse> convertWebUrlToTxt convertWebUrlToTxtWithHttpInfo(input)

Convert website URL page to text (txt)

Converts a website URL page into text (txt); extracts text from HTML

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ConvertWebApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ConvertWebApi apiInstance = new ConvertWebApi(defaultClient);
        UrlToTextRequest input = new UrlToTextRequest(); // UrlToTextRequest | HTML to Text request parameters
        try {
            ApiResponse<UrlToTextResponse> response = apiInstance.convertWebUrlToTxtWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertWebApi#convertWebUrlToTxt");
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
| **input** | [**UrlToTextRequest**](UrlToTextRequest.md)| HTML to Text request parameters | |

### Return type

ApiResponse<[**UrlToTextResponse**](UrlToTextResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

