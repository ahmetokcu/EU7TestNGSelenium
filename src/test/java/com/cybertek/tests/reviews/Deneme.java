package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;

public class Deneme {

    // Main Method is the execution point of any Java Program
    public static void main(String[] args){
        // Initialize Webdriver Object
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = WebDriverFactory.getDriver("Chrome");        // Open URL
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        // Set Chrome window size
        driver.manage().window().setSize(new Dimension(1552, 840));
        // Enter Firstname
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        // Set Lastname
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Wood");
        // Select Gender
        driver.findElement(By.id("sex-0")).click();
        // Select Experience
        driver.findElement(By.id("exp-4")).click();
        // Enter Date
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12-10-2021");
        // Select Profession
        driver.findElement(By.id("profession-0")).click();
        // Select Automation Tool
        driver.findElement(By.id("tool-2")).click();

        // Select Continent
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        // Select Command
        dropdown = driver.findElement(By.id("selenium_commands"));
        dropdown.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

        // Scroll Vertical
        JavascriptExecutor js = null;
        js.executeScript("window.scrollTo(0,675.5555419921875)");

        // Click Submit
        driver.findElement(By.id("submit")).click();
    }
}