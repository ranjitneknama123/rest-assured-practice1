package rough.arrays.testNgPrac;

import io.cucumber.java.it.Data;
import org.testng.annotations.DataProvider;

import java.util.Objects;

public class Createdata {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"admin", "password"},
                {"admin1", "password1"},
                {"admin2", "password2"}
        };
    }

}
