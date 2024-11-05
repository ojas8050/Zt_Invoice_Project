package tests;

import Pages.InvoicePage;
import org.testng.annotations.Test;


   public class InvoiceTest extends BaseTest {

       @Test(priority = 1,description = "(ZT_032)creating Account Entering Valid Data and clicking On save")
        public  void CreateInvoicepage() {
        InvoicePage invoicePage=new InvoicePage(driver);
        invoicePage.GenerateInvoiceThroughOpportunity("Salesforce","04-Oct-2029");
       }

       @Test(priority = 2,description = "(ZT_036)creating Account Entering Valid Data and clicking On save")
       public void VerifyEmpViewInInvoiceOject(){
       InvoicePage invoicePage=new InvoicePage(driver);
       invoicePage.GenerateInvoicePage();
   }
   }
