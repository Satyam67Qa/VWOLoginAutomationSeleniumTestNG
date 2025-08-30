package com.thetestingacadmy.Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
       try {
           WebElement webElement= driver.findElement(By.id("nonexiting-ele"));
           System.out.println(webElement);
       }catch (NoSuchElementException noSuchElementException)
       {
           noSuchElementException.printStackTrace();
       }

        System.out.println("My new code" );

       driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        WebElement clickcheckbox = checkbox.get(0);
        clickcheckbox.click();

        try {
            driver.switchTo().frame(1);
        }catch (NoSuchFrameException noSuchFrameException){
            noSuchFrameException.printStackTrace();
            System.out.println("Freame Not founnd");
        }
    }

}
