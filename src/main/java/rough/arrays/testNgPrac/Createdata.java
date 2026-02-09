package rough.arrays.testNgPrac;

import io.cucumber.java.it.Data;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

public class Createdata {

    @Test(dataProvider = "getTestData")
    public void testWithDataProvoider(Object[][] obj) {

    }

   @DataProvider
    public Object[][] getTestData(){
       return  new Object[][]{
               {"user1", "psw1","row1","row4"},
               {"user2", "psw2"},
               {"user3", "psw3"},
               {"user4", "psw4"}

       };
   }

}
