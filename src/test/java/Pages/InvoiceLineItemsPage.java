package Pages;

import Utils.Log;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class InvoiceLineItemsPage extends BasePage {

        public InvoiceLineItemsPage(){
            Log.info("Start InvoiceLineItem");
        }
        public InvoiceLineItemsPage(WebDriver driver)
        {
            super(driver);
        }
        @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem' and @title='Invoices']")
        private WebElement InvoiceDropDown;
        @FindBy(xpath = "//*[@title='Z/000443']")
        private WebElement AllInvoiceOption;
        @FindBy(xpath = "//button[normalize-space()='Invoice PDF (International)']")
        private WebElement InvoicePDF;
        @FindBy(xpath = "//*[@data-label='Related' and @class='slds-tabs_default__link']")
        private WebElement RelatedLink;
        @FindBy(xpath = "//slot[@lwc-47ngqe6rvah and text()='banu']")
        public static WebElement EmployeeNameFromRelatedLink;
        @FindBy(xpath = "//*[@kx-scope='button-neutral' and @name='New']")
        private WebElement newButton;
        @FindBy(xpath = "//*[@placeholder='Search Employees...']")
        private WebElement SearchEmployee;
        @FindBy(xpath = "//*[@class='slds-input' and @name='Night_Shift__c']")
        private WebElement NightShiftTextfield;
        @FindBy(xpath = "//*[@class='slds-input' and @name='PST_Shift__c']")
        private WebElement PSTTextfield;
        @FindBy(xpath = "//*[@class='slds-input' and @name='Weekend__c']")
        private WebElement WeekendTextField;
        @FindBy(xpath = "//*[@class='slds-input' and @name='No_Working_Days__c']")
        private WebElement WorkingDaysTextfield;
        @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']")
        private WebElement saveButton;
        @FindBy(xpath = "//*[@name='SaveAndNew']")
        private WebElement SaveAndNewButton;
        @FindBy(xpath = "//button[@name='CancelEdit']")
        private WebElement CancelButton;
        @FindBy(xpath = "//*[@name='US_Call__c']")
        private WebElement UScallField;
        @FindBy(linkText = "Related")
        private WebElement newrelatedButton;
        @FindBy(xpath = "//*[@class='windowViewMode-normal oneContent active lafPageHost']//*[@name='Edit']")
        private WebElement UserEdit;


        public InvoiceLineItemsPage GenerateInvoiceLineItem() {
            System.out.println("NewInvoiceLineItemByEnteringAllDetails ---->" + InvoiceDropDown.isDisplayed());
            waitUntilElementDisplayed(InvoiceDropDown);
            InvoiceDropDown.sendKeys(Keys.ENTER);
            waitUntilElementDisplayed(AllInvoiceOption);
            AllInvoiceOption.click();
            waitUntilElementDisplayed(RelatedLink);
            RelatedLink.click();
            waitForSeconds(3);
            return this;
        }

        @DataProvider(name = "InvoiceLine")
        public Object[][] getAllInvoiceLine() {
            return new Object[][] {
                    {"banu", "2", "3", "4", "5"}
            };
        }
        public InvoiceLineItemsPage NewInvoiceLineItemByEnteringAllDetails(String name,String NightShiftText,String PSTText,String WeekendText,String WorkingDaysText) {
            System.out.println("NewInvoiceLineItemByEnteringAllDetails ---->" + InvoiceDropDown.isDisplayed());
            waitUntilElementDisplayed(InvoiceDropDown);
            InvoiceDropDown.sendKeys(Keys.ENTER);
            System.out.println("AllInvoiceOption is displayed"+AllInvoiceOption.isDisplayed());
            waitForSeconds(2);
            AllInvoiceOption.click();
            waitForSeconds(2);
            RelatedLink.click();
            waitForSeconds(2);
            newButton.click();
            waitForSeconds(2);
            SearchEmployee.sendKeys(Keys.ENTER);
            SearchEmployee.sendKeys(name);
            waitForSeconds(1);
            SearchEmployee.sendKeys(Keys.DOWN);
            SearchEmployee.sendKeys(Keys.DOWN);
            SearchEmployee.sendKeys(Keys.ENTER);
            NightShiftTextfield.sendKeys(NightShiftText);
            PSTTextfield.sendKeys(PSTText);
            WeekendTextField.sendKeys(WeekendText);
            WorkingDaysTextfield.sendKeys(WorkingDaysText);
            saveButton.click();
            return this;
        }


        @DataProvider(name = "InvoiceLineItem")
        public Object[][] getAllInvoice() {
            return new Object[][] {
                    {"Fouziya", "20", "20", "45", "66","23"}
            };
        }
        public InvoiceLineItemsPage VerifythatuserisabletoeditcreatedInvoiceLineItem(String name,String NightShiftText,String PSTText,String WeekendText,String WorkingDaysText,String UScall) {
            System.out.println("Account Dropdown---->" + InvoiceDropDown.isDisplayed());
            waitUntilElementDisplayed(InvoiceDropDown);
            InvoiceDropDown.sendKeys(Keys.ENTER);
            waitForSeconds(2);
            waitForSeconds(2);
            AllInvoiceOption.click();
            waitForSeconds(2);
            waitUntilElementClickable(RelatedLink);
            RelatedLink.click();
            waitForSeconds(2);
            newButton.click();
            SearchEmployee.click();
            SearchEmployee.sendKeys(name);
            NightShiftTextfield.sendKeys(NightShiftText);
            PSTTextfield.sendKeys(PSTText);
            WeekendTextField.sendKeys(WeekendText);
            WorkingDaysTextfield.sendKeys(WorkingDaysText);
            UScallField.sendKeys(UScall);
            SaveAndNewButton.click();
            waitForSeconds(3);
            return this;
        }

        public InvoiceLineItemsPage verifyuserisabletocanclethecreationofinvoice (String name,String NightShiftText,String PSTText,String WeekendText,String WorkingDaysText,String UScall) {
            System.out.println("Account Dropdown---->" + InvoiceDropDown.isDisplayed());
            waitUntilElementDisplayed(InvoiceDropDown);
            InvoiceDropDown.sendKeys(Keys.ENTER);
            waitForSeconds(3);
            waitUntilElementDisplayed(AllInvoiceOption);
            AllInvoiceOption.sendKeys(Keys.ENTER);
            AllInvoiceOption.sendKeys(Keys.ENTER);
            Log.info("clicked on AllinvoiceOpton");
            //Actions actions= new Actions(driver).moveToElement(RelatedLink).sendKeys(Keys.ENTER);
            RelatedLink.sendKeys(Keys.ENTER);
            waitForSeconds(2);
            waitUntilElementDisplayed(newButton);
            newButton.click();
            SearchEmployee.click();
            SearchEmployee.sendKeys(name);
            NightShiftTextfield.sendKeys(NightShiftText);
            PSTTextfield.sendKeys(PSTText);
            WeekendTextField.sendKeys(WeekendText);
            WorkingDaysTextfield.sendKeys(WorkingDaysText);
            UScallField.sendKeys(UScall);
            CancelButton.click();
            return this;
                 }
             }