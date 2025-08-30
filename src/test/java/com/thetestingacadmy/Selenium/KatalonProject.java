package com.thetestingacadmy.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;

public class KatalonProject {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options;
        WebDriver driver;
        options = new ChromeOptions();
      //  options.addArguments("--disable-save-password-bubble");

    // Disable browser notifications
       // options.addArguments("--disable-notifications");


    // Disable download prompt (auto download)
//        options.addArguments("--user-data-dir=/tmp/chrome-profile");
//        options.addArguments("--no-first-run");
//        options.addArguments("--no-default-browser-check");

    // Start maximized (optional, sometimes avoids layout popups)
        options.addArguments("--start-maximized");


        driver = new ChromeDriver(options);

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]")).click();
        // verify the current URl

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlContains("profile.php#login"));

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        // Login
        driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[@id=\"btn-login\"]")).click();



        wait.until(ExpectedConditions.urlContains("#appointment"));

//        Alert alert = driver.switchTo().alert();
//        alert.accept();


        WebElement element= driver.findElement(By.id("combo_facility"));
        Select select =new Select(element);
        select.selectByVisibleText("Tokyo CURA Healthcare Center");

        Thread.sleep(2000);

        driver.findElement(By.id("chk_hospotal_readmission")).click();

        driver.findElement(By.id("radio_program_medicaid")).click();

        driver.findElement(By.id("txt_visit_date")).sendKeys("14/08/2023");
        driver.findElement(By.id("txt_comment")).sendKeys("hihib");

        driver.findElement(By.id("btn-book-appointment")).click();


    }
}
