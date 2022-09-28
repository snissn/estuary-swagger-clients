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
package io.swagger.client.apis

import io.swagger.client.models.UtilHttpError

import io.swagger.client.infrastructure.*

class PinningApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * List all pin status objects
     * This endpoint lists all pin status objects
     * @return void
     */
    fun pinningPinsGet(): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/pinning/pins"
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Delete a pinned object
     * This endpoint deletes a pinned object.
     * @param pinid Pin ID 
     * @return void
     */
    fun pinningPinsPinidDelete(pinid: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/pinning/pins/{pinid}".replace("{" + "pinid" + "}", "$pinid")
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a pin status object
     * This endpoint returns a pin status object.
     * @param pinid cid 
     * @return void
     */
    fun pinningPinsPinidGet(pinid: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/pinning/pins/{pinid}".replace("{" + "pinid" + "}", "$pinid")
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Replace a pinned object
     * This endpoint replaces a pinned object.
     * @param pinid Pin ID 
     * @return void
     */
    fun pinningPinsPinidPost(pinid: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/pinning/pins/{pinid}".replace("{" + "pinid" + "}", "$pinid")
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Add and pin object
     * This endpoint adds a pin to the IPFS daemon.
     * @param cid cid 
     * @param name name 
     * @return void
     */
    fun pinningPinsPost(cid: kotlin.String, name: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/pinning/pins".replace("{" + "cid" + "}", "$cid").replace("{" + "name" + "}", "$name")
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}