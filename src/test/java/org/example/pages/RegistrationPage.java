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

    public void enterName() {
        enterFirstName.sendKeys("Krishna");
    }

    @FindBy(id = "LastName")
    public WebElement enterLastName;

    public void enterLName() {
        enterLastName.sendKeys("vasani");
    }

    @FindBy(id = "Email")
    public WebElement enterEmail;

    public void enterMail() {
        enterEmail.sendKeys("vk19@gmail.com");
    }

    @FindBy(id = "Password")
    public WebElement enterPassword;

    public void enterPass() {
        enterPassword.sendKeys("123456");
    }

    @FindBy(id = "ConfirmPassword")
    public WebElement enterCPassword;

    public void enterCPass() {
        enterCPassword.sendKeys("123456");
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
}
