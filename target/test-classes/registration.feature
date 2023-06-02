Feature: registration feature
  As a user
  I want to add registration functionality
  So that customer can use it

  @RegTest @Smoke
  Scenario:Registration for new user
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

    @RegTest1
    Scenario Outline: Registration with multiple details
      Given I an on homepage
      When I click on registration btn on home page
      And I enter the valid firstname "<Firstname>"
      And I enter the valid lastname "<Lastname>"
      And I enter the valid email "<Email>"
      And I enter the "<Password>"
      And I enter the confirm password "<Confirmpassword>"
      And I click on Register btn
      Then I should see on registration page "Your registration completed" text
      And the url should contain "/registerresult/"
      Examples:
        | Firstname | Lastname | Email        | Password | Confirmpassword |
        | Krishna   | Vasani   | vk@gmail.com | 123456   | 123456          |
        | Urvi      | Vasani   | uv@gmail.com | 123456   | 123456          |
        | Milan     | Vasani   | mv@gmail.com | 123456   | 123456          |

  @RegTest2
  Scenario: Registration with data table for one registration
    Given I an on homepage
    When I click on registration btn on home page
    And I enter following details for registration
      | firstName | lastName | email        | password | confirmPassword |
      | Krishna   | Vasani   | vk@gmail.com | 123456   | 123456          |
    And I click on Register btn
    Then I should see on registration page "Your registration completed" text
    And the url should contain "/registerresult/"

    @RegTest3
    Scenario Outline: Registration with data table with outline
      Given I an on homepage
      When I click on registration btn on home page
      And I enter following details for registration
        | firstName    | lastName    | email    | password    | confirmPassword    |
        | <firstName1> | <lastName1> | <email1> | <password1> | <confirmPassword1> |
      And I click on Register btn
      Then I should see on registration page "Your registration completed" text
      And the url should contain "/registerresult/"
      Examples:
        | firstName1 | lastName1 | email1       | password1 | confirmPassword1 |
        | Reema      | Dave      | ks@gmail.com | 123456    | 123456           |
        | Hima       | Kanabar   | hk@gmail.com | 123456    | 123456           |
        | Chandni    | Pathak    | cp@gmail.com | 123456    | 123456           |





