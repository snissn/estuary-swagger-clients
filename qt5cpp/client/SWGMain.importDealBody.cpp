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


#include "SWGMain.importDealBody.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGMain.importDealBody::SWGMain.importDealBody(QString json) {
    init();
    this->fromJson(json);
}

SWGMain.importDealBody::SWGMain.importDealBody() {
    init();
}

SWGMain.importDealBody::~SWGMain.importDealBody() {
    this->cleanup();
}

void
SWGMain.importDealBody::init() {
    coluuid = new QString("");
    m_coluuid_isSet = false;
    deal_i_ds = new QList<qint32>();
    m_deal_i_ds_isSet = false;
    dir = new QString("");
    m_dir_isSet = false;
    name = new QString("");
    m_name_isSet = false;
}

void
SWGMain.importDealBody::cleanup() {
    if(coluuid != nullptr) { 
        delete coluuid;
    }

    if(deal_i_ds != nullptr) { 
        delete deal_i_ds;
    }
    if(dir != nullptr) { 
        delete dir;
    }
    if(name != nullptr) { 
        delete name;
    }
}

SWGMain.importDealBody*
SWGMain.importDealBody::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMain.importDealBody::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&coluuid, pJson["coluuid"], "QString", "QString");
    
    
    ::Swagger::setValue(&deal_i_ds, pJson["dealIDs"], "QList", "qint32");
    ::Swagger::setValue(&dir, pJson["dir"], "QString", "QString");
    
    ::Swagger::setValue(&name, pJson["name"], "QString", "QString");
    
}

QString
SWGMain.importDealBody::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGMain.importDealBody::asJsonObject() {
    QJsonObject obj;
    if(coluuid != nullptr && *coluuid != QString("")){
        toJsonValue(QString("coluuid"), coluuid, obj, QString("QString"));
    }
    if(deal_i_ds->size() > 0){
        toJsonArray((QList<void*>*)deal_i_ds, obj, "dealIDs", "");
    }
    if(dir != nullptr && *dir != QString("")){
        toJsonValue(QString("dir"), dir, obj, QString("QString"));
    }
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }

    return obj;
}

QString*
SWGMain.importDealBody::getColuuid() {
    return coluuid;
}
void
SWGMain.importDealBody::setColuuid(QString* coluuid) {
    this->coluuid = coluuid;
    this->m_coluuid_isSet = true;
}

QList<qint32>*
SWGMain.importDealBody::getDealIDs() {
    return deal_i_ds;
}
void
SWGMain.importDealBody::setDealIDs(QList<qint32>* deal_i_ds) {
    this->deal_i_ds = deal_i_ds;
    this->m_deal_i_ds_isSet = true;
}

QString*
SWGMain.importDealBody::getDir() {
    return dir;
}
void
SWGMain.importDealBody::setDir(QString* dir) {
    this->dir = dir;
    this->m_dir_isSet = true;
}

QString*
SWGMain.importDealBody::getName() {
    return name;
}
void
SWGMain.importDealBody::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}


bool
SWGMain.importDealBody::isSet(){
    bool isObjectUpdated = false;
    do{
        if(coluuid != nullptr && *coluuid != QString("")){ isObjectUpdated = true; break;}
        if(m_deal_i_ds_isSet){ isObjectUpdated = true; break;}if(deal_i_ds->size() > 0){ isObjectUpdated = true; break;}
        if(dir != nullptr && *dir != QString("")){ isObjectUpdated = true; break;}
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

