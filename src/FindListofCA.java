//Import Packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindListofCA {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launch website
        driver.get("");
    }
}
