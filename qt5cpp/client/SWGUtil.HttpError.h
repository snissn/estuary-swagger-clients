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
 * SWGUtil.HttpError.h
 *
 * 
 */

#ifndef SWGUtil.HttpError_H_
#define SWGUtil.HttpError_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGUtil.HttpError: public SWGObject {
public:
    SWGUtil.HttpError();
    SWGUtil.HttpError(QString json);
    ~SWGUtil.HttpError();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGUtil.HttpError* fromJson(QString jsonString) override;

    qint32 getCode();
    void setCode(qint32 code);

    QString* getDetails();
    void setDetails(QString* details);

    QString* getReason();
    void setReason(QString* reason);


    virtual bool isSet() override;

private:
    qint32 code;
    bool m_code_isSet;

    QString* details;
    bool m_details_isSet;

    QString* reason;
    bool m_reason_isSet;

};

}

#endif /* SWGUtil.HttpError_H_ */
