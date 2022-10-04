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
#include "SwaggerContentApi.h"

#include "SwaggerHelpers.h"
#include "SwaggerMain_importDealBody.h"
#include "SwaggerUtil_ContentAddIpfsBody.h"
#include "SwaggerUtil_ContentAddResponse.h"

namespace Swagger 
{

/* Add Car object
 *
 * This endpoint is used to add a car object to the network. The object can be a file or a directory.
*/
class SWAGGER_API SwaggerContentApi::ContentAddCarPostRequest : public Request
{
public:
    virtual ~ContentAddCarPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Car */
	FString Body;
	/* Filename */
	TOptional<FString> Filename;
	/* Commp */
	TOptional<FString> Commp;
	/* Size */
	TOptional<FString> Size;
};

class SWAGGER_API SwaggerContentApi::ContentAddCarPostResponse : public Response
{
public:
    virtual ~ContentAddCarPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Add IPFS object
 *
 * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
*/
class SWAGGER_API SwaggerContentApi::ContentAddIpfsPostRequest : public Request
{
public:
    virtual ~ContentAddIpfsPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* IPFS Body */
	SwaggerUtil_ContentAddIpfsBody Body;
};

class SWAGGER_API SwaggerContentApi::ContentAddIpfsPostResponse : public Response
{
public:
    virtual ~ContentAddIpfsPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Add new content
 *
 * This endpoint is used to upload new content.
*/
class SWAGGER_API SwaggerContentApi::ContentAddPostRequest : public Request
{
public:
    virtual ~ContentAddPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* File to upload */
	HttpFileInput Data;
	/* Collection UUID */
	TOptional<FString> Coluuid;
	/* Directory */
	TOptional<FString> Dir;
};

class SWAGGER_API SwaggerContentApi::ContentAddPostResponse : public Response
{
public:
    virtual ~ContentAddPostResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    SwaggerUtil_ContentAddResponse Content;
};

/* Get aggregated content stats
 *
 * This endpoint returns aggregated content stats
*/
class SWAGGER_API SwaggerContentApi::ContentAggregatedContentGetRequest : public Request
{
public:
    virtual ~ContentAggregatedContentGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Content ID */
	FString Content;
};

class SWAGGER_API SwaggerContentApi::ContentAggregatedContentGetResponse : public Response
{
public:
    virtual ~ContentAggregatedContentGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    FString Content;
};

/* Get all deals for a user
 *
 * This endpoint is used to get all deals for a user
*/
class SWAGGER_API SwaggerContentApi::ContentAllDealsGetRequest : public Request
{
public:
    virtual ~ContentAllDealsGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Begin */
	FString Begin;
	/* Duration */
	FString Duration;
	/* All */
	FString All;
};

class SWAGGER_API SwaggerContentApi::ContentAllDealsGetResponse : public Response
{
public:
    virtual ~ContentAllDealsGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Get content bandwidth
 *
 * This endpoint returns content bandwidth
*/
class SWAGGER_API SwaggerContentApi::ContentBwUsageContentGetRequest : public Request
{
public:
    virtual ~ContentBwUsageContentGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Content ID */
	FString Content;
};

class SWAGGER_API SwaggerContentApi::ContentBwUsageContentGetResponse : public Response
{
public:
    virtual ~ContentBwUsageContentGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Add a new content
 *
 * This endpoint adds a new content
*/
class SWAGGER_API SwaggerContentApi::ContentCreatePostRequest : public Request
{
public:
    virtual ~ContentCreatePostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Content */
	FString Body;
};

class SWAGGER_API SwaggerContentApi::ContentCreatePostResponse : public Response
{
public:
    virtual ~ContentCreatePostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Content with deals
 *
 * This endpoint lists all content with deals
*/
class SWAGGER_API SwaggerContentApi::ContentDealsGetRequest : public Request
{
public:
    virtual ~ContentDealsGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Limit */
	TOptional<int32> Limit;
	/* Offset */
	TOptional<int32> Offset;
};

class SWAGGER_API SwaggerContentApi::ContentDealsGetResponse : public Response
{
public:
    virtual ~ContentDealsGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Ensure Replication
 *
 * This endpoint ensures that the content is replicated to the specified number of providers
*/
class SWAGGER_API SwaggerContentApi::ContentEnsureReplicationDatacidGetRequest : public Request
{
public:
    virtual ~ContentEnsureReplicationDatacidGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Data CID */
	FString Datacid;
};

class SWAGGER_API SwaggerContentApi::ContentEnsureReplicationDatacidGetResponse : public Response
{
public:
    virtual ~ContentEnsureReplicationDatacidGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* List all failures for a content
 *
 * This endpoint returns all failures for a content
*/
class SWAGGER_API SwaggerContentApi::ContentFailuresContentGetRequest : public Request
{
public:
    virtual ~ContentFailuresContentGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Content ID */
	FString Content;
};

class SWAGGER_API SwaggerContentApi::ContentFailuresContentGetResponse : public Response
{
public:
    virtual ~ContentFailuresContentGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    FString Content;
};

/* Import a deal
 *
 * This endpoint imports a deal into the shuttle.
*/
class SWAGGER_API SwaggerContentApi::ContentImportdealPostRequest : public Request
{
public:
    virtual ~ContentImportdealPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Import a deal */
	SwaggerMain_importDealBody Body;
};

class SWAGGER_API SwaggerContentApi::ContentImportdealPostResponse : public Response
{
public:
    virtual ~ContentImportdealPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* List all pinned content
 *
 * This endpoint lists all content
*/
class SWAGGER_API SwaggerContentApi::ContentListGetRequest : public Request
{
public:
    virtual ~ContentListGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerContentApi::ContentListGetResponse : public Response
{
public:
    virtual ~ContentListGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    TArray<FString> Content;
};

/* Read content
 *
 * This endpoint reads content from the blockstore
*/
class SWAGGER_API SwaggerContentApi::ContentReadContGetRequest : public Request
{
public:
    virtual ~ContentReadContGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* CID */
	FString Cont;
};

class SWAGGER_API SwaggerContentApi::ContentReadContGetResponse : public Response
{
public:
    virtual ~ContentReadContGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Get staging zone for user
 *
 * This endpoint is used to get staging zone for user.
*/
class SWAGGER_API SwaggerContentApi::ContentStagingZonesGetRequest : public Request
{
public:
    virtual ~ContentStagingZonesGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerContentApi::ContentStagingZonesGetResponse : public Response
{
public:
    virtual ~ContentStagingZonesGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Get content statistics
 *
 * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
*/
class SWAGGER_API SwaggerContentApi::ContentStatsGetRequest : public Request
{
public:
    virtual ~ContentStatsGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* limit */
	FString Limit;
};

class SWAGGER_API SwaggerContentApi::ContentStatsGetResponse : public Response
{
public:
    virtual ~ContentStatsGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Content Status
 *
 * This endpoint returns the status of a content
*/
class SWAGGER_API SwaggerContentApi::ContentStatusIdGetRequest : public Request
{
public:
    virtual ~ContentStatusIdGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Content ID */
	int32 Id;
};

class SWAGGER_API SwaggerContentApi::ContentStatusIdGetResponse : public Response
{
public:
    virtual ~ContentStatusIdGetResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

}
