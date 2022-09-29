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

object PeeringApi {

  /**
   * This endpoint can be used to remove a Peer from the Peering Service
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminPeeringPeersDelete()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://api.estuary.tech", "/admin/peering/peers", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint can be used to list all peers on Peering Service
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminPeeringPeersGet()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/admin/peering/peers", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint can be used to add a Peer from the Peering Service
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminPeeringPeersPost()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/admin/peering/peers", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint can be used to start the Peering Service
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminPeeringStartPost()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/admin/peering/start", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint can be used to check the Peering status
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminPeeringStatusGet()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/admin/peering/status", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint can be used to stop the Peering Service
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def adminPeeringStopPost()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/admin/peering/stop", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      

}

