Feature: User login

  Scenario: The user enter the valid credentials
    Given the user go to loginPage
    When the user enters valid credentials
    Then the user should be redirected to the products module

  Scenario: The user enter the invalid credentials
    Given the user go to loginPage
    When the user enters invalid credentials
    Then the user should see an error message
<