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


import io.swagger.client.infrastructure.*

class AutoretrieveApi(basePath: kotlin.String = "https://api.estuary.tech") : ApiClient(basePath) {

    /**
    * Register autoretrieve server
    * This endpoint registers a new autoretrieve server
    * @param addresses Autoretrieve&#39;s comma-separated list of addresses 
    * @param pubKey Autoretrieve&#39;s public key 
    * @return void
    */
    fun adminAutoretrieveInitPost(addresses: kotlin.String, pubKey: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = addressespubKey
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/admin/autoretrieve/init",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Unit>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * List autoretrieve servers
    * This endpoint lists all registered autoretrieve servers
    * @return void
    */
    fun adminAutoretrieveListGet() : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/admin/autoretrieve/list",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Unit>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Marks autoretrieve server as up
    * This endpoint updates the lastConnection field for autoretrieve
    * @param token Autoretrieve&#39;s auth token 
    * @return void
    */
    fun autoretrieveHeartbeatPost(token: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf("token" to token)
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/autoretrieve/heartbeat",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Unit>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
