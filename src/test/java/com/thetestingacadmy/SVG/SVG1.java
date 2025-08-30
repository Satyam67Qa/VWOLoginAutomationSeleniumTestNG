package com.thetestingacadmy.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVG1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        // driver.findElement(By.name("q")).sendKeys("AC" + Keys.RETURN); >>> directly use kr skte h svg ka use nhi kiya ya icon pe ckik nhi kiya
        driver.findElement(By.name("q")).sendKeys("AC");
        //  //button[ @type="submit"]/*[local-name()='svg']
        ////    //*[local-name()='svg']/*[local-name()="title"]

        WebElement element = driver.findElement(By.xpath("//button[ @type=\"submit\"]/*[local-name()='svg']"));
        // note icon ko directly click  nhi kr skte Use actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();


    }

}
