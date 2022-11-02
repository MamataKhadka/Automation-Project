import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillTheForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");

        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Manju");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("KC");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("manju.kc@gmail.com");

        WebElement comment = driver.findElement(By.name("message"));
        comment.sendKeys("This is Manju");

        WebElement message = driver.findElement(By.name("message"));
        comment.sendKeys("This is Manju");


    }
}
