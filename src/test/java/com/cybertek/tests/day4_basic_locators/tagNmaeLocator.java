package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNmaeLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        //send keys to FullName
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith with TagName");
        Thread.sleep(3000);

        //send keys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");
        Thread.sleep(3000);

        //lazy way to click button
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);

        driver.quit();



    }
}
