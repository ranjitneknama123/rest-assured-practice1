package tests.ui.tests.pages;

import base.BaseTest;
import org.jspecify.annotations.Nullable;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {


    @Test
    public void getTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("pageTitle: "+ pageTitle);
    }
}
