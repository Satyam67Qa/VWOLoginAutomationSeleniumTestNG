package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGOprationFROMXMLFILE {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/login.php/");
    }
    @Test
    public void FBTitleTest1(){
        String title = driver.getTitle();
        System.out.println("Title is  >>>"+title);
        AssertJUnit.assertEquals(title,"Log in to Facebook");
    }

    @Test
    public void FBTitleTest2(){
        String title = driver.getTitle();
        System.out.println("Title is  >>>"+title);
        AssertJUnit.assertEquals(title,"Log in to Facebook");
    }

    @Test
    public void FBTitleTest3(){
        String title = driver.getTitle();
        System.out.println("Title is  >>>"+title);
        AssertJUnit.assertEquals(title,"Log in to Facebook");
    }


    @AfterMethod
    public void terDown(){
        driver.quit();
    }

}
