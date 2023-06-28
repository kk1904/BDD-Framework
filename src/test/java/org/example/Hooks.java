package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager drivermanager = new DriverManager();
    public static Logger log = Logger.getLogger(DriverManager.class);
    @Before
    public void setUp() throws InterruptedException, IllegalAccessException {
        drivermanager.openLocalBrowser();
        //drivermanager.openHeadlessBrowser();
       log.info("Browser is opened");
        drivermanager.openUrl();
        drivermanager.maxWindow();
        drivermanager.applyWait();
        log.info("Scenario is started");
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            drivermanager.takeScreenshot(scenario);
        }
        drivermanager.closeWindow();
        log.info("Driver and Browser is closed");

    }
}
