Feature: add to basket feature
  As a user
  I want to add product to basket
  So that I can buy the product

  @Basket1
  Scenario: View product on shopping cart
    Given I am on homepage
    When I click on books
    And I click on add to cart btn of First Prize Pies
    Then I should see the product in cart when I click on shopping cart

  @Basket2
  Scenario: View product on shopping cart
    Given I am on homepage
    When I click on jewelry
    And I click on Flower Girl Bracelet
    And I click on add to cart btn
    Then I should see the product in cart when I click on shopping cart

  @sort
  Scenario: Sorting by low to high
    Given I am on homepage
    When I click on books
    And I select sort by price low to high
    Then I should see items are sorted by price low to high

  @Display
  Scenario: Display number of items from 6 to 3
    Given I am on homepage
    When I hover the mouse on computer
    And I click on notebook
    And I select display from 6 to 3
    Then I should see 3 notebooks




