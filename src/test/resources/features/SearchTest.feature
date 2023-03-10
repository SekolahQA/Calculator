@Search
Feature: Search Google
  @Tag1
  Scenario: Simple Search Google
    Given User visit google page
    When User input search keyword
    Then User should see search result