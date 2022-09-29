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
 * PinningApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_PinningApi_H_
#define IO_SWAGGER_CLIENT_API_PinningApi_H_


#include "../ApiClient.h"

#include "Util.HttpError.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  PinningApi
{
public:
    PinningApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~PinningApi();
    /// <summary>
    /// List all pin status objects
    /// </summary>
    /// <remarks>
    /// This endpoint lists all pin status objects
    /// </remarks>
    pplx::task<void> pinningPinsGet(
    );
    /// <summary>
    /// Delete a pinned object
    /// </summary>
    /// <remarks>
    /// This endpoint deletes a pinned object.
    /// </remarks>
    /// <param name="pinid">Pin ID</param>
    pplx::task<void> pinningPinsPinidDelete(
        utility::string_t pinid
    );
    /// <summary>
    /// Get a pin status object
    /// </summary>
    /// <remarks>
    /// This endpoint returns a pin status object.
    /// </remarks>
    /// <param name="pinid">cid</param>
    pplx::task<void> pinningPinsPinidGet(
        utility::string_t pinid
    );
    /// <summary>
    /// Replace a pinned object
    /// </summary>
    /// <remarks>
    /// This endpoint replaces a pinned object.
    /// </remarks>
    /// <param name="pinid">Pin ID</param>
    pplx::task<void> pinningPinsPinidPost(
        utility::string_t pinid
    );
    /// <summary>
    /// Add and pin object
    /// </summary>
    /// <remarks>
    /// This endpoint adds a pin to the IPFS daemon.
    /// </remarks>
    /// <param name="cid">cid</param>
    /// <param name="name">name</param>
    pplx::task<void> pinningPinsPost(
        utility::string_t cid,
        utility::string_t name
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_PinningApi_H_ */
