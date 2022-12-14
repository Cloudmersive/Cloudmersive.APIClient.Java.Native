# BackupConvertApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dataintegrationBackupConvertMssqlBakGetTablesPost**](BackupConvertApi.md#dataintegrationBackupConvertMssqlBakGetTablesPost) | **POST** /dataintegration/backup/convert/mssql/bak/get/tables | Lists all tables stored in a SQL Server Backup (.BAK) file |
| [**dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo**](BackupConvertApi.md#dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo) | **POST** /dataintegration/backup/convert/mssql/bak/get/tables | Lists all tables stored in a SQL Server Backup (.BAK) file |
| [**dataintegrationBackupConvertMssqlBakToCsvPost**](BackupConvertApi.md#dataintegrationBackupConvertMssqlBakToCsvPost) | **POST** /dataintegration/backup/convert/mssql/bak/to/csv | Converts a SQL Server Backup (.BAK) file into CSV for a specified table |
| [**dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo**](BackupConvertApi.md#dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo) | **POST** /dataintegration/backup/convert/mssql/bak/to/csv | Converts a SQL Server Backup (.BAK) file into CSV for a specified table |



## dataintegrationBackupConvertMssqlBakGetTablesPost

> MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(inputFile)

Lists all tables stored in a SQL Server Backup (.BAK) file

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.BackupConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        BackupConvertApi apiInstance = new BackupConvertApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on
        try {
            MssqlBakEnumerateTablesResult result = apiInstance.dataintegrationBackupConvertMssqlBakGetTablesPost(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupConvertApi#dataintegrationBackupConvertMssqlBakGetTablesPost");
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
| **inputFile** | **File**| Input file to perform the operation on | [optional] |

### Return type

[**MssqlBakEnumerateTablesResult**](MssqlBakEnumerateTablesResult.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo

> ApiResponse<MssqlBakEnumerateTablesResult> dataintegrationBackupConvertMssqlBakGetTablesPost dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(inputFile)

Lists all tables stored in a SQL Server Backup (.BAK) file

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.BackupConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        BackupConvertApi apiInstance = new BackupConvertApi(defaultClient);
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on
        try {
            ApiResponse<MssqlBakEnumerateTablesResult> response = apiInstance.dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupConvertApi#dataintegrationBackupConvertMssqlBakGetTablesPost");
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
| **inputFile** | **File**| Input file to perform the operation on | [optional] |

### Return type

ApiResponse<[**MssqlBakEnumerateTablesResult**](MssqlBakEnumerateTablesResult.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## dataintegrationBackupConvertMssqlBakToCsvPost

> File dataintegrationBackupConvertMssqlBakToCsvPost(tableName, inputFile)

Converts a SQL Server Backup (.BAK) file into CSV for a specified table

Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.BackupConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        BackupConvertApi apiInstance = new BackupConvertApi(defaultClient);
        String tableName = "tableName_example"; // String | Name of the table to return
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on
        try {
            File result = apiInstance.dataintegrationBackupConvertMssqlBakToCsvPost(tableName, inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupConvertApi#dataintegrationBackupConvertMssqlBakToCsvPost");
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
| **tableName** | **String**| Name of the table to return | [optional] |
| **inputFile** | **File**| Input file to perform the operation on | [optional] |

### Return type

[**File**](File.md)


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

## dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo

> ApiResponse<File> dataintegrationBackupConvertMssqlBakToCsvPost dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(tableName, inputFile)

Converts a SQL Server Backup (.BAK) file into CSV for a specified table

Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.

### Example

```java
// Import classes:
import com.cloudmersive.client.ntv.invoker.ApiClient;
import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.invoker.ApiResponse;
import com.cloudmersive.client.ntv.invoker.Configuration;
import com.cloudmersive.client.ntv.invoker.auth.*;
import com.cloudmersive.client.ntv.invoker.models.*;
import com.cloudmersive.client.ntv.BackupConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Apikey
        ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        Apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        BackupConvertApi apiInstance = new BackupConvertApi(defaultClient);
        String tableName = "tableName_example"; // String | Name of the table to return
        File inputFile = new File("/path/to/file"); // File | Input file to perform the operation on
        try {
            ApiResponse<File> response = apiInstance.dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(tableName, inputFile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BackupConvertApi#dataintegrationBackupConvertMssqlBakToCsvPost");
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
| **tableName** | **String**| Name of the table to return | [optional] |
| **inputFile** | **File**| Input file to perform the operation on | [optional] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

