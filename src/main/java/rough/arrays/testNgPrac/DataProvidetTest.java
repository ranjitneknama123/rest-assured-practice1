package rough.arrays.testNgPrac;

import org.testng.annotations.Test;

public class DataProvidetTest {


    @Test(dataProvider = "loginData", dataProviderClass = Createdata.class)
    public void createUser(String un, String psw) {
        System.out.println(un + " " + psw);

    }
}
