package com.thetestingacadmy;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestVWOLogin {
    ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
    @Test(priority = 1,groups = {"negative","sanity","reg"})
   // @Test
   // @Severity(SeverityLevel.BLOCKER)
    @Description("# TC1 - verify the that user unable to login with invalid crd")

    public void testInvalidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("satyamsingh28389@gmail.co");
        driver.findElement(By.id("login-password")).sendKeys("Noc@123");
        driver.findElement(By.id("js-login-btn")).click();

        WebElement errorMessage= driver.findElement(By.className("notification-box-description"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(errorMessage));

//        String errorString= driver.findElement(By.className("notification-box-description")).getText();
//        Assert.assertEquals(errorString,"Your email, password, IP address or location did not match");
        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");
    }

    @Test(enabled = false,priority = 2)
    @Description("#TC2 - verify the that user able to login with valid crd")
    public void tesValidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Dashboard");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");
    }
    @AfterSuite
    public void tearDown(){
      driver.quit();
    }

    }

