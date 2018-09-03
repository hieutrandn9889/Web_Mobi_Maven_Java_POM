@AndroidCalculator
Feature: Calculator

  Scenario: Calculator
    Given I open the Calculator application
    When I click number seven
    Then I click plus
    Then I click number two
    Then I click equal
    Then I validate value

