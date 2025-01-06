package Pages;

import Constants.EmployeeConstants;
import Utils.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EmployeePage extends BasePage {
    public static String randomEmpID;
    public static String randomEmpEmail;

    public EmployeePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[data-refid='recordId']")
    private List<WebElement> AllEmployees;
    @FindBy(xpath = "//button[contains(@name,'Edit')]")
    private List<WebElement> UserEdit;
    @FindBy(xpath = "//*[@class='slds-input' and @name='Employee_ID__c']")
    private WebElement EmpID;
    @FindBy(xpath = "//*[@class='slds-input' and @inputmode='email']")
    private WebElement EmpEmail;
    @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//*[@name='output']//*[contains(text(),'ZT')]")
    public static WebElement EmpIDInformation;
    @FindBy(xpath = "//*[text()='Email']/..//../../..//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']")
    public static WebElement EmailInformation;
    @FindBy(xpath = "//*[@name='Last_Name__c' and @class='slds-input']")
    private WebElement LastNameField;
    @FindBy(xpath = "//*[@name='Cost__c' and @class='slds-input']")
    private WebElement CostField;
    @FindBy(xpath = "//*[@name='CancelEdit']")
    private WebElement CancelEdit;
    @FindBy(linkText = "Log out")
    public static WebElement LogoutLink;
    @FindBy(xpath = "//*[contains(@class,actionsContainer)]//*[text()='Delete']")
    private WebElement DeleteButton;
    @FindBy(xpath = "//span[text()='Delete']")
    private WebElement ConfirmDeleteButton;
    @FindBy(css = "button[title='Cancel'] span[class=' label bBody']")
    private WebElement ConfirmCancelButton;
    @FindBy(xpath = "//*[@name='Name']")
    private WebElement FirstNameTextBox;
    @FindBy(xpath = "//*[@title='Quality Assurance']")
    public WebElement BusinessUnitDropdown;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Business Unit']")
    public WebElement BusinessUnit;
    @FindBy(xpath = "//*[@name='SaveAndNew']")
    private WebElement SAVEandNEWbutton;
    @FindBy(xpath = "//*[@name='CancelEdit']")
    private WebElement CANCLEBUTTON;
    @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Employees']")
    public static WebElement EmployeeDropdown;
    @FindBy(xpath = "//a//div[@title='New']")
    public static WebElement NewButton;
    @FindBy(xpath = "//span[@class='slds-var-p-right_x-small'and text()='Employees']")
    public WebElement EmployeesText;
    @FindBy(xpath = "//a[contains(@title,'New')]")
    private WebElement NewEmployeeText;
    @FindBy(xpath = "(//button[contains(@name,'Edit')])[2]")
    private WebElement EditEmployeeButton;

    public EmployeePage VerifyUserPresent(String EmpName) {
        Log.info("Checking "+EmpName+" is present in thr Employee List");
        Actions actions = new Actions(driver);
        waitForSeconds(2);
        for (WebElement employee : AllEmployees) {
            String currentEmpName = employee.getText();
            if (currentEmpName.equalsIgnoreCase(EmpName)) {
                employee.click();
                Log.info("User Found");
                break;
            }
        }
        return this;
    }

    public EmployeePage VerifyUserCanCreateEmployee(){
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementDisplayed(EmployeeDropdown);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(EmployeeDropdown);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(EmployeesText);
        NewButton.click();
        Log.info("Entering the EmpID " + randomEmpID);
        waitUntilElementDisplayed(EmpID);
        EmpID.sendKeys(randomEmpID);
        FirstNameTextBox.sendKeys("banu");
        CostField.sendKeys("20000");
        BusinessUnit.click();
        waitUntilElementDisplayed(BusinessUnitDropdown);
        BusinessUnitDropdown.click();
        Log.info("Entering Emp Mail To " + randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on save Button");
        saveButton.click();
        return this;
    }

    public EmployeePage VerifyUserCanPerformSaveandnewEmployee() throws InterruptedException {
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementDisplayed(EmployeeDropdown);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(EmployeesText);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",NewEmployeeText);
        Thread.sleep(6000);
        NewEmployeeText.sendKeys(Keys.ENTER);
        Log.info("Entering the EmpID " + randomEmpID);
        waitUntilElementDisplayed(EmpID);
        EmpID.sendKeys(randomEmpID);
        FirstNameTextBox.sendKeys("ojas");
        CostField.sendKeys("20000");
        BusinessUnit.click();
        waitUntilElementDisplayed(BusinessUnitDropdown);
        BusinessUnitDropdown.click();
        EmpEmail.clear();
        Log.info("Entering Emp Mail " + randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on save&New Button");
        SAVEandNEWbutton.click();
        return this;
    }

    public EmployeePage VerifyUserCancleEmployeeCreation() {
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();

        waitUntilElementDisplayed(EmployeeDropdown);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        waitUntilElementDisplayed(EmployeesText);
        moveToElement(NewButton);
        NewButton.click();
        waitUntilElementDisplayed(NewEmployeeText);
        Log.info("Changing the EmpID to " + randomEmpID);
        EmpID.sendKeys(randomEmpID);
        waitUntilElementDisplayed(FirstNameTextBox);
        FirstNameTextBox.sendKeys("ojas");
        CostField.sendKeys("20000");
        BusinessUnit.click();
        waitUntilElementDisplayed(BusinessUnitDropdown);
        BusinessUnitDropdown.click();
        EmpEmail.clear();
        Log.info("Entering Emp Mail " + randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on Cancel Button");
        CANCLEBUTTON.sendKeys(Keys.ENTER);
        return this;
    }

    public EmployeePage VerifyUserCanEditEmployee() {
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementDisplayed(EmployeeDropdown);
        EmployeeDropdown.sendKeys(Keys.ENTER);
        VerifyUserPresent(EmployeeConstants.EmployeeOjasCredEnum.User.getValue());
        Log.info("Click On Edit Button Present In Employee Page");
        waitForSeconds(2);
        EmpID.clear();
        Log.info("Changing the EmpID to "+randomEmpID);
        EmpID.sendKeys(randomEmpID);
        EmpEmail.clear();
        Log.info("Changing Emp Mail To "+randomEmpEmail);
        EmpEmail.sendKeys(randomEmpEmail);
        Log.info("Clicking on save Button");
        saveButton.click();
        waitForSeconds(8);
        return this;
    }

    public EmployeePage VerifyUserCanCancelEditTab(){
        VerifyUserPresent(EmployeeConstants.EmployeeOjasCredEnum.User.getValue());
        Log.info("Click On Edit Button Present In Employee Page");
        EditEmployeeButton.sendKeys(Keys.ENTER);
        Log.info("Changing LastName");
        LastNameField.sendKeys("Harper");
        Log.info("Changing Cost");
        CostField.sendKeys("2m");
        CancelEdit.click();

        return this;
    }

    public EmployeePage VerifyUserCanDeleteEmployee(){
        waitUntilElementDisplayed(EmployeesText);
        if (DeleteButton.isDisplayed()) {
            DeleteButton.sendKeys(Keys.ENTER);
        } else {
            System.out.println("Element not visible");
        }
        ConfirmDeleteButton.click();
        return this;
    }

    public EmployeePage VerifyUserCanCancelDeletingEmployee(){
        waitUntilElementClickable(DeleteButton);
        if (DeleteButton.isDisplayed()) {
            DeleteButton.click();
        } else {
            System.out.println("Element not visible");
        }
        DeleteButton.click();
        ConfirmCancelButton.click();
        return this;
    }
}
