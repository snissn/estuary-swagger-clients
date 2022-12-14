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



#include "Collections.Collection.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Collections.Collection::Collections.Collection()
{
    m_Cid = utility::conversions::to_string_t("");
    m_CidIsSet = false;
    m_CreatedAt = utility::conversions::to_string_t("");
    m_CreatedAtIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_UserId = 0;
    m_UserIdIsSet = false;
    m_Uuid = utility::conversions::to_string_t("");
    m_UuidIsSet = false;
}

Collections.Collection::~Collections.Collection()
{
}

void Collections.Collection::validate()
{
    // TODO: implement validation
}

web::json::value Collections.Collection::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CidIsSet)
    {
        val[utility::conversions::to_string_t("cid")] = ModelBase::toJson(m_Cid);
    }
    if(m_CreatedAtIsSet)
    {
        val[utility::conversions::to_string_t("createdAt")] = ModelBase::toJson(m_CreatedAt);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t("description")] = ModelBase::toJson(m_Description);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_UserIdIsSet)
    {
        val[utility::conversions::to_string_t("userId")] = ModelBase::toJson(m_UserId);
    }
    if(m_UuidIsSet)
    {
        val[utility::conversions::to_string_t("uuid")] = ModelBase::toJson(m_Uuid);
    }

    return val;
}

void Collections.Collection::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("cid")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("cid")];
        if(!fieldValue.is_null())
        {
            setCid(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("createdAt")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("createdAt")];
        if(!fieldValue.is_null())
        {
            setCreatedAt(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("description")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("description")];
        if(!fieldValue.is_null())
        {
            setDescription(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("name")];
        if(!fieldValue.is_null())
        {
            setName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("userId")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("userId")];
        if(!fieldValue.is_null())
        {
            setUserId(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("uuid")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("uuid")];
        if(!fieldValue.is_null())
        {
            setUuid(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void Collections.Collection::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_CidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("cid"), m_Cid));
        
    }
    if(m_CreatedAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("createdAt"), m_CreatedAt));
        
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("description"), m_Description));
        
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
        
    }
    if(m_UserIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("userId"), m_UserId));
    }
    if(m_UuidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("uuid"), m_Uuid));
        
    }
}

void Collections.Collection::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("cid")))
    {
        setCid(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("cid"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("createdAt")))
    {
        setCreatedAt(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("createdAt"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("description")))
    {
        setDescription(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("description"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("userId")))
    {
        setUserId(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("userId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("uuid")))
    {
        setUuid(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("uuid"))));
    }
}

utility::string_t Collections.Collection::getCid() const
{
    return m_Cid;
}


void Collections.Collection::setCid(utility::string_t value)
{
    m_Cid = value;
    m_CidIsSet = true;
}
bool Collections.Collection::cidIsSet() const
{
    return m_CidIsSet;
}

void Collections.Collection::unsetCid()
{
    m_CidIsSet = false;
}

utility::string_t Collections.Collection::getCreatedAt() const
{
    return m_CreatedAt;
}


void Collections.Collection::setCreatedAt(utility::string_t value)
{
    m_CreatedAt = value;
    m_CreatedAtIsSet = true;
}
bool Collections.Collection::createdAtIsSet() const
{
    return m_CreatedAtIsSet;
}

void Collections.Collection::unsetCreatedAt()
{
    m_CreatedAtIsSet = false;
}

utility::string_t Collections.Collection::getDescription() const
{
    return m_Description;
}


void Collections.Collection::setDescription(utility::string_t value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool Collections.Collection::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void Collections.Collection::unsetDescription()
{
    m_DescriptionIsSet = false;
}

utility::string_t Collections.Collection::getName() const
{
    return m_Name;
}


void Collections.Collection::setName(utility::string_t value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool Collections.Collection::nameIsSet() const
{
    return m_NameIsSet;
}

void Collections.Collection::unsetName()
{
    m_NameIsSet = false;
}

int32_t Collections.Collection::getUserId() const
{
    return m_UserId;
}


void Collections.Collection::setUserId(int32_t value)
{
    m_UserId = value;
    m_UserIdIsSet = true;
}
bool Collections.Collection::userIdIsSet() const
{
    return m_UserIdIsSet;
}

void Collections.Collection::unsetUserId()
{
    m_UserIdIsSet = false;
}

utility::string_t Collections.Collection::getUuid() const
{
    return m_Uuid;
}


void Collections.Collection::setUuid(utility::string_t value)
{
    m_Uuid = value;
    m_UuidIsSet = true;
}
bool Collections.Collection::uuidIsSet() const
{
    return m_UuidIsSet;
}

void Collections.Collection::unsetUuid()
{
    m_UuidIsSet = false;
}

}
}
}
}

