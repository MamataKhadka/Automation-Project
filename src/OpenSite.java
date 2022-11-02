import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://javaguide.technologychannel.org/");

        WebElement clickhere = driver.findElement(By.xpath("//*[@id=\"body-inner\"]/div[1]/h3/a"));
        clickhere.click();
    }
}
