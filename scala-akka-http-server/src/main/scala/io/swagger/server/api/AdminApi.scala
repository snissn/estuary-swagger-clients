package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class AdminApi(
    adminService: AdminApiService
) {
  
  lazy val route: Route =
    path() { () => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminPeeringPeersDelete()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminPeeringPeersGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminPeeringPeersPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminPeeringStartPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminPeeringStatusGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminPeeringStopPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminSystemConfigGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  adminService.adminUsersGet()
               
             
            }
         
        }
      }
    }
}

trait AdminApiService {

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

  /**
   */
  def adminSystemConfigGet()
      (implicit ): Route

  /**
   */
  def adminUsersGet()
      (implicit ): Route

}


