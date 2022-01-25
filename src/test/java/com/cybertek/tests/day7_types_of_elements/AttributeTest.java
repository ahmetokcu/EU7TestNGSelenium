package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.id("blue"));
        WebElement redRadioBtn = driver.findElement(By.id("red"));


        System.out.println("=========================");

        System.out.println(blueRadioBtn.getAttribute("value"));
        System.out.println(redRadioBtn.getAttribute("value"));

        System.out.println("=========================");

        //get the value of type attribute
        System.out.println(blueRadioBtn.getAttribute("type"));
        //get the value of name attribute
        System.out.println(blueRadioBtn.getAttribute("name"));
        //get the value of checked
        //since checked attribute does not keep any value, it will return true or false based on the condition
        System.out.println(blueRadioBtn.getAttribute("checked"));

        //trying to get attribute that doe not exist
        System.out.println(blueRadioBtn.getAttribute("href"));

        System.out.println(blueRadioBtn.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));

        System.out.println("=========================");

        System.out.println(button2.getAttribute("class"));

        System.out.println("=========================");

        System.out.println(button2.getAttribute("outerHTML"));
        String outerHTML = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHTML.contains("Button 2"));

        System.out.println(button2.getAttribute("innerHTML"));







    }
}
