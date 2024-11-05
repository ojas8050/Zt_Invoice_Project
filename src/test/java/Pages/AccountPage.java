package Pages;


import Utils.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends BasePage{
    private WebDriver driver;
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='Name' and @maxlength='255']")
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

    public AccountPage SearchBillingAddress(String Bill) {
        BillingAddress.sendKeys(Keys.PAGE_DOWN);
        BillingAddress.sendKeys(Keys.ENTER);
        BillingAddress.sendKeys(Bill);
        BillingAddress.sendKeys(Keys.DOWN);
        waitForSeconds(1);
        BillingAddress.sendKeys(Keys.ENTER);
        Log.info(" Search successfully in Billing Address");
        return this;
    }

    public AccountPage VerfiyAccountCreationPage(String user, String URL, String phno, String des, String email, String employee, String Bill)  {
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());//true
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.sendKeys(Keys.ENTER);
        AccountName.sendKeys(user);
        Type.click();
        Type.click();
        Type.sendKeys(Keys.ENTER);
        PressOption.click();
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.click();
        Banking.click();
        Savebutton.click();
        return this;
    }

    public AccountPage VerfiyUserSaveAndNew(String user, String URL, String phno, String des, String email, String employee, String Bill)  {
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());//true
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.sendKeys(Keys.ENTER);
        AccountName.sendKeys(user);
        System.out.println("Type--->"+Type.isDisplayed());
        waitForSeconds(2);
//        Type.click();
//        Type.click();
//        Type.sendKeys(Keys.ENTER);
        Type.sendKeys(Keys.ENTER);
        PressOption.click();
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.click();
        Banking.click();
        SearchBillingAddress(Bill);
        SaveAndNewbutton.click();
        return this;
    }

    public AccountPage VerfiyAccountCreationWOMandtoryFields(String URL, String phno, String des, String email, String employee, String Bill) {
        System.out.println("Account Dropdown---->" + AccountDropdown.isDisplayed());//true
        waitUntilElementDisplayed(AccountDropdown);
        AccountDropdown.sendKeys(Keys.ENTER);
        waitForSeconds(4);
        NewButton.sendKeys(Keys.ENTER);
        waitForSeconds(5);
        Type.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.click();
        Type.click();
        Type.click();
//        Type.sendKeys(Keys.ENTER);
//        Type.sendKeys(Keys.ENTER);
        PressOption.click();
        EnterWebsite.sendKeys(URL);
        PhoneNumber.sendKeys(phno);
        Description.sendKeys(des);
        Emailtextbox.sendKeys(email);
        Industry.sendKeys(Keys.ENTER);
        Banking.click();
        Savebutton.click();
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

    public AccountPage VerifyUserCanEdit(String Accname) {
        SearchAccountAndClick(Accname);
        waitForSeconds(2);
        edit.click();
        Employee.clear();
        Employee.sendKeys("35");
        Savebutton.click();
        return this;
    }

    public AccountPage VerfiyUserCancelAfterEditing(String Accname) {
        SearchAccountAndClick(Accname);
        edit.click();
        Employee.clear();
        Employee.sendKeys("35");
        CancelButton.click();
        return this;
    }

    public AccountPage DeleteAccountCreated() {
        waitForSeconds(2);
        DeleteCreatedAccount.click();
        DeletePopup.click();
        if(ClosePopup.isDisplayed()){
            ClosePopup.click();
        }
        return this;
    }
    }
