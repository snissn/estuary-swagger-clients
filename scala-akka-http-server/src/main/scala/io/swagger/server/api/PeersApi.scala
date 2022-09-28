package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class PeersApi(
    peersService: PeersApiService
) {
  
  lazy val route: Route =
    path() { () => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peersService.adminPeeringPeersDelete()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peersService.adminPeeringPeersGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peersService.adminPeeringPeersPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peersService.adminPeeringStartPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peersService.adminPeeringStatusGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  peersService.adminPeeringStopPost()
               
             
            }
         
        }
      }
    }
}

trait PeersApiService {

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


