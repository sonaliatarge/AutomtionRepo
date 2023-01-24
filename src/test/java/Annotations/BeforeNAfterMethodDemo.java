package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeNAfterMethodDemo {
    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("before method example");
    }

    @Test
    public  void bat(){
        System.out.println("bat!!");
    }

    @Test
    public  void dog(){
        System.out.println("dog!!");
    }

    @Test
    public  void cat(){
        System.out.println("cat!!");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
    }
}
