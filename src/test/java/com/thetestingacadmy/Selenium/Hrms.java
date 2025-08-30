package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hrms {
    ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void setUP() {
        options= new ChromeOptions();
        options.addArguments("--start-maximized");
        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 1)
   public void testInvalidLogin(){
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin1");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Hacher@4322");


    }
    @Test(priority = 2)
    public void testValidLogin(){
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Hacher@4321");


        }

    @AfterSuite
    public void tearDown () {
      driver.quit();

    }
    }

