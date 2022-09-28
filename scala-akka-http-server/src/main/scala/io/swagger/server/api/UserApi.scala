package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.main.getApiKeysResp
import io.swagger.server.model.main.userStatsResponse
import io.swagger.server.model.util.HttpError

class UserApi(
    userService: UserApiService,
    userMarshaller: UserApiMarshaller
) {
  import userMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userApiKeysGet()
               
             
            }
         
        }
      }
    } ~
    path() { (key) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userApiKeysKeyDelete(key = key)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userApiKeysPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userExportGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userStatsGet()
               
             
            }
         
        }
      }
    }
}

trait UserApiService {

  def userApiKeysGet200(responsemain.getApiKeysResparray: List[main.getApiKeysResp])(implicit toEntityMarshallermain.getApiKeysResparray: ToEntityMarshaller[List[main.getApiKeysResp]]): Route =
    complete((200, responsemain.getApiKeysResparray))
  def userApiKeysGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userApiKeysGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def userApiKeysGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[main.getApiKeysResp]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userApiKeysGet()
      (implicit toEntityMarshallermain.getApiKeysResparray: ToEntityMarshaller[List[main.getApiKeysResp]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  /**
   */
  def userApiKeysKeyDelete(key: String)
      (implicit ): Route

  def userApiKeysPost200(responsemain.getApiKeysResp: main.getApiKeysResp)(implicit toEntityMarshallermain.getApiKeysResp: ToEntityMarshaller[main.getApiKeysResp]): Route =
    complete((200, responsemain.getApiKeysResp))
  def userApiKeysPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userApiKeysPost404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def userApiKeysPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: main.getApiKeysResp
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userApiKeysPost()
      (implicit toEntityMarshallermain.getApiKeysResp: ToEntityMarshaller[main.getApiKeysResp], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def userExportGet200(responseString: String): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def userExportGet()
      (implicit ): Route

  def userStatsGet200(responsemain.userStatsResponse: main.userStatsResponse)(implicit toEntityMarshallermain.userStatsResponse: ToEntityMarshaller[main.userStatsResponse]): Route =
    complete((200, responsemain.userStatsResponse))
  /**
   * Code: 200, Message: OK, DataType: main.userStatsResponse
   */
  def userStatsGet()
      (implicit toEntityMarshallermain.userStatsResponse: ToEntityMarshaller[main.userStatsResponse]): Route

}

trait UserApiMarshaller {

  implicit def toEntityMarshallermain.getApiKeysResparray: ToEntityMarshaller[List[main.getApiKeysResp]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallermain.getApiKeysResp: ToEntityMarshaller[main.getApiKeysResp]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallermain.userStatsResponse: ToEntityMarshaller[main.userStatsResponse]

}

