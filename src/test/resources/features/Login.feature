@LoginTestEmployee
Feature: Login test
  @TestVa
  Scenario Outline: user successfully login with valid credentialssad
    Given User on page employee sdcillsy
    When User fill form <username> and <password>
    And User click on loginad
    Then Get user Valid login resource

    Examples:
      | username  | password  |
      | tonnyUV   | Te$la1234 |