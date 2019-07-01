Feature: Test User API
  Background:
    * url 'http://localhost:8080'
    * header Accept = 'application/json'
  Scenario: Fetch all user
    Given path '/api/user'
    When method GET
    Then status 200
    #And match response contains { id: #notnull, name: #notnull, teamName: #notnull, salary: #notnull }
    And match response[1].name == 'Johnny Depp'

   Scenario: Fetch post by id
     Given path '/api/post/1'
     When method GET
     Then status 200
     And match response contains { id: 1, title: #notnull, body: #notnull, userId: #notnull }
