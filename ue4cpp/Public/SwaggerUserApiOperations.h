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
#include "SwaggerUserApi.h"

#include "SwaggerMain_getApiKeysResp.h"
#include "SwaggerMain_userStatsResponse.h"
#include "SwaggerUtil_HttpError.h"

namespace Swagger 
{

/* Get API keys for a user
 *
 * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
*/
class SWAGGER_API SwaggerUserApi::UserApiKeysGetRequest : public Request
{
public:
    virtual ~UserApiKeysGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerUserApi::UserApiKeysGetResponse : public Response
{
public:
    virtual ~UserApiKeysGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    TArray<SwaggerMain_getApiKeysResp> Content;
};

/* Revoke a User API Key.
 *
 * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
*/
class SWAGGER_API SwaggerUserApi::UserApiKeysKeyDeleteRequest : public Request
{
public:
    virtual ~UserApiKeysKeyDeleteRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Key */
	FString Key;
};

class SWAGGER_API SwaggerUserApi::UserApiKeysKeyDeleteResponse : public Response
{
public:
    virtual ~UserApiKeysKeyDeleteResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Create API keys for a user
 *
 * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
*/
class SWAGGER_API SwaggerUserApi::UserApiKeysPostRequest : public Request
{
public:
    virtual ~UserApiKeysPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerUserApi::UserApiKeysPostResponse : public Response
{
public:
    virtual ~UserApiKeysPostResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    SwaggerMain_getApiKeysResp Content;
};

/* Export user data
 *
 * This endpoint is used to get API keys for a user.
*/
class SWAGGER_API SwaggerUserApi::UserExportGetRequest : public Request
{
public:
    virtual ~UserExportGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerUserApi::UserExportGetResponse : public Response
{
public:
    virtual ~UserExportGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    FString Content;
};

/* Create API keys for a user
 *
 * This endpoint is used to create API keys for a user.
*/
class SWAGGER_API SwaggerUserApi::UserStatsGetRequest : public Request
{
public:
    virtual ~UserStatsGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerUserApi::UserStatsGetResponse : public Response
{
public:
    virtual ~UserStatsGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    SwaggerMain_userStatsResponse Content;
};

}
