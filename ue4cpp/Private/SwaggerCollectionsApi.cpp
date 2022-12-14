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
#include "SwaggerCollectionsApi.h"

#include "SwaggerCollectionsApiOperations.h"
#include "SwaggerModule.h"

#include "HttpModule.h"
#include "Serialization/JsonSerializer.h"

namespace Swagger 
{

SwaggerCollectionsApi::SwaggerCollectionsApi() 
: Url(TEXT("https://api.estuary.tech"))
{
}

SwaggerCollectionsApi::~SwaggerCollectionsApi() {}

void SwaggerCollectionsApi::SetURL(const FString& InUrl)
{
	Url = InUrl;
}

void SwaggerCollectionsApi::AddHeaderParam(const FString& Key, const FString& Value)
{
	AdditionalHeaderParams.Add(Key, Value);
}

void SwaggerCollectionsApi::ClearHeaderParams()
{
	AdditionalHeaderParams.Reset();
}

bool SwaggerCollectionsApi::IsValid() const
{
	if (Url.IsEmpty())
	{
		UE_LOG(LogSwagger, Error, TEXT("SwaggerCollectionsApi: Endpoint Url is not set, request cannot be performed"));
		return false;
	}

	return true;
}

void SwaggerCollectionsApi::HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const
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

bool SwaggerCollectionsApi::CollectionsColuuidCommitPost(const CollectionsColuuidCommitPostRequest& Request, const FCollectionsColuuidCommitPostDelegate& Delegate /*= FCollectionsColuuidCommitPostDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsColuuidCommitPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsColuuidCommitPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsColuuidCommitPostDelegate Delegate) const
{
	CollectionsColuuidCommitPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsColuuidContentsDelete(const CollectionsColuuidContentsDeleteRequest& Request, const FCollectionsColuuidContentsDeleteDelegate& Delegate /*= FCollectionsColuuidContentsDeleteDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsColuuidContentsDeleteResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsColuuidContentsDeleteResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsColuuidContentsDeleteDelegate Delegate) const
{
	CollectionsColuuidContentsDeleteResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsColuuidDelete(const CollectionsColuuidDeleteRequest& Request, const FCollectionsColuuidDeleteDelegate& Delegate /*= FCollectionsColuuidDeleteDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsColuuidDeleteResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsColuuidDeleteResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsColuuidDeleteDelegate Delegate) const
{
	CollectionsColuuidDeleteResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsColuuidGet(const CollectionsColuuidGetRequest& Request, const FCollectionsColuuidGetDelegate& Delegate /*= FCollectionsColuuidGetDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsColuuidGetResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsColuuidGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsColuuidGetDelegate Delegate) const
{
	CollectionsColuuidGetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsColuuidPost(const CollectionsColuuidPostRequest& Request, const FCollectionsColuuidPostDelegate& Delegate /*= FCollectionsColuuidPostDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsColuuidPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsColuuidPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsColuuidPostDelegate Delegate) const
{
	CollectionsColuuidPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsFsAddPost(const CollectionsFsAddPostRequest& Request, const FCollectionsFsAddPostDelegate& Delegate /*= FCollectionsFsAddPostDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsFsAddPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsFsAddPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsFsAddPostDelegate Delegate) const
{
	CollectionsFsAddPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsGet(const CollectionsGetRequest& Request, const FCollectionsGetDelegate& Delegate /*= FCollectionsGetDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsGetResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsGetDelegate Delegate) const
{
	CollectionsGetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerCollectionsApi::CollectionsPost(const CollectionsPostRequest& Request, const FCollectionsPostDelegate& Delegate /*= FCollectionsPostDelegate()*/) const
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
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerCollectionsApi::OnCollectionsPostResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerCollectionsApi::OnCollectionsPostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCollectionsPostDelegate Delegate) const
{
	CollectionsPostResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

}
