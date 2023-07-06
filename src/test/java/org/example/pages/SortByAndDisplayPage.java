package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SortByAndDisplayPage extends DriverManager {
    @FindBy(id="products-orderby")
    public WebElement sortByList;

    public void selectSortByWay() throws InterruptedException {
        sortByList.click();
        Select select=new Select(sortByList);
        select.selectByValue("10");
        //select.selectByIndex(3);
        Thread.sleep(4000);
        //driver.navigate.refresh();
    }
    @FindBy(id="products-pagesize")
    public WebElement displayNoOfItems;

    public void displayByNoOfItems() throws InterruptedException {
        displayNoOfItems.click();
        Select select=new Select(displayNoOfItems);
        select.selectByValue("3");
        Thread.sleep(4000);
    }
}
