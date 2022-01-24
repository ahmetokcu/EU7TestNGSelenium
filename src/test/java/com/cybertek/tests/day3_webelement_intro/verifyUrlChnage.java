package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChnage {

    public static void main(String[] args) throws InterruptedException {

    //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("cHromE");
        driver.get("http://practice.cybertekschool.com/forgot_password");

    //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

    //sendKey()-->send keyboard action to the webElement
        emailInputBox.sendKeys("mike@cybertek.com");

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        Thread.sleep(2000);

    //verify that Url changed to http://practice.cybertekschool.com/email.sent
    //create expectedUrl
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

    //saving actual Url from browser after we enter any email and click retrieve password button
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);

        }
        //close browser
        driver.quit();

    }

}
