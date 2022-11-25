Feature: Info of Spring Boot
  Background:
    * url AppUrl
    * def info_response_ok = read('./response/info_response.json')

  Scenario: Obtain information about the application
    Given path 'info'
    When method GET
    Then status 200
    And match response == info_response_ok