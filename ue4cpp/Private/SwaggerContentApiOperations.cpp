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
#include "SwaggerContentApiOperations.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace Swagger 
{

FString SwaggerContentApi::ContentAddCarPostRequest::ComputePath() const
{
	FString Path(TEXT("/content/add-car"));
	TArray<FString> QueryParams;
	if(Filename.IsSet())
	{
		QueryParams.Add(FString(TEXT("filename=")) + ToUrlString(Filename.GetValue()));
	}
	if(Commp.IsSet())
	{
		QueryParams.Add(FString(TEXT("commp=")) + ToUrlString(Commp.GetValue()));
	}
	if(Size.IsSet())
	{
		QueryParams.Add(FString(TEXT("size=")) + ToUrlString(Size.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void SwaggerContentApi::ContentAddCarPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Body);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}


bool SwaggerContentApi::ContentAddCarPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentAddIpfsPostRequest::ComputePath() const
{
	FString Path(TEXT("/content/add-ipfs"));
	return Path;
}

void SwaggerContentApi::ContentAddIpfsPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Body);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}


bool SwaggerContentApi::ContentAddIpfsPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentAddPostRequest::ComputePath() const
{
	FString Path(TEXT("/content/add"));
	TArray<FString> QueryParams;
	if(Coluuid.IsSet())
	{
		QueryParams.Add(FString(TEXT("coluuid=")) + ToUrlString(Coluuid.GetValue()));
	}
	if(Dir.IsSet())
	{
		QueryParams.Add(FString(TEXT("dir=")) + ToUrlString(Dir.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void SwaggerContentApi::ContentAddPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = { TEXT("multipart/form-data") };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Form parameter (data) was ignored, cannot be used in JsonBody"));
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		HttpMultipartFormData FormData;
		FormData.AddFilePart(TEXT("data"), Data);

		FormData.SetupHttpRequest(HttpRequest);
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		TArray<FString> FormParams;
		UE_LOG(LogSwagger, Error, TEXT("Form parameter (data) was ignored, Files are not supported in urlencoded requests"));
		
		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/x-www-form-urlencoded; charset=utf-8"));
		HttpRequest->SetContentAsString(FString::Join(FormParams, TEXT("&")));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerContentApi::ContentAddPostResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
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

bool SwaggerContentApi::ContentAddPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerContentApi::ContentAggregatedContentGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("content"), ToStringFormatArg(Content) } };

	FString Path = FString::Format(TEXT("/content/aggregated/{content}"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentAggregatedContentGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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

void SwaggerContentApi::ContentAggregatedContentGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
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

bool SwaggerContentApi::ContentAggregatedContentGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerContentApi::ContentAllDealsGetRequest::ComputePath() const
{
	FString Path(TEXT("/content/all-deals"));
	TArray<FString> QueryParams;
	QueryParams.Add(FString(TEXT("begin=")) + ToUrlString(Begin));
	QueryParams.Add(FString(TEXT("duration=")) + ToUrlString(Duration));
	QueryParams.Add(FString(TEXT("all=")) + ToUrlString(All));
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void SwaggerContentApi::ContentAllDealsGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentAllDealsGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentBwUsageContentGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("content"), ToStringFormatArg(Content) } };

	FString Path = FString::Format(TEXT("/content/bw-usage/{content}"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentBwUsageContentGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentBwUsageContentGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentCreatePostRequest::ComputePath() const
{
	FString Path(TEXT("/content/create"));
	return Path;
}

void SwaggerContentApi::ContentCreatePostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Body);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}


bool SwaggerContentApi::ContentCreatePostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentDealsGetRequest::ComputePath() const
{
	FString Path(TEXT("/content/deals"));
	TArray<FString> QueryParams;
	if(Limit.IsSet())
	{
		QueryParams.Add(FString(TEXT("limit=")) + ToUrlString(Limit.GetValue()));
	}
	if(Offset.IsSet())
	{
		QueryParams.Add(FString(TEXT("offset=")) + ToUrlString(Offset.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void SwaggerContentApi::ContentDealsGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentDealsGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentEnsureReplicationDatacidGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("datacid"), ToStringFormatArg(Datacid) } };

	FString Path = FString::Format(TEXT("/content/ensure-replication/{datacid}"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentEnsureReplicationDatacidGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentEnsureReplicationDatacidGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentFailuresContentGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("content"), ToStringFormatArg(Content) } };

	FString Path = FString::Format(TEXT("/content/failures/{content}"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentFailuresContentGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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

void SwaggerContentApi::ContentFailuresContentGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
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

bool SwaggerContentApi::ContentFailuresContentGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerContentApi::ContentImportdealPostRequest::ComputePath() const
{
	FString Path(TEXT("/content/importdeal"));
	return Path;
}

void SwaggerContentApi::ContentImportdealPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Body);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}


bool SwaggerContentApi::ContentImportdealPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentListGetRequest::ComputePath() const
{
	FString Path(TEXT("/content/list"));
	return Path;
}

void SwaggerContentApi::ContentListGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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

void SwaggerContentApi::ContentListGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
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

bool SwaggerContentApi::ContentListGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerContentApi::ContentReadContGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("cont"), ToStringFormatArg(Cont) } };

	FString Path = FString::Format(TEXT("/content/read/{cont}"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentReadContGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentReadContGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentStagingZonesGetRequest::ComputePath() const
{
	FString Path(TEXT("/content/staging-zones"));
	return Path;
}

void SwaggerContentApi::ContentStagingZonesGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentStagingZonesGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentStatsGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("limit"), ToStringFormatArg(Limit) } };

	FString Path = FString::Format(TEXT("/content/stats"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentStatsGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentStatsGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString SwaggerContentApi::ContentStatusIdGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("id"), ToStringFormatArg(Id) } };

	FString Path = FString::Format(TEXT("/content/status/{id}"), PathParams);
	
	return Path;
}

void SwaggerContentApi::ContentStatusIdGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
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


bool SwaggerContentApi::ContentStatusIdGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

}