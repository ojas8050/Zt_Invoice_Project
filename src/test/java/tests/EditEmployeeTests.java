package tests;

import Constants.LoginConstants;
import Pages.EmployeePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class EditEmployeeTests extends BaseTest{
    @Test(description = "Verifying we can edit the employee details here we are Changing" +
            "Here we are editing EmployeeID and Employee Email and Asserting")
    public void EditEmployee() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginToSalesForce(LoginConstants.Username,LoginConstants.Password)
                .ClickOnLoginButton();

        EmployeePage employeePage=new EmployeePage(driver);
        employeePage.VerfiyEmployeeCanEditEmpIDandEmail()
                .VerifyEditedObject();
    }
}
