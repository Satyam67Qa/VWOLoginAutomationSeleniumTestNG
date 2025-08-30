package com.thetestingacadmy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtable2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
            driver.get("https://awesomeqa.com/webtable1.html");
            // find tbody
        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        List<WebElement> table_r = table.findElements(By.tagName("tr"));
        System.out.println(table_r.size());

        for (int i=0; i< table_r.size();i++){
            List<WebElement> table_c = table_r.get(i).findElements(By.tagName("td"));
            for (WebElement e:table_c) {
                if (e.getText().contains("Taiwan")){
                    String city = e.findElement(By.xpath("./following-sibling::td")).getText();

                    System.out.println("taiwan city is "  +  city);
                System.out.println(e.getText());
            }

            }

    }

}}
