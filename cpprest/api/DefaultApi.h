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
 * DefaultApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_DefaultApi_H_
#define IO_SWAGGER_CLIENT_API_DefaultApi_H_


#include "../ApiClient.h"


#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  DefaultApi
{
public:
    DefaultApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~DefaultApi();
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<void> dealTransferStatusPost(
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_DefaultApi_H_ */
