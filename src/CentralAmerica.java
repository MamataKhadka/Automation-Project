//Import Packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CentralAmerica {
    public static void main(String[] args) throws InterruptedException {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.get("https://www.justwatch.com/");

        Thread.sleep(3000);
        WebElement centralAmerica = driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]"));

        List<WebElement> allcountries = centralAmerica.findElements(By.className("countries-list__region-content"));
        System.out.println("Total country in Central America: " + allcountries.size());
        for (WebElement w : allcountries){
            if (w.getText() == ""){
                continue;
            }
            System.out.println(w.getText());
        }



    }
}
