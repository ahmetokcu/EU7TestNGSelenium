package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) throws InterruptedException {
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("cHromE");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "mike@smith.com";

        //sendKey()-->send keyboard action to the webElement
        emailInputBox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box

        //somehow we should get text from web elements
        //two main ways to get text from web elements
        //1.getText()-->it will work %99 and it will return string
        //2.getAttribute("value")-->second way of getting text especially input boxes

        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        //verify that email is displayed in the input box
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //click on retrieve password
        WebElement retrievePaswordButton = driver.findElement(By.id("form_submit"));
        retrievePaswordButton.click();

        //verify that confirmation message says "your emails been sent"
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        //save expected message
        String expectedMessage = "Your e-mail's been sent!";
        //save actual message to variable
        String actualMessage = actualConfirmationMessage.getText();

        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);

        }
        //close browser
        Thread.sleep(2000);
        driver.quit();



    }
}
