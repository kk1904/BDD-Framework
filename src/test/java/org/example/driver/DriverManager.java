package org.example.driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;


public class DriverManager {
    public static WebDriver driver;
    String url= "https://demo.nopcommerce.com/";
    public static Logger log = Logger.getLogger(DriverManager.class);

    String browser= "chrome";
    public DriverManager(){
        PageFactory.initElements(driver,this);
        log.info("Driver is started");
    }

   public void openLocalBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    public void openHeadlessBrowser() throws IllegalAccessException {
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("window-size=1920,1080");
                driver= new ChromeDriver(chromeOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                throw new IllegalAccessException("unexpected browser");
        }
    }

    public void openUrl(){
        driver.get(url);
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public void applyWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void maxWindow(){
        driver.manage().window().maximize();
    }
    public void sleepWindow(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }
    public void closeWindow(){
        driver.quit();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public WebElement waitUntilElementIsClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,30);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementVisibility(WebElement element, int timeout, String failureMessage) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.withMessage(failureMessage);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void takeElementscreenshot(WebElement element, String fileName) {
        File scnFile =element.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scnFile, new File("./target/screenshots/" +fileName+ ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshot(Scenario scenario){

        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
      //take a screen shot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("C:/Users/Kaushal Samani/Desktop/screenshotTests"));
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

   public int generateRandomNumber(){
        Random random = new Random();
// Obtain a number between [0 - 49].
        return random.nextInt(50);
    }

    public static String getRandomString(int length) {
        final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        while (length > 0) {
            Random rand = new Random();
            result.append(characters.charAt(rand.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }
}

