package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

public class HomeSteps extends DriverManager {
    HomePage homepage= new HomePage();

    @Given("^I an on homepage$")
    public void i_an_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("^I click on login btn on home page$")
    public void i_click_on_login_btn_on_home_page() throws Throwable {
        homepage.clickOnLoginBtn();
    }

    @When("^I click on registration btn on home page$")
    public void iClickOnRegistrationBtnOnHomePage() {
       homepage.clickOnRegisterButton();
    }
    @When("^I click on books$")
    public void i_click_on_books() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnBooksMenuBtn();
    }

    @When("^I click on jewelry$")
    public void i_click_on_jewelry() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnJewelryBtn();
    }

    @When("^I hover the mouse on computer$")
    public void i_hover_the_mouse_on_computer() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homepage.mouseHoverOnComputerMenu();
    }

    @When("^I click on notebook$")
    public void i_click_on_notebook() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnNotebook();
    }
}
