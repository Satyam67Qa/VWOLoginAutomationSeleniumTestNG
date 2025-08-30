package com.thetestingacadmy.Selenium;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class AwesomeQAForm {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options;
        WebDriver driver;
        options=new ChromeOptions();
        options.addArguments("--start-maximized");
       // options.addArguments("--headless=new");
        //options.addArguments("--disable-infobar");
        driver=new ChromeDriver(options);
       // Thread.sleep(5000);

        driver.get("https://awesomeqa.com/ui/");
        driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
       // driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
//        System.out.println(driver.getTitle());

        // We did assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");

        Assert.assertEquals(driver.getTitle(),"Register Account");

        // Using tag name

        List<WebElement> allATags = driver.findElements(By.tagName("a"));
        System.out.println("AllATags on page "+ allATags);

//   Used for all the tags name
//        for (WebElement tag:allATags
//             ) {
//            System.out.println(tag.getText());
//        }

        // to click on any specific tag
//        for (WebElement tag:allATags) {
//            System.out.println(tag.getText());
//            if(tag.getText().equalsIgnoreCase("login page")){
//              //  Thread.sleep(5000);
//                tag.click();
//            }
//        }

        WebElement name = driver.findElement(By.id("input-firstname"));
        String gettext = name.getText();
        System.out.println(gettext);
                name.sendKeys("satyam");
        driver.findElement(By.id("input-lastname")).sendKeys("singh");
        driver.findElement(By.id("input-email")).sendKeys("satyam.sing@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("7021474286");
        driver.findElement(By.id("input-password")).sendKeys("Noc@123");
        driver.findElement(By.id("input-confirm")).sendKeys("Noc@123");
//
//        List<WebElement> radiobuttons = driver.findElements(By.className("radio-inline"));
//        Thread.sleep(5000);

        // NOTE : this we can use any specific radio button to be cliked using contaions methoed
//        for (WebElement radioButton : radiobuttons
//             ) {
//            if(radioButton.getText().contains("Yes")){
//                radioButton.click();
//            }
//
//        }
        // Note : Checked button that is selected or not that click
//        for (WebElement radioButton : radiobuttons
//             ) {
//            if(radioButton.isSelected()){
//                Thread.sleep(5000);
//                radioButton.click();
//                Thread.sleep(5000);
//                break;
//            }
//        }

        // NOTE : this we can use any specific radio button to be cliked
       // System.out.println(radiobuttons.get(0).getText());
       Thread.sleep(5000);
       // driver.close(); //session aata h
        driver.quit(); // Command: [null, getTitle {}]
       // System.out.println(driver.getTitle());

    }
}
