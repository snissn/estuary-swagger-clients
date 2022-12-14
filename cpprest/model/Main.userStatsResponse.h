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
 * Main.userStatsResponse.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Main.userStatsResponse_H_
#define IO_SWAGGER_CLIENT_MODEL_Main.userStatsResponse_H_


#include "../ModelBase.h"


namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Main.userStatsResponse
    : public ModelBase
{
public:
    Main.userStatsResponse();
    virtual ~Main.userStatsResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Main.userStatsResponse members

    /// <summary>
    /// 
    /// </summary>
    int32_t getNumPins() const;
    bool numPinsIsSet() const;
    void unsetNumPins();
    void setNumPins(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getTotalSize() const;
    bool totalSizeIsSet() const;
    void unsetTotalSize();
    void setTotalSize(int32_t value);

protected:
    int32_t m_NumPins;
    bool m_NumPinsIsSet;
    int32_t m_TotalSize;
    bool m_TotalSizeIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Main.userStatsResponse_H_ */
