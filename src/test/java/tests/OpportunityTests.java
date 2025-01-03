package tests;

import Pages.OpportunityPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Pages.OpportunityPage.*;

public class OpportunityTests extends BaseTest {

    @Test(description = "Verify that a user can create an Opportunity record by entering all details.", priority = 1)
    public void CreateNewOpportunityWithAllDetails(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.CreateRecordByAllDetails("Zomato","10m","June");
    }

    @Test(description = "Verify User is able to create Opportunity record in Opportunity by entering only mandatory details",priority = 2)
    public void CreateNewOpportunityWithMandatoryDetails(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.CreateRecordByMandatoryDetails("Swiggy","10m","July");
    }

    @Test(description = "Verify that a user can edit an Opportunity record in Salesforce once after opportunity is created.",priority = 3)
    public void EditOpportunityWithDetails(){
        String nightShiftExpense = "23";
        String pstShiftExpense = "25";
        String usCallExpense = "25";
        String MobileNumber = "233445533";
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.EditRecordByDetails(nightShiftExpense,pstShiftExpense,usCallExpense,MobileNumber);
        Assert.assertEquals(NightShiftExpenseFromDetails.getText(),"$" + nightShiftExpense + ".00");
        Assert.assertEquals(PST_ShiftExpenseFromDetails.getText(),"$" + pstShiftExpense + ".00");
        Assert.assertEquals(US_CallExpenseFromDetails.getText(),"$" + usCallExpense + ".00");
    }

    @Test(description = "Update Opportunity record only for mandatory fields",priority = 4)
    public void EditOpportunityWithMandatoryDetails(){
        String SetExpenseForNightShift="12";
        String SetExpenseForPST_Shift="25";
        String SetExpenseForUS_CallShift="31";
        String SetHSN_SAC_Number="890989";
        String SetPO_Number="56745612";
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.EditRecordByMandatoryDetails("Zomato","10m",SetExpenseForNightShift,SetExpenseForPST_Shift,SetExpenseForUS_CallShift,SetPO_Number,SetHSN_SAC_Number);
        Assert.assertEquals(NightShiftExpenseFromDetails.getText(),"$" + SetExpenseForNightShift + ".00");
        Assert.assertEquals(PST_ShiftExpenseFromDetails.getText(),"$" + SetExpenseForPST_Shift + ".00");
        Assert.assertEquals(US_CallExpenseFromDetails.getText(),"$" + SetExpenseForUS_CallShift + ".00");
    }

    @Test(description = "View the Employees not added to the opportunity",priority = 5)
    public void EmployeePresentInOpportunity(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.EmployeesPresentToOpp();
    }

    @Test(description = "Set Expenses for Night Shift",priority = 6)
    public void SetExpenseForNightShiftFromOpportunity(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.SetExpenseNightShift("2k");
    }

    @Test(description = "Set Expenses for PST shift.",priority = 7)
    public void SetExpenseForPSTShiftFromOpportunity(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.SetExpensePSTShift("2k");
    }

    @Test(description = "Set Expenses for US call",priority = 8)
    public void SetExpenseForUSCallFromOpportunity(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.SetExpenseUSCall("2k");
    }

    @Test(description = "Add Employees in opportunity record",priority = 9)
    public void AddEmployeesToTheOpportunity(){
        OpportunityPage opportunityPage=new OpportunityPage(driver);
        opportunityPage.AddEmpToOpp();
    }

   @Test(description = "View the Present Cycle Expenses field in opportunity",priority = 10)
    public void ViewPresentCycleExpense(){
       OpportunityPage opportunityPage=new OpportunityPage(driver);
       opportunityPage.VerifyThePresentCycleExpenseIsPresent();
   }

   @Test(description = "View the Budget Remaining from the Total Project Cost.",priority = 11)
    public void ViewBudgetRemaining(){
       OpportunityPage opportunityPage=new OpportunityPage(driver);
       opportunityPage.ViewBudgetRemaining();
   }

    @Test(description = "Verify that Salary for working days is calculated properly upon saving employee allowance data",priority = 12)
    public void Salaryforworkingdaysiscalculatedproperly() {
        OpportunityPage opportunityPage = new OpportunityPage(driver);
        opportunityPage.VerifythatSalaryforworkingdaysiscalculatedproperly();
    }

    @Test(description = "Generate invoice by clicking on Generate Invoice button ",priority = 13)
    public void GenratingInvoice() {
        OpportunityPage opportunityPage = new OpportunityPage(driver);
        opportunityPage.TOgenerateInvoice();
    }

    @Test(description = "Generate Multiple Invoice for one Opportunity",priority = 14)
    public void GenrateMultiplrInvoice() {
        OpportunityPage opportunityPage = new OpportunityPage(driver);
        opportunityPage.TOgeneratemultipleInvoice();
    }

    @Test(description = "Edit Taxtion field ", priority = 15)
    public void EditTaxationFieldTest() {
        OpportunityPage opportunityPage = new OpportunityPage(driver);
        opportunityPage.EditTaxationField();
    }

    @Test(description = "Edit WithinStateoption", priority = 16)
    public void EditWithinStateoption() {
        OpportunityPage opportunityPage = new OpportunityPage(driver);
        opportunityPage.EditWithinStateField();
    }

    @Test(description = "Edit Domesticoption", priority = 17)
    public void EditDomesticoption() {
        OpportunityPage opportunityPage = new OpportunityPage(driver);
        opportunityPage.EditDomesticField();
    }

}
