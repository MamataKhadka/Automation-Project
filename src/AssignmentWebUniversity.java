// Import packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AssignmentWebUniversity {
    public static void main(String[] args) throws InterruptedException {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Step 1.Launch webdriver university website
        driver.get("https://webdriveruniversity.com/");

        // Step 2. Click login portal,maximize window and hold 5 sec
        driver.manage().window().maximize();
        WebElement loginPortal = driver.findElement(By.xpath("//*[@id=\"login-portal\"]"));
        Thread.sleep(5000);
        loginPortal.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(tabs.size());

        //Step 3. Go the other tab
        driver.switchTo().window(tabs.get(1));

        //Step 4.Enter Username Password
        WebElement Username = driver.findElement(By.id("text"));
        Username.sendKeys("webdriver");

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("webdriver123");

        //Step 5.Click login button
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

    }
}
