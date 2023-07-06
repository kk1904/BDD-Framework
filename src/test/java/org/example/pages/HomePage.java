package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath = "//*[@class=\"header-menu\"]/ul[1]/li[1]")
    public WebElement computerMenu;

    public void mouseHoverOnComputerMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(computerMenu).perform();
        Thread.sleep(4000);
    }

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
    public WebElement notebook;

    public void clickOnNotebook() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(notebook).click().perform();
        Thread.sleep(4000);
    }

}
