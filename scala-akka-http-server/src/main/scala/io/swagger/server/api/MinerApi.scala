package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class MinerApi(
    minerService: MinerApiService
) {
  
  lazy val route: Route =
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  minerService.publicMinersDealsMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  minerService.publicMinersStatsMinerGet(miner = miner)
               
             
            }
         
        }
      }
    }
}

trait MinerApiService {

  /**
   */
  def publicMinersDealsMinerGet(miner: String)
      (implicit ): Route

  /**
   */
  def publicMinersStatsMinerGet(miner: String)
      (implicit ): Route

}


