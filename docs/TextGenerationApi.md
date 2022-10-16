# TextGenerationApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**textGenerationCreateHandwritingPng**](TextGenerationApi.md#textGenerationCreateHandwritingPng) | **POST** /image/text/create/handwriting/png | Create an image of handwriting in PNG format |
| [**textGenerationCreateHandwritingPngWithHttpInfo**](TextGenerationApi.md#textGenerationCreateHandwritingPngWithHttpInfo) | **POST** /image/text/create/handwriting/png | Create an image of handwriting in PNG format |



## textGenerationCreateHandwritingPng

> Object textGenerationCreateHandwritingPng(request)

Create an image of handwriting in PNG format

Uses Deep Learning to generate realistic handwriting and returns the result as a PNG image

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.TextGenerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TextGenerationApi apiInstance = new TextGenerationApi(defaultClient);
        CreateHandwritingRequest request = new CreateHandwritingRequest(); // CreateHandwritingRequest | Draw text parameters
        try {
            Object result = apiInstance.textGenerationCreateHandwritingPng(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextGenerationApi#textGenerationCreateHandwritingPng");
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
| **request** | [**CreateHandwritingRequest**](CreateHandwritingRequest.md)| Draw text parameters | |

### Return type

**Object**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## textGenerationCreateHandwritingPngWithHttpInfo

> ApiResponse<Object> textGenerationCreateHandwritingPng textGenerationCreateHandwritingPngWithHttpInfo(request)

Create an image of handwriting in PNG format

Uses Deep Learning to generate realistic handwriting and returns the result as a PNG image

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.TextGenerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        TextGenerationApi apiInstance = new TextGenerationApi(defaultClient);
        CreateHandwritingRequest request = new CreateHandwritingRequest(); // CreateHandwritingRequest | Draw text parameters
        try {
            ApiResponse<Object> response = apiInstance.textGenerationCreateHandwritingPngWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TextGenerationApi#textGenerationCreateHandwritingPng");
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
| **request** | [**CreateHandwritingRequest**](CreateHandwritingRequest.md)| Draw text parameters | |

### Return type

ApiResponse<**Object**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

