# EstuaryApi.DealsApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealEstimatePost**](DealsApi.md#dealEstimatePost) | **POST** /deal/estimate | Estimate the cost of a deal
[**dealInfoDealidGet**](DealsApi.md#dealInfoDealidGet) | **GET** /deal/info/{dealid} | Get Deal Info
[**dealProposalPropcidGet**](DealsApi.md#dealProposalPropcidGet) | **GET** /deal/proposal/{propcid} | Get Proposal
[**dealQueryMinerGet**](DealsApi.md#dealQueryMinerGet) | **GET** /deal/query/{miner} | Query Ask
[**dealStatusByProposalPropcidGet**](DealsApi.md#dealStatusByProposalPropcidGet) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**dealStatusMinerPropcidGet**](DealsApi.md#dealStatusMinerPropcidGet) | **GET** /deal/status/{miner}/{propcid} | Deal Status
[**dealTransferInProgressGet**](DealsApi.md#dealTransferInProgressGet) | **GET** /deal/transfer/in-progress | Transfer In Progress
[**dealTransferStatusPost**](DealsApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | Transfer Status
[**dealsFailuresGet**](DealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures for user
[**dealsMakeMinerPost**](DealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal
[**dealsStatusDealGet**](DealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status
[**publicDealsFailuresGet**](DealsApi.md#publicDealsFailuresGet) | **GET** /public/deals/failures | Get storage failures
[**publicMinersStorageQueryMinerGet**](DealsApi.md#publicMinersStorageQueryMinerGet) | **GET** /public/miners/storage/query/{miner} | Query Ask

<a name="dealEstimatePost"></a>
# **dealEstimatePost**
> dealEstimatePost(body)

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let body = new EstuaryApi.MainEstimateDealBody(); // MainEstimateDealBody | The size of the deal in bytes, the replication factor, and the duration of the deal in blocks

apiInstance.dealEstimatePost(body, (error, data, response) => {
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
 **body** | [**MainEstimateDealBody**](MainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="dealInfoDealidGet"></a>
# **dealInfoDealidGet**
> dealInfoDealidGet(dealid)

Get Deal Info

This endpoint returns the deal info for a deal

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let dealid = 56; // Number | Deal ID

apiInstance.dealInfoDealidGet(dealid, (error, data, response) => {
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
 **dealid** | **Number**| Deal ID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dealProposalPropcidGet"></a>
# **dealProposalPropcidGet**
> dealProposalPropcidGet(propcid)

Get Proposal

This endpoint returns the proposal for a deal

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let propcid = "propcid_example"; // String | Proposal CID

apiInstance.dealProposalPropcidGet(propcid, (error, data, response) => {
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
 **propcid** | **String**| Proposal CID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dealQueryMinerGet"></a>
# **dealQueryMinerGet**
> dealQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let miner = "miner_example"; // String | CID

apiInstance.dealQueryMinerGet(miner, (error, data, response) => {
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
 **miner** | **String**| CID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dealStatusByProposalPropcidGet"></a>
# **dealStatusByProposalPropcidGet**
> dealStatusByProposalPropcidGet(propcid)

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let propcid = "propcid_example"; // String | PropCid

apiInstance.dealStatusByProposalPropcidGet(propcid, (error, data, response) => {
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
 **propcid** | **String**| PropCid | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dealStatusMinerPropcidGet"></a>
# **dealStatusMinerPropcidGet**
> dealStatusMinerPropcidGet(miner, propcid)

Deal Status

This endpoint returns the status of a deal

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let miner = "miner_example"; // String | Miner
let propcid = "propcid_example"; // String | Proposal CID

apiInstance.dealStatusMinerPropcidGet(miner, propcid, (error, data, response) => {
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
 **miner** | **String**| Miner | 
 **propcid** | **String**| Proposal CID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dealTransferInProgressGet"></a>
# **dealTransferInProgressGet**
> dealTransferInProgressGet()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
apiInstance.dealTransferInProgressGet((error, data, response) => {
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

<a name="dealTransferStatusPost"></a>
# **dealTransferStatusPost**
> dealTransferStatusPost()

Transfer Status

This endpoint returns the status of a transfer

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
apiInstance.dealTransferStatusPost((error, data, response) => {
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

<a name="dealsFailuresGet"></a>
# **dealsFailuresGet**
> dealsFailuresGet()

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
apiInstance.dealsFailuresGet((error, data, response) => {
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

<a name="dealsMakeMinerPost"></a>
# **dealsMakeMinerPost**
> dealsMakeMinerPost(body, miner)

Make Deal

This endpoint makes a deal for a given content and miner

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let body = "body_example"; // String | Deal Request
let miner = "miner_example"; // String | Miner

apiInstance.dealsMakeMinerPost(body, miner, (error, data, response) => {
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
 **body** | [**String**](String.md)| Deal Request | 
 **miner** | **String**| Miner | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="dealsStatusDealGet"></a>
# **dealsStatusDealGet**
> dealsStatusDealGet(deal)

Get Deal Status

This endpoint returns the status of a deal

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let deal = 56; // Number | Deal ID

apiInstance.dealsStatusDealGet(deal, (error, data, response) => {
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
 **deal** | **Number**| Deal ID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="publicDealsFailuresGet"></a>
# **publicDealsFailuresGet**
> publicDealsFailuresGet()

Get storage failures

This endpoint returns a list of storage failures

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
apiInstance.publicDealsFailuresGet((error, data, response) => {
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

<a name="publicMinersStorageQueryMinerGet"></a>
# **publicMinersStorageQueryMinerGet**
> publicMinersStorageQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```javascript
import {EstuaryApi} from 'estuary_api';
let defaultClient = EstuaryApi.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryApi.DealsApi();
let miner = "miner_example"; // String | CID

apiInstance.publicMinersStorageQueryMinerGet(miner, (error, data, response) => {
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
 **miner** | **String**| CID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

