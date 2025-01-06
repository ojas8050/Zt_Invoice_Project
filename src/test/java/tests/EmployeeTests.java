package tests;


import Pages.EmployeePage;
import Utils.Log;
import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.Test;


import static Pages.AccountPage.Popup;
import static Pages.EmployeePage.EmployeeDropdown;
import static Pages.EmployeePage.LogoutLink;

public class EmployeeTests extends BaseTest{

    @Test(description = "(ZT_005)verify user can create a new Employee and Save",priority = 1)
    public void CreateNewEmployee() {
        EmployeePage employeePage = new EmployeePage(driver);
        employeePage.VerifyUserCanCreateEmployee();

    }

    @Test(description = "(ZT_005)verify user can create a new Employee and Save&New",priority = 2)
    public void SaveAndNewEmployeeCreation() throws InterruptedException {
        EmployeePage employeePage = new EmployeePage(driver);
        employeePage.VerifyUserCanPerformSaveandnewEmployee();
    }

    @Test(description = "verifying that user is able to cancle employee creation",priority = 3)
    public void CancelEmployeeCreation() {
        EmployeePage employeePage = new EmployeePage(driver);
        employeePage.VerifyUserCancleEmployeeCreation();
    }

    @Test(description = "(ZT_006) Verifying User can Edit the Employee Details Here we are updating the Employee iD and Employee Email",priority = 4)
    public void EditEmployeeDetails() {
        EmployeePage employeePage=new EmployeePage(driver);
        employeePage.VerifyUserCanEditEmployee();
        Log.info("Verifying Employee ID");
        Assert.assertEquals(EmployeePage.EmpIDInformation.getText(), EmployeePage.randomEmpID.toString());
        Log.info("Verifying EmailID ");
        Assert.assertEquals(EmployeePage.EmailInformation.getText(),EmployeePage.randomEmpEmail.toString());
    }

    @Test(description = "(ZT_006) Verifying User can Cancel the Editing Option Here We are changing Lastname and Cost and clicking On cancle",priority = 5)
    public void CancelTheEditing(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserCanCancelEditTab();
        Assert.assertTrue(LogoutLink.isDisplayed());
    }

    @Test(description = "(ZT_007) Verify that a user can view an Employee record",priority = 6)
    public void ViewRecordsInEmployee(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserPresent("banu");
    }


    @Test(description = "(ZT_008)",priority = 7)
    public void CancelDeletingEmployee(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserPresent("banu")
                .VerifyUserCanCancelDeletingEmployee();
        Assert.assertTrue(LogoutLink.isDisplayed());
    }

    @Test(description = "(ZT_008) Verifying User can Delete the Employee",priority = 8)
    public void DeleteEmployee(){
        EmployeePage employeePage=new EmployeePage(driver);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        employeePage.VerifyUserPresent("banu")
                .VerifyUserCanDeleteEmployee();
        Assert.assertTrue(LogoutLink.isDisplayed());
    }

}
