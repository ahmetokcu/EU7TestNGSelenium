package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating radio buttons
        WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioBtn = driver.findElement(By.id("red"));

        //how to check radio button is selected?
        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        System.out.println("redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        //how to click radio button?
        redRadioBtn.click();


        //verify blue is selected red is not selected
        //blue --> true
        Assert.assertFalse(blueRadioBtn.isSelected(),"verify that blue is selected");
        //red --> false
        Assert.assertTrue(redRadioBtn.isSelected(),"verify that red is NOT selected");





        Thread.sleep(3000);
        driver.quit();




    }

}
