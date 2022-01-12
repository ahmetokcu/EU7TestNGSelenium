package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.tests.utilities.ConfigurationReader;
import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){

    String browserType = ConfigurationReader.get("browser");

    System.out.println("browserType = " + browserType);

    String url = ConfigurationReader.get("url");

    System.out.println("url = " + url);


    }

    @Test
    public void OpenBrowserWithConf(){

        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));

        driver.get(ConfigurationReader.get("url"));

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys("User10");
        driver.findElement(By.id("prependedInput")).sendKeys("UserUser123"+ Keys.ENTER);







    }
}
