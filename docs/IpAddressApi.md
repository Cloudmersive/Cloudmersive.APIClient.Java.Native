# IpAddressApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iPAddressGeolocateStreetAddress**](IpAddressApi.md#iPAddressGeolocateStreetAddress) | **POST** /validate/ip/geolocate/street-address | Geolocate an IP address to a street address |
| [**iPAddressGeolocateStreetAddressWithHttpInfo**](IpAddressApi.md#iPAddressGeolocateStreetAddressWithHttpInfo) | **POST** /validate/ip/geolocate/street-address | Geolocate an IP address to a street address |
| [**iPAddressIpIntelligence**](IpAddressApi.md#iPAddressIpIntelligence) | **POST** /validate/ip/intelligence | Get intelligence on an IP address |
| [**iPAddressIpIntelligenceWithHttpInfo**](IpAddressApi.md#iPAddressIpIntelligenceWithHttpInfo) | **POST** /validate/ip/intelligence | Get intelligence on an IP address |
| [**iPAddressIsBot**](IpAddressApi.md#iPAddressIsBot) | **POST** /validate/ip/is-bot | Check if IP address is a Bot client |
| [**iPAddressIsBotWithHttpInfo**](IpAddressApi.md#iPAddressIsBotWithHttpInfo) | **POST** /validate/ip/is-bot | Check if IP address is a Bot client |
| [**iPAddressIsThreat**](IpAddressApi.md#iPAddressIsThreat) | **POST** /validate/ip/is-threat | Check if IP address is a known threat |
| [**iPAddressIsThreatWithHttpInfo**](IpAddressApi.md#iPAddressIsThreatWithHttpInfo) | **POST** /validate/ip/is-threat | Check if IP address is a known threat |
| [**iPAddressIsTorNode**](IpAddressApi.md#iPAddressIsTorNode) | **POST** /validate/ip/is-tor-node | Check if IP address is a Tor node server |
| [**iPAddressIsTorNodeWithHttpInfo**](IpAddressApi.md#iPAddressIsTorNodeWithHttpInfo) | **POST** /validate/ip/is-tor-node | Check if IP address is a Tor node server |
| [**iPAddressPost**](IpAddressApi.md#iPAddressPost) | **POST** /validate/ip/geolocate | Geolocate an IP address |
| [**iPAddressPostWithHttpInfo**](IpAddressApi.md#iPAddressPostWithHttpInfo) | **POST** /validate/ip/geolocate | Geolocate an IP address |
| [**iPAddressReverseDomainLookup**](IpAddressApi.md#iPAddressReverseDomainLookup) | **POST** /validate/ip/reverse-domain-lookup | Perform a reverse domain name (DNS) lookup on an IP address |
| [**iPAddressReverseDomainLookupWithHttpInfo**](IpAddressApi.md#iPAddressReverseDomainLookupWithHttpInfo) | **POST** /validate/ip/reverse-domain-lookup | Perform a reverse domain name (DNS) lookup on an IP address |



## iPAddressGeolocateStreetAddress

> GeolocateStreetAddressResponse iPAddressGeolocateStreetAddress(value)

Geolocate an IP address to a street address

Identify an IP address&#39;s street address.  Useful for security and UX applications.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            GeolocateStreetAddressResponse result = apiInstance.iPAddressGeolocateStreetAddress(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressGeolocateStreetAddress");
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
| **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**GeolocateStreetAddressResponse**](GeolocateStreetAddressResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressGeolocateStreetAddressWithHttpInfo

> ApiResponse<GeolocateStreetAddressResponse> iPAddressGeolocateStreetAddress iPAddressGeolocateStreetAddressWithHttpInfo(value)

Geolocate an IP address to a street address

Identify an IP address&#39;s street address.  Useful for security and UX applications.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<GeolocateStreetAddressResponse> response = apiInstance.iPAddressGeolocateStreetAddressWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressGeolocateStreetAddress");
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
| **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**GeolocateStreetAddressResponse**](GeolocateStreetAddressResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## iPAddressIpIntelligence

> IPIntelligenceResponse iPAddressIpIntelligence(value)

Get intelligence on an IP address

Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to process, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            IPIntelligenceResponse result = apiInstance.iPAddressIpIntelligence(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIpIntelligence");
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
| **value** | **String**| IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**IPIntelligenceResponse**](IPIntelligenceResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressIpIntelligenceWithHttpInfo

> ApiResponse<IPIntelligenceResponse> iPAddressIpIntelligence iPAddressIpIntelligenceWithHttpInfo(value)

Get intelligence on an IP address

Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to process, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<IPIntelligenceResponse> response = apiInstance.iPAddressIpIntelligenceWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIpIntelligence");
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
| **value** | **String**| IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**IPIntelligenceResponse**](IPIntelligenceResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## iPAddressIsBot

> BotCheckResponse iPAddressIsBot(value)

Check if IP address is a Bot client

Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            BotCheckResponse result = apiInstance.iPAddressIsBot(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIsBot");
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

[**BotCheckResponse**](BotCheckResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressIsBotWithHttpInfo

> ApiResponse<BotCheckResponse> iPAddressIsBot iPAddressIsBotWithHttpInfo(value)

Check if IP address is a Bot client

Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<BotCheckResponse> response = apiInstance.iPAddressIsBotWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIsBot");
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

ApiResponse<[**BotCheckResponse**](BotCheckResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## iPAddressIsThreat

> IPThreatResponse iPAddressIsThreat(value)

Check if IP address is a known threat

Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            IPThreatResponse result = apiInstance.iPAddressIsThreat(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIsThreat");
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

[**IPThreatResponse**](IPThreatResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressIsThreatWithHttpInfo

> ApiResponse<IPThreatResponse> iPAddressIsThreat iPAddressIsThreatWithHttpInfo(value)

Check if IP address is a known threat

Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<IPThreatResponse> response = apiInstance.iPAddressIsThreatWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIsThreat");
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

ApiResponse<[**IPThreatResponse**](IPThreatResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## iPAddressIsTorNode

> TorNodeResponse iPAddressIsTorNode(value)

Check if IP address is a Tor node server

Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            TorNodeResponse result = apiInstance.iPAddressIsTorNode(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIsTorNode");
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

[**TorNodeResponse**](TorNodeResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressIsTorNodeWithHttpInfo

> ApiResponse<TorNodeResponse> iPAddressIsTorNode iPAddressIsTorNodeWithHttpInfo(value)

Check if IP address is a Tor node server

Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<TorNodeResponse> response = apiInstance.iPAddressIsTorNodeWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressIsTorNode");
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

ApiResponse<[**TorNodeResponse**](TorNodeResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## iPAddressPost

> GeolocateResponse iPAddressPost(value)

Geolocate an IP address

Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            GeolocateResponse result = apiInstance.iPAddressPost(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressPost");
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
| **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**GeolocateResponse**](GeolocateResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressPostWithHttpInfo

> ApiResponse<GeolocateResponse> iPAddressPost iPAddressPostWithHttpInfo(value)

Geolocate an IP address

Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<GeolocateResponse> response = apiInstance.iPAddressPostWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressPost");
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
| **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**GeolocateResponse**](GeolocateResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## iPAddressReverseDomainLookup

> IPReverseDNSLookupResponse iPAddressReverseDomainLookup(value)

Perform a reverse domain name (DNS) lookup on an IP address

Gets the domain name, if any, associated with the IP address.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            IPReverseDNSLookupResponse result = apiInstance.iPAddressReverseDomainLookup(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressReverseDomainLookup");
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

[**IPReverseDNSLookupResponse**](IPReverseDNSLookupResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## iPAddressReverseDomainLookupWithHttpInfo

> ApiResponse<IPReverseDNSLookupResponse> iPAddressReverseDomainLookup iPAddressReverseDomainLookupWithHttpInfo(value)

Perform a reverse domain name (DNS) lookup on an IP address

Gets the domain name, if any, associated with the IP address.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.IpAddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        IpAddressApi apiInstance = new IpAddressApi(defaultClient);
        String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<IPReverseDNSLookupResponse> response = apiInstance.iPAddressReverseDomainLookupWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressApi#iPAddressReverseDomainLookup");
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

ApiResponse<[**IPReverseDNSLookupResponse**](IPReverseDNSLookupResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

