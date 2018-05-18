@SimulatorIOS
Feature: Run IOS to login

  Background: Given I open application IOS
    When I click skip button

  @tag1
  Scenario Outline: Testing IOS
    Then I input email "<email>" and password "<password>"
    Then I click login button of app
    Then I see home page
    And I click add new event

    Examples: 
      | email                   | password |
      | thu.nguuyen@smartdev.vn | Test@123 |
