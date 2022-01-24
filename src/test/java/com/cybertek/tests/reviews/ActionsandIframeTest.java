package com.cybertek.tests.reviews;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsandIframeTest {
//1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
//2. Switch to iframe.
//3. Double click on the text “Double-click me to change my text color.”
//4. Assert: Text’s “style” attribute value contains “red”.

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        driver.findElement(By.id("accept-choices")).click();
        WebElement iframe = driver.findElement(By.xpath("//*[@id='iframeResult']"));

        driver.switchTo().frame(iframe);
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.doubleClick(driver.findElement(By.id("demo"))).perform();
        Thread.sleep(2000);

        String colorAttr = driver.findElement(By.id("demo")).getAttribute("style");
        System.out.println(colorAttr);
        Thread.sleep(2000);

        Assert.assertTrue(colorAttr.contains("red"));
        Thread.sleep(2000);


    }
    }


