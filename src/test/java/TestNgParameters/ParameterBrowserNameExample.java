package TestNgParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterBrowserNameExample {
    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void testScript(String browserName){
        if (browserName.equals("chrome")){
            //opening that browser
            System.out.println("before method example");
            System.setProperty("webdriver.chrome.driver", "C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("please select correct browser!!");
        }

    }

    @Parameters({"s1","s2"})
    @Test
    public void testcase1(String s1,String s2){
        System.out.println("second test case");
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element1 = driver.findElement(By.id("login1"));
        element1.sendKeys(s1);
        WebElement element2 = driver.findElement(By.id("password"));
        element2.sendKeys(s2);
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
        driver.close();
    }

}
