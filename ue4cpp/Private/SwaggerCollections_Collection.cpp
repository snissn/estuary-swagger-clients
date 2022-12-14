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
#include "SwaggerCollections_Collection.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Templates/SharedPointer.h"

namespace Swagger 
{

void SwaggerCollections_Collection::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Cid.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cid")); WriteJsonValue(Writer, Cid.GetValue());	
	}
	if (CreatedAt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("createdAt")); WriteJsonValue(Writer, CreatedAt.GetValue());	
	}
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());	
	}
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());	
	}
	if (UserId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("userId")); WriteJsonValue(Writer, UserId.GetValue());	
	}
	if (Uuid.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("uuid")); WriteJsonValue(Writer, Uuid.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool SwaggerCollections_Collection::FromJson(const TSharedPtr<FJsonObject>& JsonObject)
{
	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("cid"), Cid);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("createdAt"), CreatedAt);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("userId"), UserId);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("uuid"), Uuid);

	return ParseSuccess;
}
}
