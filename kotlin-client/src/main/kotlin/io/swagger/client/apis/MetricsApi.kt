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

class MetricsApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     * @return void
     */
    fun publicMetricsDealsOnChainGet(): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/public/metrics/deals-on-chain"
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
