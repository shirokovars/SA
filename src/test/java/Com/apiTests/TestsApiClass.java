import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import java.io.File;
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
    File jsonFile = new File("src/test/resources/postpets.json");

    String response = RestAssured
            .given()
                .baseUri("https://petstore.swagger.io/v2")
            .header("Content-Type", "application/json")
            .body(jsonFile)
            .when().post("/user")
            .then().statusCode(200)
            .extract()
            .asString();
            System.out.println(response);

}

@Test
//Проверка что гет не создает пользователей
    public void whenRequestPost2() {
    File jsonFile = new File("src/test/resources/postpets.json");
    String response = RestAssured
            .given().baseUri("https://petstore.swagger.io/v2")
            .header("Content-Type", "application/json")
            .body(jsonFile)
            .when().post("/store/inventory")
            .then().statusCode(405)
            .extract()
            .asString();
            System.out.println(response);
}
@Test
public void whenRequestPut() {
    File jsonFile = new File("src/test/resources/postpets.json");
    String response = RestAssured
            .given().baseUri("https://petstore.swagger.io/v2")
            .header("Content-Type", "application/json")
            .body(jsonFile)
            .when().put("/user/9223372036854775629")
            .then().statusCode(200)
            .extract()
            .asString();
    System.out.println(response);


}
}