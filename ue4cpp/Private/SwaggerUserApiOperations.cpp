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
#include "SwaggerUserApiOperations.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace Swagger 
{

FString SwaggerUserApi::UserApiKeysGetRequest::ComputePath() const
{
	FString Path(TEXT("/user/api-keys"));
	return Path;
}

void SwaggerUserApi::UserApiKeysGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerUserApi::UserApiKeysGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 404:
		SetResponseString(TEXT("Not Found"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerUserApi::UserApiKeysGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerUserApi::UserApiKeysKeyDeleteRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("key"), ToStringFormatArg(Key) } };

	FString Path = FString::Format(TEXT("/user/api-keys/{key}"), PathParams);
	
	return Path;
}

void SwaggerUserApi::UserApiKeysKeyDeleteRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("DELETE"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}


bool SwaggerUserApi::UserApiKeysKeyDeleteResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerUserApi::UserApiKeysPostRequest::ComputePath() const
{
	FString Path(TEXT("/user/api-keys"));
	return Path;
}

void SwaggerUserApi::UserApiKeysPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerUserApi::UserApiKeysPostResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 404:
		SetResponseString(TEXT("Not Found"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerUserApi::UserApiKeysPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerUserApi::UserExportGetRequest::ComputePath() const
{
	FString Path(TEXT("/user/export"));
	return Path;
}

void SwaggerUserApi::UserExportGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerUserApi::UserExportGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	}
}

bool SwaggerUserApi::UserExportGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerUserApi::UserStatsGetRequest::ComputePath() const
{
	FString Path(TEXT("/user/stats"));
	return Path;
}

void SwaggerUserApi::UserStatsGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerUserApi::UserStatsGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	}
}

bool SwaggerUserApi::UserStatsGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
