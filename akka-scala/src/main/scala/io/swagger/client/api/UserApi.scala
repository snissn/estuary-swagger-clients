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
package io.swagger.client.api

import io.swagger.client.model.MainGetApiKeysResp
import io.swagger.client.model.MainUserStatsResponse
import io.swagger.client.model.UtilHttpError
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UserApi {

  /**
   * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
   * 
   * Expected answers:
   *   code 200 : Seq[MainGetApiKeysResp] (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 404 : UtilHttpError (Not Found)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def userApiKeysGet()(implicit apiKey: ApiKeyValue): ApiRequest[Seq[MainGetApiKeysResp]] =
    ApiRequest[Seq[MainGetApiKeysResp]](ApiMethods.GET, "https://api.estuary.tech", "/user/api-keys", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[Seq[MainGetApiKeysResp]](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](404)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param key Key
   */
  def userApiKeysKeyDelete(key: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://api.estuary.tech", "/user/api-keys/{key}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("key", key)
        /**
   * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
   * 
   * Expected answers:
   *   code 200 : MainGetApiKeysResp (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 404 : UtilHttpError (Not Found)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def userApiKeysPost()(implicit apiKey: ApiKeyValue): ApiRequest[MainGetApiKeysResp] =
    ApiRequest[MainGetApiKeysResp](ApiMethods.POST, "https://api.estuary.tech", "/user/api-keys", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[MainGetApiKeysResp](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](404)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint is used to get API keys for a user.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def userExportGet()(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://api.estuary.tech", "/user/export", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[String](200)
        /**
   * This endpoint is used to create API keys for a user.
   * 
   * Expected answers:
   *   code 200 : MainUserStatsResponse (OK)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def userStatsGet()(implicit apiKey: ApiKeyValue): ApiRequest[MainUserStatsResponse] =
    ApiRequest[MainUserStatsResponse](ApiMethods.GET, "https://api.estuary.tech", "/user/stats", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[MainUserStatsResponse](200)
      

}

