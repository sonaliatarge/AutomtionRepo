package Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("before method example");
        System.setProperty("webdriver.chrome.driver", "C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase1(){
        SoftAssert softAssert = new SoftAssert();

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("title of the website : "+title);

        // Assert.assertEquals(title,"google","title should match!");
        // Assert.assertNotEquals(title,"google","String should be correct!");
        // Assert.assertFalse(title.contains("google"),"String should be google");

        softAssert.assertEquals(title,"Google","title should match!");
        softAssert.assertNotEquals(title,"google","String should be correct!");
        softAssert.assertFalse(title.contains("google"),"String should be google");
        softAssert.assertAll();

        System.out.println(title);
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
        driver.close();
    }

}
