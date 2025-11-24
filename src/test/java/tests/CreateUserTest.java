package tests;

import base.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import config.APIConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payloads.CreateUserRequest;
import pojo.User;

import static io.restassured.RestAssured.*;

public class CreateUserTest extends BaseTest {


    @Test(description = "Verify user creation API")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validate that new user is created successfully")
    public void createUser() throws JsonProcessingException {
        CreateUserRequest cur = new CreateUserRequest();
        cur.setJob("QA");
        cur.setName("Ranjit");

        ObjectMapper mapper = new ObjectMapper();
        String jsonBody = mapper.writeValueAsString(cur);

        Response response = given().spec(reqSpec)
                .body(jsonBody)
                .when()
                .post(APIConstants.USERS)
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        User user = mapper.readValue(response.asString(), User.class);
        Assert.assertEquals(user.getName(),"Ranjit");

    }
}
