package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._

class MetricsApi(
    metricsService: MetricsApiService
) {
  
  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  metricsService.publicMetricsDealsOnChainGet()
               
             
            }
         
        }
      }
    }
}

trait MetricsApiService {

  /**
   */
  def publicMetricsDealsOnChainGet()
      (implicit ): Route

}


