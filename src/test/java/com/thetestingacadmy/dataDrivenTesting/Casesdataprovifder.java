package com.thetestingacadmy.dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Casesdataprovifder {
    ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
    @Test(dataProvider = "LoginData")
    public void testDataDriven(String email,String Password,String expectedresult){
        driver.get("https://app.vwo.com/#/login");
        WebElement emailElement = driver.findElement(By.id("login-username"));
        emailElement.clear();
        emailElement.sendKeys(email);
        WebElement passwordElement = driver.findElement(By.id("login-password"));
        passwordElement.clear();
        passwordElement.sendKeys(Password);
        driver.findElement(By.id("js-login-btn")).click();

        if(expectedresult.equalsIgnoreCase("Valid")) {
            String text = driver.findElement(By.cssSelector("[data-qa=\"lufexuloga\"]")).getText();
            System.out.println(text);
        }
        if(expectedresult.equalsIgnoreCase("Invalid")) {
            WebElement errorMessage= driver.findElement(By.className("notification-box-description"));
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(errorMessage));
        }
    }

//    @DataProvider(name = "LoginData")
//        public Object[][] testData(){
//         return new Object[][]{
//                {"TD1","dhdhdhhdhdjnv","gdhfbfnj","Invalid"},
//                {"TD2","satyam@neert.com","Noc@1235","Valid"}
//        };
//  }


   // @DataProvider(name = "LoginData")
 //   public String[][] testDataExcel() {
//        String testDataFile = "TataData2.xlsx";
//        ExcelReader excelReader = new ExcelReader(testDataFile);
//        String [][] data =excelReader.getDataFromSheet(testDataFile,"LoginData");
       // return data;

  //  }



    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}


    

