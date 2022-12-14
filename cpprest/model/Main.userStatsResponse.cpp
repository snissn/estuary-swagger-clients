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



#include "Main.userStatsResponse.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Main.userStatsResponse::Main.userStatsResponse()
{
    m_NumPins = 0;
    m_NumPinsIsSet = false;
    m_TotalSize = 0;
    m_TotalSizeIsSet = false;
}

Main.userStatsResponse::~Main.userStatsResponse()
{
}

void Main.userStatsResponse::validate()
{
    // TODO: implement validation
}

web::json::value Main.userStatsResponse::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_NumPinsIsSet)
    {
        val[utility::conversions::to_string_t("numPins")] = ModelBase::toJson(m_NumPins);
    }
    if(m_TotalSizeIsSet)
    {
        val[utility::conversions::to_string_t("totalSize")] = ModelBase::toJson(m_TotalSize);
    }

    return val;
}

void Main.userStatsResponse::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("numPins")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("numPins")];
        if(!fieldValue.is_null())
        {
            setNumPins(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("totalSize")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("totalSize")];
        if(!fieldValue.is_null())
        {
            setTotalSize(ModelBase::int32_tFromJson(fieldValue));
        }
    }
}

void Main.userStatsResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_NumPinsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("numPins"), m_NumPins));
    }
    if(m_TotalSizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("totalSize"), m_TotalSize));
    }
}

void Main.userStatsResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("numPins")))
    {
        setNumPins(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("numPins"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("totalSize")))
    {
        setTotalSize(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("totalSize"))));
    }
}

int32_t Main.userStatsResponse::getNumPins() const
{
    return m_NumPins;
}


void Main.userStatsResponse::setNumPins(int32_t value)
{
    m_NumPins = value;
    m_NumPinsIsSet = true;
}
bool Main.userStatsResponse::numPinsIsSet() const
{
    return m_NumPinsIsSet;
}

void Main.userStatsResponse::unsetNumPins()
{
    m_NumPinsIsSet = false;
}

int32_t Main.userStatsResponse::getTotalSize() const
{
    return m_TotalSize;
}


void Main.userStatsResponse::setTotalSize(int32_t value)
{
    m_TotalSize = value;
    m_TotalSizeIsSet = true;
}
bool Main.userStatsResponse::totalSizeIsSet() const
{
    return m_TotalSizeIsSet;
}

void Main.userStatsResponse::unsetTotalSize()
{
    m_TotalSizeIsSet = false;
}

}
}
}
}

