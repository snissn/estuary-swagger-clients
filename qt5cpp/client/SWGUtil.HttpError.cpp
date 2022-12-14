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


#include "SWGUtil.HttpError.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGUtil.HttpError::SWGUtil.HttpError(QString json) {
    init();
    this->fromJson(json);
}

SWGUtil.HttpError::SWGUtil.HttpError() {
    init();
}

SWGUtil.HttpError::~SWGUtil.HttpError() {
    this->cleanup();
}

void
SWGUtil.HttpError::init() {
    code = 0;
    m_code_isSet = false;
    details = new QString("");
    m_details_isSet = false;
    reason = new QString("");
    m_reason_isSet = false;
}

void
SWGUtil.HttpError::cleanup() {

    if(details != nullptr) { 
        delete details;
    }
    if(reason != nullptr) { 
        delete reason;
    }
}

SWGUtil.HttpError*
SWGUtil.HttpError::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGUtil.HttpError::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&code, pJson["code"], "qint32", "");
    
    ::Swagger::setValue(&details, pJson["details"], "QString", "QString");
    
    ::Swagger::setValue(&reason, pJson["reason"], "QString", "QString");
    
}

QString
SWGUtil.HttpError::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGUtil.HttpError::asJsonObject() {
    QJsonObject obj;
    if(m_code_isSet){
        obj.insert("code", QJsonValue(code));
    }
    if(details != nullptr && *details != QString("")){
        toJsonValue(QString("details"), details, obj, QString("QString"));
    }
    if(reason != nullptr && *reason != QString("")){
        toJsonValue(QString("reason"), reason, obj, QString("QString"));
    }

    return obj;
}

qint32
SWGUtil.HttpError::getCode() {
    return code;
}
void
SWGUtil.HttpError::setCode(qint32 code) {
    this->code = code;
    this->m_code_isSet = true;
}

QString*
SWGUtil.HttpError::getDetails() {
    return details;
}
void
SWGUtil.HttpError::setDetails(QString* details) {
    this->details = details;
    this->m_details_isSet = true;
}

QString*
SWGUtil.HttpError::getReason() {
    return reason;
}
void
SWGUtil.HttpError::setReason(QString* reason) {
    this->reason = reason;
    this->m_reason_isSet = true;
}


bool
SWGUtil.HttpError::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_code_isSet){ isObjectUpdated = true; break;}
        if(details != nullptr && *details != QString("")){ isObjectUpdated = true; break;}
        if(reason != nullptr && *reason != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

