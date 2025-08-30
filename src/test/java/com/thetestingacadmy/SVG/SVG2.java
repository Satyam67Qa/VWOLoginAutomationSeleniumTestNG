package com.thetestingacadmy.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SVG2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();


         // //*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']   .. all, the state it will gove

        List<WebElement> name_States = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path'] "));
        for (WebElement state:name_States) {
            // all state name
            System.out.println(state.getAttribute("aria-label"));
            // click on any specific
            if(state.getAttribute("aria-label").contains("Tripura")){
                // if(s.getAttribute("aria-label").trim().equals("Tripura "))
                // use actions class u will clicked on svg >> tripura
                new Actions(driver).moveToElement(state).click().perform();

            }

        }
    }
}
