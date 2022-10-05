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



#include "Util.ContentAddIpfsBody.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Util.ContentAddIpfsBody::Util.ContentAddIpfsBody()
{
    m_Coluuid = utility::conversions::to_string_t("");
    m_ColuuidIsSet = false;
    m_Dir = utility::conversions::to_string_t("");
    m_DirIsSet = false;
    m_Filename = utility::conversions::to_string_t("");
    m_FilenameIsSet = false;
    m_PeersIsSet = false;
    m_Root = utility::conversions::to_string_t("");
    m_RootIsSet = false;
}

Util.ContentAddIpfsBody::~Util.ContentAddIpfsBody()
{
}

void Util.ContentAddIpfsBody::validate()
{
    // TODO: implement validation
}

web::json::value Util.ContentAddIpfsBody::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_ColuuidIsSet)
    {
        val[utility::conversions::to_string_t("coluuid")] = ModelBase::toJson(m_Coluuid);
    }
    if(m_DirIsSet)
    {
        val[utility::conversions::to_string_t("dir")] = ModelBase::toJson(m_Dir);
    }
    if(m_FilenameIsSet)
    {
        val[utility::conversions::to_string_t("filename")] = ModelBase::toJson(m_Filename);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Peers )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("peers")] = web::json::value::array(jsonArray);
        }
    }
    if(m_RootIsSet)
    {
        val[utility::conversions::to_string_t("root")] = ModelBase::toJson(m_Root);
    }

    return val;
}

void Util.ContentAddIpfsBody::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("coluuid")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("coluuid")];
        if(!fieldValue.is_null())
        {
            setColuuid(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("dir")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("dir")];
        if(!fieldValue.is_null())
        {
            setDir(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("filename")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("filename")];
        if(!fieldValue.is_null())
        {
            setFilename(ModelBase::stringFromJson(fieldValue));
        }
    }
    {
        m_Peers.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("peers")))
        {
        for( auto& item : val[utility::conversions::to_string_t("peers")].as_array() )
        {
            m_Peers.push_back(ModelBase::stringFromJson(item));
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("root")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("root")];
        if(!fieldValue.is_null())
        {
            setRoot(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void Util.ContentAddIpfsBody::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_ColuuidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("coluuid"), m_Coluuid));
        
    }
    if(m_DirIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("dir"), m_Dir));
        
    }
    if(m_FilenameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("filename"), m_Filename));
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Peers )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("peers"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_RootIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("root"), m_Root));
        
    }
}

void Util.ContentAddIpfsBody::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("coluuid")))
    {
        setColuuid(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("coluuid"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("dir")))
    {
        setDir(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("dir"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("filename")))
    {
        setFilename(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("filename"))));
    }
    {
        m_Peers.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("peers")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("peers"))));
        for( auto& item : jsonArray.as_array() )
        {
            m_Peers.push_back(ModelBase::stringFromJson(item));
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("root")))
    {
        setRoot(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("root"))));
    }
}

utility::string_t Util.ContentAddIpfsBody::getColuuid() const
{
    return m_Coluuid;
}


void Util.ContentAddIpfsBody::setColuuid(utility::string_t value)
{
    m_Coluuid = value;
    m_ColuuidIsSet = true;
}
bool Util.ContentAddIpfsBody::coluuidIsSet() const
{
    return m_ColuuidIsSet;
}

void Util.ContentAddIpfsBody::unsetColuuid()
{
    m_ColuuidIsSet = false;
}

utility::string_t Util.ContentAddIpfsBody::getDir() const
{
    return m_Dir;
}


void Util.ContentAddIpfsBody::setDir(utility::string_t value)
{
    m_Dir = value;
    m_DirIsSet = true;
}
bool Util.ContentAddIpfsBody::dirIsSet() const
{
    return m_DirIsSet;
}

void Util.ContentAddIpfsBody::unsetDir()
{
    m_DirIsSet = false;
}

utility::string_t Util.ContentAddIpfsBody::getFilename() const
{
    return m_Filename;
}


void Util.ContentAddIpfsBody::setFilename(utility::string_t value)
{
    m_Filename = value;
    m_FilenameIsSet = true;
}
bool Util.ContentAddIpfsBody::filenameIsSet() const
{
    return m_FilenameIsSet;
}

void Util.ContentAddIpfsBody::unsetFilename()
{
    m_FilenameIsSet = false;
}

std::vector<utility::string_t>& Util.ContentAddIpfsBody::getPeers()
{
    return m_Peers;
}

void Util.ContentAddIpfsBody::setPeers(std::vector<utility::string_t> value)
{
    m_Peers = value;
    m_PeersIsSet = true;
}
bool Util.ContentAddIpfsBody::peersIsSet() const
{
    return m_PeersIsSet;
}

void Util.ContentAddIpfsBody::unsetPeers()
{
    m_PeersIsSet = false;
}

utility::string_t Util.ContentAddIpfsBody::getRoot() const
{
    return m_Root;
}


void Util.ContentAddIpfsBody::setRoot(utility::string_t value)
{
    m_Root = value;
    m_RootIsSet = true;
}
bool Util.ContentAddIpfsBody::rootIsSet() const
{
    return m_RootIsSet;
}

void Util.ContentAddIpfsBody::unsetRoot()
{
    m_RootIsSet = false;
}

}
}
}
}
