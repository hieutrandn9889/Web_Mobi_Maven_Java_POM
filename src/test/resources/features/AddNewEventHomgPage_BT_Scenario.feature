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

  @tag2
  Scenario Outline: Enter Homepage
    Then I input email "<email>" and password "<password>"
    Then I click login button of app
    Then I open homepage
    And I click logout button

    Examples: 
      | email                   | password |
      | thu.nguuyen@smartdev.vn | Test@123 |
