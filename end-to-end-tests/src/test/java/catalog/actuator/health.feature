Feature: Health of Spring Boot
  Background:
    * url AppUrl
    * def health_response_ok = read('./response/health_response.json')

  Scenario: Obtain information about if application is healthy or not
    Given path 'health'
    When method GET
    Then status 200
    And match response == health_response_ok