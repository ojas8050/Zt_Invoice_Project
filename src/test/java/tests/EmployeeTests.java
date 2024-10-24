package tests;

import Constants.LoginConstants;
import Pages.EmployeePage;
import Pages.LoginPage;
import Utils.Log;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.CommonPage.EmployeesDropDown;
import static Pages.EmployeePage.LogoutLink;

public class EmployeeTests extends BaseTest{
    @Test(description = "(ZT_006) Verifying User can Edit the Employee Details Here we are updating the Employee iD and Employee Email",priority = 1)
    public void EditEmployeeDeatils() {
        EmployeePage employeePage=new EmployeePage(driver);
        employeePage.VerifyUserCanEditEmployee();
        Log.info("Verifying Employee ID");
        Assert.assertEquals(EmployeePage.EmpIDInformation.getText(), EmployeePage.randomEmpID.toString());
        Log.info("Verifying EmailID ");
        Assert.assertEquals(EmployeePage.EmailInformation.getText(),EmployeePage.randomEmpEmail.toString());
    }

    @Test(description = "(ZT_006) Verifying User can Cancel the Editing Option Here We are changing Lastname and Cost and clicking On cancle",priority = 2)
    public void CancelTheEditing(){
        EmployeePage employeePage=new EmployeePage(driver);
        employeePage.VerifyUserCanCancelEditTab();
        Assert.assertTrue(LogoutLink.isDisplayed());
    }

    @Test(description = "(ZT_007) Verify that a user can view an Employee record",priority = 4)
    public void ViewRecordsInEmployee(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeesDropDown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserPresent("Pooja");
    }


    @Test(description = "(ZT_008)",priority = 3)
    public void CancelDelitingEmployee(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeesDropDown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserPresent("banu")
                .VerifyUserCanCancelDeletingEmployee();
        Assert.assertTrue(LogoutLink.isDisplayed());
    }

    @Test(description = "(ZT_008) Verifying User can Delete the Employee",priority = 5)
    public void DeleteEmployee(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeesDropDown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserPresent("banu")
                .VerifyUserCanDeleteEmployee();
        Assert.assertTrue(LogoutLink.isDisplayed());
    }

}
