package Action;

import Enums.EmployeeConstants;
import Pages.CommonPage;
import Pages.EmployeePage;
import org.openqa.selenium.WebDriver;

public class EmployeeAction {
    private WebDriver driver;
    private EmployeePage employeePage;
    private CommonPage commonPage;

    public EmployeeAction(WebDriver driver) {
        this.driver=driver;
        employeePage=new EmployeePage(driver);
        commonPage=new CommonPage(driver);
    }

    public EmployeeAction VerfiyEmployeeCanEditEmpIDandEmail() throws InterruptedException {
            commonPage.ClickOnEmployees();
            employeePage.VerifyUserPresent(EmployeeConstants.EmployeeOjasCredEnum.User.getValue())
                    .ClickOnEditButton()
                    .EnterEmpID(EmployeeConstants.EmployeeOjasCredEnum.ID.getValue())
                    .EnterEmpEmail(EmployeeConstants.EmployeeOjasCredEnum.Email.getValue())
                    .ClickOnSave();
            return this;
    }

    public EmployeeAction VerifyEditedObject(){
            employeePage.VerifyEmpID()
                    .VerifyEmpEmail();
            return this;
    }
}
