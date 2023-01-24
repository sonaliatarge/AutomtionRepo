package Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParametersExample {

    @Test(invocationCount = 10,groups = {"P0"},description = "this is a test case for validating normal scenario")
    public void test1(){
        System.out.println("test case number 1");
        Assert.assertFalse(false);
    }

    @Test(groups = {"sanity"},dependsOnMethods = "test1",alwaysRun = true)
    public void test2(){
        System.out.println("test case number 2");
    }

    @Test(groups = {"smoke"},dependsOnGroups = "P0",enabled = true)
    public void test3(){
        System.out.println("test case number 3");
    }

    @Test(groups = {"regression"},invocationCount = 15,invocationTimeOut = 2)
    public void test4(){
        System.out.println("test case number 4");
    }

    @Test(enabled = false)
    public void test5(){
        System.out.println("test case number 5");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void test6(){
        System.out.println("test case number 6");
        System.out.println(10/0);
        System.out.println("exception is handled!!!");
    }

    }
