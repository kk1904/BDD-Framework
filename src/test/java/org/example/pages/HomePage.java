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
    @FindBy(xpath = "//*[@class=\"header-menu\"]/ul[1]/li[5]")
    public WebElement booksMenuBtn;

    public void clickOnBooksMenuBtn(){
        booksMenuBtn.click();
    }
    @FindBy(xpath = "//*[@class=\"header-menu\"]/ul[1]/li[6]")
    public WebElement jewelryMenuBtn;

    public void clickOnJewelryBtn(){
        jewelryMenuBtn.click();
    }

}
