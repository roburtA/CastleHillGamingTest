import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoMainPageObject {

    private static final String SWAG_LOGO = "div.app_logo";

    // Element Getter
    public WebElement getSwagAppLogo(WebDriver driver) {
        return driver.findElement(By.cssSelector(SWAG_LOGO));
    }
    // Verification Method
    public boolean isSwagAppLogoVisible(WebDriver driver) {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(SWAG_LOGO)));
        return getSwagAppLogo(driver).isDisplayed();
    }

}
