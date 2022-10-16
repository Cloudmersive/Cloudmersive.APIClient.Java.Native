# OrchestratorApi

All URIs are relative to *https://api.cloudmersive.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orchestratorHttpSimple**](OrchestratorApi.md#orchestratorHttpSimple) | **POST** /config/orchestrator/http/simple | Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task. |
| [**orchestratorHttpSimpleWithHttpInfo**](OrchestratorApi.md#orchestratorHttpSimpleWithHttpInfo) | **POST** /config/orchestrator/http/simple | Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task. |



## orchestratorHttpSimple

> HttpOrchestrationResponse orchestratorHttpSimple(request)

Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.OrchestratorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        OrchestratorApi apiInstance = new OrchestratorApi(defaultClient);
        HttpOrchestrationRequest request = new HttpOrchestrationRequest(); // HttpOrchestrationRequest | 
        try {
            HttpOrchestrationResponse result = apiInstance.orchestratorHttpSimple(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrchestratorApi#orchestratorHttpSimple");
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
| **request** | [**HttpOrchestrationRequest**](HttpOrchestrationRequest.md)|  | |

### Return type

[**HttpOrchestrationResponse**](HttpOrchestrationResponse.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## orchestratorHttpSimpleWithHttpInfo

> ApiResponse<HttpOrchestrationResponse> orchestratorHttpSimple orchestratorHttpSimpleWithHttpInfo(request)

Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.OrchestratorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudmersive.com");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        OrchestratorApi apiInstance = new OrchestratorApi(defaultClient);
        HttpOrchestrationRequest request = new HttpOrchestrationRequest(); // HttpOrchestrationRequest | 
        try {
            ApiResponse<HttpOrchestrationResponse> response = apiInstance.orchestratorHttpSimpleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrchestratorApi#orchestratorHttpSimple");
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
| **request** | [**HttpOrchestrationRequest**](HttpOrchestrationRequest.md)|  | |

### Return type

ApiResponse<[**HttpOrchestrationResponse**](HttpOrchestrationResponse.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

