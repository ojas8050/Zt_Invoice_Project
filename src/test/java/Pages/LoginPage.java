package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
       super(driver);
    }

    @FindBy(id = "username") public static WebElement usernameTextFiled;
    @FindBy(id = "password") public static WebElement PasswordTextField;
    @FindBy(id = "Login") public static WebElement LoginButton;

    public LoginPage loginToSalesForce(String username, String password) {
        usernameTextFiled.sendKeys(username);
        PasswordTextField.sendKeys(password);
        LoginButton.click();
        return this;
    }


}
