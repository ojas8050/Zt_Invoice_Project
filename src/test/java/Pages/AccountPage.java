package Pages;


import Utils.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import java.util.List;

public class AccountPage extends BasePage {

    public AccountPage() {
        Log.info("Account Page initialized.");
    }

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='Name' and @class='slds-input']")
    private WebElement AccountName;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Type']")
    private WebElement Type;
    @FindBy(xpath = "//*[@title='Press' and @class='slds-truncate']")
    private WebElement PressOption;
    @FindBy(xpath = "//input[@name='Website' and @class='slds-input']")
    private WebElement EnterWebsite;
    @FindBy(xpath = "//input[@name='Phone']")
    private WebElement PhoneNumber;
    @FindBy(xpath = "//*[@class='slds-textarea' and @maxlength='32000']")
    private WebElement Description;
    @FindBy(xpath = "//*[@class='slds-input' and @inputmode='email']")
    private WebElement Emailtextbox;
    @FindBy(xpath = "//*[@class='slds-input' and @name='NumberOfEmployees']")
    private WebElement Employeestextbox;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Industry']")
    private WebElement Industry;
    @FindBy(xpath = "//*[@data-value='Banking']")
    private WebElement Banking;
    @FindBy(xpath = "//input[@placeholder='Search Address']")
    private WebElement BillingAddress;
    @FindBy(xpath = "//input[@aria-activedescendant='combobox-input-237-2-237']")
    private WebElement SearchBangalore;
    @FindBy(xpath = "//*[text()='Shipping Address']/..//*[@placeholder='Search Address']")
    private WebElement ShippingAddress;
    @FindBy(xpath = "//*[@name='SaveEdit' and @part='button']")
    private WebElement Savebutton;
    @FindBy(xpath = "//h2[text()='We hit a snag.']")
    public static WebElement Popup;
    @FindBy(xpath = "//*[@data-refid='recordId']")
    private List<WebElement> AllAccounts;
    @FindBy(xpath = "//*[@class='windowViewMode-normal oneContent active lafPageHost']//*[@name='Edit']")
    private WebElement edit;
    @FindBy(xpath = "//*[@name='NumberOfEmployees']")
    private WebElement Employee;
    @FindBy(xpath = "//li[@data-target-selection-name='sfdc:StandardButton.Account.Delete' and @class='visible']//button[@name='Delete'][normalize-space()='Delete']")
    private WebElement DeleteCreatedAccount;
    @FindBy(xpath = "//*[@title='Delete' and @aria-live='off']")
    private WebElement DeletePopup;
    @FindBy(xpath = "//*[@name='CancelEdit']")
    private WebElement CancelButton;
    @FindBy(xpath = "//*[@name='SaveAndNew']")
    private WebElement SaveAndNewbutton;
    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem' and @title='Accounts']")
    private WebElement AccountDropdown;
    @FindBy(xpath = "//*[@class='forceActionLink' and @title='New']")
    private WebElement NewButton;
    @FindBy(xpath = "//*[@data-key='close']")
    private WebElement ClosePopup;
    @FindBy(xpath = "//h2[text()='New Account']")
    private WebElement NewAccountPage;
    @FindBy(xpath = "//*[@class='slds-modal__header']//h2[@class='slds-modal__title slds-hyphenate slds-text-heading--medium']")
    private WebElement EditPageDropUp;
    @FindBy(xpath = "//*[@field-label='Employees']//*[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']")
    public static WebElement UpdatedEmp;
    @FindBy(xpath = "//*[@title='Details']")
    private WebElement DetailsButton;
    @FindBy(xpath = "//span[@class='slds-var-p-right_x-small'and text()='Accounts']")
    public WebElement AccountsText;



    public AccountPage SearchBillingAddress(String Bill) {
        BillingAddress.sendKeys(Keys.PAGE_DOWN);
        BillingAddress.sendKeys(Keys.ENTER);
        BillingAddress.sendKeys(Bill);
        BillingAddress.sendKeys(Keys.DOWN);
        waitUntilElementDisplayed(BillingAddress);
        BillingAddress.sendKeys(Keys.ENTER);
        Log.info(" Search successfully in Billing Address");
        return this;
    }

    @DataProvider(name = "AllDetails")
    public Object[][] getAllAccountDetails() {
        return new Object[][] {
                {"Chandini", "JohnCenaaa.com", "8899001122", "You cant see me", "YCSM@gmail.com", "34", "Bangalore"}
        };
    }
    public AccountPage AccountCreationPage(String AccName,String URL,String PhoneNo,String Des,String Email,String number,String BillAdress) {
            System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());
            waitUntilElementDisplayed(AccountDropdown);
            AccountDropdown.sendKeys(Keys.ENTER);
            waitUntilElementDisplayed(AccountsText);
            waitUntilElementClickable(NewButton);
            NewButton.sendKeys(Keys.ENTER);
            waitUntilElementDisplayed(NewAccountPage);
            AccountName.sendKeys(AccName);
            Reporter.log("Entered AccountName"+AccountName);
            try{
                if (Type.isDisplayed()){
               Type.click();
                }
            }catch (Exception e){
                Reporter.log("TypeDropDown Throws Exception"+ e);
            }
            waitUntilElementDisplayed(PressOption);
            PressOption.click();
            Reporter.log("Selected PressOption"+PressOption);
            EnterWebsite.sendKeys(URL);
            Reporter.log("Entered Website"+EnterWebsite);
            PhoneNumber.sendKeys(PhoneNo);
            Reporter.log("Enter PhoneNumber Successfully"+PhoneNumber);
            Description.sendKeys(Des);
            Reporter.log("Enter Description"+Description);
            Emailtextbox.sendKeys(Email);
            Reporter.log("Enter email successfully"+Emailtextbox);
            Industry.click();
            Reporter.log("clicked on Industry"+Industry);
            Banking.click();
            Reporter.log("Clicked on Banking"+Banking);
            Employee.sendKeys(number);
            Reporter.log("Enter Employee"+Employee);
            SearchBillingAddress(BillAdress);
            Savebutton.click();
            Reporter.log("Done Creating Account");
        return this;
    }



    public AccountPage VerfiyUserSaveAndNew(String AccName, String URL, String phno, String des, String email, String employee, String Bill)  {
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(AccountsText);
        waitUntilElementDisplayed(NewButton);
        NewButton.sendKeys(Keys.ENTER);
        NewButton.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(NewAccountPage);
        AccountName.sendKeys(AccName);
        Reporter.log("Entered AccountName"+AccountName);
        try{
            if (Type.isDisplayed()){
                Type.click();
            }
        }catch (Exception e){
            Reporter.log("TypeDropDown Throws Exception"+ e);
        }
        PressOption.click();
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.click();
        Banking.click();
        SearchBillingAddress(Bill);
        SaveAndNewbutton.click();
        Reporter.log("Done with SaveAndNew");
        return this;
    }

    @DataProvider(name = "WithoutMandatoryData")
    public Object[][] getDataForWithoutMandatoryField() {
        return new Object[][] {
                { "JohnCenaaa.com", "8899001122", "You cant see me", "YCSM@gmail.com", "34", "Bangalore"}
        };
    }
    public AccountPage VerfiyAccountCreationWOMandtoryFields(String URL, String phno, String des, String email, String employee, String Bill) {
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());//true
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitForSeconds(4);
        Actions actions=new Actions(driver);
        actions.moveToElement(NewButton).click();
        NewButton.sendKeys(Keys.ENTER);
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.sendKeys(Keys.ENTER);
        Banking.click();
        Savebutton.click();
        Reporter.log("Done WithoutMandtoryField");
        return this;
    }

    public AccountPage VerfiyUserSaveAndNewWOmandatory(String URL, String phno, String des, String email, String employee, String Bill){
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());//true
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        Type.sendKeys(Keys.ENTER);
        PressOption.click();
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.click();
        Banking.click();
        SaveAndNewbutton.click();
        Reporter.log("done with SaveAndNewWoMandtory");
        return this;
    }

    public AccountPage VerfiyUserCancelWOmandatory(String URL, String phno, String des, String email, String employee, String Bill) {
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());//true
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        Type.sendKeys(Keys.ENTER);
        PressOption.click();
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.click();
        Banking.click();
        CancelButton.click();
        return this;
    }

    public AccountPage SearchAccountAndClick(String Accname) {
        Log.info("checking" + Accname + " is present in the account list");
        waitForSeconds(2);
        for (WebElement Account : AllAccounts) {
            String currentAccName = Account.getText();
            if (currentAccName.equalsIgnoreCase(Accname)) {
                Account.sendKeys(Keys.ENTER);
                Log.info("User Found");
            }
        }
        return this;
    }
    @DataProvider(name = "EditUserCreated")
    public Object[][] getDataForEdit() {
        return new Object[][] {
                {"38"}
        };
    }
    public AccountPage VerifyUserCanEdit(String Accname,String emps) {
        SearchAccountAndClick(Accname);
        waitForSeconds(2);
        edit.click();
        waitUntilElementDisplayed(EditPageDropUp);
        Assert.assertTrue(EditPageDropUp.isDisplayed(), "Edit page did not display as expected.");
        Employee.clear();
        String expectedEmployeeValue =emps;
        Employee.sendKeys(expectedEmployeeValue);
        Savebutton.click();
        String actualEmployeeValue = Employee.getAttribute("value");
        Assert.assertEquals(actualEmployeeValue, expectedEmployeeValue, "Employee field was not updated successfully.");
        Reporter.log("User can edit");
        waitUntilElementDisplayed(DetailsButton);
        DetailsButton.click();
        return this;

    }

    public AccountPage VerfiyUserCancelAfterEditing(String Accname,String empss) {
        SearchAccountAndClick(Accname);
        edit.click();
        waitUntilElementDisplayed(EditPageDropUp);
        Assert.assertTrue(EditPageDropUp.isDisplayed(), "Edit page did not display as expected.");
        Employee.clear();
        String expectedEmployeeValue =empss;
        Employee.sendKeys(expectedEmployeeValue);
        CancelButton.click();
        String actualEmployeeValue = Employee.getAttribute("value");
        Assert.assertEquals(actualEmployeeValue, expectedEmployeeValue, "Employee field was not updated successfully.");
        Reporter.log("User can edit");
        return this;
    }

    public AccountPage DeleteAccountCreated() {
        waitForSeconds(2);
        waitUntilElementDisplayed(DeleteCreatedAccount);
        DeleteCreatedAccount.sendKeys(Keys.ENTER);
        DeletePopup.click();
        if(ClosePopup.isDisplayed()){
            ClosePopup.click();
        }
        return this;
    }
    }
