# CurrencyExchangeApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currencyExchangeConvertCurrency**](CurrencyExchangeApi.md#currencyExchangeConvertCurrency) | **POST** /currency/exchange-rates/convert/{source}/to/{destination} | Converts a price from the source currency into the destination currency |
| [**currencyExchangeConvertCurrencyWithHttpInfo**](CurrencyExchangeApi.md#currencyExchangeConvertCurrencyWithHttpInfo) | **POST** /currency/exchange-rates/convert/{source}/to/{destination} | Converts a price from the source currency into the destination currency |
| [**currencyExchangeGetAvailableCurrencies**](CurrencyExchangeApi.md#currencyExchangeGetAvailableCurrencies) | **POST** /currency/exchange-rates/list-available | Get a list of available currencies and corresponding countries |
| [**currencyExchangeGetAvailableCurrenciesWithHttpInfo**](CurrencyExchangeApi.md#currencyExchangeGetAvailableCurrenciesWithHttpInfo) | **POST** /currency/exchange-rates/list-available | Get a list of available currencies and corresponding countries |
| [**currencyExchangeGetExchangeRate**](CurrencyExchangeApi.md#currencyExchangeGetExchangeRate) | **POST** /currency/exchange-rates/get/{source}/to/{destination} | Gets the exchange rate from the source currency into the destination currency |
| [**currencyExchangeGetExchangeRateWithHttpInfo**](CurrencyExchangeApi.md#currencyExchangeGetExchangeRateWithHttpInfo) | **POST** /currency/exchange-rates/get/{source}/to/{destination} | Gets the exchange rate from the source currency into the destination currency |



## currencyExchangeConvertCurrency

> ConvertedCurrencyResult currencyExchangeConvertCurrency(source, destination, sourcePrice)

Converts a price from the source currency into the destination currency

Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.CurrencyExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        String source = "source_example"; // String | Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        String destination = "destination_example"; // String | Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        Double sourcePrice = 3.4D; // Double | Input price, such as 19.99 in source currency
        try {
            ConvertedCurrencyResult result = apiInstance.currencyExchangeConvertCurrency(source, destination, sourcePrice);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeConvertCurrency");
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
| **source** | **String**| Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |
| **destination** | **String**| Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |
| **sourcePrice** | **Double**| Input price, such as 19.99 in source currency | |

### Return type

[**ConvertedCurrencyResult**](ConvertedCurrencyResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currencyExchangeConvertCurrencyWithHttpInfo

> ApiResponse<ConvertedCurrencyResult> currencyExchangeConvertCurrency currencyExchangeConvertCurrencyWithHttpInfo(source, destination, sourcePrice)

Converts a price from the source currency into the destination currency

Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.CurrencyExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        String source = "source_example"; // String | Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        String destination = "destination_example"; // String | Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        Double sourcePrice = 3.4D; // Double | Input price, such as 19.99 in source currency
        try {
            ApiResponse<ConvertedCurrencyResult> response = apiInstance.currencyExchangeConvertCurrencyWithHttpInfo(source, destination, sourcePrice);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeConvertCurrency");
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
| **source** | **String**| Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |
| **destination** | **String**| Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |
| **sourcePrice** | **Double**| Input price, such as 19.99 in source currency | |

### Return type

ApiResponse<[**ConvertedCurrencyResult**](ConvertedCurrencyResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## currencyExchangeGetAvailableCurrencies

> AvailableCurrencyResponse currencyExchangeGetAvailableCurrencies()

Get a list of available currencies and corresponding countries

Enumerates available currencies and the countries that correspond to these currencies.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.CurrencyExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        try {
            AvailableCurrencyResponse result = apiInstance.currencyExchangeGetAvailableCurrencies();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeGetAvailableCurrencies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AvailableCurrencyResponse**](AvailableCurrencyResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currencyExchangeGetAvailableCurrenciesWithHttpInfo

> ApiResponse<AvailableCurrencyResponse> currencyExchangeGetAvailableCurrencies currencyExchangeGetAvailableCurrenciesWithHttpInfo()

Get a list of available currencies and corresponding countries

Enumerates available currencies and the countries that correspond to these currencies.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.CurrencyExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        try {
            ApiResponse<AvailableCurrencyResponse> response = apiInstance.currencyExchangeGetAvailableCurrenciesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeGetAvailableCurrencies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**AvailableCurrencyResponse**](AvailableCurrencyResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## currencyExchangeGetExchangeRate

> ExchangeRateResult currencyExchangeGetExchangeRate(source, destination)

Gets the exchange rate from the source currency into the destination currency

Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.CurrencyExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        String source = "source_example"; // String | Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        String destination = "destination_example"; // String | Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        try {
            ExchangeRateResult result = apiInstance.currencyExchangeGetExchangeRate(source, destination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeGetExchangeRate");
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
| **source** | **String**| Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |
| **destination** | **String**| Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |

### Return type

[**ExchangeRateResult**](ExchangeRateResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currencyExchangeGetExchangeRateWithHttpInfo

> ApiResponse<ExchangeRateResult> currencyExchangeGetExchangeRate currencyExchangeGetExchangeRateWithHttpInfo(source, destination)

Gets the exchange rate from the source currency into the destination currency

Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.CurrencyExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CurrencyExchangeApi apiInstance = new CurrencyExchangeApi(defaultClient);
        String source = "source_example"; // String | Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        String destination = "destination_example"; // String | Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
        try {
            ApiResponse<ExchangeRateResult> response = apiInstance.currencyExchangeGetExchangeRateWithHttpInfo(source, destination);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyExchangeApi#currencyExchangeGetExchangeRate");
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
| **source** | **String**| Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |
| **destination** | **String**| Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. | |

### Return type

ApiResponse<[**ExchangeRateResult**](ExchangeRateResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

