@kv1
Feature: login feature
  As a user
  I want to add login functionality
  So that customer can use it

  Scenario:Validating sign in text on login page
    Given I an on homepage
    When I click on login btn on home page
    Then I should see "Welcome, Please Sign In!" text
    And the url should contain "/login"