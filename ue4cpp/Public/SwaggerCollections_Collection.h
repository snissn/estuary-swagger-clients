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

#include "SwaggerBaseModel.h"

namespace Swagger 
{

/*
 * SwaggerCollections_Collection
 *
 * 
 */
class SWAGGER_API SwaggerCollections_Collection : public Model
{
public:
    virtual ~SwaggerCollections_Collection() {}
	bool FromJson(const TSharedPtr<FJsonObject>& JsonObject) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Cid;
	TOptional<FString> CreatedAt;
	TOptional<FString> Description;
	TOptional<FString> Name;
	TOptional<int32> UserId;
	TOptional<FString> Uuid;
};

}
