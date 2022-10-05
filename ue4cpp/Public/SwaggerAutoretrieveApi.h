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

#include "CoreMinimal.h"
#include "SwaggerBaseModel.h"

namespace Swagger 
{

class SWAGGER_API SwaggerAutoretrieveApi
{
public:
	SwaggerAutoretrieveApi();
	~SwaggerAutoretrieveApi();

	void SetURL(const FString& Url);
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	class AdminAutoretrieveInitPostRequest;
	class AdminAutoretrieveInitPostResponse;
	class AdminAutoretrieveListGetRequest;
	class AdminAutoretrieveListGetResponse;
	class AutoretrieveHeartbeatPostRequest;
	class AutoretrieveHeartbeatPostResponse;
	
    DECLARE_DELEGATE_OneParam(FAdminAutoretrieveInitPostDelegate, const AdminAutoretrieveInitPostResponse&);
    DECLARE_DELEGATE_OneParam(FAdminAutoretrieveListGetDelegate, const AdminAutoretrieveListGetResponse&);
    DECLARE_DELEGATE_OneParam(FAutoretrieveHeartbeatPostDelegate, const AutoretrieveHeartbeatPostResponse&);
    
    bool AdminAutoretrieveInitPost(const AdminAutoretrieveInitPostRequest& Request, const FAdminAutoretrieveInitPostDelegate& Delegate = FAdminAutoretrieveInitPostDelegate()) const;
    bool AdminAutoretrieveListGet(const AdminAutoretrieveListGetRequest& Request, const FAdminAutoretrieveListGetDelegate& Delegate = FAdminAutoretrieveListGetDelegate()) const;
    bool AutoretrieveHeartbeatPost(const AutoretrieveHeartbeatPostRequest& Request, const FAutoretrieveHeartbeatPostDelegate& Delegate = FAutoretrieveHeartbeatPostDelegate()) const;
    
private:
    void OnAdminAutoretrieveInitPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminAutoretrieveInitPostDelegate Delegate) const;
    void OnAdminAutoretrieveListGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminAutoretrieveListGetDelegate Delegate) const;
    void OnAutoretrieveHeartbeatPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAutoretrieveHeartbeatPostDelegate Delegate) const;
    
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
};
	
}