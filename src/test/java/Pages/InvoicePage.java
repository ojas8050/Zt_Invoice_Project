package Pages;

import Utils.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.util.List;

   public class InvoicePage extends BasePage{
    public InvoicePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Opportunities']")
    private WebElement OpportunityDropDown;
   @FindBy(xpath = "//th[@scope='row']//*[@data-refid='recordId' and @target='_blank']")
   private List<WebElement> AllOpportunity;
   @FindBy(xpath = "//*[@name='Opportunity.Generate_Invoice' and @part='button']")
   private WebElement GenerateInvoiceButton;
   @FindBy(xpath = "//*[contains(text(),'Invoice will be generated for  ')]")
   public static WebElement InvoicePopup;
   @FindBy(xpath = "//button[normalize-space()='Confirm']")
   private WebElement ConfirmButton;
   @FindBy(xpath = "//*[@class='slds-button slds-button_brand' and @kx-scope='button-brand']")
   private WebElement FinishButton;
   @FindBy(xpath = "//*[@class='slds-input' and @name='Invoice_Date']")
   private WebElement DateButton;
   @FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem' and @title='Invoices']")
   private WebElement InvoiceDropDown;
   @FindBy(xpath = "//a[@title='Z/000354']")
   private WebElement AllInvoiceOption;
   @FindBy(xpath = "//button[normalize-space()='Invoice PDF (International)']")
   private WebElement InvoicePDF;
   @FindBy(xpath = "//button[normalize-space()='Invoice PDF (International)']")
   private WebElement InvoicePdfInternational;
   @FindBy(id="download")
   private WebElement DownloadButton;
   @FindBy(xpath = "//*[@class='windowViewMode-normal oneContent active lafPageHost']//*[@name='Edit']")
   private WebElement EditButton;
   @FindBy(xpath = "(//*[@aria-label='Invoice Type'])[1]")
   private WebElement InvoiceTpe;
   @FindBy(xpath = "//*[@data-value='Name based']")
   private WebElement SelectNameBased;
   @FindBy(xpath = "//*[@name='SaveEdit' and @part='button']")
   private WebElement Savebutton;


    public InvoicePage SearchOpportunityName(String OpportunityName) {
        Log.info("checking" + OpportunityName + " is present in the account list");
        waitForSeconds(2);
        for (WebElement Account : AllOpportunity) {
            String currentAccName = Account.getText();
            if (currentAccName.equalsIgnoreCase(OpportunityName)) {
                Account.click();
                Log.info("User Found");
            }
        }
        return this;
    }

    public InvoicePage GenerateInvoiceThroughOpportunity(String OpportunityName, String date) {
        System.out.println("Opportunity Dropdown---->" + OpportunityDropDown.isDisplayed());//true
        waitUntilElementDisplayed(OpportunityDropDown);
        OpportunityDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        SearchOpportunityName(OpportunityName);
        System.out.println("GenerateInvoiceButton....>"+GenerateInvoiceButton.isDisplayed());
        GenerateInvoiceButton.click();
        ConfirmButton.click();
        DateButton.sendKeys(date);
        FinishButton.sendKeys(Keys.ENTER);
        waitForSeconds(3);
        System.out.println("InvoiceDropDown ---->" + InvoiceDropDown.isDisplayed());//true
        waitUntilElementDisplayed(InvoiceDropDown);
        InvoiceDropDown.sendKeys(Keys.ENTER);
        AllInvoiceOption.click();
        InvoicePDF.click();
        waitForSeconds(5);
        Actions actions = new Actions(driver);
        actions.moveToElement(DownloadButton).sendKeys(Keys.ENTER);
        waitForSeconds(3);
       return this;
      }

    public InvoicePage GenerateInvoicePage(){
        System.out.println("InvoiceDropDown ---->" + InvoiceDropDown.isDisplayed());//true
        waitUntilElementDisplayed(InvoiceDropDown);
        InvoiceDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        AllInvoiceOption.click();
        EditButton.click();
        waitForSeconds(3);
        InvoiceTpe.sendKeys(Keys.ENTER);
        SelectNameBased.click();
        Savebutton.click();
        InvoicePdfInternational.click();
        return this;
    }
}
