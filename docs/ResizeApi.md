# ResizeApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resizePost**](ResizeApi.md#resizePost) | **POST** /image/resize/preserveAspectRatio/{maxWidth}/{maxHeight} | Resize an image while preserving aspect ratio |
| [**resizePostWithHttpInfo**](ResizeApi.md#resizePostWithHttpInfo) | **POST** /image/resize/preserveAspectRatio/{maxWidth}/{maxHeight} | Resize an image while preserving aspect ratio |
| [**resizeResizeSimple**](ResizeApi.md#resizeResizeSimple) | **POST** /image/resize/target/{width}/{height} | Resize an image |
| [**resizeResizeSimpleWithHttpInfo**](ResizeApi.md#resizeResizeSimpleWithHttpInfo) | **POST** /image/resize/target/{width}/{height} | Resize an image |



## resizePost

> byte[] resizePost(maxWidth, maxHeight, imageFile)

Resize an image while preserving aspect ratio

Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer maxWidth = 56; // Integer | Maximum width of the output image - final image will be as large as possible while less than or equial to this width
        Integer maxHeight = 56; // Integer | Maximum height of the output image - final image will be as large as possible while less than or equial to this height
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.resizePost(maxWidth, maxHeight, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizePost");
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
| **maxWidth** | **Integer**| Maximum width of the output image - final image will be as large as possible while less than or equial to this width | |
| **maxHeight** | **Integer**| Maximum height of the output image - final image will be as large as possible while less than or equial to this height | |
| **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. | |

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

## resizePostWithHttpInfo

> ApiResponse<byte[]> resizePost resizePostWithHttpInfo(maxWidth, maxHeight, imageFile)

Resize an image while preserving aspect ratio

Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer maxWidth = 56; // Integer | Maximum width of the output image - final image will be as large as possible while less than or equial to this width
        Integer maxHeight = 56; // Integer | Maximum height of the output image - final image will be as large as possible while less than or equial to this height
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            ApiResponse<byte[]> response = apiInstance.resizePostWithHttpInfo(maxWidth, maxHeight, imageFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizePost");
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
| **maxWidth** | **Integer**| Maximum width of the output image - final image will be as large as possible while less than or equial to this width | |
| **maxHeight** | **Integer**| Maximum height of the output image - final image will be as large as possible while less than or equial to this height | |
| **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. | |

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


## resizeResizeSimple

> byte[] resizeResizeSimple(width, height, imageFile)

Resize an image

Resize an image to a specific width and specific height.  Resize is EXIF-aware.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer width = 56; // Integer | Width of the output image - final image will be exactly this width
        Integer height = 56; // Integer | Height of the output image - final image will be exactly this height
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            byte[] result = apiInstance.resizeResizeSimple(width, height, imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeResizeSimple");
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
| **width** | **Integer**| Width of the output image - final image will be exactly this width | |
| **height** | **Integer**| Height of the output image - final image will be exactly this height | |
| **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. | |

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

## resizeResizeSimpleWithHttpInfo

> ApiResponse<byte[]> resizeResizeSimple resizeResizeSimpleWithHttpInfo(width, height, imageFile)

Resize an image

Resize an image to a specific width and specific height.  Resize is EXIF-aware.

### Example

```java
// Import classes:
import com.cloudmersive.client.native.invoker.ApiClient;
import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.invoker.ApiResponse;
import com.cloudmersive.client.native.invoker.Configuration;
import com.cloudmersive.client.native.invoker.auth.*;
import com.cloudmersive.client.native.invoker.models.*;
import com.cloudmersive.client.native.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer width = 56; // Integer | Width of the output image - final image will be exactly this width
        Integer height = 56; // Integer | Height of the output image - final image will be exactly this height
        File imageFile = new File("/path/to/file"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            ApiResponse<byte[]> response = apiInstance.resizeResizeSimpleWithHttpInfo(width, height, imageFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeResizeSimple");
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
| **width** | **Integer**| Width of the output image - final image will be exactly this width | |
| **height** | **Integer**| Height of the output image - final image will be exactly this height | |
| **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. | |

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

