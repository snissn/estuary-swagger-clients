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
#include "SwaggerPeersApiOperations.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace Swagger 
{

FString SwaggerPeersApi::AdminPeeringPeersDeleteRequest::ComputePath() const
{
	FString Path(TEXT("/admin/peering/peers"));
	return Path;
}

void SwaggerPeersApi::AdminPeeringPeersDeleteRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerPeersApi::AdminPeeringPeersDeleteResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerPeersApi::AdminPeeringPeersGetRequest::ComputePath() const
{
	FString Path(TEXT("/admin/peering/peers"));
	return Path;
}

void SwaggerPeersApi::AdminPeeringPeersGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerPeersApi::AdminPeeringPeersGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerPeersApi::AdminPeeringPeersPostRequest::ComputePath() const
{
	FString Path(TEXT("/admin/peering/peers"));
	return Path;
}

void SwaggerPeersApi::AdminPeeringPeersPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerPeersApi::AdminPeeringPeersPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerPeersApi::AdminPeeringStartPostRequest::ComputePath() const
{
	FString Path(TEXT("/admin/peering/start"));
	return Path;
}

void SwaggerPeersApi::AdminPeeringStartPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerPeersApi::AdminPeeringStartPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerPeersApi::AdminPeeringStatusGetRequest::ComputePath() const
{
	FString Path(TEXT("/admin/peering/status"));
	return Path;
}

void SwaggerPeersApi::AdminPeeringStatusGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerPeersApi::AdminPeeringStatusGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerPeersApi::AdminPeeringStopPostRequest::ComputePath() const
{
	FString Path(TEXT("/admin/peering/stop"));
	return Path;
}

void SwaggerPeersApi::AdminPeeringStopPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerPeersApi::AdminPeeringStopPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

}
