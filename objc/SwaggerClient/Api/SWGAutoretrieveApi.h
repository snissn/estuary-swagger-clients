#import <Foundation/Foundation.h>
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



@interface SWGAutoretrieveApi: NSObject <SWGApi>

extern NSString* kSWGAutoretrieveApiErrorDomain;
extern NSInteger kSWGAutoretrieveApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Register autoretrieve server
/// This endpoint registers a new autoretrieve server Q@&^5#^&*Q^Wasdfalsdkjflkj
///
/// @param addresses Autoretrieve&#39;s comma-separated list of addresses
/// @param pubKey Autoretrieve&#39;s public key
/// 
///
/// @return void
-(NSURLSessionTask*) adminAutoretrieveInitPostWithAddresses: (NSString*) addresses
    pubKey: (NSString*) pubKey
    completionHandler: (void (^)(NSError* error)) handler;


/// List autoretrieve servers
/// This endpoint lists all registered autoretrieve servers
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminAutoretrieveListGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Marks autoretrieve server as up
/// This endpoint updates the lastConnection field for autoretrieve
///
/// @param token Autoretrieve&#39;s auth token
/// 
///
/// @return void
-(NSURLSessionTask*) autoretrieveHeartbeatPostWithToken: (NSString*) token
    completionHandler: (void (^)(NSError* error)) handler;



@end