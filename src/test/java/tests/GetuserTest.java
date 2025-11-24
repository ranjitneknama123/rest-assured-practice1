package tests;

import base.BaseTest;
import config.APIConstants;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetuserTest extends BaseTest {

    @Test
    public void getUser() {
        Response response = given().spec(reqSpec)
                .when()
                .get(APIConstants.USERS)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.asPrettyString());
        String id = response.jsonPath().get("data[0].id").toString();
        System.out.println(id);
    }
}
