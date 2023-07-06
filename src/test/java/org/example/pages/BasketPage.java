package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends DriverManager {
    @FindBy(xpath= "//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/38/1/1\"),!1']")
    public WebElement addToCartBtn;

    public void clickOnAddTocartBtn(){
        addToCartBtn.click();
    }
    @FindBy(xpath = "//*[@class=\"ico-cart\"]")
    public WebElement shoppingCart;

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")
    public WebElement flowerGirlBrecelet;

    public void clickOnFLowerGirlBracelet(){
        flowerGirlBrecelet.click();
    }

    @FindBy(id = "add-to-cart-button-41")
    public WebElement addToCartBtn2;

    public void clickOnAddToCartBtn2(){
        addToCartBtn2.click();
    }
}
