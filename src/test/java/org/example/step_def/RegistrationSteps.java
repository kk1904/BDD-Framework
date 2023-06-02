package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RegistrationSteps extends DriverManager {
        RegistrationPage registrationpage = new RegistrationPage();
       /* @And("^I press on female radio btn$")
        public void i_press_on_female_radio_btn() throws Throwable {
            registrationpage.clickRadioButton();
        }
    @And("^I enter the valid first name$")
    public void i_enter_the_valid_first_name(String firstName) throws Throwable {
         registrationpage.enterName(firstName);
    }
    @And("^I enter the valid last name$")
    public void i_enter_the_valid_last_name(String lastName) throws Throwable {
        registrationpage.enterLName(lastName);
    }

    @And("^I enter the valid email address$")
    public void i_enter_the_valid_email_address(String email) throws Throwable {
        registrationpage.enterMail(email);
    }

    @And("^I enter the password$")
    public void i_enter_the_password(String password) throws Throwable {
       registrationpage.enterPass(password);
    }
    @And("^I enter the  confirm password$")
    public void i_enter_the_confirm_password(String cPassword) throws Throwable {
        registrationpage.enterCPass(cPassword);
    }*/

    @Then("^I click on Register btn$")
    public void iClickOnRegisterBtn() {
        registrationpage.clickRegisterBtn();
    }

    @Then("^I should see on registration page \"([^\"]*)\" text$")
    public void i_should_see_on_registration_page_text(String expectedText) throws Throwable {
        String actualText = registrationpage.getRegisterText();
        assertEquals(expectedText,actualText);
    }

    @And("^I enter the valid firstname \"([^\"]*)\"$")
    public void iEnterTheValidFirstname(String firstname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registrationpage.enterName(firstname);

    }

    @And("^I enter the valid lastname \"([^\"]*)\"$")
    public void iEnterTheValidLastname(String lastname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registrationpage.enterLName(lastname);

    }

    @And("^I enter the valid email \"([^\"]*)\"$")
    public void iEnterTheValidEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registrationpage.enterMail(email);

    }

    @And("^I enter the \"([^\"]*)\"$")
    public void iEnterThe(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registrationpage.enterPass(password);

    }

    @And("^I enter the confirm password \"([^\"]*)\"$")
    public void iEnterTheConfirmPassword(String confirmpass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registrationpage.enterCPass(confirmpass);

    }

    @And("^I enter following details for registration$")
    public void iEnterFollowingDetailsForRegistration(DataTable dataTable) {
        List<Map<String,String>> data= dataTable.asMaps(String.class,String.class);
        System.out.println(data);
        System.out.println(dataTable);
        registrationpage.enterRegistrationDetails(
                data.get(0).get("firstName"),
                data.get(0).get("lastName"),
                data.get(0).get("email"),
                data.get(0).get("password"),
                data.get(0).get("confirmPassword")
        );
    }
}
