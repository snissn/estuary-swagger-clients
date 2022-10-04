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
 * ContentApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_ContentApi_H_
#define IO_SWAGGER_CLIENT_API_ContentApi_H_


#include "../ApiClient.h"

#include "HttpContent.h"
#include "Main.importDealBody.h"
#include "Util.ContentAddIpfsBody.h"
#include "Util.ContentAddResponse.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  ContentApi
{
public:
    ContentApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~ContentApi();
    /// <summary>
    /// Add Car object
    /// </summary>
    /// <remarks>
    /// This endpoint is used to add a car object to the network. The object can be a file or a directory.
    /// </remarks>
    /// <param name="body">Car</param>
    /// <param name="filename">Filename (optional)</param>
    /// <param name="commp">Commp (optional)</param>
    /// <param name="size">Size (optional)</param>
    pplx::task<void> contentAddCarPost(
        utility::string_t body,
        boost::optional<utility::string_t> filename,
        boost::optional<utility::string_t> commp,
        boost::optional<utility::string_t> size
    );
    /// <summary>
    /// Add IPFS object
    /// </summary>
    /// <remarks>
    /// This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
    /// </remarks>
    /// <param name="body">IPFS Body</param>
    pplx::task<void> contentAddIpfsPost(
        std::shared_ptr<Util.ContentAddIpfsBody> body
    );
    /// <summary>
    /// Add new content
    /// </summary>
    /// <remarks>
    /// This endpoint is used to upload new content.
    /// </remarks>
    /// <param name="data">File to upload</param>
    /// <param name="coluuid">Collection UUID (optional)</param>
    /// <param name="dir">Directory (optional)</param>
    pplx::task<std::shared_ptr<Util.ContentAddResponse>> contentAddPost(
        std::shared_ptr<HttpContent> data,
        boost::optional<utility::string_t> coluuid,
        boost::optional<utility::string_t> dir
    );
    /// <summary>
    /// Get aggregated content stats
    /// </summary>
    /// <remarks>
    /// This endpoint returns aggregated content stats
    /// </remarks>
    /// <param name="content">Content ID</param>
    pplx::task<utility::string_t> contentAggregatedContentGet(
        utility::string_t content
    );
    /// <summary>
    /// Get all deals for a user
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get all deals for a user
    /// </remarks>
    /// <param name="begin">Begin</param>
    /// <param name="duration">Duration</param>
    /// <param name="all">All</param>
    pplx::task<void> contentAllDealsGet(
        utility::string_t begin,
        utility::string_t duration,
        utility::string_t all
    );
    /// <summary>
    /// Get content bandwidth
    /// </summary>
    /// <remarks>
    /// This endpoint returns content bandwidth
    /// </remarks>
    /// <param name="content">Content ID</param>
    pplx::task<void> contentBwUsageContentGet(
        utility::string_t content
    );
    /// <summary>
    /// Add a new content
    /// </summary>
    /// <remarks>
    /// This endpoint adds a new content
    /// </remarks>
    /// <param name="body">Content</param>
    pplx::task<void> contentCreatePost(
        utility::string_t body
    );
    /// <summary>
    /// Content with deals
    /// </summary>
    /// <remarks>
    /// This endpoint lists all content with deals
    /// </remarks>
    /// <param name="limit">Limit (optional)</param>
    /// <param name="offset">Offset (optional)</param>
    pplx::task<void> contentDealsGet(
        boost::optional<int32_t> limit,
        boost::optional<int32_t> offset
    );
    /// <summary>
    /// Ensure Replication
    /// </summary>
    /// <remarks>
    /// This endpoint ensures that the content is replicated to the specified number of providers
    /// </remarks>
    /// <param name="datacid">Data CID</param>
    pplx::task<void> contentEnsureReplicationDatacidGet(
        utility::string_t datacid
    );
    /// <summary>
    /// List all failures for a content
    /// </summary>
    /// <remarks>
    /// This endpoint returns all failures for a content
    /// </remarks>
    /// <param name="content">Content ID</param>
    pplx::task<utility::string_t> contentFailuresContentGet(
        utility::string_t content
    );
    /// <summary>
    /// Import a deal
    /// </summary>
    /// <remarks>
    /// This endpoint imports a deal into the shuttle.
    /// </remarks>
    /// <param name="body">Import a deal</param>
    pplx::task<void> contentImportdealPost(
        std::shared_ptr<Main.importDealBody> body
    );
    /// <summary>
    /// List all pinned content
    /// </summary>
    /// <remarks>
    /// This endpoint lists all content
    /// </remarks>
    pplx::task<std::vector<utility::string_t>> contentListGet(
    );
    /// <summary>
    /// Read content
    /// </summary>
    /// <remarks>
    /// This endpoint reads content from the blockstore
    /// </remarks>
    /// <param name="cont">CID</param>
    pplx::task<void> contentReadContGet(
        utility::string_t cont
    );
    /// <summary>
    /// Get staging zone for user
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get staging zone for user.
    /// </remarks>
    pplx::task<void> contentStagingZonesGet(
    );
    /// <summary>
    /// Get content statistics
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
    /// </remarks>
    /// <param name="limit">limit</param>
    pplx::task<void> contentStatsGet(
        utility::string_t limit
    );
    /// <summary>
    /// Content Status
    /// </summary>
    /// <remarks>
    /// This endpoint returns the status of a content
    /// </remarks>
    /// <param name="id">Content ID</param>
    pplx::task<void> contentStatusIdGet(
        int32_t id
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_ContentApi_H_ */

