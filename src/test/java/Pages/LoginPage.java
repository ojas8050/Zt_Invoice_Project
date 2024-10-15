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
    public WebElement usernameTextFiled;

    public LoginPage enterusername(String username) {
        Reporter.log("Enter Username",true);
        usernameTextFiled.sendKeys(username);
        return this;
    }

    @FindBy(id = "password")
    public WebElement PasswordTextField;
    public LoginPage enterpassword(String password){
        Reporter.log("Enter Password",true);
        PasswordTextField.sendKeys(password);
        return this;
    }

    @FindBy(id = "Login")
    public WebElement LoginButton;
    public void ClickOnLoginButton(){
        Reporter.log("Clcik on the Login",true);
            LoginButton.click();
    }

}
