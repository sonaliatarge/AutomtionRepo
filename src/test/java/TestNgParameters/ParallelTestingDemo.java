package TestNgParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestingDemo {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("before method example");
        System.setProperty("webdriver.chrome.driver", "C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void testcase1(){
        System.out.println("first test case");
        driver.get("https://www.google.com");
    }

    @Test
    public void testcase2(){
        System.out.println("second test case");
        driver.get("https://www.facebook.com");
    }

    @Test
    public void testcase3(){
        System.out.println("third test case");
        driver.get("https://www.whatsapp.com");
    }

    @Test
    public void testcase4(){
        System.out.println("fourth test case");
        driver.get("https://www.wikipedia.com");
    }

    @Test
    public void testcase5(){
        System.out.println("fifth test case");
        driver.get("https://www.amazon.in");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
        driver.close();
    }

}
