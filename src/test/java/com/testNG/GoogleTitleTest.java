package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {
    WebDriver driver;
    ChromeOptions chromeOptions;


    @BeforeMethod
    public void setUp(){
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @Test
    public void googleTitleTest(){
            String s = driver.getTitle();
        System.out.println(s);

        Assert.assertEquals(s,"Googgle","not found google");
    }

    @Test
    public void googleLinkGmail(){
        boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
        // System.out.println(title);
        Assert.assertTrue(b);
        Assert.assertEquals(b,true);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
