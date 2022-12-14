/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.28.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * PublicApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_PublicApi_H_
#define IO_SWAGGER_CLIENT_API_PublicApi_H_


#include "../ApiClient.h"

#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  PublicApi
{
public:
    PublicApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~PublicApi();
    /// <summary>
    /// Get Content by Cid
    /// </summary>
    /// <remarks>
    /// This endpoint returns the content associated with a CID
    /// </remarks>
    /// <param name="cid">Cid</param>
    pplx::task<void> publicByCidCidGet(
        utility::string_t cid
    );
    /// <summary>
    /// Get public node info
    /// </summary>
    /// <remarks>
    /// This endpoint returns information about the node
    /// </remarks>
    pplx::task<void> publicInfoGet(
    );
    /// <summary>
    /// Get deal metrics
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get deal metrics
    /// </remarks>
    pplx::task<void> publicMetricsDealsOnChainGet(
    );
    /// <summary>
    /// Get all miners deals
    /// </summary>
    /// <remarks>
    /// This endpoint returns all miners deals
    /// </remarks>
    /// <param name="miner">Filter by miner</param>
    pplx::task<void> publicMinersDealsMinerGet(
        utility::string_t miner
    );
    /// <summary>
    /// Get all miners
    /// </summary>
    /// <remarks>
    /// This endpoint returns all miners
    /// </remarks>
    /// <param name="miner">Filter by miner</param>
    pplx::task<void> publicMinersFailuresMinerGet(
        utility::string_t miner
    );
    /// <summary>
    /// Get all miners
    /// </summary>
    /// <remarks>
    /// This endpoint returns all miners
    /// </remarks>
    pplx::task<void> publicMinersGet(
    );
    /// <summary>
    /// Get miner stats
    /// </summary>
    /// <remarks>
    /// This endpoint returns miner stats
    /// </remarks>
    /// <param name="miner">Filter by miner</param>
    pplx::task<void> publicMinersStatsMinerGet(
        utility::string_t miner
    );
    /// <summary>
    /// Net Addrs
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get net addrs
    /// </remarks>
    pplx::task<std::vector<utility::string_t>> publicNetAddrsGet(
    );
    /// <summary>
    /// Net Peers
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get net peers
    /// </remarks>
    pplx::task<std::vector<utility::string_t>> publicNetPeersGet(
    );
    /// <summary>
    /// Public stats
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get public stats.
    /// </remarks>
    pplx::task<void> publicStatsGet(
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_PublicApi_H_ */

