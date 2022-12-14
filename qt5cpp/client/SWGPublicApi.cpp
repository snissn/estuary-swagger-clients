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

#include "SWGPublicApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGPublicApi::SWGPublicApi() {}

SWGPublicApi::~SWGPublicApi() {}

SWGPublicApi::SWGPublicApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGPublicApi::publicByCidCidGet(QString* cid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/by-cid/{cid}");

    QString cidPathParam("{"); cidPathParam.append("cid").append("}");
    fullPath.replace(cidPathParam, stringValue(cid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicByCidCidGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicByCidCidGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicByCidCidGetSignal();
    } else {
        emit publicByCidCidGetSignalE(error_type, error_str);
        emit publicByCidCidGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicInfoGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/info");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicInfoGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicInfoGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicInfoGetSignal();
    } else {
        emit publicInfoGetSignalE(error_type, error_str);
        emit publicInfoGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicMetricsDealsOnChainGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/metrics/deals-on-chain");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicMetricsDealsOnChainGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicMetricsDealsOnChainGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicMetricsDealsOnChainGetSignal();
    } else {
        emit publicMetricsDealsOnChainGetSignalE(error_type, error_str);
        emit publicMetricsDealsOnChainGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicMinersDealsMinerGet(QString* miner) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/miners/deals/{miner}");

    QString minerPathParam("{"); minerPathParam.append("miner").append("}");
    fullPath.replace(minerPathParam, stringValue(miner));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicMinersDealsMinerGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicMinersDealsMinerGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicMinersDealsMinerGetSignal();
    } else {
        emit publicMinersDealsMinerGetSignalE(error_type, error_str);
        emit publicMinersDealsMinerGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicMinersFailuresMinerGet(QString* miner) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/miners/failures/{miner}");

    QString minerPathParam("{"); minerPathParam.append("miner").append("}");
    fullPath.replace(minerPathParam, stringValue(miner));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicMinersFailuresMinerGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicMinersFailuresMinerGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicMinersFailuresMinerGetSignal();
    } else {
        emit publicMinersFailuresMinerGetSignalE(error_type, error_str);
        emit publicMinersFailuresMinerGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicMinersGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/miners");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicMinersGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicMinersGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicMinersGetSignal();
    } else {
        emit publicMinersGetSignalE(error_type, error_str);
        emit publicMinersGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicMinersStatsMinerGet(QString* miner) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/miners/stats/{miner}");

    QString minerPathParam("{"); minerPathParam.append("miner").append("}");
    fullPath.replace(minerPathParam, stringValue(miner));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicMinersStatsMinerGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicMinersStatsMinerGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicMinersStatsMinerGetSignal();
    } else {
        emit publicMinersStatsMinerGetSignalE(error_type, error_str);
        emit publicMinersStatsMinerGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicNetAddrsGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/net/addrs");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicNetAddrsGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicNetAddrsGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<QString*>* output = new QList<QString*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new SWGQObjectWrapper<QList<QString*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        QString* o = new QString();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new SWGQObjectWrapper<QString*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicNetAddrsGetSignal(output);
    } else {
        emit publicNetAddrsGetSignalE(output, error_type, error_str);
        emit publicNetAddrsGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicNetPeersGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/net/peers");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicNetPeersGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicNetPeersGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<QString*>* output = new QList<QString*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new SWGQObjectWrapper<QList<QString*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        QString* o = new QString();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new SWGQObjectWrapper<QString*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicNetPeersGetSignal(output);
    } else {
        emit publicNetPeersGetSignalE(output, error_type, error_str);
        emit publicNetPeersGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPublicApi::publicStatsGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/public/stats");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPublicApi::publicStatsGetCallback);

    worker->execute(&input);
}

void
SWGPublicApi::publicStatsGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit publicStatsGetSignal();
    } else {
        emit publicStatsGetSignalE(error_type, error_str);
        emit publicStatsGetSignalEFull(worker, error_type, error_str);
    }
}


}
