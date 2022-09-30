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
 * CollectionsApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_CollectionsApi_H_
#define IO_SWAGGER_CLIENT_API_CollectionsApi_H_


#include "../ApiClient.h"

#include "Collections.Collection.h"
#include "Main.createCollectionBody.h"
#include "Util.HttpError.h"
#include <vector>
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  CollectionsApi
{
public:
    CollectionsApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~CollectionsApi();
    /// <summary>
    /// Produce a CID of the collection contents
    /// </summary>
    /// <remarks>
    /// This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
    /// </remarks>
    /// <param name="coluuid">coluuid</param>
    pplx::task<utility::string_t> collectionsColuuidCommitPost(
        utility::string_t coluuid
    );
    /// <summary>
    /// Deletes a content from a collection
    /// </summary>
    /// <remarks>
    /// This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
    /// </remarks>
    /// <param name="coluuid">Collection ID</param>
    /// <param name="contentid">Content ID</param>
    /// <param name="by">Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;)</param>
    /// <param name="value">Value of content_id or path to look for</param>
    pplx::task<utility::string_t> collectionsColuuidContentsDelete(
        utility::string_t coluuid,
        utility::string_t contentid,
        utility::string_t by,
        utility::string_t value
    );
    /// <summary>
    /// Deletes a collection
    /// </summary>
    /// <remarks>
    /// This endpoint is used to delete an existing collection.
    /// </remarks>
    /// <param name="coluuid">Collection ID</param>
    pplx::task<void> collectionsColuuidDelete(
        utility::string_t coluuid
    );
    /// <summary>
    /// Get contents in a collection
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get contents in a collection. If no colpath query param is passed
    /// </remarks>
    /// <param name="coluuid">Collection UUID</param>
    /// <param name="dir">Directory (optional)</param>
    pplx::task<utility::string_t> collectionsColuuidGet(
        utility::string_t coluuid,
        boost::optional<utility::string_t> dir
    );
    /// <summary>
    /// Add contents to a collection
    /// </summary>
    /// <remarks>
    /// This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    /// </remarks>
    /// <param name="body">Content IDs to add to collection</param>
    pplx::task<std::map<utility::string_t, utility::string_t>> collectionsColuuidPost(
        std::vector<int32_t> body
    );
    /// <summary>
    /// Add a file to a collection
    /// </summary>
    /// <remarks>
    /// This endpoint adds a file to a collection
    /// </remarks>
    /// <param name="coluuid">Collection ID</param>
    /// <param name="content">Content</param>
    /// <param name="path">Path to file</param>
    pplx::task<void> collectionsFsAddPost(
        utility::string_t coluuid,
        utility::string_t content,
        utility::string_t path
    );
    /// <summary>
    /// List all collections
    /// </summary>
    /// <remarks>
    /// This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    /// </remarks>
    pplx::task<std::vector<std::shared_ptr<Collections.Collection>>> collectionsGet(
    );
    /// <summary>
    /// Create a new collection
    /// </summary>
    /// <remarks>
    /// This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    /// </remarks>
    /// <param name="body">Collection name and description</param>
    pplx::task<std::shared_ptr<Collections.Collection>> collectionsPost(
        std::shared_ptr<Main.createCollectionBody> body
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_CollectionsApi_H_ */

