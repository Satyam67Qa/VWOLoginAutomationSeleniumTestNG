package com.testNG;

import org.testng.annotations.Test;

import java.security.PublicKey;

public class InvacationCountTest {

    @Test(invocationCount = 5,invocationTimeOut = 2,expectedExceptions = NumberFormatException.class)
    public void loginTest(){
        System.out.println("Login");
    }
//    @Test(invocationTimeOut = 2,expectedExceptions = NumberFormatException.class)
//    public void Test(){
//        int i=1;
//        while (i==1){
//            System.out.println(i);
//        }
//    }
//    @Test(expectedExceptions = NumberFormatException.class)
//    public void Test2(){
//        String str1 = "1000A";
//        Integer.parseInt(str1);
//        }
    }

