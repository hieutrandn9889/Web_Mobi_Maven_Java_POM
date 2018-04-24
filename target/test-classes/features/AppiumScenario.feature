Feature: Validate Different Options

  @Android
  Scenario: API demos
    Given I open the application
    When I tap on Accessibility
    Then I validate Custom View

  @AndroidSwipe
  Scenario: API demos swipe
    Given I open the application
    When I click view buton
    Then I click Tabs button
    Then I validate Conten By ID

  @AndroidChrome
  Scenario: Test chrome browser
    Given I open the browser
    When I input text to searching
    Then I click search button

  @Android_API_SMS
  Scenario Outline: Test send SMS and get SMS
    Given I open the application
    When I click OS and click SMS Messaging
    And I input sms "<sms>"
    And I input content sms "<content_sms>"
    Then I click send button
    Then I verify message sent

    Examples: 
      | sms   | content_sms        |
      | 00465 | Detail sms: 004655 |

  @AndroidDropdown
  Scenario Outline: Test input msg then auto chosing dropdown
    Given I open the application
    When I click view buton
    Then I click Auto complete button
    And I click screen top
    Then I input content "<content_dropdown>"
    Then I choose india dropdown

    Examples: 
      | content_dropdown |
      | india            |

  @AndroidSMS
  Scenario Outline: Test input sms
    Given I open the application sms
		
