package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.day10_file_upload.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class NewCheckBoxHW {

    @Test
    public void test() throws InterruptedException {
        // Setup Chrome Driver.
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        String expectedLoginURL = "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";
        // Going to
        driver.get(expectedLoginURL);

        // Correct Source url and actual url is same
        Assert.assertEquals(expectedLoginURL, driver.getCurrentUrl());
        System.out.println("expectedLoginURL = " + expectedLoginURL);
        System.out.println("actualLoginURL = " + driver.getCurrentUrl());

        // Expected Login Values
        String expectedUserName = "Tester";
        String expectedPassword = "test";

        // Find Username InputBox and send the expected keys
        WebElement userNameInputBox = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        // Clear InputBox if it is not empty
        userNameInputBox.clear();
        // Send the expected value to the input-box
        userNameInputBox.sendKeys(expectedUserName);
        // Check the sent expected value and actual keys are equal
        Assert.assertEquals(expectedUserName, userNameInputBox.getAttribute("value"));


        // Find User Password InputBox and send the expected keys
        WebElement userPasswordInputBox = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        // Clear Input-Box if it is not empty
        userPasswordInputBox.clear();
        // Send the expected value to the input-box
        userPasswordInputBox.sendKeys(expectedPassword);
        // Check the sent expected userPassword and actual keys are equal
        Assert.assertEquals(expectedPassword, userPasswordInputBox.getAttribute("value"));

        // Click Submit Button
        WebElement loginButton = driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
        loginButton.click();

        // Checking the expected and actual url after login
        String expectedListOfAllOrdersURL = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/";
        String actualListOfAllOrdersURL = driver.getCurrentUrl();
        // Checking the expected and actual url after login
        Assert.assertEquals(expectedListOfAllOrdersURL, actualListOfAllOrdersURL);

        //Creating an ArrayList Hold All Checkboxes selectors
        ArrayList<WebElement> checkBoxses = new ArrayList<>(driver.findElements(By.cssSelector("table>tbody>tr>td>input[type='checkbox']")));
        WebElement checkAllButton = driver.findElement(By.cssSelector("#ctl00_MainContent_btnCheckAll"));

        // Checking all "Check Boxes" are not checked
        for (WebElement eachCheckBox :
                checkBoxses) {
            Assert.assertFalse(eachCheckBox.isSelected());
        }

        // Click "Check All" Button
        checkAllButton.click();

        //Creating an ArrayList again, Hold All Checked Checkboxes selectors
        // Why we create again an arraylist? Because of that, when page refreshed or loaded thats why we have to assign again
        ArrayList<WebElement> checkedCheckBoxses = new ArrayList<>(driver.findElements(By.cssSelector("table>tbody>tr>td>input[checked]")));
        WebElement unCheckAllButton = driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));
        // Checking all "Check Boxes" are CHECKED
        for (WebElement eachCheckedChecBoxes :
                checkedCheckBoxses) {
            Assert.assertTrue(eachCheckedChecBoxes.isSelected());
        }

        // Click "Uncheck All" button
        unCheckAllButton.click();

        // Set a random number for click a random checkBox
        int randomCheckBox = (int) (Math.random() * checkBoxses.size());
        // check if random number is equal to 0 increase it +1, because in html index numbers start from 1
        if (randomCheckBox == 0) randomCheckBox++;

        // Find the random xpath selector
        WebElement randomCheckOneOfThem = driver.findElement(By.xpath("(//*[@type='checkbox'])[" + randomCheckBox + "]"));

        // Click the random picked checkbox
        randomCheckOneOfThem.click();
        Thread.sleep(2000);
        // Saving id value to a variable, which is random picked
        String getIDValue = randomCheckOneOfThem.getAttribute("id");
        System.out.println("getIDValue = " + getIDValue);

        // Find the "Delete Selected" Button
        WebElement deleteSelectedButton = driver.findElement(By.cssSelector("#ctl00_MainContent_btnDelete"));
        deleteSelectedButton.click();


        // stale
        ArrayList<WebElement> finalList = new ArrayList<>(driver.findElements(By.cssSelector("table>tbody>tr>td>input[type='checkbox']")));

        // Checking each final list if deleted is not in it
        for (WebElement eachCheckBox: finalList) {
            Assert.assertNotSame(eachCheckBox.getAttribute("id"), getIDValue);
        }
        Thread.sleep(2000);
        driver.quit();
    }


}




