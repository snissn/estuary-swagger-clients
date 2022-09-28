# EstuaryApi.PinningApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object

<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.PinningApi();
apiInstance.pinningPinsGet((error, data, response) => {
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
 - **Accept**: application/json

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.PinningApi();
let pinid = "pinid_example"; // String | Pin ID

apiInstance.pinningPinsPinidDelete(pinid, (error, data, response) => {
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
 **pinid** | **String**| Pin ID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.PinningApi();
let pinid = "pinid_example"; // String | cid

apiInstance.pinningPinsPinidGet(pinid, (error, data, response) => {
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
 **pinid** | **String**| cid | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> pinningPinsPinidPost(pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.PinningApi();
let pinid = "pinid_example"; // String | Pin ID

apiInstance.pinningPinsPinidPost(pinid, (error, data, response) => {
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
 **pinid** | **String**| Pin ID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> pinningPinsPost(cid, name)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.PinningApi();
let cid = "cid_example"; // String | cid
let name = "name_example"; // String | name

apiInstance.pinningPinsPost(cid, name, (error, data, response) => {
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
 **cid** | **String**| cid | 
 **name** | **String**| name | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

