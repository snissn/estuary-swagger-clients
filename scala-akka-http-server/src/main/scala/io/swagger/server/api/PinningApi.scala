package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.util.HttpError

class PinningApi(
    pinningService: PinningApiService,
    pinningMarshaller: PinningApiMarshaller
) {
  import pinningMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsGet()
               
             
            }
         
        }
      }
    } ~
    path() { (pinid) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsPinidDelete(pinid = pinid)
               
             
            }
         
        }
      }
    } ~
    path() { (pinid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsPinidGet(pinid = pinid)
               
             
            }
         
        }
      }
    } ~
    path() { (pinid) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsPinidPost(pinid = pinid)
               
             
            }
         
        }
      }
    } ~
    path() { (cid, name) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsPost(cid = cid, name = name)
               
             
            }
         
        }
      }
    }
}

trait PinningApiService {

  def pinningPinsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def pinningPinsGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def pinningPinsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  /**
   */
  def pinningPinsPinidDelete(pinid: String)
      (implicit ): Route

  /**
   */
  def pinningPinsPinidGet(pinid: String)
      (implicit ): Route

  /**
   */
  def pinningPinsPinidPost(pinid: String)
      (implicit ): Route

  /**
   */
  def pinningPinsPost(cid: String, name: String)
      (implicit ): Route

}

trait PinningApiMarshaller {

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

