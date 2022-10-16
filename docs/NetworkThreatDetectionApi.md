# NetworkThreatDetectionApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**networkThreatDetectionDetectSsrfUrl**](NetworkThreatDetectionApi.md#networkThreatDetectionDetectSsrfUrl) | **POST** /security/threat-detection/network/url/ssrf/detect | Check a URL for Server-side Request Forgery (SSRF) threats |
| [**networkThreatDetectionDetectSsrfUrlWithHttpInfo**](NetworkThreatDetectionApi.md#networkThreatDetectionDetectSsrfUrlWithHttpInfo) | **POST** /security/threat-detection/network/url/ssrf/detect | Check a URL for Server-side Request Forgery (SSRF) threats |
| [**networkThreatDetectionIsBot**](NetworkThreatDetectionApi.md#networkThreatDetectionIsBot) | **POST** /security/threat-detection/network/ip/is-bot | Check if IP address is a Bot client threat |
| [**networkThreatDetectionIsBotWithHttpInfo**](NetworkThreatDetectionApi.md#networkThreatDetectionIsBotWithHttpInfo) | **POST** /security/threat-detection/network/ip/is-bot | Check if IP address is a Bot client threat |
| [**networkThreatDetectionIsThreat**](NetworkThreatDetectionApi.md#networkThreatDetectionIsThreat) | **POST** /security/threat-detection/network/ip/is-threat | Check if IP address is a known threat |
| [**networkThreatDetectionIsThreatWithHttpInfo**](NetworkThreatDetectionApi.md#networkThreatDetectionIsThreatWithHttpInfo) | **POST** /security/threat-detection/network/ip/is-threat | Check if IP address is a known threat |
| [**networkThreatDetectionIsTorNode**](NetworkThreatDetectionApi.md#networkThreatDetectionIsTorNode) | **POST** /security/threat-detection/network/ip/is-tor-node | Check if IP address is a Tor node server |
| [**networkThreatDetectionIsTorNodeWithHttpInfo**](NetworkThreatDetectionApi.md#networkThreatDetectionIsTorNodeWithHttpInfo) | **POST** /security/threat-detection/network/ip/is-tor-node | Check if IP address is a Tor node server |



## networkThreatDetectionDetectSsrfUrl

> UrlSsrfThreatDetectionResponseFull networkThreatDetectionDetectSsrfUrl(request)

Check a URL for Server-side Request Forgery (SSRF) threats

Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        UrlSsrfThreatDetectionRequestFull request = new UrlSsrfThreatDetectionRequestFull(); // UrlSsrfThreatDetectionRequestFull | Input URL request
        try {
            UrlSsrfThreatDetectionResponseFull result = apiInstance.networkThreatDetectionDetectSsrfUrl(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionDetectSsrfUrl");
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
| **request** | [**UrlSsrfThreatDetectionRequestFull**](UrlSsrfThreatDetectionRequestFull.md)| Input URL request | |

### Return type

[**UrlSsrfThreatDetectionResponseFull**](UrlSsrfThreatDetectionResponseFull.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## networkThreatDetectionDetectSsrfUrlWithHttpInfo

> ApiResponse<UrlSsrfThreatDetectionResponseFull> networkThreatDetectionDetectSsrfUrl networkThreatDetectionDetectSsrfUrlWithHttpInfo(request)

Check a URL for Server-side Request Forgery (SSRF) threats

Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        UrlSsrfThreatDetectionRequestFull request = new UrlSsrfThreatDetectionRequestFull(); // UrlSsrfThreatDetectionRequestFull | Input URL request
        try {
            ApiResponse<UrlSsrfThreatDetectionResponseFull> response = apiInstance.networkThreatDetectionDetectSsrfUrlWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionDetectSsrfUrl");
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
| **request** | [**UrlSsrfThreatDetectionRequestFull**](UrlSsrfThreatDetectionRequestFull.md)| Input URL request | |

### Return type

ApiResponse<[**UrlSsrfThreatDetectionResponseFull**](UrlSsrfThreatDetectionResponseFull.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## networkThreatDetectionIsBot

> ThreatDetectionBotCheckResponse networkThreatDetectionIsBot(value)

Check if IP address is a Bot client threat

Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ThreatDetectionBotCheckResponse result = apiInstance.networkThreatDetectionIsBot(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionIsBot");
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
| **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**ThreatDetectionBotCheckResponse**](ThreatDetectionBotCheckResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## networkThreatDetectionIsBotWithHttpInfo

> ApiResponse<ThreatDetectionBotCheckResponse> networkThreatDetectionIsBot networkThreatDetectionIsBotWithHttpInfo(value)

Check if IP address is a Bot client threat

Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<ThreatDetectionBotCheckResponse> response = apiInstance.networkThreatDetectionIsBotWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionIsBot");
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
| **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**ThreatDetectionBotCheckResponse**](ThreatDetectionBotCheckResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## networkThreatDetectionIsThreat

> IPThreatDetectionResponse networkThreatDetectionIsThreat(value)

Check if IP address is a known threat

Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            IPThreatDetectionResponse result = apiInstance.networkThreatDetectionIsThreat(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionIsThreat");
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
| **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**IPThreatDetectionResponse**](IPThreatDetectionResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## networkThreatDetectionIsThreatWithHttpInfo

> ApiResponse<IPThreatDetectionResponse> networkThreatDetectionIsThreat networkThreatDetectionIsThreatWithHttpInfo(value)

Check if IP address is a known threat

Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<IPThreatDetectionResponse> response = apiInstance.networkThreatDetectionIsThreatWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionIsThreat");
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
| **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**IPThreatDetectionResponse**](IPThreatDetectionResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## networkThreatDetectionIsTorNode

> ThreatDetectionTorNodeResponse networkThreatDetectionIsTorNode(value)

Check if IP address is a Tor node server

Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ThreatDetectionTorNodeResponse result = apiInstance.networkThreatDetectionIsTorNode(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionIsTorNode");
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
| **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**ThreatDetectionTorNodeResponse**](ThreatDetectionTorNodeResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## networkThreatDetectionIsTorNodeWithHttpInfo

> ApiResponse<ThreatDetectionTorNodeResponse> networkThreatDetectionIsTorNode networkThreatDetectionIsTorNodeWithHttpInfo(value)

Check if IP address is a Tor node server

Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.NetworkThreatDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        NetworkThreatDetectionApi apiInstance = new NetworkThreatDetectionApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<ThreatDetectionTorNodeResponse> response = apiInstance.networkThreatDetectionIsTorNodeWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkThreatDetectionApi#networkThreatDetectionIsTorNode");
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
| **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**ThreatDetectionTorNodeResponse**](ThreatDetectionTorNodeResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

