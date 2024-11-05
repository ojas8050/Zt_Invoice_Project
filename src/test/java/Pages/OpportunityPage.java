package Pages;

import Utils.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OpportunityPage extends BasePage {

    public OpportunityPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@scope='row']//*[@data-refid='recordId']")
    private List<WebElement> AllOpportunityNames;
    @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Opportunities']")
    private WebElement OpportunityDropDown;
    @FindBy(xpath = "//*[@class='forceActionLink' and @title='New']")
    private WebElement NewButton;
    @FindBy(xpath = "//input[@name='Name']")
    private WebElement OpportunityName;
    @FindBy(xpath = "//*[@placeholder='Search Accounts...']")
    private WebElement AccountNameTextField;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Taxation']")
    private WebElement TaxationDropDown;
    @FindBy(xpath = "//*[@title='International' and @class='slds-truncate']")
    private WebElement SelectInternational;
    @FindBy(xpath = "//*[@name='Amount']")
    private WebElement AmountField;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Month']")
    private WebElement MonthDropDown;
    @FindBy(xpath = "//*[@aria-label='Month']//*[@class='slds-truncate']")
    private List<WebElement> SelectMonth;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Year']")
    private WebElement YearDropDown;
    @FindBy(xpath = "//*[@title='2026' and @class='slds-truncate']")
    private WebElement Select2026Year;
    @FindBy(xpath = "//*[@name='CloseDate']")
    private WebElement CloseDateCalendar;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Stage']")
    private WebElement StageDropDown;
    @FindBy(xpath = "//*[@title='Closed Won' and @class='slds-truncate']")
    private WebElement SelectClosedWon;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Status']")
    private WebElement StatusDropDown;
    @FindBy(xpath = "//*[@title='In-Progress' and @class='slds-truncate']")
    private WebElement SelectInProgressOption;
    @FindBy(xpath = "(//*[@class='slds-textarea'])[1]")
    private WebElement DescriptionTextField;
    @FindBy(xpath = "//*[@name='PO_Number__c']")
    private WebElement PONumberTextField;
    @FindBy(xpath = "//*[@name='HSN_SAC1__c']")
    private WebElement HSN_SAC_TextField;
    @FindBy(xpath = "//*[@name='NextStep']")
    private WebElement NextStepTextField;
    @FindBy(xpath = "//*[@name='Night_Shift_Expense__c']")
    private WebElement NightShiftExpenseTextField;
    @FindBy(xpath = "//*[@name='PST_Shift_Expense__c']")
    private WebElement PSTTimeShiftTextField;
    @FindBy(xpath = "//*[@name='US_Call_Expense__c']")
    private WebElement US_Call_TextField;
    @FindBy(xpath = "(//*[@data-value='--None--' and @aria-label='Type'])[1]")
    private WebElement TypeOfBusinessDropDown;
    @FindBy(xpath = "//*[@title='New Business' and @class='slds-truncate']")
    private WebElement SelectNewBusiness;
    @FindBy(xpath = "//*[@name='Present_Cycle_Expense__c']")
    private WebElement PresentCycleExpenseTextField;
    @FindBy(xpath = "//*[@name='Arrears__c']")
    private WebElement BudgetConsumed_PrevTextField;
    @FindBy(xpath = "//*[@name='Company_Name__c']")
    private WebElement CompanyNameTextField;
    @FindBy(xpath = "//*[@name='GST_Number__c']")
    private WebElement GST_NumberTextField;
    @FindBy(xpath = "//*[@name='Pan_No__c']")
    private WebElement PAN_NoTextField;
    @FindBy(xpath = "//*[@name='Email__c']")
    private WebElement EmailTextField;
    @FindBy(xpath = "//*[@name='Address_Line_1__c']")
    private WebElement AddressLineOneTextField;
    @FindBy(xpath = "//*[@name='Address_Line_2__c']")
    private WebElement AddressLineTwoTextField;
    @FindBy(xpath = "//*[@name='Phone__c']")
    private WebElement PhoneNoTextField;
    @FindBy(xpath = "//*[@name='Account_Holder_Name__c']")
    private WebElement AccountHolderNameTextField;
    @FindBy (xpath = "//*[@name='Bank_Name__c']")
    private WebElement BankNameTextField;
    @FindBy(xpath = "//*[@name='Swift_Code__c']")
    private WebElement SwiftCodeTextField;
    @FindBy(xpath = "//*[@name='Account_Number__c']")
    private WebElement AccountNumberTextField;
    @FindBy(xpath = "//*[@name='Bank_Address__c']")
    private WebElement BankAddressTextField;
    @FindBy(xpath = "(//*[@data-value='--None--' and @aria-label='Type'])[2]")
    private WebElement AdditionalInfoType;
    @FindBy(xpath = "//*[@name='GST_LUT_ARN__c']")
    private WebElement GST_LUT_ARN_TextField;
    @FindBy(xpath = "//*[@data-value='--None--' and @aria-label='Lead Source']")
    private WebElement LeadSourceDropDown;
    @FindBy(xpath = "//*[@title='Partner' and @class='slds-truncate']")
    private WebElement SelectPartner;
    @FindBy(xpath = "//*[@name='SaveEdit']")
    private WebElement SaveButton;
    @FindBy(xpath = "//*[@class='windowViewMode-normal oneContent active lafPageHost']//*[@name='Edit']")
    private WebElement OpportunityEdit;

    //Assertions
    @FindBy(xpath = "//*[@data-field-id='RecordNight_Shift_Expense_cField']//*[contains(@data-target-selection-name,'Night_Shift_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement NightShiftExpenseFromDetails;
    @FindBy(xpath = "//*[@data-field-id='RecordPST_Shift_Expense_cField']//*[contains(@data-target-selection-name,'PST_Shift_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement PST_ShiftExpenseFromDetails;
    @FindBy(xpath = "//*[@data-field-id='RecordUS_Call_Expense_cField']//*[contains(@data-target-selection-name,'US_Call_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement US_CallExpenseFromDetails;


    public OpportunityPage SearchMonthAndClick(String MonthName) {
        Log.info("checking " + MonthName + " is present in the account list");
        waitForSeconds(1);
        for (WebElement Month : SelectMonth) {
            String currentMonthName = Month.getText();
            if (currentMonthName.equalsIgnoreCase(MonthName)) {
                Month.click();
                Log.info("Month Found");
            }
        }
        return this;
    }

    public OpportunityPage VerifyOpportunityPresent(String OppName) {
        Log.info("Checking "+ OppName +" is present in thr Employee List");
        Actions actions = new Actions(driver);
        waitForSeconds(2);
        for (WebElement opportunity : AllOpportunityNames) {
            String currentOpportunity = opportunity.getText();
            System.out.println("CurrentOppName--->"+currentOpportunity);
            if (currentOpportunity.equalsIgnoreCase(OppName)) {
                opportunity.click();
                Log.info("Opportunity Found");
                break;
            }
            else {
                actions.sendKeys(Keys.PAGE_DOWN).perform();
            }
        }
        return this;
    }

    public OpportunityPage CreateRecordByAllDetails(String OppName,String Amount,String MonthName){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.click();
        OpportunityName.sendKeys(OppName);
        AccountNameTextField.sendKeys(Keys.ENTER);
        waitForSeconds(1);
        AccountNameTextField.sendKeys(Keys.DOWN);
        AccountNameTextField.sendKeys(Keys.ENTER);
        TaxationDropDown.click();
        SelectInternational.click();
        AmountField.sendKeys(Amount);
        moveToElement(MonthDropDown);
        MonthDropDown.sendKeys(Keys.ENTER);
        SearchMonthAndClick(MonthName);
        YearDropDown.click();
        Select2026Year.click();
        CloseDateCalendar.sendKeys("24/05/2030");
        StageDropDown.sendKeys(Keys.ENTER);
        SelectClosedWon.click();
        StatusDropDown.click();
        SelectInProgressOption.click();
        moveToElement(DescriptionTextField);
        DescriptionTextField.sendKeys("Zomato is Best then the Swiggy");
        PONumberTextField.sendKeys("659123");
        HSN_SAC_TextField.sendKeys("4567609878");
        NextStepTextField.sendKeys("Next Step");
        NightShiftExpenseTextField.sendKeys("9");
        PSTTimeShiftTextField.sendKeys("9");
        US_Call_TextField.sendKeys("9");
        TypeOfBusinessDropDown.sendKeys(Keys.ENTER);
        SelectNewBusiness.click();
        PresentCycleExpenseTextField.sendKeys("1.5m");
        BudgetConsumed_PrevTextField.sendKeys("1.5m");
        CompanyNameTextField.sendKeys("ZuciTech Software and Solutions");
        GST_NumberTextField.sendKeys("GST1234567");
        PAN_NoTextField.sendKeys("ABCDE1234F");
        EmailTextField.sendKeys("ABCD@gmail.com");
        AddressLineOneTextField.sendKeys("Potential Building,1st Main Road");
        AddressLineTwoTextField.sendKeys("JP nagar,3rd Phase,Bangalore");
        PhoneNoTextField.sendKeys("909987654");
        AccountHolderNameTextField.sendKeys("ZUCITECH SOFTWARE SOLUTIONS PRIVATE LIMITED");
        BankNameTextField.sendKeys("AXIS Bank");
        SwiftCodeTextField.sendKeys("AXISINBB052");
        AccountNumberTextField.sendKeys("920020044652714");
        BankAddressTextField.sendKeys("AXIS Bank Ltd, Jayanagar 4th T block Bangalore - 560041");
        GST_LUT_ARN_TextField.sendKeys("AD2905190012149");
        LeadSourceDropDown.sendKeys(Keys.ENTER);
        SelectPartner.click();
        SaveButton.click();

        return this;
    }

    public OpportunityPage CreateRecordByMandatoryDetails(String OppName,String Amount,String MonthName){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        NewButton.click();
        OpportunityName.sendKeys(OppName);
        AccountNameTextField.sendKeys(Keys.ENTER);
        waitForSeconds(1);
        AccountNameTextField.sendKeys(Keys.DOWN);
        AccountNameTextField.sendKeys(Keys.ENTER);
        TaxationDropDown.click();
        SelectInternational.click();
        AmountField.sendKeys(Amount);
        moveToElement(MonthDropDown);
        MonthDropDown.sendKeys(Keys.ENTER);
        SearchMonthAndClick(MonthName);
        YearDropDown.click();
        Select2026Year.click();
        CloseDateCalendar.sendKeys("24/05/2030");
        StageDropDown.sendKeys(Keys.ENTER);
        SelectClosedWon.click();
        StatusDropDown.click();
        SelectInProgressOption.click();
        moveToElement(DescriptionTextField);
        PONumberTextField.sendKeys("659123");
        HSN_SAC_TextField.sendKeys("4567609878");
        NightShiftExpenseTextField.sendKeys("9");
        PSTTimeShiftTextField.sendKeys("9");
        US_Call_TextField.sendKeys("9");
        SaveButton.click();

        return this;
    }

    public OpportunityPage EditRecordByDetails(String SetNightShiftPrice, String SetPSTShiftPrice, String SetUS_CallPrice, String SetMobileNo){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        moveToElement(NightShiftExpenseTextField);
        NightShiftExpenseTextField.clear();
        NightShiftExpenseTextField.sendKeys(SetNightShiftPrice);
        PSTTimeShiftTextField.clear();
        PSTTimeShiftTextField.sendKeys(SetPSTShiftPrice);
        US_Call_TextField.clear();
        US_Call_TextField.sendKeys(SetUS_CallPrice);
        moveToElement(PhoneNoTextField);
        PhoneNoTextField.clear();
        PhoneNoTextField.sendKeys(SetMobileNo);
        SaveButton.click();
        waitForSeconds(2);

        return this;
    }

    public OpportunityPage EditRecordByMandatoryDetails(String OppName,String Amount,String NightShift,String PST_Shift,String US_Call,String PO_Num,String HSN_SAC){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        OpportunityName.clear();
        OpportunityName.sendKeys(OppName);
        AmountField.clear();
        AmountField.sendKeys(Amount);
        moveToElement(CloseDateCalendar);
        CloseDateCalendar.clear();
        CloseDateCalendar.sendKeys("24/05/2030");
        moveToElement(DescriptionTextField);
        PONumberTextField.clear();
        PONumberTextField.sendKeys(PO_Num);
        HSN_SAC_TextField.clear();
        HSN_SAC_TextField.sendKeys(HSN_SAC);
        NightShiftExpenseTextField.clear();
        NightShiftExpenseTextField.sendKeys(NightShift);
        PSTTimeShiftTextField.clear();
        PSTTimeShiftTextField.sendKeys(PST_Shift);
        US_Call_TextField.clear();
        US_Call_TextField.sendKeys(US_Call);
        SaveButton.click();
        waitForSeconds(3);
        return this;
    }

}

