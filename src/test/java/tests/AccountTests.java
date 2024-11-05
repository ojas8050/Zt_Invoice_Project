package tests;

import Constants.LoginConstants;
import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.AccountPage.Popup;

public class AccountTests extends BaseTest {
    @Test(priority = 4,description = "(ZT_001)creating Account Entering Valid Data and clicking On save")
    public void CreateNewAccountInAccountPage() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerfiyAccountCreationPage("Chandini", "JohnCenaaa.com", "8899001122", "You cant see me", "YCSM@gmail.com", "30", "banglore");
    }

    @Test(priority = 5,description = "(ZT_001)creating Account Entering Valid Data and Clicking On Save&New")
    public void SaveAndNewAccountCreation()  {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerfiyUserSaveAndNew("Johnn", "JohnCenaaa.com", "8899001422", "You cant see me", "YCSM@gmail.com", "30", "banglore");
    }

    @Test(priority = 6,description = "(ZT_002)Creating Account Without Mandatory Fields and Save")
    public void CreateAccountWithoutMandatoryFields(){
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerfiyAccountCreationWOMandtoryFields("Cena.com", "8833301122", "You cant see me", "YCSM@gmail.com", "30", "banglore");
        Assert.assertEquals(Popup.getText(), "We hit a snag.", "Failed to Assert the Error Message");
    }

    @Test(priority = 7,description = "(ZT_002)Creating Account Without Mandatory Fields and Save&new")
    public void SaveAndNewWOMandatory() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerfiyUserSaveAndNewWOmandatory("Cena.com", "8833301122", "You cant see me", "YCSM@gmail.com", "30", "banglore");
        Assert.assertEquals(Popup.getText(), "We hit a snag.", "Failed to Assert the Error Message");
    }

    @Test(priority = 8,description = "(ZT_002)Creating Account Without Mandatory Fields and Cancel")
    public void CancelButtonWOMandatory() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerfiyUserCancelWOmandatory("Cena.com", "8833301122", "You cant see me", "YCSM@gmail.com", "30", "banglore");
    }

    @Test(priority = 1,description = "(ZT_003)Editing Account and Save")
    public void EditCreatedAccount() throws InterruptedException {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerifyUserCanEdit("Disney");
    }

    @Test(priority = 2,description = "(ZT_003)Editing Account and Cancel")
    public void EditCreatedAccountandCancel() throws InterruptedException {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.VerfiyUserCancelAfterEditing("Disney");
    }

    @Test(priority = 3,description = "(ZT_004)Delete Created Account")
    public void DeleteCreatedAccount() throws InterruptedException {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.SearchAccountAndClick("chandini").DeleteAccountCreated();
    }
}
