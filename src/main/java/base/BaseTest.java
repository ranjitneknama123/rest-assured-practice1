package base;

import constant.BrowserType;
import driver.DriverFactory;
import exceptions.BrowserValueIsNotCorrectOrBrowserNotLaunchException;
import org.testng.annotations.*;

import static driver.DriverFactory.*;

public class BaseTest {
    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) throws BrowserValueIsNotCorrectOrBrowserNotLaunchException {
        initDriver(browser);
        getDriver().get("https://automationexercise.com/");
    }

    @AfterTest
    public void tearDown() {
        quitDriver();
    }


}
