package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {
        // Use the same filename for each test to overwrite the previous screenshot
        String screenshotName = testName + ".png";

        // Save to screenshots/ folder
        String screenshotPath = "screenshots/" + screenshotName;

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Overwrite the screenshot if it exists
            FileUtils.copyFile(srcFile, new File(screenshotPath));
            Log.info("Screenshot saved at: " + screenshotPath);
        } catch (IOException e) {
            Log.error("Could not save screenshot: " + e.getMessage());
        }
    }
}
