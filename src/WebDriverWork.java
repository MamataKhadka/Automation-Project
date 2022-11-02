//Import Packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
        WebElement foodItem = driver.findElement(By.id("myInput"));
        foodItem.sendKeys("a");
        WebElement asparagus = driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div[1]"));
        asparagus.click();
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        submit.click();
    }
}
