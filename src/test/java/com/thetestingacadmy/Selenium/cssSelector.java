package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class cssSelector {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/css/");
        List<WebElement> no_Of_Span = driver.findElements(By.cssSelector("div.first>span"));
        for (WebElement span:
                no_Of_Span) {
            System.out.println(span.getText());

        }
        System.out.println( "want specific span   ..>>>>"+no_Of_Span.get(3).getText());
    }
}
//  div.first>span all the span in list
// div.first>span:nth-child(n) it givn same value as above yaha pe n ko replace kr skte h with any no
//div.first>span:nth-child(n+1)
// div.first>span:nth-child(2n+1)
// div.first>span:nth-child(2n+2)

//img[alt*="gro"]>> check any where in page
//img[alt^="gro"]
//img[alt&="gro"]
