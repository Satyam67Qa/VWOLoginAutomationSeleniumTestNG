package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmeterTest {
     WebDriver driver;
    @Test

    @Parameters({"env","browser","url","emailId","pass"})
    public void yahooLoginTest(String env ,String browser ,String url , String emailId ,String pass )
    {
        if(browser.equals("chrome"))
        {
            driver= new ChromeDriver();
            driver.get(url);
        }
        else
            if (browser.equals("firefox"))
            {
            driver= new FirefoxDriver();
            driver.get(url);
        }
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(emailId);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.id("loginbutton")).click();

        driver.quit();

    }
}
