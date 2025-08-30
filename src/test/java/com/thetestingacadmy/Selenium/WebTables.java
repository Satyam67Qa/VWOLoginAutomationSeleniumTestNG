package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTables {
    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/webtable.html");
        // table  xpath >> //table[@id="customers"]
        // tr (row)  >> //table[@id="customers"]/tbody/tr  >> this is complete tr with heading 7 row & 1 heading (row -1)
        // td (col) >> //table[@id="customers"]/tbody/tr[2]/td // use tr[2] as donot want heading
        int row= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        System.out.println(row);
        System.out.println(col);

        String f_xpath= "//table[@id=\"customers\"]/tbody/tr[";
        String s_xpath = "]/td[";
        String t_xpath ="]";

        for (int i=2; i<row;i++){
            for (int j=1 ;j< col;j++){
                String dynamic_xpath =  f_xpath+i+s_xpath+j+t_xpath;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                // find country of Helen Bennett
                if(data.contains("Helen Bennett")){
                    String Country = dynamic_xpath+"/following-sibling::td";
                    String C_txt = driver.findElement(By.xpath(Country)).getText();
                    System.out.println("----------------");
                    System.out.println(C_txt);
                }
                // it will give you all the data
              //  System.out.print(data + "   ");
            }
        }
    }
}
