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
}
