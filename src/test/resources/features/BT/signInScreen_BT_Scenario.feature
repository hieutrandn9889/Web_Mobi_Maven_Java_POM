@Medication
Feature: Run app to testing medication

  Background: Given I open app and testing
    When I click skip button
    Scenario Outline: Testing Login
    Then I click login button to login
    Then I input email "<email>" and password "<password>"
    Then I click login button of app
    Then I click allow button
    Then I click menu taskbar
    Then I click My Pa button
    Then I click medication button

    Examples: 
      | email                   | password |
      | hieutrandn123@gmail.com | Abc@123  |
  
  @C1InputEmail
  Scenario: I check medication
  Then I stay medication page
  Then I click add a medication
  
