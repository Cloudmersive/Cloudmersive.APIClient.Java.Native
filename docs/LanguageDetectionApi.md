# LanguageDetectionApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**languageDetectionGetLanguage**](LanguageDetectionApi.md#languageDetectionGetLanguage) | **POST** /nlp-v2/language/detect | Detect language of text |
| [**languageDetectionGetLanguageWithHttpInfo**](LanguageDetectionApi.md#languageDetectionGetLanguageWithHttpInfo) | **POST** /nlp-v2/language/detect | Detect language of text |



## languageDetectionGetLanguage

> LanguageDetectionResponse languageDetectionGetLanguage(input)

Detect language of text

Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.LanguageDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        LanguageDetectionApi apiInstance = new LanguageDetectionApi(defaultClient);
        LanguageDetectionRequest input = new LanguageDetectionRequest(); // LanguageDetectionRequest | 
        try {
            LanguageDetectionResponse result = apiInstance.languageDetectionGetLanguage(input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguageDetectionApi#languageDetectionGetLanguage");
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
| **input** | [**LanguageDetectionRequest**](LanguageDetectionRequest.md)|  | |

### Return type

[**LanguageDetectionResponse**](LanguageDetectionResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## languageDetectionGetLanguageWithHttpInfo

> ApiResponse<LanguageDetectionResponse> languageDetectionGetLanguage languageDetectionGetLanguageWithHttpInfo(input)

Detect language of text

Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.LanguageDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        LanguageDetectionApi apiInstance = new LanguageDetectionApi(defaultClient);
        LanguageDetectionRequest input = new LanguageDetectionRequest(); // LanguageDetectionRequest | 
        try {
            ApiResponse<LanguageDetectionResponse> response = apiInstance.languageDetectionGetLanguageWithHttpInfo(input);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LanguageDetectionApi#languageDetectionGetLanguage");
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
| **input** | [**LanguageDetectionRequest**](LanguageDetectionRequest.md)|  | |

### Return type

ApiResponse<[**LanguageDetectionResponse**](LanguageDetectionResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

