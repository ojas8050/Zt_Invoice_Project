package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
    private WebDriver driver;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem' and @title='Employees']")
    public WebElement EmployeesDropDown;

    public void ClickOnEmployees() throws InterruptedException {
        Thread.sleep(2000);
        EmployeesDropDown.isDisplayed();
        System.out.println("print -->"+ EmployeesDropDown.isDisplayed());
        EmployeesDropDown.sendKeys(Keys.ENTER);
        //System.out.println("print 2 -->"+ EmployeesDropDown.isDisplayed());
    }

}
