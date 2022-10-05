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
 * DealsApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_DealsApi_H_
#define IO_SWAGGER_CLIENT_API_DealsApi_H_


#include "../ApiClient.h"

#include "Main.estimateDealBody.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  DealsApi
{
public:
    DealsApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~DealsApi();
    /// <summary>
    /// Estimate the cost of a deal
    /// </summary>
    /// <remarks>
    /// This endpoint estimates the cost of a deal
    /// </remarks>
    /// <param name="body">The size of the deal in bytes, the replication factor, and the duration of the deal in blocks</param>
    pplx::task<void> dealEstimatePost(
        std::shared_ptr<Main.estimateDealBody> body
    );
    /// <summary>
    /// Get Deal Info
    /// </summary>
    /// <remarks>
    /// This endpoint returns the deal info for a deal
    /// </remarks>
    /// <param name="dealid">Deal ID</param>
    pplx::task<void> dealInfoDealidGet(
        int32_t dealid
    );
    /// <summary>
    /// Get Proposal
    /// </summary>
    /// <remarks>
    /// This endpoint returns the proposal for a deal
    /// </remarks>
    /// <param name="propcid">Proposal CID</param>
    pplx::task<void> dealProposalPropcidGet(
        utility::string_t propcid
    );
    /// <summary>
    /// Query Ask
    /// </summary>
    /// <remarks>
    /// This endpoint returns the ask for a given CID
    /// </remarks>
    /// <param name="miner">CID</param>
    pplx::task<void> dealQueryMinerGet(
        utility::string_t miner
    );
    /// <summary>
    /// Get Deal Status by PropCid
    /// </summary>
    /// <remarks>
    /// Get Deal Status by PropCid
    /// </remarks>
    /// <param name="propcid">PropCid</param>
    pplx::task<void> dealStatusByProposalPropcidGet(
        utility::string_t propcid
    );
    /// <summary>
    /// Deal Status
    /// </summary>
    /// <remarks>
    /// This endpoint returns the status of a deal
    /// </remarks>
    /// <param name="miner">Miner</param>
    /// <param name="propcid">Proposal CID</param>
    pplx::task<void> dealStatusMinerPropcidGet(
        utility::string_t miner,
        utility::string_t propcid
    );
    /// <summary>
    /// Transfer In Progress
    /// </summary>
    /// <remarks>
    /// This endpoint returns the in-progress transfers
    /// </remarks>
    pplx::task<void> dealTransferInProgressGet(
    );
    /// <summary>
    /// Transfer Status
    /// </summary>
    /// <remarks>
    /// This endpoint returns the status of a transfer
    /// </remarks>
    pplx::task<void> dealTransferStatusPost(
    );
    /// <summary>
    /// Get storage failures for user
    /// </summary>
    /// <remarks>
    /// This endpoint returns a list of storage failures for user
    /// </remarks>
    pplx::task<void> dealsFailuresGet(
    );
    /// <summary>
    /// Make Deal
    /// </summary>
    /// <remarks>
    /// This endpoint makes a deal for a given content and miner
    /// </remarks>
    /// <param name="miner">Miner</param>
    /// <param name="dealRequest">Deal Request</param>
    pplx::task<void> dealsMakeMinerPost(
        utility::string_t miner,
        utility::string_t dealRequest
    );
    /// <summary>
    /// Get Deal Status
    /// </summary>
    /// <remarks>
    /// This endpoint returns the status of a deal
    /// </remarks>
    /// <param name="deal">Deal ID</param>
    pplx::task<void> dealsStatusDealGet(
        int32_t deal
    );
    /// <summary>
    /// Get storage failures
    /// </summary>
    /// <remarks>
    /// This endpoint returns a list of storage failures
    /// </remarks>
    pplx::task<void> publicDealsFailuresGet(
    );
    /// <summary>
    /// Query Ask
    /// </summary>
    /// <remarks>
    /// This endpoint returns the ask for a given CID
    /// </remarks>
    /// <param name="miner">CID</param>
    pplx::task<void> publicMinersStorageQueryMinerGet(
        utility::string_t miner
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_DealsApi_H_ */
