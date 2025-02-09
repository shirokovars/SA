import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

public class TestsApiClass {

    @Test
    public void whenRequestGet() {
        String response = RestAssured
             .given()
                .baseUri("https://petstore.swagger.io/v2")
             .when().get("/store/inventory")
             .then().statusCode(200)
                .extract()
                .asString();
                System.out.println(response);

    }



@Test
public void whenRequestPost() {
    String response = RestAssured
            .given()
                .baseUri("https://petstore.swagger.io/v2")
            .header("Content-Type", "application/json")
            .body(jsonBody)
            .when().post("/user")
            .then().statusCode(201)
            .extract()
            .asString();
            System.out.println(response);

}
}