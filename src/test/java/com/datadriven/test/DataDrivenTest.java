package com.datadriven.test;

import com.excel.utility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class DataDrivenTest {

    public static void main(String[] args) {

        Xls_Reader reader = new Xls_Reader("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/TestDataFacebookReg/FacebookReg.xlsx");

        String fname =reader.getCellData("RegTestData","firstname",2);
        System.out.println(fname);

        String sname =reader.getCellData("RegTestData","surname",2);
        System.out.println(sname);

        String mnumber =reader.getCellData("RegTestData","mobile",2);
        System.out.println(mnumber);

        String pass =reader.getCellData("RegTestData","password",2);
        System.out.println(pass);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(fname);

        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(sname);

        Select select = new Select(driver.findElement(By.id("day")));
        select.selectByVisibleText("2");
        Select select1 = new Select(driver.findElement(By.id("month")));
        select1.selectByVisibleText("Jun");
        Select select2 = new Select(driver.findElement(By.id("year")));
        select2.selectByVisibleText("2019");

       WebElement genderRadiobutton=  driver.findElement(By.xpath("//input[@value=\"2\"]"));
       genderRadiobutton.click();

        driver.findElement(By.name("reg_email__")).clear();
        driver.findElement(By.name("reg_email__")).sendKeys(mnumber);

        driver.findElement(By.name("reg_passwd__")).click();
        driver.findElement(By.name("reg_passwd__")).sendKeys(pass);

       // driver.findElement(By.id("u_0_n_ns")).click();



    }

}
