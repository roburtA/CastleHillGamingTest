import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoLoginPageObject {

    private static final String USERNAME_INPUT = "input#user-name";
    private static final String PASSWORD_INPUT = "input#password";
    private static final String SAUCE_LOGIN_BUTTON = "login-button";

    // Element Getters
    private WebElement getUsernameField(WebDriver driver) {
        return driver.findElement(By.cssSelector(USERNAME_INPUT));
    }
    private WebElement getPasswordField(WebDriver driver) {
        return driver.findElement(By.cssSelector(PASSWORD_INPUT));
    }
    private WebElement getClickLoginButton(WebDriver driver) {
        return driver.findElement(By.id(SAUCE_LOGIN_BUTTON));
    }

    // Action Methods
    public void usernameToEnter(WebDriver driver, String username) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getUsernameField(driver).sendKeys(username);
    }
    public void passwordToEnter(WebDriver driver, String password) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getPasswordField(driver).sendKeys(password);
    }
    public void clicksLoginButton (WebDriver driver) {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        explicitWait.until(ExpectedConditions.elementToBeClickable(getClickLoginButton(driver)));
        getClickLoginButton(driver).click();
    }
}
