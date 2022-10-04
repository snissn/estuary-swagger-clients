#import <Foundation/Foundation.h>
#import "SWGMainImportDealBody.h"
#import "SWGUtilContentAddIpfsBody.h"
#import "SWGUtilContentAddResponse.h"
#import "SWGApi.h"

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



@interface SWGContentApi: NSObject <SWGApi>

extern NSString* kSWGContentApiErrorDomain;
extern NSInteger kSWGContentApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Add Car object
/// This endpoint is used to add a car object to the network. The object can be a file or a directory.
///
/// @param body Car
/// @param filename Filename (optional)
/// @param commp Commp (optional)
/// @param size Size (optional)
/// 
///
/// @return void
-(NSURLSessionTask*) contentAddCarPostWithBody: (NSString*) body
    filename: (NSString*) filename
    commp: (NSString*) commp
    size: (NSString*) size
    completionHandler: (void (^)(NSError* error)) handler;


/// Add IPFS object
/// This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
///
/// @param body IPFS Body
/// 
///
/// @return void
-(NSURLSessionTask*) contentAddIpfsPostWithBody: (SWGUtilContentAddIpfsBody*) body
    completionHandler: (void (^)(NSError* error)) handler;


/// Add new content
/// This endpoint is used to upload new content.
///
/// @param data File to upload
/// @param coluuid Collection UUID (optional)
/// @param dir Directory (optional)
/// 
///  code:200 message:"OK"
///
/// @return SWGUtilContentAddResponse*
-(NSURLSessionTask*) contentAddPostWithData: (NSURL*) data
    coluuid: (NSString*) coluuid
    dir: (NSString*) dir
    completionHandler: (void (^)(SWGUtilContentAddResponse* output, NSError* error)) handler;


/// Get aggregated content stats
/// This endpoint returns aggregated content stats
///
/// @param content Content ID
/// 
///  code:200 message:"OK"
///
/// @return NSString*
-(NSURLSessionTask*) contentAggregatedContentGetWithContent: (NSString*) content
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Get all deals for a user
/// This endpoint is used to get all deals for a user
///
/// @param begin Begin
/// @param duration Duration
/// @param all All
/// 
///
/// @return void
-(NSURLSessionTask*) contentAllDealsGetWithBegin: (NSString*) begin
    duration: (NSString*) duration
    all: (NSString*) all
    completionHandler: (void (^)(NSError* error)) handler;


/// Get content bandwidth
/// This endpoint returns content bandwidth
///
/// @param content Content ID
/// 
///
/// @return void
-(NSURLSessionTask*) contentBwUsageContentGetWithContent: (NSString*) content
    completionHandler: (void (^)(NSError* error)) handler;


/// Add a new content
/// This endpoint adds a new content
///
/// @param body Content
/// 
///
/// @return void
-(NSURLSessionTask*) contentCreatePostWithBody: (NSString*) body
    completionHandler: (void (^)(NSError* error)) handler;


/// Content with deals
/// This endpoint lists all content with deals
///
/// @param limit Limit (optional)
/// @param offset Offset (optional)
/// 
///
/// @return void
-(NSURLSessionTask*) contentDealsGetWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    completionHandler: (void (^)(NSError* error)) handler;


/// Ensure Replication
/// This endpoint ensures that the content is replicated to the specified number of providers
///
/// @param datacid Data CID
/// 
///
/// @return void
-(NSURLSessionTask*) contentEnsureReplicationDatacidGetWithDatacid: (NSString*) datacid
    completionHandler: (void (^)(NSError* error)) handler;


/// List all failures for a content
/// This endpoint returns all failures for a content
///
/// @param content Content ID
/// 
///  code:200 message:"OK"
///
/// @return NSString*
-(NSURLSessionTask*) contentFailuresContentGetWithContent: (NSString*) content
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Import a deal
/// This endpoint imports a deal into the shuttle.
///
/// @param body Import a deal
/// 
///
/// @return void
-(NSURLSessionTask*) contentImportdealPostWithBody: (SWGMainImportDealBody*) body
    completionHandler: (void (^)(NSError* error)) handler;


/// List all pinned content
/// This endpoint lists all content
///
/// 
///  code:200 message:"OK"
///
/// @return NSArray<NSString*>*
-(NSURLSessionTask*) contentListGetWithCompletionHandler: 
    (void (^)(NSArray<NSString*>* output, NSError* error)) handler;


/// Read content
/// This endpoint reads content from the blockstore
///
/// @param cont CID
/// 
///
/// @return void
-(NSURLSessionTask*) contentReadContGetWithCont: (NSString*) cont
    completionHandler: (void (^)(NSError* error)) handler;


/// Get staging zone for user
/// This endpoint is used to get staging zone for user.
///
/// 
///
/// @return void
-(NSURLSessionTask*) contentStagingZonesGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Get content statistics
/// This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
///
/// @param limit limit
/// 
///
/// @return void
-(NSURLSessionTask*) contentStatsGetWithLimit: (NSString*) limit
    completionHandler: (void (^)(NSError* error)) handler;


/// Content Status
/// This endpoint returns the status of a content
///
/// @param _id Content ID
/// 
///
/// @return void
-(NSURLSessionTask*) contentStatusIdGetWithId: (NSNumber*) _id
    completionHandler: (void (^)(NSError* error)) handler;



@end
