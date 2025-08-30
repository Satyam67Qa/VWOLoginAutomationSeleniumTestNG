package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AAction2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.id("fromCity"));
        element.click();
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement fromcityinput = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromcityinput.click();
        fromcityinput.sendKeys("New Delhi");
       // actions.moveToElement(fromcityinput).click().sendKeys("New Delhi").build().perform();
         Thread.sleep(9000);

        List<WebElement> cities = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement e : cities) {
            if (e.getText().contains("New Delhi")){
                e.click();
            }
        }
    }
}