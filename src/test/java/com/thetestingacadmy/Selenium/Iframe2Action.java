package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe2Action {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/mmoonn/full/PwvraE");
        driver.switchTo().frame("result");
        WebElement element= driver.findElement(By.cssSelector("body>div"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }
}