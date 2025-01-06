package tests;

import Pages.InvoicePage;
import Utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.InvoicePage.GenerateInvoicePage;


public class InvoiceTest extends BaseTest {

    @Test(priority = 1,description = "(ZT_032)creating Account Entering Valid Data and clicking On save",dataProvider = "GenerateInvoice", dataProviderClass = InvoicePage.class)
    public void CreateInvoicepage(String OpportunityName,String date) {
        Log.info("Initializing test");
        super.invoicePage.GenerateInvoiceThroughOpportunity(OpportunityName,date);
        Assert.assertEquals(GenerateInvoicePage.getText(),"Generate Invoice","Failed to load Generate Invoice Page");
    }

    @Test(priority = 2,description = "(ZT_036)creating Account Entering Valid Data and clicking On save")
    public void VerifyEmpViewInInvoiceOject(){
        super.invoicePage.GenerateInvoicePage();
    }
}
