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

#ifndef _SWG_SWGMinerApi_H_
#define _SWG_SWGMinerApi_H_

#include "SWGHttpRequest.h"

#include <QString>

#include <QObject>

namespace Swagger {

class SWGMinerApi: public QObject {
    Q_OBJECT

public:
    SWGMinerApi();
    SWGMinerApi(QString host, QString basePath);
    ~SWGMinerApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void publicMinersDealsMinerGet(QString* miner);
    void publicMinersStatsMinerGet(QString* miner);
    
private:
    void publicMinersDealsMinerGetCallback (SWGHttpRequestWorker * worker);
    void publicMinersStatsMinerGetCallback (SWGHttpRequestWorker * worker);
    
signals:
    void publicMinersDealsMinerGetSignal();
    void publicMinersStatsMinerGetSignal();
    
    void publicMinersDealsMinerGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersStatsMinerGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void publicMinersDealsMinerGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersStatsMinerGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
