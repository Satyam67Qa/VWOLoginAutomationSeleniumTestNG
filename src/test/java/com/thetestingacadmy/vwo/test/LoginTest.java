package com.thetestingacadmy.vwo.test;

import com.thetestingacadmy.vwo.pages.pageObjectModel.DashboardPage;
import com.thetestingacadmy.vwo.pages.pageObjectModel.LoginPage;
import com.thetestingacadmy.vwo.pages.pageObjectModel.pageObjectFactory.LoginPagePF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void test_vwo_negative() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.navigateToURL("https://app.vwo.com/#/login");
        loginPage.loginToVWO("satyam@neert.cm","Noc@1235");
        String error =loginPage.errorMessageLoginFailed();
        System.out.println(error);


        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        Assert.assertEquals(error,"Your email, password, IP address or location did not match");
         driver.quit();
        //  Assert.assertEquals(userName,"sksksk ssss");
    }
    @Test
    public void test_vwo_positive() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      //  LoginPage loginPage= new LoginPage(driver);
        LoginPagePF loginPage = new LoginPagePF(driver);
        loginPage.navigateToURL("https://app.vwo.com/#/login");
        loginPage.loginToVWO("satyam@neert.com","Noc@1235");
        DashboardPage dashboardPage = loginPage.afterLogin();
       // dashboardPage.clickT0DashboardButton();
        String userName=dashboardPage.loggedInUserName();
        System.out.println(userName);

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard?accountId=1129170");
        Assert.assertEquals(userName,"sksksk ssss");
        driver.quit();
    }
}
