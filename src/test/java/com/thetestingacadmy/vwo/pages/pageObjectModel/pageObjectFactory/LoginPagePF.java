package com.thetestingacadmy.vwo.pages.pageObjectModel.pageObjectFactory;

import com.thetestingacadmy.vwo.pages.pageObjectModel.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
    WebDriver driver;
    @FindBy(id="login-username")
    WebElement username;
    @FindBy(id="login-password")
            WebElement password;
    @FindBy(id="js-login-btn")
            WebElement signButton;
    @FindBy(partialLinkText="Start a free trial")
            WebElement sign_uplink;
    // Error  page locator
    @FindBy(className="notification-box-description")
    WebElement error_message;
    public LoginPagePF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    // setup your driver
    //page locators (Objeect repo)
    // locators action


    // locators action page action
    //Navaigate to URL
    // Write the some test case and password
    // click on the button
    // new page > Dash board

    public void navigateToURL(String url){
        driver.get(url);
    }
    public void writeToElement(WebElement element,String text){
        element.sendKeys(text);
    }
    public void clickToElement(WebElement element){

        element.click();
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

        return error_message.getText();
    }
}
