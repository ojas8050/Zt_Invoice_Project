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
        opportunityPage.EditRecordByMandatoryDetails("Swiggy","10m",SetExpenseForNightShift,SetExpenseForPST_Shift,SetExpenseForUS_CallShift,SetPO_Number,SetHSN_SAC_Number);
        Assert.assertEquals(NightShiftExpenseFromDetails.getText(),"$" + SetExpenseForNightShift + ".00");
        Assert.assertEquals(PST_ShiftExpenseFromDetails.getText(),"$" + SetExpenseForPST_Shift + ".00");
        Assert.assertEquals(US_CallExpenseFromDetails.getText(),"$" + SetExpenseForUS_CallShift + ".00");
    }


}