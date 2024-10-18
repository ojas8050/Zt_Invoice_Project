package Pages;

import Utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default timeout
        PageFactory.initElements(driver, this);
    }

    protected void waitUntilElementVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            Log.info("Element is displayed.");
        } catch (TimeoutException e) {
            Log.warn("Element not displayed within the timeout.");
        }
    }

    protected void waitUntilElementDisplayed(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            Log.info("Element is displayed.");
        } catch (TimeoutException e) {
            Log.warn("Element not displayed within the timeout.");
        }
    }

}
