package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class ExtentReportsExample {
    WebDriver driver;
    ExtentReports reports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("TestMorningReporter.html");
    ExtentTest test;

    @BeforeTest
    public void beforeTest(){
        reports.attachReporter(sparkReporter);
      }

    @Parameters({"browserName"})
    @BeforeMethod
    public void testScript(String browserName){
        if (browserName.equals("chrome")){
            //opening that browser
            System.out.println("before method example");
            System.setProperty("webdriver.chrome.driver","C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("please select correct browser!!");
        }

    }

    @Test
    public void testScript1(){
        test = reports.createTest("launch the browser").assignAuthor("sonali").assignDevice("chrome");
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String s = driver.getTitle();
        test.fail("test is failed");
        softAssert.assertEquals(s,"google");
        softAssert.assertAll();
    }

    @Test
    public void testScript2(){
        test = reports.createTest("launch the browser").assignAuthor("kalpesh").assignDevice("chrome");
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String s = driver.getTitle();
        test.pass("test is passed");
        softAssert.assertEquals(s,"Google");
        softAssert.assertAll();
    }

    @Test
    public void testScript3(){
        test = reports.createTest("launch the browser").assignAuthor("hanumant").assignDevice("chrome");
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String s = driver.getTitle();
        test.fail("test is failed");
        softAssert.assertEquals(s,"google");
        softAssert.assertAll();
    }

    @Test(enabled = false)
    public void testScript4(){
        test = reports.createTest("launch the browser");
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String s = driver.getTitle();
        test.pass("test is passed");
        softAssert.assertEquals(s,"Google");
        softAssert.assertAll();
    }

    @Test
    public void testScript5(){
        test = reports.createTest("launch the browser").assignAuthor("pravesh").assignDevice("chrome");
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String s = driver.getTitle();
        test.fail("test is failed");
        softAssert.assertEquals(s,"google");
        softAssert.assertAll();
    }

    @Test
    public void testScript6(){
        test = reports.createTest("launch the browser");
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String s = driver.getTitle();
        test.pass("test is passed");
        softAssert.assertEquals(s,"Google");
        softAssert.assertAll();
    }



    @AfterMethod
    public void afterMethodExample(){
        System.out.println("after method example");
        driver.close();
    }

    @AfterTest
    public void afterTest(){
        reports.flush();
    }
}
