package Pages;

import Constants.EmployeeConstants;
import Utils.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeePage extends BasePage {
    public static String randomEmpID;
    public static String randomEmpEmail;

    public EmployeePage(WebDriver driver) {
        super(driver);
    }
//    @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Employees']")
//    public WebElement EmployeesObject;

    @FindBy(css = "a[data-refid='recordId']")
    public List<WebElement> AllEmployees;
    @FindBy(linkText = "Ojas")
    public WebElement UserOjas;
    @FindBy(xpath = "//*[@name='Edit']")
    public WebElement UserEdit;
//    @FindBy(xpath = "//*[@class='slds-input' and @name='Employee_ID__c']")
//    public  WebElement EmpID;
;
    @FindBy(xpath = "//*[@class='slds-input' and @inputmode='email']")
    public WebElement EmpEmail;
    @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "(//lightning-formatted-text[normalize-space()])[3]")
    public static WebElement EmpIDInformation;

    @FindBy(xpath = "//*[text()='Email']/..//../../..//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']")
    public static WebElement EmailInformation;

    public EmployeePage VerifyUserPresent(String EmpName) {
        Log.info("Checking " + EmpName + " is present in thr Employee List");
        waitForSeconds(2);
        for (WebElement employee : AllEmployees) {
            String currentEmpName = employee.getText();
            if (currentEmpName.equalsIgnoreCase(EmpName)) {
                employee.click();
                Log.info("User Found");
            }
        }
        return this;
    }


    public EmployeePage VerifyUserCanEditEmployee() throws InterruptedException {
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementVisible(EmployeesObject);
        Thread.sleep(6000);
        EmployeesObject.sendKeys(Keys.ENTER);
        VerifyUserPresent(EmployeeConstants.EmployeeOjasCredEnum.User.getValue());
        Log.info("Click On Edit Button Present In Employee Page");
        UserEdit.click();
        EmpID.clear();
        Log.info("Changing the EmpID to "+randomEmpID);
        EmpID.sendKeys(randomEmpID);
        EmpEmail.clear();
        Log.info("Changing Emp Mail To "+randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on save Button");
        saveButton.click();
        waitForSeconds(1);
        return this;    }


    @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Employees']")
    public WebElement EmployeesObject;

//    public void ClickOnEmployees() throws InterruptedException
//    {    waitUntilElementDisplayed(EmployeesObject);
//        EmployeesObject.isDisplayed();
//        EmployeesObject.sendKeys(Keys.ENTER);
//    }

    @FindBy(xpath ="//*[@class=\"forceActionLink\"]//div[@title='New']")
    public WebElement NewButton;
    @FindBy(xpath = "//*[@class='slds-input' and @name='Employee_ID__c']")
    public  WebElement EmpID;

    @FindBy(xpath = "//*[@name='Name']")
    public  WebElement Nametextbox;
    @FindBy(xpath = "//*[@name='Cost__c']")
    public  WebElement costtextbox;
    @FindBy(xpath = "//*[@title='Quality Assurance']")
    public  WebElement BusinessUnitDropdown;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Business Unit']")
    public WebElement BusinessUnit;
    @FindBy(xpath = "//*[@class='slds-button slds-button_brand']")
    public WebElement Savebutton;


    public EmployeePage VerifyUserCanCreateEmployee() throws InterruptedException {
        Thread.sleep(6000);
        EmployeesObject.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(NewButton);
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",NewButton);
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementVisible(EmployeesObject);
//        commonPage.EmployeesDropDown.sendKeys(Keys.ENTER);

         EmpID.clear();
        Log.info("Changing the EmpID to " + randomEmpID);
        EmpID.sendKeys(randomEmpID);
        Nametextbox.sendKeys("banu");
        costtextbox.sendKeys("20000");

         BusinessUnit.click();
         Thread.sleep(2000);
       BusinessUnitDropdown.click();
        EmpEmail.clear();
        Log.info("Changing Emp Mail To " + randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on save Button");
        saveButton.click();
        waitForSeconds(1);
        return this;
    }
    @FindBy(xpath = "//*[@name='SaveAndNew']")
    private WebElement SAVEandNEWbutton;

      public EmployeePage VerifyUserCanperformsaveandnewEmployee() throws InterruptedException {
          Thread.sleep(6000);
          EmployeesObject.sendKeys(Keys.ENTER);        waitUntilElementDisplayed(NewButton);
          Thread.sleep(6000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",NewButton);
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementVisible(EmployeesObject);
//        commonPage.EmployeesDropDown.sendKeys(Keys.ENTER);

//        EmpID.clear();
        Log.info("Changing the EmpID to " + randomEmpID);
        EmpID.sendKeys(randomEmpID);
        Nametextbox.sendKeys("fouziya");
        costtextbox.sendKeys("20000");

        BusinessUnit.click();
        Thread.sleep(2000);
        BusinessUnitDropdown.click();
        EmpEmail.clear();
        Log.info("Changing Emp Mail To " + randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on saveandNew Button");
        SAVEandNEWbutton.click();
        waitForSeconds(1);
        return this;
    }
    @FindBy(xpath = "//*[@name='CancelEdit']")
    private WebElement CANCLEBUTTON;

    public EmployeePage VerifyUserCancleEmployeeCreation() throws InterruptedException {
        Thread.sleep(6000);
        EmployeesObject.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(NewButton);
        Thread.sleep(6000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",NewButton);
//        Thread.sleep(6000);

        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementVisible(EmployeesObject);
//        commonPage.EmployeesDropDown.sendKeys(Keys.ENTER);

//        EmpID.clear();
        Log.info("Changing the EmpID to " + randomEmpID);
        EmpID.sendKeys(randomEmpID);
        Nametextbox.sendKeys("syedii");
        costtextbox.sendKeys("20000");

        BusinessUnit.click();
        Thread.sleep(2000);
        BusinessUnitDropdown.click();
        EmpEmail.clear();
        Log.info("Changing Emp Mail To " + randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on saveandNew Button");
        CANCLEBUTTON.sendKeys(Keys.ENTER);
        waitForSeconds(1);
        return this;
    }
}
