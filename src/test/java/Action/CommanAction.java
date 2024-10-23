package Action;

import Pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommanAction  extends BasePage {


    public CommanAction(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//*[@title='Accounts']")
    private WebElement Account;
    public void  ClickOnAccount(){
        waitUntilElementDisplayed(Account);
        Account.isDisplayed();
        System.out.println("print -->"+ Account.isDisplayed());
        Account.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath="//*[@title='Testing']")
    private WebElement testing;
    public void  ClickOnDiseny(){
        waitUntilElementDisplayed(testing);
        testing.isDisplayed();
        System.out.println("print -->"+  testing.isDisplayed());
        testing.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath = "//*[@name='Edit']")
    private WebElement Editbutton0;
    public void ClickOnEditButton0(){
        waitUntilElementDisplayed(Editbutton0);
        Editbutton0.isDisplayed();
        System.out.println("print -->"+  Editbutton0.isDisplayed());
Editbutton0.click();

    }
    @FindBy(xpath ="//*[@title='Opportunities' and @tabindex='0']")
    private WebElement Opportunities;
    public void  ClickOnOpportunities(){
        waitUntilElementDisplayed(Opportunities);
        Opportunities.isDisplayed();
        Opportunities.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath = "//*[@title='ABC News Lite']")
    private WebElement ABClink;
    public  void ClivkonABClink(){
        waitUntilElementDisplayed(ABClink);
        ABClink.isDisplayed();
        ABClink.click();
    }
    @FindBy(xpath = "//*[@name='Edit']")
    private WebElement editbutton;
    public void clickoneditbutton1(){
        waitUntilElementDisplayed(editbutton);
        editbutton.isDisplayed();
        editbutton.click();
    }
    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem' and @title='Employees']")
    public WebElement EmployeesDropDown;
    public void ClickOnEmployees() throws InterruptedException {
        waitUntilElementDisplayed(EmployeesDropDown);
        EmployeesDropDown.isDisplayed();
        EmployeesDropDown.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath = "//*[@title='Ojas']")
    private WebElement ojaslink;
    public void clickonojaslink(){
        waitUntilElementDisplayed(ojaslink);
        ojaslink.isDisplayed();
        ojaslink.click();
    }
    @FindBy(xpath = "//*[@name='Edit']")
    private WebElement editbutton2;
    public void clickoneditbutton2(){
        waitUntilElementDisplayed(editbutton2);
        editbutton2.isDisplayed();
        editbutton2.click();
    }

    @FindBy(xpath = "//*[@title='Invoices' and @tabindex='0']")
    private WebElement Invoice;    public void ClickOnInvoice() {
        waitUntilElementDisplayed(Invoice);
        Invoice.isDisplayed();
        Invoice.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath = "//*[@title='Projects History' and @tabindex='0']")
    private WebElement ProjectHistory;
    public void ClickonProjectHistory()
    {
        waitUntilElementDisplayed(ProjectHistory);
        ProjectHistory.isDisplayed();
        ProjectHistory.sendKeys(Keys.ENTER);
    }
}

