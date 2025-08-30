package com.thetestingacadmy.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AAlert {
    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement button= driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
        button.click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        webDriverWait.until(ExpectedConditions.alertIsPresent());

        Alert alert =driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);

        alert.accept();
       // alert.dismiss();
        String e= driver.findElement(By.id("result")).getText();
        System.out.println(e);
        Assert.assertEquals(e,"You successfully clicked an alert");
        driver.quit();

    }
}
