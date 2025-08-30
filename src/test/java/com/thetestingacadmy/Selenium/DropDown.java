package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select= new Select(element);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(1);




        driver.quit();
    }
}
