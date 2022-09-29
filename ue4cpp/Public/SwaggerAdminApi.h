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

class SWAGGER_API SwaggerAdminApi
{
public:
	SwaggerAdminApi();
	~SwaggerAdminApi();

	void SetURL(const FString& Url);
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	class AdminPeeringPeersDeleteRequest;
	class AdminPeeringPeersDeleteResponse;
	class AdminPeeringPeersGetRequest;
	class AdminPeeringPeersGetResponse;
	class AdminPeeringPeersPostRequest;
	class AdminPeeringPeersPostResponse;
	class AdminPeeringStartPostRequest;
	class AdminPeeringStartPostResponse;
	class AdminPeeringStatusGetRequest;
	class AdminPeeringStatusGetResponse;
	class AdminPeeringStopPostRequest;
	class AdminPeeringStopPostResponse;
	class AdminSystemConfigGetRequest;
	class AdminSystemConfigGetResponse;
	class AdminUsersGetRequest;
	class AdminUsersGetResponse;
	
    DECLARE_DELEGATE_OneParam(FAdminPeeringPeersDeleteDelegate, const AdminPeeringPeersDeleteResponse&);
    DECLARE_DELEGATE_OneParam(FAdminPeeringPeersGetDelegate, const AdminPeeringPeersGetResponse&);
    DECLARE_DELEGATE_OneParam(FAdminPeeringPeersPostDelegate, const AdminPeeringPeersPostResponse&);
    DECLARE_DELEGATE_OneParam(FAdminPeeringStartPostDelegate, const AdminPeeringStartPostResponse&);
    DECLARE_DELEGATE_OneParam(FAdminPeeringStatusGetDelegate, const AdminPeeringStatusGetResponse&);
    DECLARE_DELEGATE_OneParam(FAdminPeeringStopPostDelegate, const AdminPeeringStopPostResponse&);
    DECLARE_DELEGATE_OneParam(FAdminSystemConfigGetDelegate, const AdminSystemConfigGetResponse&);
    DECLARE_DELEGATE_OneParam(FAdminUsersGetDelegate, const AdminUsersGetResponse&);
    
    bool AdminPeeringPeersDelete(const AdminPeeringPeersDeleteRequest& Request, const FAdminPeeringPeersDeleteDelegate& Delegate = FAdminPeeringPeersDeleteDelegate()) const;
    bool AdminPeeringPeersGet(const AdminPeeringPeersGetRequest& Request, const FAdminPeeringPeersGetDelegate& Delegate = FAdminPeeringPeersGetDelegate()) const;
    bool AdminPeeringPeersPost(const AdminPeeringPeersPostRequest& Request, const FAdminPeeringPeersPostDelegate& Delegate = FAdminPeeringPeersPostDelegate()) const;
    bool AdminPeeringStartPost(const AdminPeeringStartPostRequest& Request, const FAdminPeeringStartPostDelegate& Delegate = FAdminPeeringStartPostDelegate()) const;
    bool AdminPeeringStatusGet(const AdminPeeringStatusGetRequest& Request, const FAdminPeeringStatusGetDelegate& Delegate = FAdminPeeringStatusGetDelegate()) const;
    bool AdminPeeringStopPost(const AdminPeeringStopPostRequest& Request, const FAdminPeeringStopPostDelegate& Delegate = FAdminPeeringStopPostDelegate()) const;
    bool AdminSystemConfigGet(const AdminSystemConfigGetRequest& Request, const FAdminSystemConfigGetDelegate& Delegate = FAdminSystemConfigGetDelegate()) const;
    bool AdminUsersGet(const AdminUsersGetRequest& Request, const FAdminUsersGetDelegate& Delegate = FAdminUsersGetDelegate()) const;
    
private:
    void OnAdminPeeringPeersDeleteResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringPeersDeleteDelegate Delegate) const;
    void OnAdminPeeringPeersGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringPeersGetDelegate Delegate) const;
    void OnAdminPeeringPeersPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringPeersPostDelegate Delegate) const;
    void OnAdminPeeringStartPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringStartPostDelegate Delegate) const;
    void OnAdminPeeringStatusGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringStatusGetDelegate Delegate) const;
    void OnAdminPeeringStopPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringStopPostDelegate Delegate) const;
    void OnAdminSystemConfigGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminSystemConfigGetDelegate Delegate) const;
    void OnAdminUsersGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminUsersGetDelegate Delegate) const;
    
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
};
	
}
