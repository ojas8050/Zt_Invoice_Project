package Pages;

import Utils.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
    @FindBy(xpath = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[@title='Employees'][text()='Employees']")
    private WebElement EmployeeList;
    @FindBy(xpath = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//button[@type='button'][normalize-space()='Add Employee']")
    private WebElement AddEmployee;
    @FindBy(xpath = "//label[@id='check-button-label-1-19']//span[@class='slds-checkbox_faux']")
    private WebElement EmployeeBanu;
    @FindBy(xpath = "//*[@class='slds-media__body']//*[text()='Add Employees']")
    private WebElement AddEmployeeText;
    @FindBy(xpath = "//*[@data-aura-class='forceInlineEditGrid']")
    private WebElement List;
    @FindBy(xpath = "//*[@class='slds-button slds-button_brand']")
    private WebElement FinishButton;
    @FindBy(xpath = "(//*[@class='slds-button slds-button_icon-border slds-button_icon-x-small']//*[@class='slds-button__icon'])[7]")
    private WebElement EmployeeEditDeopDown;
    @FindBy(xpath = "//div[@class='forceActionLink' and @title='Edit']")
    private WebElement DropDownEditButton;
    @FindBy(xpath = "//*[@name='Night_Shift__c']")
    private WebElement NightShiftEmployee;
    @FindBy(xpath = "//*[@class='view-all-label']")
    private List<WebElement> viewAllEmployeeList;
    @FindBy(xpath = "//*[@name='Opportunity.Generate_Invoice' and @part='button']")
    private List<WebElement> GenrateInvoiceButton;
    @FindBy(xpath = "//*[@class='slds-button slds-button_brand']")
    private WebElement ConfirmButton;
    @FindBy(xpath = "//span[@part='indicator']")
    private WebElement DateCheckBox;
    @FindBy(xpath = "//*[@class='slds-select' and @name='Month']")
    private WebElement MonthSelectBOX;
    @FindBy(xpath = "//*[@value='MonthPicklist.January']")
    private WebElement MonthSelecting;
    @FindBy(xpath = "//*[text()='//*[text()='Amount']/../../..//*[@data-output-element-id='output-field']']/../../..//*[@data-output-element-id='output-field']")
    private WebElement AmountInformation;
    @FindBy(xpath = "//*[@data-value='International' and @aria-label='Taxation']")
    private WebElement TaxationEditInternational;
    @FindBy(xpath = "//*[@title='Domestic' and @class='slds-truncate']")
    private WebElement Domesticedit;
    @FindBy(xpath = "//*[@data-value='Domestic' and @aria-label='Taxation']")
    private WebElement TaxationDomestic;
    @FindBy(xpath = "//*[@title='Within State' and @class='slds-truncate']")
    private WebElement WithinState;
    @FindBy(xpath = "//*[@title='Domestic' and @class='slds-truncate']")
    private WebElement Domestic;
    @FindBy(css = "sfa-output-opportunity-amount[data-output-element-id='output-field'] lightning-formatted-text")
    private WebElement TotalAmount;
    @FindBy(xpath = "//lightning-formatted-text[normalize-space()='$7,000,000.00']")
    private WebElement BudgetReamining;


    //Assertions
    @FindBy(xpath = "//*[@data-field-id='RecordNight_Shift_Expense_cField']//*[contains(@data-target-selection-name,'Night_Shift_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement NightShiftExpenseFromDetails;
    @FindBy(xpath = "//*[@data-field-id='RecordPST_Shift_Expense_cField']//*[contains(@data-target-selection-name,'PST_Shift_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement PST_ShiftExpenseFromDetails;
    @FindBy(xpath = "//*[@data-field-id='RecordUS_Call_Expense_cField']//*[contains(@data-target-selection-name,'US_Call_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement US_CallExpenseFromDetails;
    @FindBy(xpath = "//*[@data-field-id='RecordPresent_Cycle_Expense_cField']//*[contains(@data-target-selection-name,'Present_Cycle_Expense__c')]//*[@data-output-element-id='output-field' and @lwc-f6gbo863ml-host]")
    public static WebElement PresentCycleExpenseFromDetails;
    @FindBy(xpath = "(//*[text()='Budget Consumed Prev.']/../../..//*[@data-output-element-id='output-field'])")
    public static WebElement BudgetConsumedFromDetails;
    @FindBy(xpath = "(//*[text()='Budget Remaining']/../../..//*[@data-output-element-id='output-field'])")
    public static WebElement BudgetRemainingFromDetails;
    @FindBy(xpath = "(//*[text()='Amount']/../../..//*[@data-output-element-id='output-field'])")
    public static WebElement TotalAmountFromDetails;


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
                opportunity.sendKeys(Keys.ENTER);
                Log.info("Opportunity Found");
                break;
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

    public OpportunityPage EmployeesPresentToOpp(){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        EmployeeList.click();
        AddEmployee.click();
        waitForSeconds(5);

        return this;
    }

    public OpportunityPage SetExpenseNightShift(String SetExpenseNightShift){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        moveToElement(NightShiftExpenseTextField);
        NightShiftExpenseTextField.clear();
        NightShiftExpenseTextField.sendKeys(SetExpenseNightShift);
        SaveButton.click();
        return this;
    }

    public OpportunityPage SetExpensePSTShift(String SetExpensePST){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        moveToElement(NightShiftExpenseTextField);
        PSTTimeShiftTextField.clear();
        PSTTimeShiftTextField.sendKeys(SetExpensePST);
        SaveButton.click();
        return this;
    }

    public OpportunityPage SetExpenseUSCall(String SetExpenseUSCall){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        moveToElement(NightShiftExpenseTextField);
        US_Call_TextField.clear();
        US_Call_TextField.sendKeys(SetExpenseUSCall);
        SaveButton.click();
        return this;
    }

    public OpportunityPage AddEmpToOpp(){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        EmployeeList.click();
        AddEmployee.click();
        waitForSeconds(5);
        driver.switchTo().frame(0);
        EmployeeBanu.click();
        FinishButton.click();
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForSeconds(2);

        return this;
    }

    public OpportunityPage VerifyThePresentCycleExpenseIsPresent(){
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        Assert.assertTrue(PresentCycleExpenseFromDetails.isDisplayed(),"Present Cycle Expense is Not Present");
        return this;
    }

    public OpportunityPage ViewBudgetRemaining(){
        OpportunityDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        VerifyOpportunityPresent("Zomato");
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(3);
        moveToElement(NightShiftExpenseFromDetails);
        Assert.assertTrue(PresentCycleExpenseFromDetails.isDisplayed());
        Assert.assertTrue(BudgetConsumedFromDetails.isDisplayed());
        Assert.assertTrue(BudgetRemainingFromDetails.isDisplayed());
        Assert.assertTrue(TotalAmountFromDetails.isDisplayed());

        return this;

    }

    public OpportunityPage VerifythatSalaryforworkingdaysiscalculatedproperly() {
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Test Zuci FInals");
        //VerifyOpportunityPresent("Test Zuci FInals");
        waitForSeconds(2);

        Actions actions = new Actions(driver);

        // Check if there are multiple matching elements in the list
        WebElement viewAllEmployee;
        if (viewAllEmployeeList.size() == 2) {
            // Use the second element if there are two
            viewAllEmployee = viewAllEmployeeList.get(1);
        } else {
            // Use the first element if there's only one
            viewAllEmployee = viewAllEmployeeList.get(0);
        }

        actions.moveToElement(viewAllEmployee).click().perform();
        System.out.println("Employee Edit dropdown is displayed---->" + EmployeeEditDeopDown.isDisplayed());
        waitForSeconds(3);
        actions.moveToElement(EmployeeEditDeopDown).click().perform();
        waitForSeconds(2);
        System.out.println("Edit Button---->" + DropDownEditButton.isDisplayed());
        actions.moveToElement(DropDownEditButton).click().perform();
        NightShiftEmployee.clear();
        NightShiftEmployee.sendKeys("22");
        SaveButton.click();

        return this;
    }


    public OpportunityPage TOgenerateInvoice() {
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Salesforce");
        waitForSeconds(3);
        Actions actions = new Actions(driver);
        WebElement AllGenerateinvoiceLink;
        System.out.println(GenrateInvoiceButton.size());
        if (GenrateInvoiceButton.size() >= 2) {
            // Use the second element if there are two
            AllGenerateinvoiceLink = GenrateInvoiceButton.get(2);
        } else {
            // Use the first element if there's only one
            AllGenerateinvoiceLink = GenrateInvoiceButton.get(0);
        }
        System.out.println(AllGenerateinvoiceLink.isDisplayed());
        AllGenerateinvoiceLink.sendKeys(Keys.ENTER);
        ConfirmButton.click();
        ConfirmButton.click();
        return this;
    }

    public OpportunityPage TOgeneratemultipleInvoice() {
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Test Zuci FInals");
        waitForSeconds(3);
        //System.out.println("Generate Invoice Button is Displayed--->"+GenrateInvoiceButton.isDisplayed());

        WebElement AllGenerateinvoiceLink;
        if (GenrateInvoiceButton.size() >= 2) {
            // Use the second element if there are two
            AllGenerateinvoiceLink = GenrateInvoiceButton.get(1);
        } else {
            // Use the first element if there's only one
            AllGenerateinvoiceLink = GenrateInvoiceButton.get(0);
        }

        AllGenerateinvoiceLink.click();
        DateCheckBox.click();
        waitForSeconds(2);
        ConfirmButton.click();
        MonthSelectBOX.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        MonthSelecting.click();
        ConfirmButton.click();
        ConfirmButton.click();
        ConfirmButton.click();
        return this;
    }

    public OpportunityPage EditTaxationField() {
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        TaxationEditInternational.sendKeys("Domestic");
        Domesticedit.click();
        return this;
    }

    public OpportunityPage EditWithinStateField() {
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        TaxationEditInternational.sendKeys("WithinState");
        WithinState.click();
        return this;
    }

    public OpportunityPage EditDomesticField() {
        waitUntilElementVisible(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        VerifyOpportunityPresent("Zomato");
        waitForSeconds(2);
        OpportunityEdit.click();
        TaxationEditInternational.sendKeys("Domestic");
        Domestic.click();
        return this;
    }


}

