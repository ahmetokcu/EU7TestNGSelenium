package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.day10_file_upload.utilities.BrowserUtils;
import com.cybertek.tests.day10_file_upload.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatOptionsTest extends TestBase {

    /*VERIFY RADIO BUTTONS
    Open Chrome browser
    Login as driver
    Go to Activities->Calendar Events
    Click on create calendar events
    Click on repeat
    Verify that repeat every days is checked
    verify that repeat weekday is not checked
    * */

    @Test
    public void Test1(){

        LoginPage loginPage = new LoginPage();
        //Login as driver
        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();

        //Go to Activities -> Calendar Events
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        //Click on create calendar events
        //wait for loader mask
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(calendarEventsPage.createCalendarEvent, 5);

        calendarEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();

        //click on repeat
        createCalendarEventsPage.repeat.click();

        //Verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Verify repeat is selected");
        //Verify that repeat every days is NOT checked
        Assert.assertTrue(createCalendarEventsPage.weekday.isSelected(), "Verify repeat is selected");







    }

}
