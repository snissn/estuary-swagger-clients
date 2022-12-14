/*
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

public class SwagMetricsApi {
    SwagClient client;

    public SwagMetricsApi(SwagClient client) {
        this.client = client;
    }

    public SwagMetricsApi() {
        this.client = new SwagClient();
    }

    public SwagClient getClient() {
        return this.client;
    }

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     * @throws Swagger.ApiException if fails to make API call
     */
    public void publicMetricsDealsOnChainGet() {
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'GET', '/public/metrics/deals-on-chain', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'bearerAuth' },
            null
        );
    }
}
