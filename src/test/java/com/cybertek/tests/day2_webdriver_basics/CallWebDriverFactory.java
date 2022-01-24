package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("title = " + title);


        driver = WebDriverFactory.getDriver("edge");

        driver.get("https://www.google.com");

        title = driver.getTitle();

        System.out.println("title = " + title);





    }




}
