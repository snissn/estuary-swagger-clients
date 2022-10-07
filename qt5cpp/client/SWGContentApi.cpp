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

#include "SWGContentApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"
#include "SWGQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGContentApi::SWGContentApi() {}

SWGContentApi::~SWGContentApi() {}

SWGContentApi::SWGContentApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGContentApi::contentAddCarPost(QString*& body, QString* filename, QString* commp, QString* size) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/add-car");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("filename"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(filename)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("commp"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(commp)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("size"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(size)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    
    QString output(*body);
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentAddCarPostCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentAddCarPostCallback(SWGHttpRequestWorker * worker) {
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
        emit contentAddCarPostSignal();
    } else {
        emit contentAddCarPostSignalE(error_type, error_str);
        emit contentAddCarPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentAddIpfsPost(SWGUtil.ContentAddIpfsBody& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/add-ipfs");



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
            &SWGContentApi::contentAddIpfsPostCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentAddIpfsPostCallback(SWGHttpRequestWorker * worker) {
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
        emit contentAddIpfsPostSignal();
    } else {
        emit contentAddIpfsPostSignalE(error_type, error_str);
        emit contentAddIpfsPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentAddPost(SWGHttpRequestInputFileElement* file, QString* coluuid, QString* dir) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/add");

    QString coluuidPathParam("{"); coluuidPathParam.append("coluuid").append("}");
    fullPath.replace(coluuidPathParam, stringValue(coluuid));
    QString dirPathParam("{"); dirPathParam.append("dir").append("}");
    fullPath.replace(dirPathParam, stringValue(dir));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");

    if (file != nullptr) {
        input.add_file("file", (*file).local_filename, (*file).request_filename, (*file).mime_type);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentAddPostCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentAddPostCallback(SWGHttpRequestWorker * worker) {
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
    SWGUtil.ContentAddResponse* output = static_cast<SWGUtil.ContentAddResponse*>(create(json, QString("SWGUtil.ContentAddResponse")));
    auto wrapper = new SWGQObjectWrapper<SWGUtil.ContentAddResponse*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit contentAddPostSignal(output);
    } else {
        emit contentAddPostSignalE(output, error_type, error_str);
        emit contentAddPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentAggregatedContentGet(QString* content) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/aggregated/{content}");

    QString contentPathParam("{"); contentPathParam.append("content").append("}");
    fullPath.replace(contentPathParam, stringValue(content));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentAggregatedContentGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentAggregatedContentGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentAggregatedContentGetSignal(output);
    } else {
        emit contentAggregatedContentGetSignalE(output, error_type, error_str);
        emit contentAggregatedContentGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentAllDealsGet(QString* begin, QString* duration, QString* all) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/all-deals");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("begin"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(begin)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("duration"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(duration)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("all"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(all)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentAllDealsGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentAllDealsGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentAllDealsGetSignal();
    } else {
        emit contentAllDealsGetSignalE(error_type, error_str);
        emit contentAllDealsGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentBwUsageContentGet(QString* content) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/bw-usage/{content}");

    QString contentPathParam("{"); contentPathParam.append("content").append("}");
    fullPath.replace(contentPathParam, stringValue(content));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentBwUsageContentGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentBwUsageContentGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentBwUsageContentGetSignal();
    } else {
        emit contentBwUsageContentGetSignalE(error_type, error_str);
        emit contentBwUsageContentGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentCreatePost(QString*& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/create");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "POST");


    
    QString output(*body);
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentCreatePostCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentCreatePostCallback(SWGHttpRequestWorker * worker) {
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
        emit contentCreatePostSignal();
    } else {
        emit contentCreatePostSignalE(error_type, error_str);
        emit contentCreatePostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentDealsGet(qint32 limit, qint32 offset) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/deals");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("limit"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(limit)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("offset"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(offset)));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentDealsGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentDealsGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentDealsGetSignal();
    } else {
        emit contentDealsGetSignalE(error_type, error_str);
        emit contentDealsGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentEnsureReplicationDatacidGet(QString* datacid) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/ensure-replication/{datacid}");

    QString datacidPathParam("{"); datacidPathParam.append("datacid").append("}");
    fullPath.replace(datacidPathParam, stringValue(datacid));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentEnsureReplicationDatacidGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentEnsureReplicationDatacidGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentEnsureReplicationDatacidGetSignal();
    } else {
        emit contentEnsureReplicationDatacidGetSignalE(error_type, error_str);
        emit contentEnsureReplicationDatacidGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentFailuresContentGet(QString* content) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/failures/{content}");

    QString contentPathParam("{"); contentPathParam.append("content").append("}");
    fullPath.replace(contentPathParam, stringValue(content));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentFailuresContentGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentFailuresContentGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentFailuresContentGetSignal(output);
    } else {
        emit contentFailuresContentGetSignalE(output, error_type, error_str);
        emit contentFailuresContentGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentImportdealPost(SWGMain.importDealBody& body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/importdeal");



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
            &SWGContentApi::contentImportdealPostCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentImportdealPostCallback(SWGHttpRequestWorker * worker) {
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
        emit contentImportdealPostSignal();
    } else {
        emit contentImportdealPostSignalE(error_type, error_str);
        emit contentImportdealPostSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentListGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/list");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentListGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentListGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentListGetSignal(output);
    } else {
        emit contentListGetSignalE(output, error_type, error_str);
        emit contentListGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentReadContGet(QString* cont) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/read/{cont}");

    QString contPathParam("{"); contPathParam.append("cont").append("}");
    fullPath.replace(contPathParam, stringValue(cont));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentReadContGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentReadContGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentReadContGetSignal();
    } else {
        emit contentReadContGetSignalE(error_type, error_str);
        emit contentReadContGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentStagingZonesGet() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/staging-zones");



    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentStagingZonesGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentStagingZonesGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentStagingZonesGetSignal();
    } else {
        emit contentStagingZonesGetSignalE(error_type, error_str);
        emit contentStagingZonesGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentStatsGet(QString* limit) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/stats");

    QString limitPathParam("{"); limitPathParam.append("limit").append("}");
    fullPath.replace(limitPathParam, stringValue(limit));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentStatsGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentStatsGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentStatsGetSignal();
    } else {
        emit contentStatsGetSignalE(error_type, error_str);
        emit contentStatsGetSignalEFull(worker, error_type, error_str);
    }
}

void
SWGContentApi::contentStatusIdGet(qint32 id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/content/status/{id}");

    QString idPathParam("{"); idPathParam.append("id").append("}");
    fullPath.replace(idPathParam, stringValue(id));


    SWGHttpRequestWorker *worker = new SWGHttpRequestWorker();
    SWGHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &SWGHttpRequestWorker::on_execution_finished,
            this,
            &SWGContentApi::contentStatusIdGetCallback);

    worker->execute(&input);
}

void
SWGContentApi::contentStatusIdGetCallback(SWGHttpRequestWorker * worker) {
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
        emit contentStatusIdGetSignal();
    } else {
        emit contentStatusIdGetSignalE(error_type, error_str);
        emit contentStatusIdGetSignalEFull(worker, error_type, error_str);
    }
}


}
