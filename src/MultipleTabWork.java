import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabWork {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Launch webdriver university website
        driver.get("https://webdriveruniversity.com/");

    }
}
