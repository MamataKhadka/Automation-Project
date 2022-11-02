import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrame {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.get("https://dart-tutorial.com/");

        // Using the xpath locator method
        WebElement clickhere = driver.findElement(By.xpath("//*[@id=\"body-inner\"]/div[1]/h3/a"));
        clickhere.click();

    }
}
