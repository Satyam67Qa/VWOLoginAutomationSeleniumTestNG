package com.thetestingacadmy.vwo.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
       WebDriver  driver;
    public DashboardPage(WebDriver driver)
    {
       this.driver=driver;
   }
   By userNameOnDashboard = By.cssSelector("[data-qa=lufexuloga]");
    By clickOnDashboard = By.xpath("//a[@class=\"ng-binding ng-scope\"]");

         public String loggedInUserName() throws InterruptedException {
             Thread.sleep(10000);
             clickT0DashboardButton(clickOnDashboard);
            return driver.findElement(userNameOnDashboard).getText();

         }
    public void clickT0DashboardButton(By element){

             driver.findElement(element).click();
    }


}
