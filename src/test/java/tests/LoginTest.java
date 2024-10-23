package tests;

import Constants.LoginConstants;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void loginToApplication() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginToSalesForce(LoginConstants.Username,LoginConstants.Password);
    }
}
