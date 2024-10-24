package Pages;

import Constants.EmployeeConstants;
import Utils.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeePage extends BasePage {
    private CommonPage commonPage;
    public static String randomEmpID;
    public static String randomEmpEmail;

    public EmployeePage(WebDriver driver) {
        super(driver);
        commonPage=new CommonPage(driver);
    }

    @FindBy(css = "a[data-refid='recordId']") private List<WebElement> AllEmployees;
    @FindBy(xpath = "//*[@name='Edit']") private WebElement UserEdit;
    @FindBy(xpath = "//*[@class='slds-input' and @name='Employee_ID__c']") private  WebElement EmpID;
    @FindBy(xpath = "//*[@class='slds-input' and @inputmode='email']") private WebElement EmpEmail;
    @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']") private WebElement saveButton;
    @FindBy(xpath = "//*[@name='output']//*[contains(text(),'ZT')]") public static WebElement EmpIDInformation;
    @FindBy(xpath = "//*[text()='Email']/..//../../..//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']") public static WebElement EmailInformation;
    @FindBy(xpath = "//*[@name='Last_Name__c' and @class='slds-input']") private WebElement LastNameField;
    @FindBy(xpath = "//*[@name='Cost__c' and @class='slds-input']") private WebElement CostField;
    @FindBy(xpath = "//*[@name='CancelEdit']") private WebElement CancelEdit;
    @FindBy(linkText = "Log out") public static WebElement LogoutLink;
    @FindBy(xpath = "//*[@class='windowViewMode-normal oneContent active lafPageHost']//*[@class='slds-grid primaryFieldRow']//*[contains(@class,actionsContainer)]//*[text()='Delete']") private WebElement DeleteButton;
    @FindBy(xpath = "//span[text()='Delete']") private WebElement ConfirmDeleteButton;
    @FindBy(css = "button[title='Cancel'] span[class=' label bBody']") private WebElement ConfirmCancelButton;

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
            else {
                actions.sendKeys(Keys.DOWN).perform();
            }
        }
        return this;
    }


    public EmployeePage VerifyUserCanEditEmployee() {
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementVisible(CommonPage.EmployeesDropDown);
        waitForSeconds(2);
        commonPage.EmployeesDropDown.sendKeys(Keys.ENTER);
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
        return this;
    }

    public EmployeePage VerifyUserCanCancelEditTab(){
        waitUntilElementVisible(commonPage.EmployeesDropDown);
        commonPage.EmployeesDropDown.sendKeys(Keys.ENTER);
        VerifyUserPresent(EmployeeConstants.EmployeeOjasCredEnum.User.getValue());
        Log.info("Click On Edit Button Present In Employee Page");
        UserEdit.click();
        Log.info("Changing LastName");
        LastNameField.sendKeys("Harper");
        Log.info("Changing Cost");
        CostField.sendKeys("2m");
        CancelEdit.click();

    return this;
    }

    public EmployeePage VerifyUserCanDeleteEmployee(){
        waitUntilElementClickable(DeleteButton);
        DeleteButton.click();
        ConfirmDeleteButton.click();
        return this;
    }

    public EmployeePage VerifyUserCanCancelDeletingEmployee(){
        waitUntilElementClickable(DeleteButton);
        DeleteButton.click();
        ConfirmCancelButton.click();
        return this;
    }




}
