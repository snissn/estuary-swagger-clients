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
 * SwaggerMain_estimateDealBody
 *
 * 
 */
class SWAGGER_API SwaggerMain_estimateDealBody : public Model
{
public:
    virtual ~SwaggerMain_estimateDealBody() {}
	bool FromJson(const TSharedPtr<FJsonObject>& JsonObject) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<int32> DurationBlks;
	TOptional<int32> Replication;
	TOptional<int32> Size;
	TOptional<bool> Verified;
};

}
