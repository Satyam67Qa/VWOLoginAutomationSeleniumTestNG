package com.thetestingacadmy.vwo.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    // setup your driver
    //page locators (Objeect repo)
    // locators action
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton =By.id("js-login-btn");


    By sign_uplink = By.partialLinkText("Start a free trial");
   // Error  page locator
   By error_message=  By.className("notification-box-description");
    // locators action page action
    //Navaigate to URL
    // Write the some test case and password
    // click on the button
    // new page > Dash board

    public void navigateToURL(String url){
        driver.get(url);
    }
    public void writeToElement(By element,String text){
        driver.findElement(element).sendKeys(text);
    }
    public void clickToElement(By element){
        driver.findElement(element).click();
    }
    public void loginToVWO(String mail,String password_sent) throws InterruptedException {
        writeToElement(username,mail);
        writeToElement(password,password_sent);
        clickToElement(signButton);
        Thread.sleep(10000);
        //clickT0DashboardButton(clickOnDashboard);
    }
    public DashboardPage afterLogin(){
        return new DashboardPage(driver);
    }
    public String errorMessageLoginFailed(){
        return driver.findElement(error_message).getText();
    }
}
