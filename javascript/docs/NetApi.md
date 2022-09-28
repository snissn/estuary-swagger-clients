# EstuaryApi.NetApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**netAddrsGet**](NetApi.md#netAddrsGet) | **GET** /net/addrs | Net Addrs
[**publicMinersFailuresMinerGet**](NetApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicMinersGet**](NetApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
[**publicNetAddrsGet**](NetApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](NetApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers

<a name="netAddrsGet"></a>
# **netAddrsGet**
> [&#x27;String&#x27;] netAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.NetApi();
apiInstance.netAddrsGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

**[&#x27;String&#x27;]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersFailuresMinerGet"></a>
# **publicMinersFailuresMinerGet**
> publicMinersFailuresMinerGet(miner)

Get all miners

This endpoint returns all miners

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.NetApi();
let miner = "miner_example"; // String | Filter by miner

apiInstance.publicMinersFailuresMinerGet(miner, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="publicMinersGet"></a>
# **publicMinersGet**
> publicMinersGet()

Get all miners

This endpoint returns all miners

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.NetApi();
apiInstance.publicMinersGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
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

<a name="publicNetAddrsGet"></a>
# **publicNetAddrsGet**
> [&#x27;String&#x27;] publicNetAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.NetApi();
apiInstance.publicNetAddrsGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

**[&#x27;String&#x27;]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicNetPeersGet"></a>
# **publicNetPeersGet**
> [&#x27;String&#x27;] publicNetPeersGet()

Net Peers

This endpoint is used to get net peers

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.NetApi();
apiInstance.publicNetPeersGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

**[&#x27;String&#x27;]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

