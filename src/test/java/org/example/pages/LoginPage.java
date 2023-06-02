package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(xpath = "//div[@class=\"center-1\"]/div/div/h1") //welcometext inspect element
    WebElement welcomeText;

    public String getWelcomeText(){
        String actualtext= welcomeText.getText();           //Welcome, Please Sign In!
        return actualtext;
    }

    @FindBy(id = "Email")
    public WebElement enterEmail;

    public void enterMail(){
        enterEmail.sendKeys("vk19@gmail.com");
    }

    @FindBy(id = "Password")
    public WebElement enterPassword;

    public void enterPass(){
        enterPassword.sendKeys("123456");
    }

    @FindBy(className ="login-button")
    public WebElement clickOnLoginBtn;

    public void clickLoginBtn(){
        clickOnLoginBtn.click();
    }
    @FindBy(className = "ico-logout")
    public WebElement logoutBtn;

    public boolean displayLogoutBtn(){
        return logoutBtn.isDisplayed();
    }
}
