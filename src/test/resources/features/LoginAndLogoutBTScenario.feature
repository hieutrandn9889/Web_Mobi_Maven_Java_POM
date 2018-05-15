Feature: Run IOS to login

  @SimulatorIOS
  Scenario Outline: Testing IOS
    Given I open application IOS
    When I click skip button
    Then I input email "<email>" and password "<password>"
    Then I click login button of app

    Examples: 
      | email                   | password |
      | thu.nguuyen@smartdev.vn | Test@123 |

 @homePageBT
  Scenario: Enter Homepage 
    Given I see home page
    And I click add new event