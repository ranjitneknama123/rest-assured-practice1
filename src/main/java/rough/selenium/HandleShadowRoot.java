package rough.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleShadowRoot {

    @Test
    public void handleShadow() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/shadowdom");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-root (open) "));
        // WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        // shadowRoot.findElement(By.cssSelector("#insideElement")).getText();
        SearchContext searchContent = shadowHost.getShadowRoot();
        String text = searchContent.findElement(By.xpath("//span[contains(text(),'Let')]")).getText();
        System.out.println(text);
    }
}
