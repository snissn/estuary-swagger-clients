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


#include "SWGMain.deleteContentFromCollectionBody.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGMain.deleteContentFromCollectionBody::SWGMain.deleteContentFromCollectionBody(QString json) {
    init();
    this->fromJson(json);
}

SWGMain.deleteContentFromCollectionBody::SWGMain.deleteContentFromCollectionBody() {
    init();
}

SWGMain.deleteContentFromCollectionBody::~SWGMain.deleteContentFromCollectionBody() {
    this->cleanup();
}

void
SWGMain.deleteContentFromCollectionBody::init() {
    by = new QString("");
    m_by_isSet = false;
    value = new QString("");
    m_value_isSet = false;
}

void
SWGMain.deleteContentFromCollectionBody::cleanup() {
    if(by != nullptr) { 
        delete by;
    }
    if(value != nullptr) { 
        delete value;
    }
}

SWGMain.deleteContentFromCollectionBody*
SWGMain.deleteContentFromCollectionBody::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMain.deleteContentFromCollectionBody::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&by, pJson["by"], "QString", "QString");
    
    ::Swagger::setValue(&value, pJson["value"], "QString", "QString");
    
}

QString
SWGMain.deleteContentFromCollectionBody::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGMain.deleteContentFromCollectionBody::asJsonObject() {
    QJsonObject obj;
    if(by != nullptr && *by != QString("")){
        toJsonValue(QString("by"), by, obj, QString("QString"));
    }
    if(value != nullptr && *value != QString("")){
        toJsonValue(QString("value"), value, obj, QString("QString"));
    }

    return obj;
}

QString*
SWGMain.deleteContentFromCollectionBody::getBy() {
    return by;
}
void
SWGMain.deleteContentFromCollectionBody::setBy(QString* by) {
    this->by = by;
    this->m_by_isSet = true;
}

QString*
SWGMain.deleteContentFromCollectionBody::getValue() {
    return value;
}
void
SWGMain.deleteContentFromCollectionBody::setValue(QString* value) {
    this->value = value;
    this->m_value_isSet = true;
}


bool
SWGMain.deleteContentFromCollectionBody::isSet(){
    bool isObjectUpdated = false;
    do{
        if(by != nullptr && *by != QString("")){ isObjectUpdated = true; break;}
        if(value != nullptr && *value != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

