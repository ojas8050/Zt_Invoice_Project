package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
       super(driver);
    }

    @FindBy(id = "username")
    private WebElement usernameTextFiled;
    public LoginPage enterusername(String username) {
        usernameTextFiled.sendKeys(username);
        return this;
    }

    @FindBy(id = "password")
    private WebElement PasswordTextField;
    public LoginPage enterpassword(String password){
        PasswordTextField.sendKeys(password);
        PasswordTextField.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "Login")
    private WebElement LoginButton;
    public void ClickOnLoginButton(){
            LoginButton.click();
    }

    public LoginPage loginToSalesForce(String username, String password) {
        return enterusername(username)
                .enterpassword(password);
    }

}
