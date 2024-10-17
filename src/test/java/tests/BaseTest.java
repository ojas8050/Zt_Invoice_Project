package tests;

import Enums.LoginConstants;
import Utils.Log;
import Utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.HashMap;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> prefs = new HashMap<>();
        // Block notifications
        prefs.put("profile.default_content_setting_values.notifications", 2); // 1: allow, 2: block
        // Block location
        prefs.put("profile.default_content_setting_values.geolocation", 2); // 1: allow, 2: block
        // Disable pop-up blocking
        prefs.put("profile.default_content_setting_values.popups", 0); // 0: allow, 1: block
        options.setExperimentalOption("prefs", prefs);
        Log.info("Initializing WebDriver...");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Log.info("Navigating to URL: " + LoginConstants.Test_URL);
        driver.get(LoginConstants.Test_URL);
    }

    @AfterMethod
    public void captureFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            Log.error("Test failed: " + result.getName());
            try {
                ScreenshotUtil.captureScreenshot(driver, result.getName());
                Log.info("Screenshot captured for: " + result.getName());
            } catch (Exception e) {
                Log.error("Error capturing screenshot: " + e.getMessage());
            }
        }
    }

    @AfterClass
    public void teardown(){
            Log.info("Closing WebDriver...");
            driver.quit();
    }
}
