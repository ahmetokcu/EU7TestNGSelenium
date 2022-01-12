package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) throws InterruptedException {

       //open chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected url before clicking button
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement --> Interface that represent elements on the webpage
        //findElement --> method used to find element on a page
        WebElement retrievePasswordButtton = driver.findElement(By.id("form_submit"));
        Thread.sleep(2000);
        retrievePasswordButtton.click();
        Thread.sleep(2000);

        //save expected url after clicking button
        String actualUrl = driver.getCurrentUrl();

        //verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //close your browser
        driver.quit();



    }




}
