package com.thetestingacadmy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/xpath/");
        // //div[@class="Mammal"]/parent::div >> here we find the mammal then parent
        // //div[@class="Mammal"]/child::div   >> mammal chiild
        // //div[@class="Mammal"]/ancestor::div  >> mamaal ancestor
        // //div[@class="Mammal"]/following::div  >> mamaal following
    }
}
