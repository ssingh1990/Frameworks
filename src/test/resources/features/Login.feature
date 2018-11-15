@Login
Feature: Login

  Background: A Registered User navigates to Login page
    Given I navigate to the "Login" page

  @SuccessfulLogin
  Scenario Outline: Successful login using valid credentials
    When I fill in "username" with "<username>"
    And I fill in "password" with "<password>"
    And I click on the "Log In" button
    Then I should be successfully logged in
    And I should land on the "Home" page
    And I should see "Dashboard" and "Logout" links
  Examples:
    | username               | password |
    | satendra@greenlots.com | ss       |

  @failedLogin
  Scenario Outline: Failed login using wrong credentials
    When I fill in "username" with "<username>"
    And I fill in "password" with "<password>"
    And I click on the "Log In" button
    Then I should be redirected on the "Login" page
    And I should see "error" message as "<alert>"
  Examples:
    | username | password | alert                          |
    | sat     | !23      | Invalid username and password. |

