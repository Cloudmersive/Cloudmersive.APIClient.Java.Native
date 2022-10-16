# EmailApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**emailAddressGetServers**](EmailApi.md#emailAddressGetServers) | **POST** /validate/email/address/servers | Partially check whether an email address is valid |
| [**emailAddressGetServersWithHttpInfo**](EmailApi.md#emailAddressGetServersWithHttpInfo) | **POST** /validate/email/address/servers | Partially check whether an email address is valid |
| [**emailFullValidation**](EmailApi.md#emailFullValidation) | **POST** /validate/email/address/full | Fully validate an email address |
| [**emailFullValidationWithHttpInfo**](EmailApi.md#emailFullValidationWithHttpInfo) | **POST** /validate/email/address/full | Fully validate an email address |
| [**emailPost**](EmailApi.md#emailPost) | **POST** /validate/email/address/syntaxOnly | Validate email adddress for syntactic correctness only |
| [**emailPostWithHttpInfo**](EmailApi.md#emailPostWithHttpInfo) | **POST** /validate/email/address/syntaxOnly | Validate email adddress for syntactic correctness only |



## emailAddressGetServers

> AddressGetServersResponse emailAddressGetServers(email)

Partially check whether an email address is valid

Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String email = "email_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\".    The input is a string so be sure to enclose it in double-quotes.
        try {
            AddressGetServersResponse result = apiInstance.emailAddressGetServers(email);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailAddressGetServers");
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
| **email** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**AddressGetServersResponse**](AddressGetServersResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## emailAddressGetServersWithHttpInfo

> ApiResponse<AddressGetServersResponse> emailAddressGetServers emailAddressGetServersWithHttpInfo(email)

Partially check whether an email address is valid

Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String email = "email_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\".    The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<AddressGetServersResponse> response = apiInstance.emailAddressGetServersWithHttpInfo(email);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailAddressGetServers");
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
| **email** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**AddressGetServersResponse**](AddressGetServersResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## emailFullValidation

> FullEmailValidationResponse emailFullValidation(email)

Fully validate an email address

Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String email = "email_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\".    The input is a string so be sure to enclose it in double-quotes.
        try {
            FullEmailValidationResponse result = apiInstance.emailFullValidation(email);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailFullValidation");
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
| **email** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**FullEmailValidationResponse**](FullEmailValidationResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## emailFullValidationWithHttpInfo

> ApiResponse<FullEmailValidationResponse> emailFullValidation emailFullValidationWithHttpInfo(email)

Fully validate an email address

Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String email = "email_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\".    The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<FullEmailValidationResponse> response = apiInstance.emailFullValidationWithHttpInfo(email);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailFullValidation");
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
| **email** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**FullEmailValidationResponse**](FullEmailValidationResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## emailPost

> AddressVerifySyntaxOnlyResponse emailPost(value)

Validate email adddress for syntactic correctness only

Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String value = "value_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\".    The input is a string so be sure to enclose it in double-quotes.
        try {
            AddressVerifySyntaxOnlyResponse result = apiInstance.emailPost(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailPost");
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
| **value** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. | |

### Return type

[**AddressVerifySyntaxOnlyResponse**](AddressVerifySyntaxOnlyResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## emailPostWithHttpInfo

> ApiResponse<AddressVerifySyntaxOnlyResponse> emailPost emailPostWithHttpInfo(value)

Validate email adddress for syntactic correctness only

Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String value = "value_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\".    The input is a string so be sure to enclose it in double-quotes.
        try {
            ApiResponse<AddressVerifySyntaxOnlyResponse> response = apiInstance.emailPostWithHttpInfo(value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailPost");
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
| **value** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. | |

### Return type

ApiResponse<[**AddressVerifySyntaxOnlyResponse**](AddressVerifySyntaxOnlyResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

