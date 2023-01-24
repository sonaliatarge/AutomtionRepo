package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeNAfterMethodExample {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("before method example");
        System.setProperty("webdriver.chrome.driver", "C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
    }

    @Test
    public void test1(){
        driver.get("https://www.google.com");
    }

    @Test
    public void test2(){
        driver.get("https://www.facebook.com");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
        driver.close();
    }
}
