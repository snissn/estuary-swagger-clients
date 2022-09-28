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
package io.swagger.client.model


/**
 * @param coluuid 
 * @param dealIDs 
 * @param dir 
 * @param name 
 */
case class ImportDealBody (
  coluuid: Option[String] = None,
  dealIDs: Option[List[Integer]] = None,
  dir: Option[String] = None,
  name: Option[String] = None
)
