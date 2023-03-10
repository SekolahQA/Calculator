@TagTest
Feature: Sum Feature
  TC1_SUM Calculator
  Scenario : User can Sum feature
    Given User already at Calculator page
    When I input number "2"
    And I add with number "5"
    Then the result is "7"