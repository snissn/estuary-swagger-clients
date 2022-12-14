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
#include "SwaggerPeersApi.h"

#include "SwaggerPeersApiOperations.h"
#include "SwaggerModule.h"

#include "HttpModule.h"
#include "Serialization/JsonSerializer.h"

namespace Swagger 
{

SwaggerPeersApi::SwaggerPeersApi() 
: Url(TEXT("https://api.estuary.tech"))
{
}

SwaggerPeersApi::~SwaggerPeersApi() {}

void SwaggerPeersApi::SetURL(const FString& InUrl)
{
	Url = InUrl;
}

void SwaggerPeersApi::AddHeaderParam(const FString& Key, const FString& Value)
{
	AdditionalHeaderParams.Add(Key, Value);
}

void SwaggerPeersApi::ClearHeaderParams()
{
	AdditionalHeaderParams.Reset();
}

bool SwaggerPeersApi::IsValid() const
{
	if (Url.IsEmpty())
	{
		UE_LOG(LogSwagger, Error, TEXT("SwaggerPeersApi: Endpoint Url is not set, request cannot be performed"));
		return false;
	}

	return true;
}

void SwaggerPeersApi::HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const
{
	InOutResponse.SetHttpResponse(HttpResponse);
	InOutResponse.SetSuccessful(bSucceeded);

	if (bSucceeded && HttpResponse.IsValid())
	{
		InOutResponse.SetHttpResponseCode((EHttpResponseCodes::Type)HttpResponse->GetResponseCode());
		FString ContentType = HttpResponse->GetContentType();
		FString Content;

		if (ContentType == TEXT("application/json"))
		{
			Content = HttpResponse->GetContentAsString();

			TSharedPtr<FJsonValue> JsonValue;
			auto Reader = TJsonReaderFactory<>::Create(Content);

			if (FJsonSerializer::Deserialize(Reader, JsonValue) && JsonValue.IsValid())
			{
				if (InOutResponse.FromJson(JsonValue))
					return; // Successfully parsed
			}
		}
		else if(ContentType == TEXT("text/plain"))
		{
			Content = HttpResponse->GetContentAsString();
			InOutResponse.SetResponseString(Content);
			return; // Successfully parsed
		}

		// Report the parse error but do not mark the request as unsuccessful. Data could be partial or malformed, but the request succeeded.
		UE_LOG(LogSwagger, Error, TEXT("Failed to deserialize Http response content (type:%s):\n%s"), *ContentType , *Content);
		return;
	}

	// By default, assume we failed to establish connection
	InOutResponse.SetHttpResponseCode(EHttpResponseCodes::RequestTimeout);
}

bool SwaggerPeersApi::AdminPeeringPeersDelete(const AdminPeeringPeersDeleteRequest& Request, const FAdminPeeringPeersDeleteDelegate& Delegate /*= FAdminPeeringPeersDeleteDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerPeersApi::OnAdminPeeringPeersDeleteResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerPeersApi::OnAdminPeeringPeersDeleteResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringPeersDeleteDelegate Delegate) const
{
	AdminPeeringPeersDeleteResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerPeersApi::AdminPeeringPeersGet(const AdminPeeringPeersGetRequest& Request, const FAdminPeeringPeersGetDelegate& Delegate /*= FAdminPeeringPeersGetDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerPeersApi::OnAdminPeeringPeersGetResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerPeersApi::OnAdminPeeringPeersGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringPeersGetDelegate Delegate) const
{
	AdminPeeringPeersGetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerPeersApi::AdminPeeringPeersPost(const AdminPeeringPeersPostRequest& Request, const FAdminPeeringPeersPostDelegate& Delegate /*= FAdminPeeringPeersPostDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerPeersApi::OnAdminPeeringPeersPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerPeersApi::OnAdminPeeringPeersPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringPeersPostDelegate Delegate) const
{
	AdminPeeringPeersPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerPeersApi::AdminPeeringStartPost(const AdminPeeringStartPostRequest& Request, const FAdminPeeringStartPostDelegate& Delegate /*= FAdminPeeringStartPostDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerPeersApi::OnAdminPeeringStartPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerPeersApi::OnAdminPeeringStartPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringStartPostDelegate Delegate) const
{
	AdminPeeringStartPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerPeersApi::AdminPeeringStatusGet(const AdminPeeringStatusGetRequest& Request, const FAdminPeeringStatusGetDelegate& Delegate /*= FAdminPeeringStatusGetDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerPeersApi::OnAdminPeeringStatusGetResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerPeersApi::OnAdminPeeringStatusGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringStatusGetDelegate Delegate) const
{
	AdminPeeringStatusGetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerPeersApi::AdminPeeringStopPost(const AdminPeeringStopPostRequest& Request, const FAdminPeeringStopPostDelegate& Delegate /*= FAdminPeeringStopPostDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerPeersApi::OnAdminPeeringStopPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerPeersApi::OnAdminPeeringStopPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdminPeeringStopPostDelegate Delegate) const
{
	AdminPeeringStopPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

}
