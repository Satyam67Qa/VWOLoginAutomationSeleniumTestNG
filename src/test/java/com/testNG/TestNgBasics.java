package com.testNG;

import org.testng.annotations.*;

public class TestNgBasics {
    //Pre conditions annotations -- starting with @Before
    @BeforeSuite// ex 1
    public void setUp(){
        System.out.println("setup system proprty for chrome ");
    }
    @BeforeTest //// ex 2
    public void launchBrowser(){
        System.out.println("launch the Browser");
    }

    @BeforeClass
    public void login(){
        System.out.println("login into app");
    }

    @BeforeMethod
    public void enterURL(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<< enter the url >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    //testcase  @test
    @Test
    public void googleTitleTest(){
        System.out.println(" Case 1 google Title Test");
    }
    @Test
    public void searchTest(){
        System.out.println(" Case 2 search Test");
    }
    @Test
    public void googleLogoTest(){
        System.out.println(" Case 3 logo Test");
    }

    //  post conditions @after
    @AfterMethod
    public void logOut(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  logout from app >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @AfterClass
    public void closeBroswer() {
        System.out.println("close Broswer");
    }
    @AfterTest
    public void deleteAllCookies(){
        System.out.println("deleteAllCookies");
    }
    @AfterSuite
    public void generateTestReport(){
        System.out.println("generateTestReport");
    }



}
