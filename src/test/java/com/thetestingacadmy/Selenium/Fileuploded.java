package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileuploded {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options;
        WebDriver driver;

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);



        driver.get("https://awesomeqa.com/selenium/upload.html");
        Thread.sleep(3000);

      WebElement e =  driver.findElement(By.xpath("//input[@id=\"fileToUpload\" ]"));
      e.sendKeys("C:/Users/satya/Downloads/my photo.png");

        driver.findElement(By.name("submit")).click();
    }

}
