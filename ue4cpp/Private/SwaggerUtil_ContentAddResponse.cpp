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
#include "SwaggerUtil_ContentAddResponse.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Templates/SharedPointer.h"

namespace Swagger 
{

void SwaggerUtil_ContentAddResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Cid.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cid")); WriteJsonValue(Writer, Cid.GetValue());	
	}
	if (EstuaryId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("estuaryId")); WriteJsonValue(Writer, EstuaryId.GetValue());	
	}
	if (Providers.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("providers")); WriteJsonValue(Writer, Providers.GetValue());	
	}
	if (RetrievalUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("retrieval_url")); WriteJsonValue(Writer, RetrievalUrl.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool SwaggerUtil_ContentAddResponse::FromJson(const TSharedPtr<FJsonObject>& JsonObject)
{
	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("cid"), Cid);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("estuaryId"), EstuaryId);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("providers"), Providers);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("retrieval_url"), RetrievalUrl);

	return ParseSuccess;
}
}
