Feature: Flow to obtain all the information - Success cases
  Background:
    * url AppUrl
    * def city_response_ok = read('./response/city_response_ok.json')
    * def country_response_ok = read('./response/country_response_ok.json')

  Scenario: Obtain the information about one particular city and country
    Given path 'city/BUE'
    When method GET
    Then status 200
    And match response == city_response_ok

    Given path 'country/' + response.country.code
    When method GET
    Then status 200
    And match response == country_response_ok