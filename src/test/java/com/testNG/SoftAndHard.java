package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHard {

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void Test(){
        System.out.println("Open Browser");
        Assert.assertEquals(true,true);

        System.out.println("enter the url");
        System.out.println("enter the usernname");
        System.out.println("enter the pasword");
        softAssert.assertEquals(true,false,"UN & Pass check");

        System.out.println("click");
        System.out.println("go to home");
        softAssert.assertEquals(true,false,"title not there");

        System.out.println("click on prduct");
        softAssert.assertEquals(true,false,"unbale to click ");


        softAssert.assertAll(); // sare metheod m likhna h

    }
}
