package com.thetestingacadmy.RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RL2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.switchTo().frame("result");
        WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));
        submit.click();


        // Parent elemennt

        WebElement p_element = driver.findElement(By.id("username"));
        WebElement errormeaasge = driver.findElement(with(By.tagName("small")).below(p_element));
        System.out.println(errormeaasge.getText());
    }
}
