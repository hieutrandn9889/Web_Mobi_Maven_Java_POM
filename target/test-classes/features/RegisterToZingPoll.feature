Feature: Register to ZingPoll
  I want to registered successfull
  @Chrome
  Scenario: Register with empty new user
    Given I am on ZingPoll website "chrome"
    And I click the SignIn button
    Then The SignIn form should be shown
    And Choose task new user radio button
    Then The SignUp form should be shown
    When I click Register button
    Then I verify the failure message "Please enter your name."
    And I verify the failure message "Please enter your email."
    And I verify the failure message "Please enter your password."
    And I verify the failure message "The re-type password is required and cannot be empty"
    And I verify the failure message "Please agree with the term!"