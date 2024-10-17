package tests;

import Action.LoginAction;
import Enums.LoginConstants;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void loginToApplication(){
        LoginAction loginAction=new LoginAction(driver);
        loginAction.login(LoginConstants.Username,LoginConstants.Password);
    }
}
