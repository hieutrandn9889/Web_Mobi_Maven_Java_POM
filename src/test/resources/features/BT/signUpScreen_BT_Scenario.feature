@RegisterScreen
Feature: Run app to testing register screen

  Background: Given I open application
    When I click skip button to going register screen

  @C1InputEmail
  Scenario Outline: Testing IOS
    Then I input email "<email>" and password "<password>" and confirm password "confirmPassword"
    Then I click login button sign up

    Examples: 
      | email               | password | confirmPassword |
      | hieutran3@gmail.com | Abc@123  | Abc@123         |

  @C2FB
  Scenario: Testing Sign up by fb
    Then I click FB button of app

  @C3GooglePlus
  Scenario: Testing Sign up by google plus
    Then I click Google plus button of app
