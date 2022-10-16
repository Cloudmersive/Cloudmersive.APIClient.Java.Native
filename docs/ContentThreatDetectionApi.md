# ContentThreatDetectionApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contentThreatDetectionAutomaticThreatDetectionString**](ContentThreatDetectionApi.md#contentThreatDetectionAutomaticThreatDetectionString) | **POST** /security/threat-detection/content/automatic/detect/string | Automatically detect threats in an input string |
| [**contentThreatDetectionAutomaticThreatDetectionStringWithHttpInfo**](ContentThreatDetectionApi.md#contentThreatDetectionAutomaticThreatDetectionStringWithHttpInfo) | **POST** /security/threat-detection/content/automatic/detect/string | Automatically detect threats in an input string |
| [**contentThreatDetectionCheckSqlInjectionString**](ContentThreatDetectionApi.md#contentThreatDetectionCheckSqlInjectionString) | **POST** /security/threat-detection/content/sql-injection/detect/string | Check text input for SQL Injection (SQLI) attacks |
| [**contentThreatDetectionCheckSqlInjectionStringWithHttpInfo**](ContentThreatDetectionApi.md#contentThreatDetectionCheckSqlInjectionStringWithHttpInfo) | **POST** /security/threat-detection/content/sql-injection/detect/string | Check text input for SQL Injection (SQLI) attacks |
| [**contentThreatDetectionCheckXxe**](ContentThreatDetectionApi.md#contentThreatDetectionCheckXxe) | **POST** /security/threat-detection/content/xxe/detect/xml/string | Protect text input from XML External Entity (XXE) attacks |
| [**contentThreatDetectionCheckXxeWithHttpInfo**](ContentThreatDetectionApi.md#contentThreatDetectionCheckXxeWithHttpInfo) | **POST** /security/threat-detection/content/xxe/detect/xml/string | Protect text input from XML External Entity (XXE) attacks |
| [**contentThreatDetectionDetectInsecureDeserializationJsonString**](ContentThreatDetectionApi.md#contentThreatDetectionDetectInsecureDeserializationJsonString) | **POST** /security/threat-detection/content/insecure-deserialization/json/detect/string | Detect Insecure Deserialization JSON (JID) attacks in a string |
| [**contentThreatDetectionDetectInsecureDeserializationJsonStringWithHttpInfo**](ContentThreatDetectionApi.md#contentThreatDetectionDetectInsecureDeserializationJsonStringWithHttpInfo) | **POST** /security/threat-detection/content/insecure-deserialization/json/detect/string | Detect Insecure Deserialization JSON (JID) attacks in a string |
| [**contentThreatDetectionProtectXss**](ContentThreatDetectionApi.md#contentThreatDetectionProtectXss) | **POST** /security/threat-detection/content/xss/detect/string | Protect text input from Cross-Site-Scripting (XSS) attacks through normalization |
| [**contentThreatDetectionProtectXssWithHttpInfo**](ContentThreatDetectionApi.md#contentThreatDetectionProtectXssWithHttpInfo) | **POST** /security/threat-detection/content/xss/detect/string | Protect text input from Cross-Site-Scripting (XSS) attacks through normalization |



## contentThreatDetectionAutomaticThreatDetectionString

> StringAutomaticThreatDetection contentThreatDetectionAutomaticThreatDetectionString(value)

Automatically detect threats in an input string

Auto-detects a wide range of threat types in input string, including Cross-Site Scripting (XSS), SQL Injection (SQLI), XML External Entitites (XXE), Server-side Request Forgeries (SSRF), and JSON Insecure Deserialization (JID).

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            StringAutomaticThreatDetection result = apiInstance.contentThreatDetectionAutomaticThreatDetectionString(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionAutomaticThreatDetectionString");
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
| **value** | **String**| User-facing text input. | |

### Return type

[**StringAutomaticThreatDetection**](StringAutomaticThreatDetection.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## contentThreatDetectionAutomaticThreatDetectionStringWithHttpInfo

> ApiResponse<StringAutomaticThreatDetection> contentThreatDetectionAutomaticThreatDetectionString contentThreatDetectionAutomaticThreatDetectionStringWithHttpInfo(value)

Automatically detect threats in an input string

Auto-detects a wide range of threat types in input string, including Cross-Site Scripting (XSS), SQL Injection (SQLI), XML External Entitites (XXE), Server-side Request Forgeries (SSRF), and JSON Insecure Deserialization (JID).

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            ApiResponse<StringAutomaticThreatDetection> response = apiInstance.contentThreatDetectionAutomaticThreatDetectionStringWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionAutomaticThreatDetectionString");
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
| **value** | **String**| User-facing text input. | |

### Return type

ApiResponse<[**StringAutomaticThreatDetection**](StringAutomaticThreatDetection.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## contentThreatDetectionCheckSqlInjectionString

> StringSqlInjectionDetectionResult contentThreatDetectionCheckSqlInjectionString(value)

Check text input for SQL Injection (SQLI) attacks

Detects SQL Injection (SQLI) attacks from text input.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            StringSqlInjectionDetectionResult result = apiInstance.contentThreatDetectionCheckSqlInjectionString(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionCheckSqlInjectionString");
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
| **value** | **String**| User-facing text input. | |

### Return type

[**StringSqlInjectionDetectionResult**](StringSqlInjectionDetectionResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## contentThreatDetectionCheckSqlInjectionStringWithHttpInfo

> ApiResponse<StringSqlInjectionDetectionResult> contentThreatDetectionCheckSqlInjectionString contentThreatDetectionCheckSqlInjectionStringWithHttpInfo(value)

Check text input for SQL Injection (SQLI) attacks

Detects SQL Injection (SQLI) attacks from text input.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            ApiResponse<StringSqlInjectionDetectionResult> response = apiInstance.contentThreatDetectionCheckSqlInjectionStringWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionCheckSqlInjectionString");
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
| **value** | **String**| User-facing text input. | |

### Return type

ApiResponse<[**StringSqlInjectionDetectionResult**](StringSqlInjectionDetectionResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## contentThreatDetectionCheckXxe

> StringXxeDetectionResult contentThreatDetectionCheckXxe(value)

Protect text input from XML External Entity (XXE) attacks

Detects XXE (XML External Entity) attacks from XML text input.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            StringXxeDetectionResult result = apiInstance.contentThreatDetectionCheckXxe(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionCheckXxe");
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
| **value** | **String**| User-facing text input. | |

### Return type

[**StringXxeDetectionResult**](StringXxeDetectionResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## contentThreatDetectionCheckXxeWithHttpInfo

> ApiResponse<StringXxeDetectionResult> contentThreatDetectionCheckXxe contentThreatDetectionCheckXxeWithHttpInfo(value)

Protect text input from XML External Entity (XXE) attacks

Detects XXE (XML External Entity) attacks from XML text input.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            ApiResponse<StringXxeDetectionResult> response = apiInstance.contentThreatDetectionCheckXxeWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionCheckXxe");
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
| **value** | **String**| User-facing text input. | |

### Return type

ApiResponse<[**StringXxeDetectionResult**](StringXxeDetectionResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## contentThreatDetectionDetectInsecureDeserializationJsonString

> StringInsecureDeserializationJsonDetection contentThreatDetectionDetectInsecureDeserializationJsonString(value)

Detect Insecure Deserialization JSON (JID) attacks in a string

Detects Insecure Deserialization JSON (JID) attacks from text input.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            StringInsecureDeserializationJsonDetection result = apiInstance.contentThreatDetectionDetectInsecureDeserializationJsonString(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionDetectInsecureDeserializationJsonString");
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
| **value** | **String**| User-facing text input. | |

### Return type

[**StringInsecureDeserializationJsonDetection**](StringInsecureDeserializationJsonDetection.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## contentThreatDetectionDetectInsecureDeserializationJsonStringWithHttpInfo

> ApiResponse<StringInsecureDeserializationJsonDetection> contentThreatDetectionDetectInsecureDeserializationJsonString contentThreatDetectionDetectInsecureDeserializationJsonStringWithHttpInfo(value)

Detect Insecure Deserialization JSON (JID) attacks in a string

Detects Insecure Deserialization JSON (JID) attacks from text input.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            ApiResponse<StringInsecureDeserializationJsonDetection> response = apiInstance.contentThreatDetectionDetectInsecureDeserializationJsonStringWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionDetectInsecureDeserializationJsonString");
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
| **value** | **String**| User-facing text input. | |

### Return type

ApiResponse<[**StringInsecureDeserializationJsonDetection**](StringInsecureDeserializationJsonDetection.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## contentThreatDetectionProtectXss

> StringXssProtectionResult contentThreatDetectionProtectXss(value)

Protect text input from Cross-Site-Scripting (XSS) attacks through normalization

Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            StringXssProtectionResult result = apiInstance.contentThreatDetectionProtectXss(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionProtectXss");
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
| **value** | **String**| User-facing text input. | |

### Return type

[**StringXssProtectionResult**](StringXssProtectionResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## contentThreatDetectionProtectXssWithHttpInfo

> ApiResponse<StringXssProtectionResult> contentThreatDetectionProtectXss contentThreatDetectionProtectXssWithHttpInfo(value)

Protect text input from Cross-Site-Scripting (XSS) attacks through normalization

Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.ContentThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ContentThreatDetectionApi apiInstance = new ContentThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | User-facing text input.
        try {
            ApiResponse<StringXssProtectionResult> response = apiInstance.contentThreatDetectionProtectXssWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentThreatDetectionApi#contentThreatDetectionProtectXss");
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
| **value** | **String**| User-facing text input. | |

### Return type

ApiResponse<[**StringXssProtectionResult**](StringXssProtectionResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

