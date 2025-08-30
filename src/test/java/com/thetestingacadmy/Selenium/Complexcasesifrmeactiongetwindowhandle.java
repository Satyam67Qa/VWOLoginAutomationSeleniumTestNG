package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Complexcasesifrmeactiongetwindowhandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
                // Open the page
        driver.get("https://app.vwo.com/#/analyze/osa/13/heatmaps/1?token=eyJhY2\n" +
                "NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMj\n" +
                "A1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MD\n" +
                "M1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOn\n" +
                "ly=1");

            driver.findElement(By.id("login-username")).sendKeys("satyam@neert.com");
             driver.findElement(By.id("login-password")).sendKeys("Noc@1235");
             driver.findElement(By.id("js-login-btn")).click();


        // Store the handle of the current window
        String mainWindowHandle = driver.getWindowHandle();
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.cssSelector("[data-qa=\"yedexafob i\"]"))).click().build().perform();
// Store the handles of all open windows in a list
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        Iterator<String> iterator = windowHandles.iterator();
// Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                driver.switchTo().frame("heatmap-iframe");
                driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
    }
}

        // Close the web driver
            // driver.quit();
    }
}
