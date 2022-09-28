package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Main.estimateDealBody

class DealsApi(
    dealsService: DealsApiService,
    dealsMarshaller: DealsApiMarshaller
) {
  import dealsMarshaller._

  lazy val route: Route =
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Main.estimateDealBody]){ body =>
                  dealsService.dealEstimatePost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { (dealid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealInfoDealidGet(dealid = dealid)
               
             
            }
         
        }
      }
    } ~
    path() { (propcid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealProposalPropcidGet(propcid = propcid)
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealQueryMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { (propcid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealStatusByProposalPropcidGet(propcid = propcid)
               
             
            }
         
        }
      }
    } ~
    path() { (miner, propcid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealStatusMinerPropcidGet(miner = miner, propcid = propcid)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealTransferInProgressGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealTransferStatusPost()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealsFailuresGet()
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[String]){ body =>
                  dealsService.dealsMakeMinerPost(body = body, miner = miner)
                }
             
            }
         
        }
      }
    } ~
    path() { (deal) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.dealsStatusDealGet(deal = deal)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.publicDealsFailuresGet()
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  dealsService.publicMinersStorageQueryMinerGet(miner = miner)
               
             
            }
         
        }
      }
    }
}

trait DealsApiService {

  /**
   */
  def dealEstimatePost(body: Main.estimateDealBody)
      (implicit ): Route

  /**
   */
  def dealInfoDealidGet(dealid: Int)
      (implicit ): Route

  /**
   */
  def dealProposalPropcidGet(propcid: String)
      (implicit ): Route

  /**
   */
  def dealQueryMinerGet(miner: String)
      (implicit ): Route

  /**
   */
  def dealStatusByProposalPropcidGet(propcid: String)
      (implicit ): Route

  /**
   */
  def dealStatusMinerPropcidGet(miner: String, propcid: String)
      (implicit ): Route

  /**
   */
  def dealTransferInProgressGet()
      (implicit ): Route

  /**
   */
  def dealTransferStatusPost()
      (implicit ): Route

  /**
   */
  def dealsFailuresGet()
      (implicit ): Route

  /**
   */
  def dealsMakeMinerPost(body: String, miner: String)
      (implicit ): Route

  /**
   */
  def dealsStatusDealGet(deal: Int)
      (implicit ): Route

  /**
   */
  def publicDealsFailuresGet()
      (implicit ): Route

  /**
   */
  def publicMinersStorageQueryMinerGet(miner: String)
      (implicit ): Route

}

trait DealsApiMarshaller {
  implicit def fromRequestUnmarshallerString: FromRequestUnmarshaller[String]

  implicit def fromRequestUnmarshallerMain.estimateDealBody: FromRequestUnmarshaller[Main.estimateDealBody]


}

