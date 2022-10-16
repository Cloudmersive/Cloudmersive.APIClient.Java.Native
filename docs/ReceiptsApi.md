# ReceiptsApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**receiptsPhotoToCSV**](ReceiptsApi.md#receiptsPhotoToCSV) | **POST** /ocr/receipts/photo/to/csv | Convert a photo of a receipt into a CSV file containing structured information from the receipt |
| [**receiptsPhotoToCSVWithHttpInfo**](ReceiptsApi.md#receiptsPhotoToCSVWithHttpInfo) | **POST** /ocr/receipts/photo/to/csv | Convert a photo of a receipt into a CSV file containing structured information from the receipt |



## receiptsPhotoToCSV

> Object receiptsPhotoToCSV(imageFile)

Convert a photo of a receipt into a CSV file containing structured information from the receipt

Leverage Deep Learning to automatically turn a photo of a receipt into a CSV file containing the structured information from the receipt.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        File imageFile = new File("/path/to/file"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
        try {
            Object result = apiInstance.receiptsPhotoToCSV(imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#receiptsPhotoToCSV");
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
| **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | |

### Return type

**Object**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## receiptsPhotoToCSVWithHttpInfo

> ApiResponse<Object> receiptsPhotoToCSV receiptsPhotoToCSVWithHttpInfo(imageFile)

Convert a photo of a receipt into a CSV file containing structured information from the receipt

Leverage Deep Learning to automatically turn a photo of a receipt into a CSV file containing the structured information from the receipt.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        File imageFile = new File("/path/to/file"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
        try {
            ApiResponse<Object> response = apiInstance.receiptsPhotoToCSVWithHttpInfo(imageFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#receiptsPhotoToCSV");
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
| **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | |

### Return type

ApiResponse<**Object**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

