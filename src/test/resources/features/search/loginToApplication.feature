Feature: Login to HRM Application

  Scenario: Login with valid credentials
    Given user is on homepage
    When user enter admin as username
    And user enter admin123 as pasword
    Then user should be able to login