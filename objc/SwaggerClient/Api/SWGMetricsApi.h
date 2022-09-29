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



@interface SWGMetricsApi: NSObject <SWGApi>

extern NSString* kSWGMetricsApiErrorDomain;
extern NSInteger kSWGMetricsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get deal metrics
/// This endpoint is used to get deal metrics
///
/// 
///
/// @return void
-(NSURLSessionTask*) publicMetricsDealsOnChainGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;



@end
