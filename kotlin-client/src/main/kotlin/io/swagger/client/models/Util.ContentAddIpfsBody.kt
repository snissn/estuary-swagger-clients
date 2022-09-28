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
package io.swagger.client.models


/**
 * 
 * @param coluuid 
 * @param dir 
 * @param filename 
 * @param peers 
 * @param root 
 */
data class UtilContentAddIpfsBody (

    val coluuid: kotlin.String? = null,
    val dir: kotlin.String? = null,
    val filename: kotlin.String? = null,
    val peers: kotlin.Array<kotlin.String>? = null,
    val root: kotlin.String? = null
) {
}