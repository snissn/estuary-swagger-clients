# swagger-client

Estuary API
- API version: 0.0.0

This is the API for the Estuary application.

  For more information, please visit [https://docs.estuary.tech/feedback](https://docs.estuary.tech/feedback)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "io.swagger" % "swagger-client" % "1.0.0"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://api.estuary.tech*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | **adminPeeringPeersDelete** | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*AdminApi* | **adminPeeringPeersGet** | **GET** /admin/peering/peers | List all Peering peers
*AdminApi* | **adminPeeringPeersPost** | **POST** /admin/peering/peers | Add peers on Peering Service
*AdminApi* | **adminPeeringStartPost** | **POST** /admin/peering/start | Start Peering
*AdminApi* | **adminPeeringStatusGet** | **GET** /admin/peering/status | Check Peering Status
*AdminApi* | **adminPeeringStopPost** | **POST** /admin/peering/stop | Stop Peering
*AdminApi* | **adminSystemConfigGet** | **GET** /admin/system/config | Get systems(estuary/shuttle) config
*AdminApi* | **adminUsersGet** | **GET** /admin/users | Get all users
*AutoretrieveApi* | **adminAutoretrieveInitPost** | **POST** /admin/autoretrieve/init | Register autoretrieve server
*AutoretrieveApi* | **adminAutoretrieveListGet** | **GET** /admin/autoretrieve/list | List autoretrieve servers
*AutoretrieveApi* | **autoretrieveHeartbeatPost** | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up
*CollectionsApi* | **collectionsColuuidCommitPost** | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
*CollectionsApi* | **collectionsColuuidDelete** | **DELETE** /collections/{coluuid} | Deletes a collection
*CollectionsApi* | **collectionsColuuidGet** | **GET** /collections/{coluuid} | Get contents in a collection
*CollectionsApi* | **collectionsColuuidPost** | **POST** /collections/{coluuid} | Add contents to a collection
*CollectionsApi* | **collectionsFsAddPost** | **POST** /collections/fs/add | Add a file to a collection
*CollectionsApi* | **collectionsGet** | **GET** /collections/ | List all collections
*CollectionsApi* | **collectionsPost** | **POST** /collections/ | Create a new collection
*ContentApi* | **contentAddCarPost** | **POST** /content/add-car | Add Car object
*ContentApi* | **contentAddIpfsPost** | **POST** /content/add-ipfs | Add IPFS object
*ContentApi* | **contentAddPost** | **POST** /content/add | Add new content
*ContentApi* | **contentAggregatedContentGet** | **GET** /content/aggregated/{content} | Get aggregated content stats
*ContentApi* | **contentAllDealsGet** | **GET** /content/all-deals | Get all deals for a user
*ContentApi* | **contentBwUsageContentGet** | **GET** /content/bw-usage/{content} | Get content bandwidth
*ContentApi* | **contentCreatePost** | **POST** /content/create | Add a new content
*ContentApi* | **contentDealsGet** | **GET** /content/deals | Content with deals
*ContentApi* | **contentEnsureReplicationDatacidGet** | **GET** /content/ensure-replication/{datacid} | Ensure Replication
*ContentApi* | **contentFailuresContentGet** | **GET** /content/failures/{content} | List all failures for a content
*ContentApi* | **contentImportdealPost** | **POST** /content/importdeal | Import a deal
*ContentApi* | **contentListGet** | **GET** /content/list | List all pinned content
*ContentApi* | **contentReadContGet** | **GET** /content/read/{cont} | Read content
*ContentApi* | **contentStagingZonesGet** | **GET** /content/staging-zones | Get staging zone for user
*ContentApi* | **contentStatsGet** | **GET** /content/stats | Get content statistics
*ContentApi* | **contentStatusIdGet** | **GET** /content/status/{id} | Content Status
*DealsApi* | **dealEstimatePost** | **POST** /deal/estimate | Estimate the cost of a deal
*DealsApi* | **dealInfoDealidGet** | **GET** /deal/info/{dealid} | Get Deal Info
*DealsApi* | **dealProposalPropcidGet** | **GET** /deal/proposal/{propcid} | Get Proposal
*DealsApi* | **dealQueryMinerGet** | **GET** /deal/query/{miner} | Query Ask
*DealsApi* | **dealStatusByProposalPropcidGet** | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
*DealsApi* | **dealStatusMinerPropcidGet** | **GET** /deal/status/{miner}/{propcid} | Deal Status
*DealsApi* | **dealTransferInProgressGet** | **GET** /deal/transfer/in-progress | Transfer In Progress
*DealsApi* | **dealTransferStatusPost** | **POST** /deal/transfer/status | Transfer Status
*DealsApi* | **dealsFailuresGet** | **GET** /deals/failures | Get storage failures for user
*DealsApi* | **dealsMakeMinerPost** | **POST** /deals/make/{miner} | Make Deal
*DealsApi* | **dealsStatusDealGet** | **GET** /deals/status/{deal} | Get Deal Status
*DealsApi* | **publicDealsFailuresGet** | **GET** /public/deals/failures | Get storage failures
*DealsApi* | **publicMinersStorageQueryMinerGet** | **GET** /public/miners/storage/query/{miner} | Query Ask
*MetricsApi* | **publicMetricsDealsOnChainGet** | **GET** /public/metrics/deals-on-chain | Get deal metrics
*MinerApi* | **publicMinersDealsMinerGet** | **GET** /public/miners/deals/{miner} | Get all miners deals
*MinerApi* | **publicMinersStatsMinerGet** | **GET** /public/miners/stats/{miner} | Get miner stats
*NetApi* | **netAddrsGet** | **GET** /net/addrs | Net Addrs
*NetApi* | **publicMinersFailuresMinerGet** | **GET** /public/miners/failures/{miner} | Get all miners
*NetApi* | **publicMinersGet** | **GET** /public/miners | Get all miners
*NetApi* | **publicNetAddrsGet** | **GET** /public/net/addrs | Net Addrs
*NetApi* | **publicNetPeersGet** | **GET** /public/net/peers | Net Peers
*PeeringApi* | **adminPeeringPeersDelete** | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*PeeringApi* | **adminPeeringPeersGet** | **GET** /admin/peering/peers | List all Peering peers
*PeeringApi* | **adminPeeringPeersPost** | **POST** /admin/peering/peers | Add peers on Peering Service
*PeeringApi* | **adminPeeringStartPost** | **POST** /admin/peering/start | Start Peering
*PeeringApi* | **adminPeeringStatusGet** | **GET** /admin/peering/status | Check Peering Status
*PeeringApi* | **adminPeeringStopPost** | **POST** /admin/peering/stop | Stop Peering
*PeersApi* | **adminPeeringPeersDelete** | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*PeersApi* | **adminPeeringPeersGet** | **GET** /admin/peering/peers | List all Peering peers
*PeersApi* | **adminPeeringPeersPost** | **POST** /admin/peering/peers | Add peers on Peering Service
*PeersApi* | **adminPeeringStartPost** | **POST** /admin/peering/start | Start Peering
*PeersApi* | **adminPeeringStatusGet** | **GET** /admin/peering/status | Check Peering Status
*PeersApi* | **adminPeeringStopPost** | **POST** /admin/peering/stop | Stop Peering
*PinningApi* | **pinningPinsGet** | **GET** /pinning/pins | List all pin status objects
*PinningApi* | **pinningPinsPinidDelete** | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
*PinningApi* | **pinningPinsPinidGet** | **GET** /pinning/pins/{pinid} | Get a pin status object
*PinningApi* | **pinningPinsPinidPost** | **POST** /pinning/pins/{pinid} | Replace a pinned object
*PinningApi* | **pinningPinsPost** | **POST** /pinning/pins | Add and pin object
*PublicApi* | **publicByCidCidGet** | **GET** /public/by-cid/{cid} | Get Content by Cid
*PublicApi* | **publicInfoGet** | **GET** /public/info | Get public node info
*PublicApi* | **publicMetricsDealsOnChainGet** | **GET** /public/metrics/deals-on-chain | Get deal metrics
*PublicApi* | **publicMinersDealsMinerGet** | **GET** /public/miners/deals/{miner} | Get all miners deals
*PublicApi* | **publicMinersFailuresMinerGet** | **GET** /public/miners/failures/{miner} | Get all miners
*PublicApi* | **publicMinersGet** | **GET** /public/miners | Get all miners
*PublicApi* | **publicMinersStatsMinerGet** | **GET** /public/miners/stats/{miner} | Get miner stats
*PublicApi* | **publicNetAddrsGet** | **GET** /public/net/addrs | Net Addrs
*PublicApi* | **publicNetPeersGet** | **GET** /public/net/peers | Net Peers
*PublicApi* | **publicStatsGet** | **GET** /public/stats | Public stats
*UserApi* | **userApiKeysGet** | **GET** /user/api-keys | Get API keys for a user
*UserApi* | **userApiKeysKeyDelete** | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
*UserApi* | **userApiKeysPost** | **POST** /user/api-keys | Create API keys for a user
*UserApi* | **userExportGet** | **GET** /user/export | Export user data
*UserApi* | **userStatsGet** | **GET** /user/stats | Create API keys for a user


## Documentation for Models

 - [MainCollection](MainCollection.md)
 - [MainCreateCollectionBody](MainCreateCollectionBody.md)
 - [MainEstimateDealBody](MainEstimateDealBody.md)
 - [MainGetApiKeysResp](MainGetApiKeysResp.md)
 - [MainImportDealBody](MainImportDealBody.md)
 - [MainUserStatsResponse](MainUserStatsResponse.md)
 - [UtilContentAddIpfsBody](UtilContentAddIpfsBody.md)
 - [UtilContentAddResponse](UtilContentAddResponse.md)
 - [UtilHttpError](UtilHttpError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author

