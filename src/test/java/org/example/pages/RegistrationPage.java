package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RegistrationPage extends DriverManager {

    @FindBy(css = "#gender-female")
    public WebElement clickOnRadioButton;

    public void clickRadioButton() {
        clickOnRadioButton.click();
    }

    @FindBy(id = "FirstName")
    public WebElement enterFirstName;

    public void enterName(String firstName) {
        enterFirstName.sendKeys(firstName);
    }

    @FindBy(id = "LastName")
    public WebElement enterLastName;

    public void enterLName(String lastName) {
        enterLastName.sendKeys(lastName);

    }

    @FindBy(id = "Email")
    public WebElement enterEmail;

    public void enterMail(String email) {
        String randomString = getRandomString(5);
        String myEmail = randomString+email;
        System.out.println(myEmail);
        enterEmail.sendKeys(email);
    }

    @FindBy(id = "Password")
    public WebElement enterPassword;

    public void enterPass(String password) {
        enterPassword.sendKeys(password);
    }

    @FindBy(id = "ConfirmPassword")
    public WebElement enterConfirmPassword;

    public void enterCPass(String confirmPassword) {
        enterConfirmPassword.sendKeys(confirmPassword);
    }

    @FindBy(id = "register-button")
    public WebElement clickOnRegisterBtn;

    public void clickRegisterBtn() {
        clickOnRegisterBtn.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    public WebElement welcomeRegistration;

    public String getRegisterText() {
        String actualtext = welcomeRegistration.getText();           //your registration completed
        return actualtext;
    }
    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword ){
        enterFirstName.clear();
        enterFirstName.sendKeys(firstName);
        enterLastName.clear();
        enterLastName.sendKeys(lastName);
        enterEmail.clear();
        String randomString= getRandomString(5);
        String myEmail = randomString+email;
        System.out.println(email);
        enterEmail.sendKeys(email);
        enterPassword.clear();
        enterPassword.sendKeys(password);
        enterConfirmPassword.clear();
        enterConfirmPassword.sendKeys(confirmPassword);
    }
}
