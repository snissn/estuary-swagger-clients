# EstuaryApi.AdminApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](AdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](AdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](AdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](AdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](AdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](AdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
[**adminSystemConfigGet**](AdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
[**adminUsersGet**](AdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users

<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> adminPeeringPeersDelete()

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminPeeringPeersDelete((error, data, response) => {
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

<a name="adminPeeringPeersGet"></a>
# **adminPeeringPeersGet**
> adminPeeringPeersGet()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminPeeringPeersGet((error, data, response) => {
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

<a name="adminPeeringPeersPost"></a>
# **adminPeeringPeersPost**
> adminPeeringPeersPost()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminPeeringPeersPost((error, data, response) => {
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

<a name="adminPeeringStartPost"></a>
# **adminPeeringStartPost**
> adminPeeringStartPost()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminPeeringStartPost((error, data, response) => {
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

<a name="adminPeeringStatusGet"></a>
# **adminPeeringStatusGet**
> adminPeeringStatusGet()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminPeeringStatusGet((error, data, response) => {
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

<a name="adminPeeringStopPost"></a>
# **adminPeeringStopPost**
> adminPeeringStopPost()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminPeeringStopPost((error, data, response) => {
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

<a name="adminSystemConfigGet"></a>
# **adminSystemConfigGet**
> adminSystemConfigGet()

Get systems(estuary/shuttle) config

This endpoint is used to get system configs.

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminSystemConfigGet((error, data, response) => {
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

<a name="adminUsersGet"></a>
# **adminUsersGet**
> adminUsersGet()

Get all users

This endpoint is used to get all users.

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.AdminApi();
apiInstance.adminUsersGet((error, data, response) => {
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

