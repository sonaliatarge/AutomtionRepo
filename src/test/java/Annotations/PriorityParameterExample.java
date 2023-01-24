package Annotations;

import org.testng.annotations.Test;

public class PriorityParameterExample {
    @Test(priority = 1,alwaysRun = true)
    public  void bat(){
        System.out.println("bat!!");
    }

    @Test(priority = -2)
    public  void dog(){
        System.out.println("dog!!");
    }

    @Test(priority = 3)
    public void apple(){
        System.out.println("apple!!");
    }

    @Test(priority = 4)
    public  void cat(){
        System.out.println("cat!!");
    }
}
