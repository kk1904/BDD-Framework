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

  @Login1
  Scenario:Successful Login with valid credentials
    Given I an on homepage
    When I click on login btn on home page
    And I enter emailID "vk19@gmail.com" and password "123456"
    And I click on login button
    Then I should see Log out on header.






