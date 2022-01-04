package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OdevNewCheckBoxHW {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement username = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));

        String Tester = "Tester";

        username.sendKeys(Tester);

        WebElement password = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));

        String Password = "test";

        password.sendKeys(Password);

        WebElement Login = driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));

        Login.click();

        WebElement CheckAll = driver.findElement(By.cssSelector("#ctl00_MainContent_btnCheckAll"));

        CheckAll.click();

        WebElement PaulButton = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
        WebElement MarkButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        WebElement SteveButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl04_OrderSelector"));
        WebElement CharlesButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        WebElement SusanButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
        WebElement BobButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl07_OrderSelector"));
        WebElement SamuelButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector"));
        WebElement ClareButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector"));

        System.out.println(PaulButton.isSelected());
        System.out.println(MarkButton.isSelected());
        System.out.println(SteveButton.isSelected());
        System.out.println(CharlesButton.isSelected());
        System.out.println(SusanButton.isSelected());
        System.out.println(BobButton.isSelected());
        System.out.println(SamuelButton.isSelected());
        System.out.println(ClareButton.isSelected());

        WebElement UnCheckAll = driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));

        UnCheckAll.click();

        System.out.println("================");

         PaulButton = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
         MarkButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
         SteveButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl04_OrderSelector"));
         CharlesButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
         SusanButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
         BobButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl07_OrderSelector"));
         SamuelButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector"));
         ClareButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector"));

        System.out.println(PaulButton.isSelected());
        System.out.println(MarkButton.isSelected());
        System.out.println(SteveButton.isSelected());
        System.out.println(CharlesButton.isSelected());
        System.out.println(SusanButton.isSelected());
        System.out.println(BobButton.isSelected());
        System.out.println(SamuelButton.isSelected());
        System.out.println(ClareButton.isSelected());

        //ClareButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector"));

        //ClareButton.click();

        PaulButton = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));

        PaulButton.click();

        WebElement Delete = driver.findElement(By.cssSelector("#ctl00_MainContent_btnDelete"));

        Delete.click();

        Thread.sleep(3000);

        System.out.println("================");

       //ClareButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector"));

        //ClareButton.click();

        WebElement result = driver.findElement(By.xpath("//td[contains(text(),'Paul')]"));

        //String resultText = result.getText();

        //Assert.assertFalse(result.isDisplayed(),"No");






    }


}
