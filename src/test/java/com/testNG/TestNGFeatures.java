package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGFeatures {

    @Test
    public void loginTest(){
    System.out.println("login Test");
    int i=9/0;
    }
    @Test(dependsOnMethods = "loginTest")
    public void homePageTest()
    {
        System.out.println("home Page Test");
    }


}
