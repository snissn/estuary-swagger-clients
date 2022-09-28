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

import io.swagger.client.models.MainCollection
import io.swagger.client.models.MaincreateCollectionBody
import io.swagger.client.models.UtilHttpError

import io.swagger.client.infrastructure.*

class CollectionsApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * Produce a CID of the collection contents
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     * @param coluuid coluuid 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun collectionsColuuidCommitPost(coluuid: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/collections/{coluuid}/commit".replace("{" + "coluuid" + "}", "$coluuid")
        )
        val response = request<kotlin.String>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Deletes a collection
     * This endpoint is used to delete an existing collection.
     * @param coluuid Collection ID 
     * @return void
     */
    fun collectionsColuuidDelete(coluuid: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/collections/{coluuid}".replace("{" + "coluuid" + "}", "$coluuid")
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
     * Get contents in a collection
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     * @param coluuid Collection UUID 
     * @param dir Directory (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun collectionsColuuidGet(coluuid: kotlin.String, dir: kotlin.String? = null): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("coluuid" to listOf("$coluuid"), "dir" to listOf("$dir"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/collections/{coluuid}", query = localVariableQuery
        )
        val response = request<kotlin.String>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Add contents to a collection
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     * @param body Content IDs to add to collection 
     * @return kotlin.collections.Map<kotlin.String, kotlin.String>
     */
    @Suppress("UNCHECKED_CAST")
    fun collectionsColuuidPost(body: kotlin.Array<kotlin.Int>): kotlin.collections.Map<kotlin.String, kotlin.String> {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/collections/{coluuid}"
        )
        val response = request<kotlin.collections.Map<kotlin.String, kotlin.String>>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.collections.Map<kotlin.String, kotlin.String>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Add a file to a collection
     * This endpoint adds a file to a collection
     * @param coluuid Collection ID 
     * @param content Content 
     * @param path Path to file 
     * @return void
     */
    fun collectionsFsAddPost(coluuid: kotlin.String, content: kotlin.String, path: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf("coluuid" to listOf("$coluuid"), "content" to listOf("$content"), "path" to listOf("$path"))
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/collections/fs/add", query = localVariableQuery
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
     * List all collections
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     * @param id User ID 
     * @return kotlin.Array<MainCollection>
     */
    @Suppress("UNCHECKED_CAST")
    fun collectionsGet(id: kotlin.Int): kotlin.Array<MainCollection> {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/collections/".replace("{" + "id" + "}", "$id")
        )
        val response = request<kotlin.Array<MainCollection>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<MainCollection>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Create a new collection
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     * @param body Collection name and description 
     * @return MainCollection
     */
    @Suppress("UNCHECKED_CAST")
    fun collectionsPost(body: MaincreateCollectionBody): MainCollection {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/collections/"
        )
        val response = request<MainCollection>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as MainCollection
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}