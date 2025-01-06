package tests;

import Pages.OpportunityPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Pages.OpportunityPage.*;

import Pages.OpportunityPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Pages.OpportunityPage.*;

public class OpportunityTests extends BaseTest {

    @Test(priority = 1,description = "Verify that a user can create an Opportunity record by entering all details.", dataProvider = "OpportunityPageDetails",dataProviderClass = OpportunityPage.class)
    public void CreateNewOpportunityWithAllDetails(String OppName,String Amount,String MonthName,String CloseDate,String DescriptionText,String PONumberText,
                                                   String HSNTextfield, String NextStepText, String NightShiftExpense, String PSTTimeShift, String  UScallTextField, String PresentCycleExpense, String BudgetConsumed, String  CompanyName,
                                                   String GSTTextfield, String PANNoText, String  EmailText, String AddressLineone, String  AddressLineTwo, String PhoneNoText, String AccountHolderName, String BankNameText, String SwiftCodeText, String AccountNumberText, String BankAddressText, String  GSTLUTARNText){
        super.opportunityPage.CreateRecordByAllDetails(OppName,Amount,MonthName,CloseDate,DescriptionText,PONumberText,
                HSNTextfield,NextStepText, NightShiftExpense,PSTTimeShift,UScallTextField,PresentCycleExpense,BudgetConsumed,CompanyName,GSTTextfield,
                PANNoText, EmailText,AddressLineone,AddressLineTwo,PhoneNoText,AccountHolderName,BankNameText,SwiftCodeText,AccountNumberText,BankAddressText,GSTLUTARNText);
    }

    @Test(priority = 2,description = "Verify User is able to create Opportunity record in Opportunity by entering only mandatory details",dataProvider = "OpportunityMandatoryDetails",dataProviderClass = OpportunityPage.class)
    public void CreateNewOpportunityWithMandatoryDetails(String OppName,String Amount,String MonthName, String CloseDate,String PONumberText,String HSNTextField, String NightShiftExpense,String PSTTimeShift, String USCallText ){
        super.opportunityPage.CreateRecordByMandatoryDetails(OppName,Amount,MonthName,CloseDate,PONumberText,HSNTextField,NightShiftExpense,PSTTimeShift,USCallText);
    }

    @Test(priority = 3,description = "Verify that a user can edit an Opportunity record in Salesforce once after opportunity is created.",dataProvider = "GetEditOppName",dataProviderClass = OpportunityPage.class)
    public void EditOpportunityWithDetails(String OppName,String SetNightShiftPrice, String SetPSTShiftPrice, String SetUS_CallPrice, String SetMobileNo){
        super.opportunityPage.EditRecordByDetails(OppName,SetNightShiftPrice,SetPSTShiftPrice,SetUS_CallPrice,SetMobileNo);
        Assert.assertEquals(NightShiftExpenseFromDetails.getText(),"$" + SetNightShiftPrice + ".00");
        Assert.assertEquals(PST_ShiftExpenseFromDetails.getText(),"$" + SetPSTShiftPrice + ".00");
        Assert.assertEquals(US_CallExpenseFromDetails.getText(),"$" + SetUS_CallPrice + ".00");
    }

    @Test(priority = 4,description = "Update Opportunity record only for mandatory fields",dataProvider = "GetEditRecordByMdetails",dataProviderClass = OpportunityPage.class)
    public void EditOpportunityWithMandatoryDetails(String OppName,String Amount,String CloseDate,String NightShift,String PST_Shift,String US_Call,String PO_Num,String HSN_SAC){
        super.opportunityPage.EditRecordByMandatoryDetails(OppName,Amount,CloseDate,NightShift,PST_Shift,US_Call,PO_Num,HSN_SAC);
        Assert.assertEquals(NightShiftExpenseFromDetails.getText(),"$" + NightShift + ".00");
        Assert.assertEquals(PST_ShiftExpenseFromDetails.getText(),"$" + PST_Shift + ".00");
        Assert.assertEquals(US_CallExpenseFromDetails.getText(),"$" + US_Call + ".00");
    }

    @Test(priority = 6,description = "Set Expenses for Night Shift",dataProvider = "GetOppName",dataProviderClass = OpportunityPage.class)
    public void SetExpenseForNightShiftFromOpportunity(String Oppname,String SetExpenseNightShift){
        super.opportunityPage.SetExpenseNightShift(Oppname,SetExpenseNightShift);
    }

    @Test(priority = 7,description = "Set Expenses for PST shift.",dataProvider = "GetOppName",dataProviderClass = OpportunityPage.class)
    public void SetExpenseForPSTShiftFromOpportunity(String Oppname,String SetExpensePST){
        super.opportunityPage.SetExpensePSTShift(Oppname,SetExpensePST);
    }

    @Test(priority = 8,description = "Set Expenses for US call",dataProvider = "GetOppName",dataProviderClass = OpportunityPage.class)
    public void SetExpenseForUSCallFromOpportunity(String Oppname, String  SetExpenseUSCall){
        opportunityPage.SetExpenseUSCall(Oppname,SetExpenseUSCall);
    }

    @Test(priority = 9,description = "Add Employees in opportunity record",dataProvider = "AllOppDetails",dataProviderClass = OpportunityPage.class)
    public void AddEmployeesToTheOpportunity(String Oppname){
        super.opportunityPage.AddEmpToOpp(Oppname);
    }

    @Test(priority = 10, description = "View the Present Cycle Expenses field in opportunity",dataProvider = "AllOppDetails",dataProviderClass = OpportunityPage.class)
    public void ViewPresentCycleExpense(String Oppname){
        super.opportunityPage.VerifyThePresentCycleExpenseIsPresent(Oppname);
    }

    @Test(priority = 11,description = "View the Budget Remaining from the Total Project Cost.",dataProvider = "AllOppDetails",dataProviderClass = OpportunityPage.class)
    public void ViewBudgetRemaining(String Oppname){
        opportunityPage.ViewBudgetRemaining(Oppname);
    }

    @Test(description = "Verify that Salary for working days is calculated properly upon saving employee allowance data",priority = 12)
    public void Salaryforworkingdaysiscalculatedproperly() {
        super.opportunityPage.VerifyThatSalaryForWorkingDaysIsCalculatedProperly();
    }

    @Test(priority = 13,description = "Generate invoice by clicking on Generate Invoice button ")
    public void GeneratingInvoice() {
        super.opportunityPage.ToGenerateInvoice();
    }

    @Test(description = "Generate Multiple Invoice for one Opportunity",priority = 14)
    public void GenerateMultipleInvoice() {
        super.opportunityPage.ToGenerateMultipleInvoice();
    }

    @Test(priority = 15,description = "Edit Taxtion field ")
    public void EditTaxationFieldTest() {
        super.opportunityPage.EditTaxationField();
    }

    @Test(priority = 16,description = "Edit WithinStateoption")
    public void EditWithinStateoption() {
        super.opportunityPage.EditWithinStateField();
    }

    @Test(priority = 17,description = "Edit Domesticoption")
    public void EditDomesticoption() {
        super.opportunityPage.EditDomesticField();
    }
    @Test(priority = 18,description = "View the Employees not added to the opportunity")
    public void EmployeePresentInOpportunity(){
        super.opportunityPage.EmployeesPresentToOpp();
    }

}
