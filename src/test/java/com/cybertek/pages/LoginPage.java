package com.cybertek.pages;

import com.cybertek.tests.day10_file_upload.utilities.ConfigurationReader;
import com.cybertek.tests.day10_file_upload.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    //driver.findElement(By.id("prependedInput"));
    //FindBy = or , FindBys = and
    @FindAll({
            @FindBy(id="prependedInput"),
            @FindBy(name="_username")
    })
    public WebElement usernameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    //driver.findElement(By.id("_submit"));
    @FindBy(id="_submit")
    public WebElement loginBtn;

    @FindBy(css=".btn.btn-primary")
    public List<WebElement> buttons;


    public void login(String username, String password){

       usernameInput.sendKeys(username);
       passwordInput.sendKeys(password);
       loginBtn.click();

    }
    public void loginAsDriver(){

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

}
