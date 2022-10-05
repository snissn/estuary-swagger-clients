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



#include "Main.estimateDealBody.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Main.estimateDealBody::Main.estimateDealBody()
{
    m_DurationBlks = 0;
    m_DurationBlksIsSet = false;
    m_Replication = 0;
    m_ReplicationIsSet = false;
    m_Size = 0;
    m_SizeIsSet = false;
    m_Verified = false;
    m_VerifiedIsSet = false;
}

Main.estimateDealBody::~Main.estimateDealBody()
{
}

void Main.estimateDealBody::validate()
{
    // TODO: implement validation
}

web::json::value Main.estimateDealBody::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_DurationBlksIsSet)
    {
        val[utility::conversions::to_string_t("durationBlks")] = ModelBase::toJson(m_DurationBlks);
    }
    if(m_ReplicationIsSet)
    {
        val[utility::conversions::to_string_t("replication")] = ModelBase::toJson(m_Replication);
    }
    if(m_SizeIsSet)
    {
        val[utility::conversions::to_string_t("size")] = ModelBase::toJson(m_Size);
    }
    if(m_VerifiedIsSet)
    {
        val[utility::conversions::to_string_t("verified")] = ModelBase::toJson(m_Verified);
    }

    return val;
}

void Main.estimateDealBody::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("durationBlks")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("durationBlks")];
        if(!fieldValue.is_null())
        {
            setDurationBlks(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("replication")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("replication")];
        if(!fieldValue.is_null())
        {
            setReplication(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("size")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("size")];
        if(!fieldValue.is_null())
        {
            setSize(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("verified")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("verified")];
        if(!fieldValue.is_null())
        {
            setVerified(ModelBase::boolFromJson(fieldValue));
        }
    }
}

void Main.estimateDealBody::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_DurationBlksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("durationBlks"), m_DurationBlks));
    }
    if(m_ReplicationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("replication"), m_Replication));
    }
    if(m_SizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("size"), m_Size));
    }
    if(m_VerifiedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("verified"), m_Verified));
    }
}

void Main.estimateDealBody::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("durationBlks")))
    {
        setDurationBlks(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("durationBlks"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("replication")))
    {
        setReplication(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("replication"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("size")))
    {
        setSize(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("size"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("verified")))
    {
        setVerified(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("verified"))));
    }
}

int32_t Main.estimateDealBody::getDurationBlks() const
{
    return m_DurationBlks;
}


void Main.estimateDealBody::setDurationBlks(int32_t value)
{
    m_DurationBlks = value;
    m_DurationBlksIsSet = true;
}
bool Main.estimateDealBody::durationBlksIsSet() const
{
    return m_DurationBlksIsSet;
}

void Main.estimateDealBody::unsetDurationBlks()
{
    m_DurationBlksIsSet = false;
}

int32_t Main.estimateDealBody::getReplication() const
{
    return m_Replication;
}


void Main.estimateDealBody::setReplication(int32_t value)
{
    m_Replication = value;
    m_ReplicationIsSet = true;
}
bool Main.estimateDealBody::replicationIsSet() const
{
    return m_ReplicationIsSet;
}

void Main.estimateDealBody::unsetReplication()
{
    m_ReplicationIsSet = false;
}

int32_t Main.estimateDealBody::getSize() const
{
    return m_Size;
}


void Main.estimateDealBody::setSize(int32_t value)
{
    m_Size = value;
    m_SizeIsSet = true;
}
bool Main.estimateDealBody::sizeIsSet() const
{
    return m_SizeIsSet;
}

void Main.estimateDealBody::unsetSize()
{
    m_SizeIsSet = false;
}

bool Main.estimateDealBody::isVerified() const
{
    return m_Verified;
}


void Main.estimateDealBody::setVerified(bool value)
{
    m_Verified = value;
    m_VerifiedIsSet = true;
}
bool Main.estimateDealBody::verifiedIsSet() const
{
    return m_VerifiedIsSet;
}

void Main.estimateDealBody::unsetVerified()
{
    m_VerifiedIsSet = false;
}

}
}
}
}
