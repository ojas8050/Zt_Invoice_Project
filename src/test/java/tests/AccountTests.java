package tests;

import Constants.LoginConstants;
import Pages.AccountPage;
import Pages.LoginPage;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.AccountPage.Popup;

public class AccountTests extends BaseTest {


    @Test(priority = 1,description = "(ZT_001)creating Account Entering Valid Data and clicking On save",dataProvider = "AllDetails",dataProviderClass = AccountPage.class)
    public void CreateNewAccountInAccountPage(String AccName,String URL,String PhoneNo,String Des,String Email,String number,String BillAdress) {
        Log.info("Initializing test");
        super.accountPage.AccountCreationPage(AccName,URL,PhoneNo,Des,Email,number,BillAdress);
    }

    @Test(priority = 2,description = "(ZT_001)creating Account Entering Valid Data and Clicking On Save&New",dataProvider = "AllDetails",dataProviderClass = AccountPage.class)
    public void SaveAndNewAccountCreation(String AccName,String URL,String PhoneNo,String Des,String Email,String number,String BillAdress)  {
        Log.info("Initializing test");
        super.accountPage.VerfiyUserSaveAndNew(AccName,URL,PhoneNo,Des,Email,number,BillAdress);
    }

    @Test(priority = 3,description = "(ZT_002)Creating Account Without Mandatory Fields and Save",dataProvider = "WithoutMandatoryData",dataProviderClass = AccountPage.class)
    public void CreateAccountWithoutMandatoryFields(String URL, String phno, String des, String email, String employee, String Bill){
        Log.info("Initializing test");
        super.accountPage.VerfiyAccountCreationWOMandtoryFields(URL,phno,des,email,employee,Bill);
        Assert.assertEquals(Popup.getText(), "We hit a snag.", "Failed to Assert the Error Message");
    }

    @Test(priority = 4,description = "(ZT_002)Creating Account Without Mandatory Fields and Save&new",dataProvider = "WithoutMandatoryData",dataProviderClass = AccountPage.class)
    public void SaveAndNewWOMandatory(String URL, String phno, String des, String email, String employee, String Bill) {
        Log.info("Initializing test");
       super.accountPage.VerfiyUserSaveAndNewWOmandatory(URL,phno,des,email,employee,Bill);
        Assert.assertEquals(Popup.getText(), "We hit a snag.", "Failed to Assert the Error Message");
    }

    @Test(priority = 5,description = "(ZT_002)Creating Account Without Mandatory Fields and Cancel",dataProvider = "WithoutMandatoryData",dataProviderClass = AccountPage.class)
    public void CancelButtonWOMandatory(String URL, String phno, String des, String email, String employee, String Bill) {
        Log.info("Initializing test");
        super.accountPage.VerfiyUserCancelWOmandatory(URL,phno,des,email,employee,Bill);
    }

    @Test(priority = 6,description = "(ZT_003)Editing Account and Save",dataProvider = "EditUserCreated",dataProviderClass = AccountPage.class)
    public void EditCreatedAccount(String emps ) throws InterruptedException {
        Log.info("Initializing test");
        super.accountPage.VerifyUserCanEdit("Disney",emps);
        Assert.assertEquals(super.accountPage.UpdatedEmp.getText(),emps,"Employee field didnt got updated");
    }

    @Test(priority = 7,description = "(ZT_003)Editing Account and Cancel",dataProvider = "EditUserCreated",dataProviderClass = AccountPage.class)
    public void EditCreatedAccountandCancel(String empss) throws InterruptedException {
        Log.info("Initializing test");
        super.accountPage.VerfiyUserCancelAfterEditing("Disney",empss);
    }

    @Test(priority = 8,description = "(ZT_004)Delete Created Account")
    public void DeleteCreatedAccount() throws InterruptedException {
        Log.info("Initializing test");
        super.accountPage.SearchAccountAndClick("chandini").DeleteAccountCreated();
    }
}
