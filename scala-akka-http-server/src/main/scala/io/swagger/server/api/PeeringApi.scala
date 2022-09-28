package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class PeeringApi(
    peeringService: PeeringApiService
) {
  
  lazy val route: Route =
    path() { () => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peeringService.adminPeeringPeersDelete()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peeringService.adminPeeringPeersGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peeringService.adminPeeringPeersPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peeringService.adminPeeringStartPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peeringService.adminPeeringStatusGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peeringService.adminPeeringStopPost()
               
             
            }
         
        }
      }
    }
}

trait PeeringApiService {

  /**
   */
  def adminPeeringPeersDelete()
      (implicit ): Route

  /**
   */
  def adminPeeringPeersGet()
      (implicit ): Route

  /**
   */
  def adminPeeringPeersPost()
      (implicit ): Route

  /**
   */
  def adminPeeringStartPost()
      (implicit ): Route

  /**
   */
  def adminPeeringStatusGet()
      (implicit ): Route

  /**
   */
  def adminPeeringStopPost()
      (implicit ): Route

}


