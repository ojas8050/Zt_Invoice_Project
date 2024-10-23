package Pages;

import Constants.EmployeeConstants;
import Utils.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(css = "a[data-refid='recordId']") public List<WebElement> AllEmployees;
    @FindBy(linkText = "Ojas") public WebElement UserOjas;
    @FindBy(xpath = "//*[@name='Edit']") public WebElement UserEdit;
    @FindBy(xpath = "//*[@class='slds-input' and @name='Employee_ID__c']") public  WebElement EmpID;
    @FindBy(xpath = "//*[@class='slds-input' and @inputmode='email']") public WebElement EmpEmail;
    @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']") public WebElement saveButton;
    @FindBy(xpath = "(//lightning-formatted-text[normalize-space()])[3]") public static WebElement EmpIDInformation;
    @FindBy(xpath = "//*[text()='Email']/..//../../..//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']") public static WebElement EmailInformation;

    public EmployeePage VerifyUserPresent(String EmpName) {
        Log.info("Checking "+EmpName+" is present in thr Employee List");
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


    public EmployeePage VerifyUserCanEditEmployee() {
        randomEmpID = EmployeeConstants.EmployeeOjasCredEnum.ID.getValue();
        randomEmpEmail = EmployeeConstants.EmployeeOjasCredEnum.Email.getValue();
        waitUntilElementVisible(commonPage.EmployeesDropDown);
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

}
