package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class PublicApi(
    publicService: PublicApiService
) {
  
  lazy val route: Route =
    path() { (cid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicByCidCidGet(cid = cid)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicInfoGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicMetricsDealsOnChainGet()
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicMinersDealsMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicMinersFailuresMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicMinersGet()
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicMinersStatsMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicNetAddrsGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicNetPeersGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  publicService.publicStatsGet()
               
             
            }
         
        }
      }
    }
}

trait PublicApiService {

  /**
   */
  def publicByCidCidGet(cid: String)
      (implicit ): Route

  /**
   */
  def publicInfoGet()
      (implicit ): Route

  /**
   */
  def publicMetricsDealsOnChainGet()
      (implicit ): Route

  /**
   */
  def publicMinersDealsMinerGet(miner: String)
      (implicit ): Route

  /**
   */
  def publicMinersFailuresMinerGet(miner: String)
      (implicit ): Route

  /**
   */
  def publicMinersGet()
      (implicit ): Route

  /**
   */
  def publicMinersStatsMinerGet(miner: String)
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

  /**
   */
  def publicStatsGet()
      (implicit ): Route

}


