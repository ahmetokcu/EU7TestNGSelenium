package com.cybertek.tests.reviews.week2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://www.demoblaze.com/index.html");
        Thread.sleep(3000);

        //naviagte to laptop category
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(5000);

        driver.findElement(By.partialLinkText("i7")).click();
        Thread.sleep(3000);

        int expectedPrice = 790;

        WebElement priceTextElement = driver.findElement(By.tagName("h3"));
        String priceText = priceTextElement.getText();

        System.out.println("priceText = " + priceText);

        String [] arr = priceText.split(" ");

        int actualPrice = Integer.parseInt(arr[0].substring(1));

        System.out.println("Actual and Expected Price is same: "+(expectedPrice==actualPrice));


    }


}
