package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class NetApi(
    netService: NetApiService
) {
  
  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.netAddrsGet()
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicMinersFailuresMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicMinersGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicNetAddrsGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicNetPeersGet()
               
             
            }
         
        }
      }
    }
}

trait NetApiService {

  def netAddrsGet200(responseStringarray: List[String]): Route =
    complete((200, responseStringarray))
  /**
   * Code: 200, Message: OK, DataType: List[String]
   */
  def netAddrsGet()
      (implicit ): Route

  /**
   */
  def publicMinersFailuresMinerGet(miner: String)
      (implicit ): Route

  /**
   */
  def publicMinersGet()
      (implicit ): Route

  def publicNetAddrsGet200(responseStringarray: List[String]): Route =
    complete((200, responseStringarray))
  /**
   * Code: 200, Message: OK, DataType: List[String]
   */
  def publicNetAddrsGet()
      (implicit ): Route

  def publicNetPeersGet200(responseStringarray: List[String]): Route =
    complete((200, responseStringarray))
  /**
   * Code: 200, Message: OK, DataType: List[String]
   */
  def publicNetPeersGet()
      (implicit ): Route

}


