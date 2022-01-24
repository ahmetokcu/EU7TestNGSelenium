package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.day10_file_upload.utilities.BrowserUtils;
import com.cybertek.tests.day10_file_upload.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /**
     * Test case
     * Open Browser
     * Login as a driver
     * Verify that page subtitle is Quick Launchpad
     * Go to Activities -> Calendar Events
     * Verify that page subtitle is Calendar Events
     */

    @Test
    public void Test1(){

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();

        String expectedSubtitle = "Quick Launchpad";

        DashboardPage dashboardpage = new DashboardPage();

        String actualSubtitle = dashboardpage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle, expectedSubtitle,"Verify subtitle");

        dashboardpage.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        BrowserUtils.waitFor(2);

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","Verify subtitle Calendar Events");



    }


}


