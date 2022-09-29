/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
#pragma once

#include "SwaggerBaseModel.h"
#include "SwaggerPinningApi.h"

#include "SwaggerUtil_HttpError.h"

namespace Swagger 
{

/* List all pin status objects
 *
 * This endpoint lists all pin status objects
*/
class SWAGGER_API SwaggerPinningApi::PinningPinsGetRequest : public Request
{
public:
    virtual ~PinningPinsGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerPinningApi::PinningPinsGetResponse : public Response
{
public:
    virtual ~PinningPinsGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Delete a pinned object
 *
 * This endpoint deletes a pinned object.
*/
class SWAGGER_API SwaggerPinningApi::PinningPinsPinidDeleteRequest : public Request
{
public:
    virtual ~PinningPinsPinidDeleteRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Pin ID */
	FString Pinid;
};

class SWAGGER_API SwaggerPinningApi::PinningPinsPinidDeleteResponse : public Response
{
public:
    virtual ~PinningPinsPinidDeleteResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Get a pin status object
 *
 * This endpoint returns a pin status object.
*/
class SWAGGER_API SwaggerPinningApi::PinningPinsPinidGetRequest : public Request
{
public:
    virtual ~PinningPinsPinidGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* cid */
	FString Pinid;
};

class SWAGGER_API SwaggerPinningApi::PinningPinsPinidGetResponse : public Response
{
public:
    virtual ~PinningPinsPinidGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Replace a pinned object
 *
 * This endpoint replaces a pinned object.
*/
class SWAGGER_API SwaggerPinningApi::PinningPinsPinidPostRequest : public Request
{
public:
    virtual ~PinningPinsPinidPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Pin ID */
	FString Pinid;
};

class SWAGGER_API SwaggerPinningApi::PinningPinsPinidPostResponse : public Response
{
public:
    virtual ~PinningPinsPinidPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Add and pin object
 *
 * This endpoint adds a pin to the IPFS daemon.
*/
class SWAGGER_API SwaggerPinningApi::PinningPinsPostRequest : public Request
{
public:
    virtual ~PinningPinsPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* cid */
	FString Cid;
	/* name */
	FString Name;
};

class SWAGGER_API SwaggerPinningApi::PinningPinsPostResponse : public Response
{
public:
    virtual ~PinningPinsPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

}
