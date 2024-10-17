package tests;

import Action.EmployeeAction;
import Action.LoginAction;
import Enums.LoginConstants;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class EditEmployeeTests extends BaseTest{
    @Test(description = "Verifying we can edit the employee details here we are Changing" +
            "Here we are editing EmployeeID and Employee Email and Asserting")
    public void EditEmployee() throws InterruptedException {
        LoginAction loginAction=new LoginAction(driver);
        loginAction.login(LoginConstants.Username,LoginConstants.Password);

        EmployeeAction employeeAction=new EmployeeAction(driver);
        employeeAction.VerfiyEmployeeCanEditEmpIDandEmail()
                .VerifyEditedObject();
    }
}
