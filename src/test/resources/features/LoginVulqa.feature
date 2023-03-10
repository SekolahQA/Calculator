@LoginTest
Feature: Login Valid
  @Test1
  Scenario Outline: user successfully login with valid credentials
    Given User on page Vulqa Cilsi
    When User click on login
    And User input <username> and <password>
    And User click on login button
    Then Get Valid login resource

    Examples:
      | username             | password  |
      | try123@mailnesia.com | admin1234 |