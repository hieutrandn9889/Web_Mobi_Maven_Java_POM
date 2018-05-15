Feature: Run IOS

  @SimulatorIOS
  Scenario Outline: Testing IOS
    Given I open application IOS
    When I click skip button
    Then I input email "<email>" and password "<password>"
    Then I click login button of app

    Examples: 
      | email                   | password |
      | thu.nguuyen@smartdev.vn | Test@123 |

 @LogOutBT
  Scenario: Enter Homepage 
    Given I open homepage
    And I click logout button