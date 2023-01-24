package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeClassNAfterClassExample {
    @BeforeClass
    public void beforeClassExample(){
        System.out.println("before Class example");
    }

    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("before method example");
        System.setProperty("webdriver.chrome.driver", "C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void test1(){
        System.out.println("first test case running");
        driver.get("https://www.google.com");
    }

    @Test
    public void test2(){
        System.out.println("second test case running");
        driver.get("https://www.facebook.com");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
        driver.close();
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("after Class example");
    }

}
