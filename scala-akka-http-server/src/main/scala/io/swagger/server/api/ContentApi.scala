package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Main.importDealBody
import io.swagger.server.model.Util.ContentAddIpfsBody
import io.swagger.server.model.byte[]
import io.swagger.server.model.util.ContentAddResponse

class ContentApi(
    contentService: ContentApiService,
    contentMarshaller: ContentApiMarshaller
) {
  import contentMarshaller._

  lazy val route: Route =
    path() { () => 
      post {
        parameters("filename".as[String].?, "commp".as[String].?, "size".as[String].?) { (filename, commp, size) =>
          
            formFields() { () =>
              
                entity(as[String]){ body =>
                  contentService.contentAddCarPost(body = body, filename = filename, commp = commp, size = size)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Util.ContentAddIpfsBody]){ body =>
                  contentService.contentAddIpfsPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { (coluuid, dir) => 
      post {
        parameters() { () =>
          
            formFields("file".as[byte[]]) { (file) =>
              
                
                  contentService.contentAddPost(file = file, coluuid = coluuid, dir = dir)
               
             
            }
         
        }
      }
    } ~
    path() { (content) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentAggregatedContentGet(content = content)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("begin".as[String], "duration".as[String], "all".as[String]) { (begin, duration, all) =>
          
            formFields() { () =>
              
                
                  contentService.contentAllDealsGet(begin = begin, duration = duration, all = all)
               
             
            }
         
        }
      }
    } ~
    path() { (content) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentBwUsageContentGet(content = content)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[String]){ body =>
                  contentService.contentCreatePost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) =>
          
            formFields() { () =>
              
                
                  contentService.contentDealsGet(limit = limit, offset = offset)
               
             
            }
         
        }
      }
    } ~
    path() { (datacid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentEnsureReplicationDatacidGet(datacid = datacid)
               
             
            }
         
        }
      }
    } ~
    path() { (content) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentFailuresContentGet(content = content)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Main.importDealBody]){ body =>
                  contentService.contentImportdealPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentListGet()
               
             
            }
         
        }
      }
    } ~
    path() { (cont) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentReadContGet(cont = cont)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentStagingZonesGet()
               
             
            }
         
        }
      }
    } ~
    path() { (limit) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentStatsGet(limit = limit)
               
             
            }
         
        }
      }
    } ~
    path() { (id) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentStatusIdGet(id = id)
               
             
            }
         
        }
      }
    }
}

trait ContentApiService {

  /**
   */
  def contentAddCarPost(body: String, filename: Option[String], commp: Option[String], size: Option[String])
      (implicit ): Route

  /**
   */
  def contentAddIpfsPost(body: Util.ContentAddIpfsBody)
      (implicit ): Route

  def contentAddPost200(responseutil.ContentAddResponse: util.ContentAddResponse)(implicit toEntityMarshallerutil.ContentAddResponse: ToEntityMarshaller[util.ContentAddResponse]): Route =
    complete((200, responseutil.ContentAddResponse))
  /**
   * Code: 200, Message: OK, DataType: util.ContentAddResponse
   */
  def contentAddPost(file: String, coluuid: String, dir: String)
      (implicit toEntityMarshallerutil.ContentAddResponse: ToEntityMarshaller[util.ContentAddResponse]): Route

  def contentAggregatedContentGet200(responseString: String): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def contentAggregatedContentGet(content: String)
      (implicit ): Route

  /**
   */
  def contentAllDealsGet(begin: String, duration: String, all: String)
      (implicit ): Route

  /**
   */
  def contentBwUsageContentGet(content: String)
      (implicit ): Route

  /**
   */
  def contentCreatePost(body: String)
      (implicit ): Route

  /**
   */
  def contentDealsGet(limit: Option[Int], offset: Option[Int])
      (implicit ): Route

  /**
   */
  def contentEnsureReplicationDatacidGet(datacid: String)
      (implicit ): Route

  def contentFailuresContentGet200(responseString: String): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def contentFailuresContentGet(content: String)
      (implicit ): Route

  /**
   */
  def contentImportdealPost(body: Main.importDealBody)
      (implicit ): Route

  def contentListGet200(responseStringarray: List[String]): Route =
    complete((200, responseStringarray))
  /**
   * Code: 200, Message: OK, DataType: List[String]
   */
  def contentListGet()
      (implicit ): Route

  /**
   */
  def contentReadContGet(cont: String)
      (implicit ): Route

  /**
   */
  def contentStagingZonesGet()
      (implicit ): Route

  /**
   */
  def contentStatsGet(limit: String)
      (implicit ): Route

  /**
   */
  def contentStatusIdGet(id: Int)
      (implicit ): Route

}

trait ContentApiMarshaller {
  implicit def fromRequestUnmarshallerUtil.ContentAddIpfsBody: FromRequestUnmarshaller[Util.ContentAddIpfsBody]

  implicit def fromRequestUnmarshallerString: FromRequestUnmarshaller[String]

  implicit def fromRequestUnmarshallerMain.importDealBody: FromRequestUnmarshaller[Main.importDealBody]


  implicit def toEntityMarshallerutil.ContentAddResponse: ToEntityMarshaller[util.ContentAddResponse]

}

