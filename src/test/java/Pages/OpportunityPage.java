package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunityPage extends BasePage {
    public OpportunityPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[text()='New']") private WebElement NewButton;
    @FindBy(xpath = "//input[@name='Name']") private WebElement OpportunityName;
    @FindBy(css = "#combobox-input-2654") private WebElement AccountName;


    public OpportunityPage CreateRecordByallDeatils(){

    return this;
    }
}

