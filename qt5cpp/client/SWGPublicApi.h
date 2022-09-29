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

#ifndef _SWG_SWGPublicApi_H_
#define _SWG_SWGPublicApi_H_

#include "SWGHttpRequest.h"

#include <QString>

#include <QObject>

namespace Swagger {

class SWGPublicApi: public QObject {
    Q_OBJECT

public:
    SWGPublicApi();
    SWGPublicApi(QString host, QString basePath);
    ~SWGPublicApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void publicByCidCidGet(QString* cid);
    void publicInfoGet();
    void publicMetricsDealsOnChainGet();
    void publicMinersDealsMinerGet(QString* miner);
    void publicMinersFailuresMinerGet(QString* miner);
    void publicMinersGet();
    void publicMinersStatsMinerGet(QString* miner);
    void publicNetAddrsGet();
    void publicNetPeersGet();
    void publicStatsGet();
    
private:
    void publicByCidCidGetCallback (SWGHttpRequestWorker * worker);
    void publicInfoGetCallback (SWGHttpRequestWorker * worker);
    void publicMetricsDealsOnChainGetCallback (SWGHttpRequestWorker * worker);
    void publicMinersDealsMinerGetCallback (SWGHttpRequestWorker * worker);
    void publicMinersFailuresMinerGetCallback (SWGHttpRequestWorker * worker);
    void publicMinersGetCallback (SWGHttpRequestWorker * worker);
    void publicMinersStatsMinerGetCallback (SWGHttpRequestWorker * worker);
    void publicNetAddrsGetCallback (SWGHttpRequestWorker * worker);
    void publicNetPeersGetCallback (SWGHttpRequestWorker * worker);
    void publicStatsGetCallback (SWGHttpRequestWorker * worker);
    
signals:
    void publicByCidCidGetSignal();
    void publicInfoGetSignal();
    void publicMetricsDealsOnChainGetSignal();
    void publicMinersDealsMinerGetSignal();
    void publicMinersFailuresMinerGetSignal();
    void publicMinersGetSignal();
    void publicMinersStatsMinerGetSignal();
    void publicNetAddrsGetSignal(QList<QString*>* summary);
    void publicNetPeersGetSignal(QList<QString*>* summary);
    void publicStatsGetSignal();
    
    void publicByCidCidGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicInfoGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMetricsDealsOnChainGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersDealsMinerGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersFailuresMinerGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersStatsMinerGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void publicNetAddrsGetSignalE(QList<QString*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicNetPeersGetSignalE(QList<QString*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicStatsGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void publicByCidCidGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicInfoGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMetricsDealsOnChainGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersDealsMinerGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersFailuresMinerGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicMinersStatsMinerGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicNetAddrsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicNetPeersGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void publicStatsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif