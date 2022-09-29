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

#ifndef _SWG_SWGUserApi_H_
#define _SWG_SWGUserApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGMain.getApiKeysResp.h"
#include "SWGMain.userStatsResponse.h"
#include "SWGUtil.HttpError.h"

#include <QObject>

namespace Swagger {

class SWGUserApi: public QObject {
    Q_OBJECT

public:
    SWGUserApi();
    SWGUserApi(QString host, QString basePath);
    ~SWGUserApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void userApiKeysGet();
    void userApiKeysKeyDelete(QString* key);
    void userApiKeysPost();
    void userExportGet();
    void userStatsGet();
    
private:
    void userApiKeysGetCallback (SWGHttpRequestWorker * worker);
    void userApiKeysKeyDeleteCallback (SWGHttpRequestWorker * worker);
    void userApiKeysPostCallback (SWGHttpRequestWorker * worker);
    void userExportGetCallback (SWGHttpRequestWorker * worker);
    void userStatsGetCallback (SWGHttpRequestWorker * worker);
    
signals:
    void userApiKeysGetSignal(QList<SWGMain.getApiKeysResp*>* summary);
    void userApiKeysKeyDeleteSignal();
    void userApiKeysPostSignal(SWGMain.getApiKeysResp* summary);
    void userExportGetSignal(QString* summary);
    void userStatsGetSignal(SWGMain.userStatsResponse* summary);
    
    void userApiKeysGetSignalE(QList<SWGMain.getApiKeysResp*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void userApiKeysKeyDeleteSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void userApiKeysPostSignalE(SWGMain.getApiKeysResp* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void userExportGetSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void userStatsGetSignalE(SWGMain.userStatsResponse* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void userApiKeysGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void userApiKeysKeyDeleteSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void userApiKeysPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void userExportGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void userStatsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif