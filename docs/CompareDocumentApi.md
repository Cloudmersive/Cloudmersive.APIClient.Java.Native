# CompareDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compareDocumentDocx**](CompareDocumentApi.md#compareDocumentDocx) | **POST** /convert/compare/docx | Compare Two Word DOCX |
| [**compareDocumentDocxWithHttpInfo**](CompareDocumentApi.md#compareDocumentDocxWithHttpInfo) | **POST** /convert/compare/docx | Compare Two Word DOCX |



## compareDocumentDocx

> byte[] compareDocumentDocx(inputFile1, inputFile2)

Compare Two Word DOCX

Compare two Office Word Documents (docx) files and highlight the differences

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.CompareDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CompareDocumentApi apiInstance = new CompareDocumentApi(defaultClient);
        File inputFile1 = new File("/path/to/file"); // File | First input file to perform the operation on.
        File inputFile2 = new File("/path/to/file"); // File | Second input file to perform the operation on (more than 2 can be supplied).
        try {
            byte[] result = apiInstance.compareDocumentDocx(inputFile1, inputFile2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompareDocumentApi#compareDocumentDocx");
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
| **inputFile1** | **File**| First input file to perform the operation on. | |
| **inputFile2** | **File**| Second input file to perform the operation on (more than 2 can be supplied). | |

### Return type

**byte[]**


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## compareDocumentDocxWithHttpInfo

> ApiResponse<byte[]> compareDocumentDocx compareDocumentDocxWithHttpInfo(inputFile1, inputFile2)

Compare Two Word DOCX

Compare two Office Word Documents (docx) files and highlight the differences

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.CompareDocumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        CompareDocumentApi apiInstance = new CompareDocumentApi(defaultClient);
        File inputFile1 = new File("/path/to/file"); // File | First input file to perform the operation on.
        File inputFile2 = new File("/path/to/file"); // File | Second input file to perform the operation on (more than 2 can be supplied).
        try {
            ApiResponse<byte[]> response = apiInstance.compareDocumentDocxWithHttpInfo(inputFile1, inputFile2);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompareDocumentApi#compareDocumentDocx");
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
| **inputFile1** | **File**| First input file to perform the operation on. | |
| **inputFile2** | **File**| Second input file to perform the operation on (more than 2 can be supplied). | |

### Return type

ApiResponse<**byte[]**>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

