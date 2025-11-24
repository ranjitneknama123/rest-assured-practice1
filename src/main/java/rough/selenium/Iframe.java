package rough.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Iframe {
    @Test
    public void test1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        //(//div[@class='single-products']/div/h2[contains(text(),'Rs. 500')])[1]
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement framId = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(0);
        WebElement body = driver.findElement(By.cssSelector("#tinymce"));
        body.clear();
        body.sendKeys("Hi How are you---");
        driver.switchTo().defaultContent();
        Set<String> allWindowsId = driver.getWindowHandles();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Elemental Selenium')]")));
        el2.click();
        Iterator<String> itr = allWindowsId.iterator();
        String parentId = itr.next();
        System.out.println(driver.getTitle());
        while (itr.hasNext()){
            String childId = itr.next();
            System.out.println("childId"+childId);
                driver.switchTo().window(childId);
                System.out.println(driver.getTitle());
                driver.close();

        }
        driver.switchTo().window(parentId);
        driver.close();
    }
}
