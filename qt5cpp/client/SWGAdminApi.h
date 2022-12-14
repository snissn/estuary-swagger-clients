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

#ifndef _SWG_SWGAdminApi_H_
#define _SWG_SWGAdminApi_H_

#include "SWGHttpRequest.h"


#include <QObject>

namespace Swagger {

class SWGAdminApi: public QObject {
    Q_OBJECT

public:
    SWGAdminApi();
    SWGAdminApi(QString host, QString basePath);
    ~SWGAdminApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void adminPeeringPeersDelete();
    void adminPeeringPeersGet();
    void adminPeeringPeersPost();
    void adminPeeringStartPost();
    void adminPeeringStatusGet();
    void adminPeeringStopPost();
    void adminSystemConfigGet();
    void adminUsersGet();
    
private:
    void adminPeeringPeersDeleteCallback (SWGHttpRequestWorker * worker);
    void adminPeeringPeersGetCallback (SWGHttpRequestWorker * worker);
    void adminPeeringPeersPostCallback (SWGHttpRequestWorker * worker);
    void adminPeeringStartPostCallback (SWGHttpRequestWorker * worker);
    void adminPeeringStatusGetCallback (SWGHttpRequestWorker * worker);
    void adminPeeringStopPostCallback (SWGHttpRequestWorker * worker);
    void adminSystemConfigGetCallback (SWGHttpRequestWorker * worker);
    void adminUsersGetCallback (SWGHttpRequestWorker * worker);
    
signals:
    void adminPeeringPeersDeleteSignal();
    void adminPeeringPeersGetSignal();
    void adminPeeringPeersPostSignal();
    void adminPeeringStartPostSignal();
    void adminPeeringStatusGetSignal();
    void adminPeeringStopPostSignal();
    void adminSystemConfigGetSignal();
    void adminUsersGetSignal();
    
    void adminPeeringPeersDeleteSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringPeersGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringPeersPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringStartPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringStatusGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringStopPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminSystemConfigGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void adminUsersGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void adminPeeringPeersDeleteSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringPeersGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringPeersPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringStartPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringStatusGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminPeeringStopPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminSystemConfigGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void adminUsersGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
