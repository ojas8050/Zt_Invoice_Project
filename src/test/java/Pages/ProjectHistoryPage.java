package Pages;

import Utils.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectHistoryPage extends BasePage{
    public ProjectHistoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem' and @title='Invoices']")
    private WebElement InvoiceDropDown;
    @FindBy(xpath = "//*[@data-refid='recordId']")
    private WebElement AllInvoiceID;
    @FindBy(xpath = "//*[@role='tab' and @id='relatedListsTab__item']")
    private WebElement RelatedLink;
    @FindBy(xpath = "//slot[contains(text(),'InvItem-000')]")
    private WebElement InvItemsID;
    @FindBy(xpath = "//*[@class='windowViewMode-normal oneContent active lafPageHost']//*[@name='Edit']")
    private WebElement EditOption;
    @FindBy(xpath = "//*[@name='US_Call__c']")
    private WebElement UsCallField;
    @FindBy(xpath = "//*[@name='Night_Shift__c']")
    private WebElement NightShiftField;
    @FindBy(xpath = "//*[@name='PST_Shift__c']")
    private WebElement PSTShiftField;
    @FindBy(xpath = "//*[@name='Weekend__c']")
    private WebElement WeekendField;
    @FindBy(xpath = "//*[@name='SaveEdit' and text()='Save']")
    private WebElement SaveButton;
    @FindBy(xpath = "//button[@name='CancelEdit']")
    private WebElement CancelButton;

    public ProjectHistoryPage dislayedinprojecthistory() {
        System.out.println("InvoiceDropDown ---->" + InvoiceDropDown.isDisplayed());
        waitUntilElementDisplayed(InvoiceDropDown);
        InvoiceDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        Log.info("invoicedropdown page is displayed");
        AllInvoiceID.click();
        Log.info("invoiceId id clicked");
        waitForSeconds(2);
        waitUntilElementClickable(RelatedLink);
        RelatedLink.click();
        waitForSeconds(2);
        Log.info("Relatedlink is clicked");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", InvItemsID);
        waitForSeconds(2);
        Log.info("invitemid is clicked");
        EditOption.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        Log.info("editoption is clicked");
        UsCallField.clear();
        UsCallField.sendKeys("27");
        Log.info("UsCallField is filled");
        NightShiftField.clear();
        NightShiftField.sendKeys("3");
        Log.info("NightShiftField is filled");
        PSTShiftField.clear();
        PSTShiftField.sendKeys("7");
        Log.info("PSTShiftField is filled");
        WeekendField.clear();
        WeekendField.sendKeys("8");
        Log.info("WeekendField is filled");
        SaveButton.click();
        waitForSeconds(2);
        Log.info("SaveButton is clicked");
        return this;
    }

    public ProjectHistoryPage CancletEdit() {
        System.out.println("InvoiceDropDown ---->" + InvoiceDropDown.isDisplayed());
        waitUntilElementDisplayed(InvoiceDropDown);
        InvoiceDropDown.sendKeys(Keys.ENTER);
        waitForSeconds(2);
//        waitForSeconds(2);
        Log.info("invoicedropdown page is displayed");
        AllInvoiceID.click();
        waitForSeconds(2);
        Log.info("invoiceId id clicked");
        waitUntilElementClickable(RelatedLink);
        RelatedLink.click();
        waitForSeconds(2);
        Log.info("Relatedlink is clicked");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", InvItemsID);
        waitForSeconds(2);
        Log.info("invitemid is clicked");
        EditOption.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        Log.info("editoption is clicked");
        UsCallField.clear();
        UsCallField.sendKeys("20");
        Log.info("UsCallField is filled");
        NightShiftField.clear();
        NightShiftField.sendKeys("23");
        Log.info("NightShiftField is filled");
        PSTShiftField.clear();
        PSTShiftField.sendKeys("4");
        Log.info("PSTShiftField is filled");
        WeekendField.clear();
        WeekendField.sendKeys("2");
        Log.info("WeekendField is filled");
        CancelButton.click();
        waitForSeconds(2);
        Log.info("CancelButton is clicked");
        return this;
    }
}

