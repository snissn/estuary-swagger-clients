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
 * SwaggerMain_deleteContentFromCollectionBody
 *
 * 
 */
class SWAGGER_API SwaggerMain_deleteContentFromCollectionBody : public Model
{
public:
    virtual ~SwaggerMain_deleteContentFromCollectionBody() {}
	bool FromJson(const TSharedPtr<FJsonObject>& JsonObject) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> By;
	TOptional<FString> Value;
};

}
