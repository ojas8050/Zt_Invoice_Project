package tests;

import Constants.LoginConstants;
import Pages.EmployeePage;
import Pages.LoginPage;
import Utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditEmployeeTests extends BaseTest{
    @Test(description = "Verifying we can edit the employee details here we are Changing" +
            "Here we are editing EmployeeID and Employee Email and Asserting")
    public void EditEmployee() throws InterruptedException {
//        LoginPage loginPage=new LoginPage(driver);
//        loginPage.loginToSalesForce(LoginConstants.Username,LoginConstants.Password);
        EmployeePage employeePage=new EmployeePage(driver);
        employeePage.VerifyUserCanEditEmployee();
        Log.info("Verifying Employee ID");
        Assert.assertEquals(EmployeePage.EmpIDInformation.getText(), EmployeePage.randomEmpID.toString());
        Log.info("Verifying EmailID ");
        Assert.assertEquals(EmployeePage.EmailInformation.getText(),EmployeePage.randomEmpEmail.toString());
    }

@Test(description = "verifying that user can create a new employe")

    public void createmployee() throws InterruptedException {
//    LoginPage loginPage=new LoginPage(driver);
//    loginPage.loginToSalesForce(LoginConstants.Username,LoginConstants.Password);
    EmployeePage employeePage=new EmployeePage(driver);
    employeePage.VerifyUserCanCreateEmployee();
    }




@Test(description = "verifying that user is able to perform SAVE and New ")
    public  void Perfornsaveandnewaction() throws InterruptedException {

//    LoginPage loginPage = new LoginPage(driver);
//    loginPage.loginToSalesForce(LoginConstants.Username, LoginConstants.Password);
    EmployeePage employeePage = new EmployeePage(driver);
    employeePage.VerifyUserCanperformsaveandnewEmployee();

}
@Test(description = "verifying that user is able to cancle employee creation")
    public void cancleemployeecreation() throws InterruptedException {
    {

//        LoginPage loginPage=new LoginPage(driver);
//        loginPage.loginToSalesForce(LoginConstants.Username,LoginConstants.Password);
        EmployeePage employeePage=new EmployeePage(driver);
        employeePage.VerifyUserCancleEmployeeCreation();

    }
}
}

