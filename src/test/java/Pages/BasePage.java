package Pages;

import Utils.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default timeout
        PageFactory.initElements(driver, this);
    }

    public BasePage() {
    }

    protected void waitUntilElementVisible(WebElement element) {
        try {
            waitForSeconds(1);
            wait.until(ExpectedConditions.visibilityOf(element));
            Log.info("Element is Visible.");
        } catch (TimeoutException e) {
            Log.warn("Element not Visible within the timeout.");
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

    protected void waitForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Log.warn("Interrupted while waiting: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    protected void waitUntilElementClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Log.info("Element is clickable.");
        } catch (TimeoutException e) {
            Log.warn("Element not clickable within the timeout.");
        }
    }

    protected void moveToElement(WebElement element) {
        try {
            // Scroll the element into view at the top
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            Log.info("Moved to the element");
        } catch (Exception e) {
            Log.warn("Failed to move to the element: " + e.getMessage());
        }
    }

}
