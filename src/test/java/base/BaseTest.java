package base;

import config.APIConstants;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;

public class BaseTest {
    protected static RequestSpecification reqSpec;

    @BeforeClass
    public static void getRequestSpecification() {
        reqSpec = given()
                .contentType(ContentType.JSON)
                .header("x-api-key"," reqres-free-v1")
                .baseUri(APIConstants.BASE_URL);

    }

}
