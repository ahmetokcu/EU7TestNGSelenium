package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReport extends TestBase {

    @Test
    public void wrongPasswordTest() {
        //name of the test
        extentLogger = report.createTest("Wrong Password Test");

        LoginPage loginPage = new LoginPage();

        extentLogger.info("Enter Username: user1");
        loginPage.usernameInput.sendKeys("user1");

        extentLogger.info("Enter Password: somepassword");
        loginPage.passwordInput.sendKeys("somepassword");

        extentLogger.info("Click login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify Page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");

        extentLogger.pass("Wrong Password Test is passed");


    }

    @Test
    public void wrongUsernameTest(){

        //name of the test
        extentLogger = report.createTest("Wrong Username Test");

        LoginPage loginPage = new LoginPage();

        extentLogger.info("Enter Username: someusername");
        loginPage.usernameInput.sendKeys("someusername");

        extentLogger.info("Enter Username: UserUser123");
        loginPage.passwordInput.sendKeys("UserUser123");

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/loginDWE");

        extentLogger.pass("PASSED");

    }
}


