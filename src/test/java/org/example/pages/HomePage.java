package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    @FindBy(css=".ico-login")
    public WebElement loginBtn;
    public void clickOnLoginBtn(){
        loginBtn.click();
    }

    @FindBy(css=".ico-register")
    public WebElement registerBtn;

    public void clickOnRegisterButton(){
        registerBtn.click();
    }

}
