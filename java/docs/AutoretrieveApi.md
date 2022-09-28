# AutoretrieveApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAutoretrieveInitPost**](AutoretrieveApi.md#adminAutoretrieveInitPost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
[**adminAutoretrieveListGet**](AutoretrieveApi.md#adminAutoretrieveListGet) | **GET** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieveHeartbeatPost**](AutoretrieveApi.md#autoretrieveHeartbeatPost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up

<a name="adminAutoretrieveInitPost"></a>
# **adminAutoretrieveInitPost**
> adminAutoretrieveInitPost(body)

Register autoretrieve server

This endpoint registers a new autoretrieve server

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoretrieveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

AutoretrieveApi apiInstance = new AutoretrieveApi();
String body = "body_example"; // String | Autoretrieve's public key
try {
    apiInstance.adminAutoretrieveInitPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoretrieveApi#adminAutoretrieveInitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Autoretrieve&#x27;s public key |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="adminAutoretrieveListGet"></a>
# **adminAutoretrieveListGet**
> adminAutoretrieveListGet()

List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoretrieveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

AutoretrieveApi apiInstance = new AutoretrieveApi();
try {
    apiInstance.adminAutoretrieveListGet();
} catch (ApiException e) {
    System.err.println("Exception when calling AutoretrieveApi#adminAutoretrieveListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="autoretrieveHeartbeatPost"></a>
# **autoretrieveHeartbeatPost**
> autoretrieveHeartbeatPost(token)

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoretrieveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

AutoretrieveApi apiInstance = new AutoretrieveApi();
String token = "token_example"; // String | Autoretrieve's auth token
try {
    apiInstance.autoretrieveHeartbeatPost(token);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoretrieveApi#autoretrieveHeartbeatPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Autoretrieve&#x27;s auth token |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

