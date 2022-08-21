import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver getTheWebDriver() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // I am on the Sauce Demo Login Page
        driver.get("https://www.saucedemo.com/");

        return driver;

    }
}
