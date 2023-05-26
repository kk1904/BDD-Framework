package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import static org.junit.Assert.assertEquals;

public class RegistrationSteps extends DriverManager {
        RegistrationPage registrationpage = new RegistrationPage();
        @And("^I press on female radio btn$")
        public void i_press_on_female_radio_btn() throws Throwable {
            registrationpage.clickRadioButton();
        }
    @And("^I enter the valid first name$")
    public void i_enter_the_valid_first_name() throws Throwable {
        registrationpage.enterName();
    }
    @And("^I enter the valid last name$")
    public void i_enter_the_valid_last_name() throws Throwable {
        registrationpage.enterLName();
    }

    @And("^I enter the valid email address$")
    public void i_enter_the_valid_email_address() throws Throwable {
        registrationpage.enterMail();
    }

    @And("^I enter the password$")
    public void i_enter_the_password() throws Throwable {
       registrationpage.enterPass();
    }
    @And("^I enter the  confirm password$")
    public void i_enter_the_confirm_password() throws Throwable {
        registrationpage.enterCPass();
    }

    @Then("^I click on Register btn$")
    public void iClickOnRegisterBtn() {
        registrationpage.clickRegisterBtn();
    }

    @Then("^I should see on registration page \"([^\"]*)\" text$")
    public void i_should_see_on_registration_page_text(String expectedText) throws Throwable {
        String actualText = registrationpage.getRegisterText();
        assertEquals(expectedText,actualText);
    }
}
