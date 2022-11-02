//Import packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DartWebsiteWork {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launch website
        driver.get("https://dart-tutorial.com/");
       //To maximize the screen
        driver.manage().window().maximize();
        // Using the xpath locator method
        WebElement introductionandBasic = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));
        introductionandBasic.click();
        WebElement introductiontoDart = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[1]/a"));
        introductiontoDart.click();
        WebElement installDart = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[2]/a"));
        installDart.click();

    }
}
