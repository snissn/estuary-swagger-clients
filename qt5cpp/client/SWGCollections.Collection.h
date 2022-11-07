/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * SWGCollections.Collection.h
 *
 * 
 */

#ifndef SWGCollections.Collection_H_
#define SWGCollections.Collection_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGCollections.Collection: public SWGObject {
public:
    SWGCollections.Collection();
    SWGCollections.Collection(QString json);
    ~SWGCollections.Collection();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGCollections.Collection* fromJson(QString jsonString) override;

    QString* getCid();
    void setCid(QString* cid);

    QString* getCreatedAt();
    void setCreatedAt(QString* created_at);

    QString* getDescription();
    void setDescription(QString* description);

    QString* getName();
    void setName(QString* name);

    qint32 getUserId();
    void setUserId(qint32 user_id);

    QString* getUuid();
    void setUuid(QString* uuid);


    virtual bool isSet() override;

private:
    QString* cid;
    bool m_cid_isSet;

    QString* created_at;
    bool m_created_at_isSet;

    QString* description;
    bool m_description_isSet;

    QString* name;
    bool m_name_isSet;

    qint32 user_id;
    bool m_user_id_isSet;

    QString* uuid;
    bool m_uuid_isSet;

};

}

#endif /* SWGCollections.Collection_H_ */