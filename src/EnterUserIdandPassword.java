//Import Packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUserIdandPassword {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launch website
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
        // Using the xpath locator method
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        userName.sendKeys("webdriver");

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.sendKeys("webdriver123");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();


    }
}
