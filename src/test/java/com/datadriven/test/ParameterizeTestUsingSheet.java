package com.datadriven.test;

import com.excel.utility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParameterizeTestUsingSheet {
    public static void main(String[] args) {
        //web driver code
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");


        // get the data form excel

        Xls_Reader reader = new Xls_Reader("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/TestDataFacebookReg/FacebookReg.xlsx");

            int rowCount=reader.getRowCount("RegTestData");

            // add new coln
           reader.addColumn("RegTestData","status");



            for (int rowNUM=2;rowNUM<=rowCount;rowNUM++)
            {

                System.out.println("++++++++++++++++++++++++");

                String fname =reader.getCellData("RegTestData","firstname",rowNUM);
                System.out.println(fname);

                String sname =reader.getCellData("RegTestData","surname",rowNUM);
                System.out.println(sname);

                String mnumber =reader.getCellData("RegTestData","mobile",rowNUM);
                System.out.println(mnumber);

                String pass =reader.getCellData("RegTestData","password",rowNUM);
                System.out.println(pass);

                //enter the data

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

                reader.setCellData("RegTestData","status",rowNUM,"Pass");



            }
    }
}
