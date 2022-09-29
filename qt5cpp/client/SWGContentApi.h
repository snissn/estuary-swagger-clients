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

#ifndef _SWG_SWGContentApi_H_
#define _SWG_SWGContentApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGHttpRequest.h"
#include "SWGMain.importDealBody.h"
#include "SWGUtil.ContentAddIpfsBody.h"
#include "SWGUtil.ContentAddResponse.h"

#include <QObject>

namespace Swagger {

class SWGContentApi: public QObject {
    Q_OBJECT

public:
    SWGContentApi();
    SWGContentApi(QString host, QString basePath);
    ~SWGContentApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void contentAddCarPost(QString*& body, QString* filename, QString* commp, QString* size);
    void contentAddIpfsPost(SWGUtil.ContentAddIpfsBody& body);
    void contentAddPost(SWGHttpRequestInputFileElement* file, QString* coluuid, QString* dir);
    void contentAggregatedContentGet(QString* content);
    void contentAllDealsGet(QString* begin, QString* duration, QString* all);
    void contentBwUsageContentGet(QString* content);
    void contentCreatePost(QString*& body);
    void contentDealsGet(qint32 limit, qint32 offset);
    void contentEnsureReplicationDatacidGet(QString* datacid);
    void contentFailuresContentGet(QString* content);
    void contentImportdealPost(SWGMain.importDealBody& body);
    void contentListGet();
    void contentReadContGet(QString* cont);
    void contentStagingZonesGet();
    void contentStatsGet(QString* limit);
    void contentStatusIdGet(qint32 id);
    
private:
    void contentAddCarPostCallback (SWGHttpRequestWorker * worker);
    void contentAddIpfsPostCallback (SWGHttpRequestWorker * worker);
    void contentAddPostCallback (SWGHttpRequestWorker * worker);
    void contentAggregatedContentGetCallback (SWGHttpRequestWorker * worker);
    void contentAllDealsGetCallback (SWGHttpRequestWorker * worker);
    void contentBwUsageContentGetCallback (SWGHttpRequestWorker * worker);
    void contentCreatePostCallback (SWGHttpRequestWorker * worker);
    void contentDealsGetCallback (SWGHttpRequestWorker * worker);
    void contentEnsureReplicationDatacidGetCallback (SWGHttpRequestWorker * worker);
    void contentFailuresContentGetCallback (SWGHttpRequestWorker * worker);
    void contentImportdealPostCallback (SWGHttpRequestWorker * worker);
    void contentListGetCallback (SWGHttpRequestWorker * worker);
    void contentReadContGetCallback (SWGHttpRequestWorker * worker);
    void contentStagingZonesGetCallback (SWGHttpRequestWorker * worker);
    void contentStatsGetCallback (SWGHttpRequestWorker * worker);
    void contentStatusIdGetCallback (SWGHttpRequestWorker * worker);
    
signals:
    void contentAddCarPostSignal();
    void contentAddIpfsPostSignal();
    void contentAddPostSignal(SWGUtil.ContentAddResponse* summary);
    void contentAggregatedContentGetSignal(QString* summary);
    void contentAllDealsGetSignal();
    void contentBwUsageContentGetSignal();
    void contentCreatePostSignal();
    void contentDealsGetSignal();
    void contentEnsureReplicationDatacidGetSignal();
    void contentFailuresContentGetSignal(QString* summary);
    void contentImportdealPostSignal();
    void contentListGetSignal(QList<QString*>* summary);
    void contentReadContGetSignal();
    void contentStagingZonesGetSignal();
    void contentStatsGetSignal();
    void contentStatusIdGetSignal();
    
    void contentAddCarPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAddIpfsPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAddPostSignalE(SWGUtil.ContentAddResponse* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAggregatedContentGetSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAllDealsGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentBwUsageContentGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentCreatePostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentDealsGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentEnsureReplicationDatacidGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentFailuresContentGetSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentImportdealPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentListGetSignalE(QList<QString*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentReadContGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentStagingZonesGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentStatsGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void contentStatusIdGetSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void contentAddCarPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAddIpfsPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAddPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAggregatedContentGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentAllDealsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentBwUsageContentGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentCreatePostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentDealsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentEnsureReplicationDatacidGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentFailuresContentGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentImportdealPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentListGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentReadContGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentStagingZonesGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentStatsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void contentStatusIdGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
