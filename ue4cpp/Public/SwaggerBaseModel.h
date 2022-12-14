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

#include "Interfaces/IHttpRequest.h"
#include "Interfaces/IHttpResponse.h"
#include "Serialization/JsonWriter.h"
#include "Dom/JsonObject.h"

namespace Swagger 
{

typedef TSharedRef<TJsonWriter<>> JsonWriter;

class SWAGGER_API Model
{ 
public:
	virtual ~Model() {}
	virtual void WriteJson(JsonWriter& Writer) const = 0;
	virtual bool FromJson(const TSharedPtr<FJsonObject>& JsonObject) = 0;
};

class SWAGGER_API Request
{
public:
	virtual ~Request() {}
	virtual void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const = 0;
	virtual FString ComputePath() const = 0;
};

class SWAGGER_API Response
{
public:
	virtual ~Response() {}
	virtual bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) = 0;

	void SetSuccessful(bool InSuccessful) { Successful = InSuccessful; }
	bool IsSuccessful() const { return Successful; }

	virtual void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode);
	EHttpResponseCodes::Type GetHttpResponseCode() const { return ResponseCode; }

	void SetResponseString(const FString& InResponseString) { ResponseString = InResponseString; }
	const FString& GetResponseString() const { return ResponseString; }

	void SetHttpResponse(const FHttpResponsePtr& InHttpResponse) { HttpResponse = InHttpResponse; }
	const FHttpResponsePtr& GetHttpResponse() const { return HttpResponse; }

private:
	bool Successful;
	EHttpResponseCodes::Type ResponseCode;
	FString ResponseString;
	FHttpResponsePtr HttpResponse;
};

}
