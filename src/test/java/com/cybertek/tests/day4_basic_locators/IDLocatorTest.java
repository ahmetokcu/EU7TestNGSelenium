package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click dont click button
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

        Thread.sleep(2000);

        dontClickButton.click();





    }
}
