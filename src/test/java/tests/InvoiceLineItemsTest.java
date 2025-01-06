package tests;

import Pages.InvoiceLineItemsPage;
import org.testng.annotations.Test;

public class InvoiceLineItemsTest extends BaseTest{

    @Test(priority = 1,description = "(ZT_038)appropriate permissions to generate and view InvoiceLineItem")
    public  void CreateInvoiceItempage() {
        super.invoiceLineItemsPage.GenerateInvoiceLineItem();
    }


    @Test(priority = 2,description = "(ZT_038)appropriate permissions to generate and view InvoiceLineItem",dataProvider = "InvoiceLine",dataProviderClass = InvoiceLineItemsPage.class)
    public void UserCanEditInInvoiceLineItemsTest(String name,String NightShiftText,String PSTText,String WeekendText,String WorkingDaysText){
        super.invoiceLineItemsPage.NewInvoiceLineItemByEnteringAllDetails(name,NightShiftText,PSTText,WeekendText,WorkingDaysText);
    }


      @Test(priority = 3,description = "Verify that a user is able to edit the created InvoiceLineItem ",dataProvider="InvoiceLineItem",dataProviderClass = InvoiceLineItemsPage.class)
      public void perfoemSaveandNewactiononInvoiceLineItem(String name,String NightShiftText,String PSTText,String WeekendText,String WorkingDaysText,String UScall)    {
          super.invoiceLineItemsPage.VerifythatuserisabletoeditcreatedInvoiceLineItem(name,NightShiftText,PSTText,WeekendText,WorkingDaysText,UScall);
    }

    @Test(priority = 4,description = "Verify that a user is able to cancle the edit InvoiceLineItem",dataProvider="InvoiceLineItem",dataProviderClass = InvoiceLineItemsPage.class)
    public void performCancleactionOnInvoiceLine(String name,String NightShiftText,String PSTText,String WeekendText,String WorkingDaysText,String UScall){
       super.invoiceLineItemsPage.verifyuserisabletocanclethecreationofinvoice(name,NightShiftText,PSTText,WeekendText,WorkingDaysText,UScall);
    }
}
