package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

    public class InvoiceLineItemsPage extends BasePage {
        public InvoiceLineItemsPage(WebDriver driver)
        {
            super(driver);
        }

        @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Invoices']")
        private WebElement InvoiceDropDown;
        @FindBy(xpath = "//*[@title='Z/000354']")
        private WebElement AllInvoiceOption;
        @FindBy(xpath = "//button[normalize-space()='Invoice PDF (International)']")
        private WebElement InvoicePDF;
        @FindBy(xpath = "//*[@role='tab' and @id='relatedListsTab__item']")
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
            System.out.println("InvoiceDropDown ---->" + InvoiceDropDown.isDisplayed());//true
            waitUntilElementDisplayed(InvoiceDropDown);
            InvoiceDropDown.sendKeys(Keys.ENTER);
            AllInvoiceOption.click();
            RelatedLink.click();

            List<WebElement> employeeNames = driver.findElements(By.cssSelector(".employee-name")); // Update selector as needed
            if (employeeNames.isEmpty()) {
                System.out.println("No employee names are present.");
            } else {
                System.out.println("Employee names found:");
                for (WebElement employee : employeeNames) {
                    System.out.println(" - " + employee.getText());
                }
            }
            return this;
        }

        public InvoiceLineItemsPage NewInvoiceLineItemByEnteringAllDetails() {
            System.out.println("NewInvoiceLineItemByEnteringAllDetails ---->" + InvoiceDropDown.isDisplayed());
            waitUntilElementDisplayed(InvoiceDropDown);
            InvoiceDropDown.sendKeys(Keys.ENTER);
            System.out.println("AllInvoiceOption is displayed"+AllInvoiceOption.isDisplayed());
            waitForSeconds(2);
            AllInvoiceOption.click();
            RelatedLink.click();
            waitForSeconds(2);
            newButton.click();
            waitForSeconds(2);
            SearchEmployee.sendKeys(Keys.ENTER);
            SearchEmployee.sendKeys("banu");
            waitForSeconds(1);
            SearchEmployee.sendKeys(Keys.DOWN);
            SearchEmployee.sendKeys(Keys.DOWN);
            SearchEmployee.sendKeys(Keys.ENTER);
            NightShiftTextfield.sendKeys("2");
            PSTTextfield.sendKeys("3");
            WeekendTextField.sendKeys("4");
            WorkingDaysTextfield.sendKeys("5");
            saveButton.click();
            return this;
        }

        public InvoiceLineItemsPage VerifythatuserisabletoeditcreatedInvoiceLineItem() {
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
            SearchEmployee.sendKeys("Fouziya");
            WorkingDaysTextfield.sendKeys("20");
            UScallField.sendKeys("20");
            NightShiftTextfield.sendKeys("45");
            PSTTextfield.sendKeys("66");
            WeekendTextField.sendKeys("23");
            SaveAndNewButton.click();
            return this;
        }

        public InvoiceLineItemsPage verifyuserisabletocanclethecreationofinvoice () {
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
            SearchEmployee.sendKeys("Fouziya");
            WorkingDaysTextfield.sendKeys("20");
            UScallField.sendKeys("20");
            NightShiftTextfield.sendKeys("45");
            PSTTextfield.sendKeys("66");
            WeekendTextField.sendKeys("23");
            CancelButton.click();
            waitForSeconds(2);
            return this;
                 }
             }