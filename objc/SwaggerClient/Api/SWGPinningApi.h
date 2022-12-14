#import <Foundation/Foundation.h>
#import "SWGUtilHttpError.h"
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



@interface SWGPinningApi: NSObject <SWGApi>

extern NSString* kSWGPinningApiErrorDomain;
extern NSInteger kSWGPinningApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// List all pin status objects
/// This endpoint lists all pin status objects
///
/// 
///  code:400 message:"Bad Request",
///  code:404 message:"Not Found",
///  code:500 message:"Internal Server Error"
///
/// @return void
-(NSURLSessionTask*) pinningPinsGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Delete a pinned object
/// This endpoint deletes a pinned object.
///
/// @param pinid Pin ID
/// 
///
/// @return void
-(NSURLSessionTask*) pinningPinsPinidDeleteWithPinid: (NSString*) pinid
    completionHandler: (void (^)(NSError* error)) handler;


/// Get a pin status object
/// This endpoint returns a pin status object.
///
/// @param pinid cid
/// 
///
/// @return void
-(NSURLSessionTask*) pinningPinsPinidGetWithPinid: (NSString*) pinid
    completionHandler: (void (^)(NSError* error)) handler;


/// Replace a pinned object
/// This endpoint replaces a pinned object.
///
/// @param pinid Pin ID
/// 
///
/// @return void
-(NSURLSessionTask*) pinningPinsPinidPostWithPinid: (NSString*) pinid
    completionHandler: (void (^)(NSError* error)) handler;


/// Add and pin object
/// This endpoint adds a pin to the IPFS daemon.
///
/// @param cid cid
/// @param name name
/// 
///
/// @return void
-(NSURLSessionTask*) pinningPinsPostWithCid: (NSString*) cid
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler;



@end
