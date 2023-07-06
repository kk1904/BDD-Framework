package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class LoginSteps extends DriverManager {
    LoginPage loginpage = new LoginPage();
    @Then("^I should see \"([^\"]*)\" text$")
    public void i_should_see_text(String expectedText) throws Throwable {
        String actualText=loginpage.getWelcomeText();
        assertEquals(expectedText,actualText);
    }
    @Then("^the url should contain \"([^\"]*)\"$")
    public void the_url_should_contain(String expectedText) throws Throwable {
        String myUrl=getUrl();
        assertThat(myUrl,containsString(expectedText));
    }

    @And("^I enter emailID \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterEmailIDAndPassword(String arg0, String arg1) throws Throwable {
        loginpage.enterMail();
        loginpage.enterPass();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        loginpage.clickLoginBtn();
    }

    @Then("^I should see Log out on header\\.$")
    public void iShouldSeeLogOutOnHeader() {
            boolean ans= loginpage.displayLogoutBtn();
            assertTrue(ans);
    }
}
