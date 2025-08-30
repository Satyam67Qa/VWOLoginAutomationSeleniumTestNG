package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AAction {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys(source,"DEL").build().perform();

    }
}
