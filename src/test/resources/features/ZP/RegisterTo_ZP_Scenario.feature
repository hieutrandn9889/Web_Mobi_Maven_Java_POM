Feature: Register to ZingPoll
  I want to registered successfull

  @Chrome
  Scenario Outline: Register with empty new user
    Given I am on ZingPoll website
    Then I click the SignIn button
    Then I input username <username> and password <password>

    Examples: 
      | username               | password |
      | hieutrandn01@gmail.com |   123456 |
