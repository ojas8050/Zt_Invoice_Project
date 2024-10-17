package Action;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginAction {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginAction(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public LoginAction login(String username, String password) {
        loginPage.enterusername(username)
                .enterpassword(password)
                .ClickOnLoginButton();
        return this;
    }

}
