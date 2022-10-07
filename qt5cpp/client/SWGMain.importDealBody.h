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
 * SWGMain.importDealBody.h
 *
 * 
 */

#ifndef SWGMain.importDealBody_H_
#define SWGMain.importDealBody_H_

#include <QJsonObject>


#include <QList>
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGMain.importDealBody: public SWGObject {
public:
    SWGMain.importDealBody();
    SWGMain.importDealBody(QString json);
    ~SWGMain.importDealBody();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGMain.importDealBody* fromJson(QString jsonString) override;

    QString* getColuuid();
    void setColuuid(QString* coluuid);

    QList<qint32>* getDealIDs();
    void setDealIDs(QList<qint32>* deal_i_ds);

    QString* getDir();
    void setDir(QString* dir);

    QString* getName();
    void setName(QString* name);


    virtual bool isSet() override;

private:
    QString* coluuid;
    bool m_coluuid_isSet;

    QList<qint32>* deal_i_ds;
    bool m_deal_i_ds_isSet;

    QString* dir;
    bool m_dir_isSet;

    QString* name;
    bool m_name_isSet;

};

}

#endif /* SWGMain.importDealBody_H_ */
