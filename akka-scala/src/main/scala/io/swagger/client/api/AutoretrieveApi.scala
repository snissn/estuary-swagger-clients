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

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AutoretrieveApi {

  /**
   * This endpoint registers a new autoretrieve server Q@&amp;^5#^&amp;*Q^Wasdfalsdkjflkj
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param addresses Autoretrieve&#39;s comma-separated list of addresses
   * @param pubKey Autoretrieve&#39;s public key
   */
  def adminAutoretrieveInitPost(addresses: String, pubKey: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/admin/autoretrieve/init", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withFormParam("addresses", addresses)
      .withFormParam("pubKey", pubKey)
        /**
   * This endpoint lists all registered autoretrieve servers
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminAutoretrieveListGet()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/admin/autoretrieve/list", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint updates the lastConnection field for autoretrieve
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param token Autoretrieve&#39;s auth token
   */
  def autoretrieveHeartbeatPost(token: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/autoretrieve/heartbeat", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withHeaderParam("token", token)
      

}
