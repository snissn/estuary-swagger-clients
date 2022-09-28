package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Main.createCollectionBody
import io.swagger.server.model.main.Collection
import io.swagger.server.model.util.HttpError

class CollectionsApi(
    collectionsService: CollectionsApiService,
    collectionsMarshaller: CollectionsApiMarshaller
) {
  import collectionsMarshaller._

  lazy val route: Route =
    path() { (coluuid) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsColuuidCommitPost(coluuid = coluuid)
               
             
            }
         
        }
      }
    } ~
    path() { (coluuid) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsColuuidDelete(coluuid = coluuid)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("coluuid".as[String], "dir".as[String].?) { (coluuid, dir) =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsColuuidGet(coluuid = coluuid, dir = dir)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[List[Int]]){ body =>
                  collectionsService.collectionsColuuidPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("coluuid".as[String], "content".as[String], "path".as[String]) { (coluuid, content, path) =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsFsAddPost(coluuid = coluuid, content = content, path = path)
               
             
            }
         
        }
      }
    } ~
    path() { (id) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsGet(id = id)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Main.createCollectionBody]){ body =>
                  collectionsService.collectionsPost(body = body)
                }
             
            }
         
        }
      }
    }
}

trait CollectionsApiService {

  def collectionsColuuidCommitPost200(responseString: String): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def collectionsColuuidCommitPost(coluuid: String)
      (implicit ): Route

  /**
   */
  def collectionsColuuidDelete(coluuid: String)
      (implicit ): Route

  def collectionsColuuidGet200(responseString: String): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def collectionsColuuidGet(coluuid: String, dir: Option[String])
      (implicit ): Route

  def collectionsColuuidPost200(responseMapmap: Map[String, String]): Route =
    complete((200, responseMapmap))
  /**
   * Code: 200, Message: OK, DataType: Map[String, String]
   */
  def collectionsColuuidPost(body: List[Int])
      (implicit ): Route

  /**
   */
  def collectionsFsAddPost(coluuid: String, content: String, path: String)
      (implicit ): Route

  def collectionsGet200(responsemain.Collectionarray: List[main.Collection])(implicit toEntityMarshallermain.Collectionarray: ToEntityMarshaller[List[main.Collection]]): Route =
    complete((200, responsemain.Collectionarray))
  def collectionsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def collectionsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[main.Collection]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsGet(id: Int)
      (implicit toEntityMarshallermain.Collectionarray: ToEntityMarshaller[List[main.Collection]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsPost200(responsemain.Collection: main.Collection)(implicit toEntityMarshallermain.Collection: ToEntityMarshaller[main.Collection]): Route =
    complete((200, responsemain.Collection))
  def collectionsPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsPost404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def collectionsPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: main.Collection
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsPost(body: Main.createCollectionBody)
      (implicit toEntityMarshallermain.Collection: ToEntityMarshaller[main.Collection], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait CollectionsApiMarshaller {
  implicit def fromRequestUnmarshallerList[Int]: FromRequestUnmarshaller[List[Int]]

  implicit def fromRequestUnmarshallerMain.createCollectionBody: FromRequestUnmarshaller[Main.createCollectionBody]


  implicit def toEntityMarshallermain.Collectionarray: ToEntityMarshaller[List[main.Collection]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallermain.Collection: ToEntityMarshaller[main.Collection]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

