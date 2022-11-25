package catalog.city

import com.intuit.karate.Runner
import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._

class CitySimulation extends Simulation {

  def urlPattern = "GET /api/flights/catalog/city/BUE"

  val protocol = karateProtocol(
    "/city/{id}" -> Nil
  )

  protocol.nameResolver = (req, ctx) => req.getHeader("karate-name")

  //Which is the environment to run the test
  protocol.runner.karateEnv("dev")

  //The name of the file and the scenario to run
  val get = scenario("Get all the information about one city").exec(karateFeature("classpath:catalog/city/city_ok.feature"))

  setUp(
    //The number of users that receive the endpoint for a period of time
    get.inject(rampUsers(10) during (20 seconds)).protocols(protocol)
  ).assertions(
    //The conditions that you want to validate
    details(urlPattern).responseTime.percentile1.lte(1000),
    details(urlPattern).responseTime.percentile2.lte(500),
    details(urlPattern).responseTime.percentile3.lte(200),
    details(urlPattern).responseTime.percentile4.lte(55)
  )

}