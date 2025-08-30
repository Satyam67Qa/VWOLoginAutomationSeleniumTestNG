package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Iframe {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        //driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"tox-notification__dismiss tox-button tox-button--naked tox-button--icon\"]")).click();
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mce_0_ifr"));
        driver.switchTo().frame("mce_0_ifr");

        String text =driver.findElement(By.id("tinymce")).getText();
        System.out.println(text);

        driver.switchTo().defaultContent();  //parent

    }
}
