import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://javaguide.technologychannel.org/");
    }
}
