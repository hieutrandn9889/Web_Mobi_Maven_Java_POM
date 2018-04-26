Feature: Verify login in SC
  @AndroidSC
  Scenario Outline: Test input username and password
    Given I open the app
    When I click login button
    Then I input username "<username>"
    Then I input password "<password>"
		Then I click submit button
    Examples: 
      | username || password |
      | india    || india    |