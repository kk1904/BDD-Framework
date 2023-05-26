@kv2
Feature: registration feature
  As a user
  I want to add registration functionality
  So that customer can use it

  Scenario:registration for new user
    Given I an on homepage
    When I click on registration btn on home page
    And I press on female radio btn
    And I enter the valid first name
    And I enter the valid last name
    And I enter the valid email address
    And I enter the password
    And I enter the  confirm password
    And I click on Register btn
    Then I should see on registration page "Your registration completed" text
    And the url should contain "/registerresult/"






