package tests;

import Pages.InvoiceLineItemsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.AccountPage.Popup;
import static Pages.InvoiceLineItemsPage.EmployeeNameFromRelatedLink;

   public class InvoiceLineItemsTest extends BaseTest{

    @Test(priority = 1,description = "(ZT_038)appropriate permissions to generate and view InvoiceLineItem")
    public  void CreateInvoiceItempage() {
        InvoiceLineItemsPage invoiceLineItemsPage=new InvoiceLineItemsPage(driver);
        invoiceLineItemsPage.GenerateInvoiceLineItem();
    }

    @Test(priority = 4,description = "(ZT_038)appropriate permissions to generate and view InvoiceLineItem")
    public void UserCanEditInInvoiceLineItemsTest(){
        InvoiceLineItemsPage invoiceLineItemsPage=new InvoiceLineItemsPage(driver);
        invoiceLineItemsPage.NewInvoiceLineItemByEnteringAllDetails();
    }


      @Test(priority = 2,description = "Verify that a user is able to edit the created InvoiceLineItem ")
      public void perfoemSaveandNewactiononInvoiceLineItem()    {
          InvoiceLineItemsPage invoiceLineItemsPage=new InvoiceLineItemsPage(driver);
          invoiceLineItemsPage.VerifythatuserisabletoeditcreatedInvoiceLineItem();
    }

    @Test(priority = 3,description = "Verify that a user is able to cancle the edit InvoiceLineItem")
    public void performCancleactionOnInvoiceLine(){
        InvoiceLineItemsPage invoiceLineItemsPage=new InvoiceLineItemsPage(driver);
        invoiceLineItemsPage.verifyuserisabletocanclethecreationofinvoice();
    }
}
