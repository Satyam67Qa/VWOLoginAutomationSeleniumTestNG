package com.thetestingacadmy.Selenium;

import com.google.common.base.Function;
import io.qameta.allure.Description;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class KatalonDemoCura {
    ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void setUp()
        {
            options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        @Test(priority = 1,groups = {"sanity","login"})
        @Description("TC1 >> Login failed! Please ensure the username and password are valid.")
        public void testInvalidLogin() throws InterruptedException
        {
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]")).click();
            // verify the current URL
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
            // Login
            driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("Johnnn Doe");
            driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPasswordddd");
            driver.findElement(By.xpath("//button[@id=\"btn-login\"]")).click();
           // Thread.sleep(5000);
            //vrify the error
           WebElement errorMessage = driver.findElement(By.xpath("//p[@class=\"lead text-danger\"]"));
            Assert.assertEquals(errorMessage.getText(),"Login failed! Please ensure the username and password are valid.");

            // FluentWait

//            Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
//                    .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//
//            WebElement errorMessage2 = wait.until(new Function<WebDriver, WebElement>() {
//                @Override
//                public WebElement apply(WebDriver driver) {
//                    return driver.findElement(By.xpath("//p[@class=\"lead text-danger\"]"));
//                }
//            });



        }
         @Test(priority = 2,groups = {"sanity","login"})
        @Description("TC2 >> Login successful")
        public void testValidLogin() throws InterruptedException
         {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]")).click();
            // verify the current URl
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
            // Login
            driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
            driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
            driver.findElement(By.xpath("//button[@id=\"btn-login\"]")).click();
          //  Thread.sleep(5000);
            // verify the current URl
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        }
        @AfterSuite
        public void tearDown()
        {
            driver.quit();
        }
    }

