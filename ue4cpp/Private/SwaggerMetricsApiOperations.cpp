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
#include "SwaggerMetricsApiOperations.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace Swagger 
{

FString SwaggerMetricsApi::PublicMetricsDealsOnChainGetRequest::ComputePath() const
{
	FString Path(TEXT("/public/metrics/deals-on-chain"));
	return Path;
}

void SwaggerMetricsApi::PublicMetricsDealsOnChainGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerMetricsApi::PublicMetricsDealsOnChainGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

}
