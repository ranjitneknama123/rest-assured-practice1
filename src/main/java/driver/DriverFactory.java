package driver;

import exceptions.BrowserValueIsNotCorrectOrBrowserNotLaunchException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) throws BrowserValueIsNotCorrectOrBrowserNotLaunchException {
        WebDriver driverInstance;

        switch (browser.toLowerCase()) {
            case "chrome":
                driverInstance = new ChromeDriver();
                break;

            case "firefox":
                driverInstance = new FirefoxDriver();
                break;

            default:
                throw new BrowserValueIsNotCorrectOrBrowserNotLaunchException("Invalid browser: " + browser);
        }

        driver.set(driverInstance); // Set ThreadLocal driver
        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }


}
