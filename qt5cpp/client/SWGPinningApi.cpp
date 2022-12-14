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

#include "SWGPinningApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGPinningApi::SWGPinningApi() {}

SWGPinningApi::~SWGPinningApi() {}

SWGPinningApi::SWGPinningApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGPinningApi::pinningPinsGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pinning/pins");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPinningApi::pinningPinsGetCallback);

    worker->execute(&input);
}

void
SWGPinningApi::pinningPinsGetCallback(SWGHttpRequestWorker * worker) {
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
        emit pinningPinsGetSignal();
    } else {
        emit pinningPinsGetSignalE(error_type, error_str);
        emit pinningPinsGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPinningApi::pinningPinsPinidDelete(QString* pinid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pinning/pins/{pinid}");

    QString pinidPathParam("{"); pinidPathParam.append("pinid").append("}");
    fullPath.replace(pinidPathParam, stringValue(pinid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "DELETE");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPinningApi::pinningPinsPinidDeleteCallback);

    worker->execute(&input);
}

void
SWGPinningApi::pinningPinsPinidDeleteCallback(SWGHttpRequestWorker * worker) {
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
        emit pinningPinsPinidDeleteSignal();
    } else {
        emit pinningPinsPinidDeleteSignalE(error_type, error_str);
        emit pinningPinsPinidDeleteSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPinningApi::pinningPinsPinidGet(QString* pinid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pinning/pins/{pinid}");

    QString pinidPathParam("{"); pinidPathParam.append("pinid").append("}");
    fullPath.replace(pinidPathParam, stringValue(pinid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPinningApi::pinningPinsPinidGetCallback);

    worker->execute(&input);
}

void
SWGPinningApi::pinningPinsPinidGetCallback(SWGHttpRequestWorker * worker) {
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
        emit pinningPinsPinidGetSignal();
    } else {
        emit pinningPinsPinidGetSignalE(error_type, error_str);
        emit pinningPinsPinidGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPinningApi::pinningPinsPinidPost(QString* pinid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pinning/pins/{pinid}");

    QString pinidPathParam("{"); pinidPathParam.append("pinid").append("}");
    fullPath.replace(pinidPathParam, stringValue(pinid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPinningApi::pinningPinsPinidPostCallback);

    worker->execute(&input);
}

void
SWGPinningApi::pinningPinsPinidPostCallback(SWGHttpRequestWorker * worker) {
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
        emit pinningPinsPinidPostSignal();
    } else {
        emit pinningPinsPinidPostSignalE(error_type, error_str);
        emit pinningPinsPinidPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGPinningApi::pinningPinsPost(QString* cid, QString* name) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pinning/pins");

    QString cidPathParam("{"); cidPathParam.append("cid").append("}");
    fullPath.replace(cidPathParam, stringValue(cid));
    QString namePathParam("{"); namePathParam.append("name").append("}");
    fullPath.replace(namePathParam, stringValue(name));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGPinningApi::pinningPinsPostCallback);

    worker->execute(&input);
}

void
SWGPinningApi::pinningPinsPostCallback(SWGHttpRequestWorker * worker) {
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
        emit pinningPinsPostSignal();
    } else {
        emit pinningPinsPostSignalE(error_type, error_str);
        emit pinningPinsPostSignalEFull(worker, error_type, error_str);
    }
}


}
