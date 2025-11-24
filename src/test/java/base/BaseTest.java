package base;

import com.sun.jdi.request.DuplicateRequestException;
import config.APIConstants;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static io.restassured.RestAssured.*;

public class BaseTest {
    protected static RequestSpecification reqSpec;
    public static WebDriver driver;

    @Parameters("Browser")
    @BeforeSuite
    public static void setUp(String browser) {
        System.out.println(browser);
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeClass
    public static void getRequestSpecification() {
        reqSpec = given()
                .contentType(ContentType.JSON)
                .header("x-api-key", " reqres-free-v1")
                .baseUri(APIConstants.BASE_URL);

    }


    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
