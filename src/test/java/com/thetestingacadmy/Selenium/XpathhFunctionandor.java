package com.thetestingacadmy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathhFunctionandor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
//      WebElement headerText = driver.findElement(By.xpath("//h1"));
//        System.out.println(headerText.getText());
        //  xpath functions

//        WebElement headerText = driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]"));
//        System.out.println(headerText.getText());

//        WebElement headerText = driver.findElement(By.xpath("//a[contains(text(),\"Make \")]"));
//        System.out.println(headerText.getText());

        //a[contains(@href,"./profile.php#login")]

        // and & OR
        // //a[text()="Make Appointment" or @id="btn-make-appointment"]

        driver.quit();
    }
}
