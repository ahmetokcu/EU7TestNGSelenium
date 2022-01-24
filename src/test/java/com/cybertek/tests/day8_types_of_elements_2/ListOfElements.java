package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
         driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //save our web elements inside the list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());

        //verify button size
        Assert.assertEquals(buttons.size(), 6, "verify button size");

        //iter + enter to get each loop with shortcut
        for (WebElement button : buttons) {
            System.out.println(button.getText());
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verfiy button are dispalyed");
        }

        //click second button
        buttons.get(1).click();

    }

    @Test
    public void test2(){

        //regular findElement method will throw NSE if locator does not exist
        //driver.findElement(By.tagName("buttonkjglgölwgöl""));


        //passing locator which does not exist, it will not throw NoSuchElement
        //Alt+Enter or Option+Enter then one more enter for shortcut
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));










    }





}
