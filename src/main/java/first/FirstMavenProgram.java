package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProgram {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/tej/Desktop/TESTING/Automation Testing/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.close();
    }
}
