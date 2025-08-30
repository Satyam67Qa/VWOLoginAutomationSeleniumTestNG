package com.thetestingacadmy.Shadowdom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SD1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement inputBox = (WebElement) javascriptExecutor.executeScript("return document.querySelector(\"div.jackpart\").showdowRoot.querySelector(\"div#pizaa\").showdowRoot.querySelector(\"div#pizaa\")");
        System.out.println(inputBox.getText());
        inputBox.sendKeys("chcickenpizza");
        
    }
}
