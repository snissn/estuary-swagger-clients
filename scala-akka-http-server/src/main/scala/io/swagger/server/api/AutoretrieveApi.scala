package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class AutoretrieveApi(
    autoretrieveService: AutoretrieveApiService,
    autoretrieveMarshaller: AutoretrieveApiMarshaller
) {
  import autoretrieveMarshaller._

  lazy val route: Route =
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[String]){ body =>
                  autoretrieveService.adminAutoretrieveInitPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  autoretrieveService.adminAutoretrieveListGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          headerValueByName("token") { token => 
            formFields() { () =>
              
                
                  autoretrieveService.autoretrieveHeartbeatPost(token = token)
               
             
            }
          }
        }
      }
    }
}

trait AutoretrieveApiService {

  /**
   */
  def adminAutoretrieveInitPost(body: String)
      (implicit ): Route

  /**
   */
  def adminAutoretrieveListGet()
      (implicit ): Route

  /**
   */
  def autoretrieveHeartbeatPost(token: String)
      (implicit ): Route

}

trait AutoretrieveApiMarshaller {
  implicit def fromRequestUnmarshallerString: FromRequestUnmarshaller[String]


}

