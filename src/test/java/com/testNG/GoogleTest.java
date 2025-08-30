package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    ChromeOptions options;
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @Test(priority = 1,groups = "title")
    public void googleTitleTest(){
        String title=driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 2,groups = "links")
    public void googleLinkGmail(){
        boolean title=driver.findElement(By.linkText("Gmail")).isDisplayed();
        // System.out.println(title);
    }
    @Test(priority = 3,groups = "links")
    public void googleLinkImages(){
        boolean title=driver.findElement(By.linkText("Images")).isDisplayed();
        // System.out.println(title);
    }
    @Test(priority = 3,groups = "test")
    public void test1(){
        boolean title=driver.findElement(By.linkText("Images")).isDisplayed();
        // System.out.println(title);
    }
    @Test(priority = 3,groups = "test")
    public void test2(){
        boolean title=driver.findElement(By.linkText("Images")).isDisplayed();
        // System.out.println(title);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
