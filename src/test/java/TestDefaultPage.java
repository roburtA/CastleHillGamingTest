import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TestDefaultPage {

    @Test
    public void testSauceDemoHomePage() throws InterruptedException {

        String username = "standard_user";
        String password = "secret_sauce";

        WebDriver driver = BasePage.getTheWebDriver();
        SauceDemoLoginPageObject sauceLoginPage = new SauceDemoLoginPageObject();
        SauceDemoMainPageObject sauceMainPage = new SauceDemoMainPageObject();


        Thread.sleep(4000);

        /* I fill the account information for account StandardUser into the Username
        field and the Password field */

        sauceLoginPage.usernameToEnter(driver, username);

        // User enters password in password field

        sauceLoginPage.passwordToEnter(driver, password);

        // I click the Login Button

        sauceLoginPage.clicksLoginButton(driver);

        // I verify the App Logo exists

        Assert.assertTrue(sauceMainPage.isSwagAppLogoVisible(driver));

        driver.quit();

    }

}
