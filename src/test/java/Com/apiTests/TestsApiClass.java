import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.hamcrest.Matchers.*;


public class TestsApiClass {

    @Test
    public void whenRequestGet() {
        String response = RestAssured
                .given()
                .baseUri("https://petstore.swagger.io/v2")
                .when().get("/store/inventory")
                .then().assertThat().statusCode(200).body("available", notNullValue())
                .extract()
                .asString();
                System.out.println(response);

    }

    @Test
    public void whenRequestGet2() {
        String response = RestAssured
                .given().baseUri("https://petstore.swagger.io/v2")
                .header("Content-type", "application/json")
                .when().get("/store/inventory")
                .then().assertThat().statusCode(200).body("available", notNullValue())
                .time(lessThan(2000L))
                .extract()
                .asString();
        System.out.println(response);

    }
    @Test
    public void whenRequestGetnegative() {
        String response = RestAssured
                .given().baseUri("https://petstore.swagger.io/v2")
                .header("Content-type", "application/json")
                .when().get("/store/inventory2")
                .then().assertThat().statusCode(404)
                .time(lessThan(2000L))
                .extract()
                .asString();
        System.out.println(response);
    }
    @Test
    public void whenRequestGetnegative2() {
        String response = RestAssured
                .given().baseUri("https://petstore.swagger.io/v2")
                .header("Content-type", "application/json")
                .when().post("/store/inventory")
                .then().assertThat().statusCode(405)
                .time(lessThan(2000L))
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
            .then().assertThat().statusCode(200).body("message", notNullValue())
            .time(lessThan(3000L))
            .extract()
            .asString();
            System.out.println(response);

}

@Test
//Проверка что гет не создает пользователей
    public void whenRequestPostNegative() {
    File jsonFile = new File("src/test/resources/postpets.json");
    String response = RestAssured
            .given().baseUri("https://petstore.swagger.io/v2")
            .header("Content-Type", "application/json")
            .body(jsonFile)
            .when().post("/store/inventory")
            .then().assertThat().statusCode(405)
            .time(lessThan(3000L))
            .extract()
            .asString();
            System.out.println(response);
}


@Test
    public void whenRequestPost2() {
        File jsonFile = new File("src/test/resources/postpets.json");

        String response = RestAssured
                .given()
                .baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .body(jsonFile)
                .when().post("/store/order")
                .then().assertThat().statusCode(200).body("complete", equalTo(false)).body("id", notNullValue())
                .time(lessThan(3000L))
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
            .then().assertThat().statusCode(200)
            .time(lessThan(3000L))
            .extract()
            .asString();
    System.out.println(response);


}


@Test
    public void whenRequestDelete() {
        String response = RestAssured
                .given().baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type","application/json")
                .when().delete("/user/9223372036854775807")
                .then().assertThat().statusCode(404)
                .time(lessThan(3000L))
                .extract()
                .asString();
                System.out.println(response);



    }


}




