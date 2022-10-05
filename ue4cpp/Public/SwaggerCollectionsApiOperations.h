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
#include "SwaggerCollectionsApi.h"

#include "SwaggerCollections_Collection.h"
#include "SwaggerMain_createCollectionBody.h"
#include "SwaggerMain_deleteContentFromCollectionBody.h"
#include "SwaggerUtil_HttpError.h"

namespace Swagger 
{

/* Produce a CID of the collection contents
 *
 * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidCommitPostRequest : public Request
{
public:
    virtual ~CollectionsColuuidCommitPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* coluuid */
	FString Coluuid;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidCommitPostResponse : public Response
{
public:
    virtual ~CollectionsColuuidCommitPostResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    FString Content;
};

/* Deletes a content from a collection
 *
 * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidContentsDeleteRequest : public Request
{
public:
    virtual ~CollectionsColuuidContentsDeleteRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Collection ID */
	FString Coluuid;
	/* Content ID */
	FString Contentid;
	/* {by: Variable to use when filtering for files (must be either 'path' or 'content_id'), value: Value of content_id or path to look for} */
	SwaggerMain_deleteContentFromCollectionBody Body;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidContentsDeleteResponse : public Response
{
public:
    virtual ~CollectionsColuuidContentsDeleteResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    FString Content;
};

/* Deletes a collection
 *
 * This endpoint is used to delete an existing collection.
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidDeleteRequest : public Request
{
public:
    virtual ~CollectionsColuuidDeleteRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Collection ID */
	FString Coluuid;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidDeleteResponse : public Response
{
public:
    virtual ~CollectionsColuuidDeleteResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* Get contents in a collection
 *
 * This endpoint is used to get contents in a collection. If no colpath query param is passed
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidGetRequest : public Request
{
public:
    virtual ~CollectionsColuuidGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Collection UUID */
	FString Coluuid;
	/* Directory */
	TOptional<FString> Dir;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidGetResponse : public Response
{
public:
    virtual ~CollectionsColuuidGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    FString Content;
};

/* Add contents to a collection
 *
 * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidPostRequest : public Request
{
public:
    virtual ~CollectionsColuuidPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Content IDs to add to collection */
	TArray<int32> Body;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsColuuidPostResponse : public Response
{
public:
    virtual ~CollectionsColuuidPostResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    TMap<FString, FString> Content;
};

/* Add a file to a collection
 *
 * This endpoint adds a file to a collection
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsFsAddPostRequest : public Request
{
public:
    virtual ~CollectionsFsAddPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Collection ID */
	FString Coluuid;
	/* Content */
	FString Content;
	/* Path to file */
	FString Path;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsFsAddPostResponse : public Response
{
public:
    virtual ~CollectionsFsAddPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

/* List all collections
 *
 * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsGetRequest : public Request
{
public:
    virtual ~CollectionsGetRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsGetResponse : public Response
{
public:
    virtual ~CollectionsGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    TArray<SwaggerCollections_Collection> Content;
};

/* Create a new collection
 *
 * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
*/
class SWAGGER_API SwaggerCollectionsApi::CollectionsPostRequest : public Request
{
public:
    virtual ~CollectionsPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* Collection name and description */
	SwaggerMain_createCollectionBody Body;
};

class SWAGGER_API SwaggerCollectionsApi::CollectionsPostResponse : public Response
{
public:
    virtual ~CollectionsPostResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    SwaggerCollections_Collection Content;
};

}