package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        Thread.sleep(3000);
        homeLink.click();
        Thread.sleep(3000);


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //print multiple buttons header
        System.out.println(driver.findElement(By.className("h3")).getText());



    }
}
