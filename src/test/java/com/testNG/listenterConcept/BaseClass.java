package com.testNG.listenterConcept;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BaseClass {
    public static WebDriver driver;

    public static void initilaization(){
        driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
    }
    public void failed(String testMethodName){
       File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       try {
         //  FileUtils.copyFile(sourceFile,new File("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/testNG/listenterConcept/Screenshoot/testFailed.jpg"));
         //  FileUtils.copyFile(sourceFile,new File("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/testNG/listenterConcept/Screenshoot/"+"failshot"+this.getClass().getClass()+"_"+".jpg"));
       FileUtils.copyFile(sourceFile,new File("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/testNG/listenterConcept/Screenshoot/"+testMethodName+"_"+".jpg"));

       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
