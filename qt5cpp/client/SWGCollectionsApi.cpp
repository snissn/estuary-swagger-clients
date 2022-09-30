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

#include "SWGCollectionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGCollectionsApi::SWGCollectionsApi() {}

SWGCollectionsApi::~SWGCollectionsApi() {}

SWGCollectionsApi::SWGCollectionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGCollectionsApi::collectionsColuuidCommitPost(QString* coluuid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/{coluuid}/commit");

    QString coluuidPathParam("{"); coluuidPathParam.append("coluuid").append("}");
    fullPath.replace(coluuidPathParam, stringValue(coluuid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsColuuidCommitPostCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsColuuidCommitPostCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    QString* output = static_cast<QString*>(create(json, QString("QString")));
    auto wrapper = new SWGQObjectWrapper<QString*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit collectionsColuuidCommitPostSignal(output);
    } else {
        emit collectionsColuuidCommitPostSignalE(output, error_type, error_str);
        emit collectionsColuuidCommitPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsColuuidContentsDelete(QString* coluuid, QString* contentid, QString*& by, QString*& value) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/{coluuid}/contents");

    QString coluuidPathParam("{"); coluuidPathParam.append("coluuid").append("}");
    fullPath.replace(coluuidPathParam, stringValue(coluuid));
    QString contentidPathParam("{"); contentidPathParam.append("contentid").append("}");
    fullPath.replace(contentidPathParam, stringValue(contentid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "DELETE");


    
    QString output(*by);
    input.request_body.append(output);
        
    QString output(*value);
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsColuuidContentsDeleteCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsColuuidContentsDeleteCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    QString* output = static_cast<QString*>(create(json, QString("QString")));
    auto wrapper = new SWGQObjectWrapper<QString*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit collectionsColuuidContentsDeleteSignal(output);
    } else {
        emit collectionsColuuidContentsDeleteSignalE(output, error_type, error_str);
        emit collectionsColuuidContentsDeleteSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsColuuidDelete(QString* coluuid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/{coluuid}");

    QString coluuidPathParam("{"); coluuidPathParam.append("coluuid").append("}");
    fullPath.replace(coluuidPathParam, stringValue(coluuid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "DELETE");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsColuuidDeleteCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsColuuidDeleteCallback(SWGHttpRequestWorker * worker) {
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
        emit collectionsColuuidDeleteSignal();
    } else {
        emit collectionsColuuidDeleteSignalE(error_type, error_str);
        emit collectionsColuuidDeleteSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsColuuidGet(QString* coluuid, QString* dir) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/{coluuid}");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("coluuid"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(coluuid)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("dir"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(dir)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsColuuidGetCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsColuuidGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    QString* output = static_cast<QString*>(create(json, QString("QString")));
    auto wrapper = new SWGQObjectWrapper<QString*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit collectionsColuuidGetSignal(output);
    } else {
        emit collectionsColuuidGetSignalE(output, error_type, error_str);
        emit collectionsColuuidGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsColuuidPost(QList<qint32>*& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/{coluuid}");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    QJsonObject body_jobj;
    toJsonArray((QList<void*>*)body, body_jobj, QString("body"), QString("SWGUser*"));

    QJsonDocument doc(body_jobj);
    QByteArray bytes = doc.toJson();

    input.request_body.append(bytes);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsColuuidPostCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsColuuidPostCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QMap<QString, QString*>* output = new QMap<QString, QString*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject obj = doc.object();

    foreach(QString key, obj.keys()) {
        QString val;
        setValue(&val, obj[key], "QString", QString());
        output->insert(key, val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit collectionsColuuidPostSignal(output);
    } else {
        emit collectionsColuuidPostSignalE(output, error_type, error_str);
        emit collectionsColuuidPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsFsAddPost(QString* coluuid, QString* content, QString* path) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/fs/add");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("coluuid"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(coluuid)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("content"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(content)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("path"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(path)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsFsAddPostCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsFsAddPostCallback(SWGHttpRequestWorker * worker) {
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
        emit collectionsFsAddPostSignal();
    } else {
        emit collectionsFsAddPostSignalE(error_type, error_str);
        emit collectionsFsAddPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsGetCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsGetCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<SWGCollections.Collection*>* output = new QList<SWGCollections.Collection*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new SWGQObjectWrapper<QList<SWGCollections.Collection*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        SWGCollections.Collection* o = new SWGCollections.Collection();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new SWGQObjectWrapper<SWGCollections.Collection*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit collectionsGetSignal(output);
    } else {
        emit collectionsGetSignalE(output, error_type, error_str);
        emit collectionsGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGCollectionsApi::collectionsPost(SWGMain.createCollectionBody& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/collections/");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    
    QString output = body.asJson();
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGCollectionsApi::collectionsPostCallback);

    worker->execute(&input);
}

void
SWGCollectionsApi::collectionsPostCallback(SWGHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    SWGCollections.Collection* output = static_cast<SWGCollections.Collection*>(create(json, QString("SWGCollections.Collection")));
    auto wrapper = new SWGQObjectWrapper<SWGCollections.Collection*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit collectionsPostSignal(output);
    } else {
        emit collectionsPostSignalE(output, error_type, error_str);
        emit collectionsPostSignalEFull(worker, error_type, error_str);
    }
}


}
