package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateSelenium {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver= new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");
       // driver.navigate().to(new URL("https://www.google.com/"));
      //  https://awesomeqa.com/hr/web/index.php/auth/login
     //   driver.navigate().back();
     //   driver.navigate().forward();
        driver.findElement(By.xpath("//input[@placeholder=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder=\"password\"]")).sendKeys("Hacher@4321");

    }
}
