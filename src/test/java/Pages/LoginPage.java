package Pages;

import Action.LoginAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
        return this;
    }

    @FindBy(id = "Login")
    private WebElement LoginButton;
    public void ClickOnLoginButton(){
            LoginButton.click();
    }

}
