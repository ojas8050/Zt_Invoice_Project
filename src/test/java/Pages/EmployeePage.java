package Pages;

import Enums.EmployeeConstants;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.List;

public class EmployeePage {
    private static final Logger log = LoggerFactory.getLogger(EmployeePage.class);
    private WebDriver driver;

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "a[data-refid='recordId']") private List<WebElement> AllEmployees;
    @FindBy(linkText = "Ojas") private WebElement UserOjas;
    @FindBy(xpath = "//*[@name='Edit']") private WebElement UserEdit;
    @FindBy(xpath = "//*[@class='slds-input' and @name='Employee_ID__c']") private WebElement EmpID;
    @FindBy(xpath = "//*[@class='slds-input' and @inputmode='email']") private WebElement EmpEmail;
    @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']") private WebElement saveButton;
    @FindBy(xpath = "//*[normalize-space()='ZT00565']") private WebElement EmpIDInformation;
    @FindBy(xpath = "//*[text()='Email']/..//../../..//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']") private WebElement EmailInformation;

    public EmployeePage ClickonUserOjas(){
        Assert.assertTrue(UserOjas.isDisplayed(),"User Ojas is Not present in the Employee List");
        UserOjas.click();
        return this;
    }

    public EmployeePage VerifyUserPresent(String EmpName) throws InterruptedException {
        Log.info("Checking "+EmpName+" is present in thr Employee List");
        Thread.sleep(3000);
        for (WebElement employee : AllEmployees) {
            String currentEmpName = employee.getText();
            if (currentEmpName.equalsIgnoreCase(EmpName)) {
                employee.click();
                Log.info("User Found");
            }
        }
        return this;
    }

    public EmployeePage ClickOnEditButton(){
        Log.info("Click On Edit Button Present In Employee Page");
        Assert.assertTrue(UserEdit.isDisplayed());
        UserEdit.click();
        return this;
    }

    public EmployeePage EnterEmpID(String ChangeIDTo){
        Log.info("Changing the EmpID to "+ChangeIDTo);
        EmpID.clear();
        EmpID.sendKeys(ChangeIDTo);
        return this;
    }

    public EmployeePage EnterEmpEmail(String ChangeEmailTo){
        Log.info("Changing Emp Mail To "+ChangeEmailTo);
        EmpEmail.clear();
        EmpEmail.sendKeys(ChangeEmailTo);
        return this;
    }

    public void ClickOnSave(){
        Log.info("Clicking on save Button");
        saveButton.click();
    }

    public EmployeePage VerifyEmpID(){
        Log.info("Verifying the Employee ID from he Information Page");
        //System.out.println("Actual EmpId--->  "+EmpIDInformation.getText());
        Assert.assertEquals(EmpIDInformation.getText(), EmployeeConstants.EmployeeOjasCredEnum.ID.getValue());
        return this;
    }

    public EmployeePage VerifyEmpEmail(){
        Log.info("Verifying the Employee Email from he Information Page");
        //System.out.println("Actual Email--->  "+EmailInformation.getText());
        Assert.assertEquals(EmailInformation.getText(), EmployeeConstants.EmployeeOjasCredEnum.Email.getValue());

        return this;
    }

}
