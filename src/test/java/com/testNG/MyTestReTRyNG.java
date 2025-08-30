package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestReTRyNG {

    @Test(retryAnalyzer = com.retryyAnallayer.RetryAnalyzer.class )
    public void Test1(){
        Assert.assertEquals(false,true);
    }

    @Test
    public void Test2(){
        Assert.assertEquals(false,true);

    }
}
