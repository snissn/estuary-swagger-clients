# Swagger\Client\AutoretrieveApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAutoretrieveInitPost**](AutoretrieveApi.md#adminautoretrieveinitpost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
[**adminAutoretrieveListGet**](AutoretrieveApi.md#adminautoretrievelistget) | **GET** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieveHeartbeatPost**](AutoretrieveApi.md#autoretrieveheartbeatpost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up

# **adminAutoretrieveInitPost**
> adminAutoretrieveInitPost($body)

Register autoretrieve server

This endpoint registers a new autoretrieve server

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\AutoretrieveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = "body_example"; // string | Autoretrieve's public key

try {
    $apiInstance->adminAutoretrieveInitPost($body);
} catch (Exception $e) {
    echo 'Exception when calling AutoretrieveApi->adminAutoretrieveInitPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**string**](../Model/string.md)| Autoretrieve&#x27;s public key |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **adminAutoretrieveListGet**
> adminAutoretrieveListGet()

List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\AutoretrieveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $apiInstance->adminAutoretrieveListGet();
} catch (Exception $e) {
    echo 'Exception when calling AutoretrieveApi->adminAutoretrieveListGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **autoretrieveHeartbeatPost**
> autoretrieveHeartbeatPost($token)

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\AutoretrieveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = "token_example"; // string | Autoretrieve's auth token

try {
    $apiInstance->autoretrieveHeartbeatPost($token);
} catch (Exception $e) {
    echo 'Exception when calling AutoretrieveApi->autoretrieveHeartbeatPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Autoretrieve&#x27;s auth token |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

