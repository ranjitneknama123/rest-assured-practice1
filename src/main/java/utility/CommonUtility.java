package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class CommonUtility {

    public static void takeScreenShot(WebDriver driver) throws IOException {
        LocalDateTime currentDate = LocalDateTime.now();
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(srcFile, new File("./screenshot"+currentDate+".png"));

    }

}
