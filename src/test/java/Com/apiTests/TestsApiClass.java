package Com.apiTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

public class TestsApiClass {

    @Test
    public void whenRequestGet() {
        RestAssured.
                when().request("GET", "https:petstore.swagger.io/v2/pet/findByStatus").
                then().assertThat().statusCode(200).
                and().body("status", is("available"));

    }
}