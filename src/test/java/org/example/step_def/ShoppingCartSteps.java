package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.BasketPage;

public class ShoppingCartSteps extends DriverManager {
    BasketPage basketPage= new BasketPage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @And("^I click on add to cart btn of First Prize Pies$")
    public void iClickOnAddToCartBtnOfFirstPrizePies() {
        basketPage.clickOnAddTocartBtn();
    }

    @Then("^I should see the product in cart when I click on shopping cart$")
    public void i_should_see_the_product_in_cart_when_I_click_on_shopping_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basketPage.clickOnShoppingCart();
    }

    @When("^I click on Flower Girl Bracelet$")
    public void i_click_on_Flower_Girl_Bracelet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       basketPage.clickOnFLowerGirlBracelet();
    }

    @When("^I click on add to cart btn$")
    public void i_click_on_add_to_cart_btn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basketPage.clickOnAddToCartBtn2();
    }
}
