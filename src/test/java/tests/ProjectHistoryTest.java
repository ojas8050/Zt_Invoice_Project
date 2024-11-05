package tests;

import Pages.BasePage;
import Pages.ProjectHistoryPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProjectHistoryTest extends BaseTest {
    @Test(priority = 1, description = "verifying that updates are displayed in project history")
    public void UpdateInvoice() {
        ProjectHistoryPage ProjectPage = new ProjectHistoryPage(driver);
        ProjectPage.dislayedinprojecthistory();
    }

    @Test(priority = 2, description = "verifying that user is able to cancle the edit ")
    public void CancletheEdit() {
        ProjectHistoryPage ProjectPage = new ProjectHistoryPage(driver);
        ProjectPage.CancletEdit();
    }
}


