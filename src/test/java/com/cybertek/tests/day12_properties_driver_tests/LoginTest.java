package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.tests.TestBase;
import com.cybertek.tests.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class LoginTest extends TestBase {

    @Test
    public void OpenBrowserWithConf() {

        driver.get(ConfigurationReader.get("url"));

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys("User10");
        driver.findElement(By.id("prependedInput")).sendKeys("UserUser123" + Keys.ENTER);//Keys.TAB


    }
}