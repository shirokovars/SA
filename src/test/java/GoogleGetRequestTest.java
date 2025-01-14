import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GoogleGetRequestTest {

    @Test
    public void testGoogleGetRequest() {
        // Установка базового URI
        RestAssured.baseURI = "https://www.google.com";

        // Выполнение GET-запроса и проверка статуса ответа
        given()
                .when()
                .get("/")
                .then()
                .statusCode(200) // Проверка, что статус код равен 200
                .body(containsString("Google")); // Проверка, что в теле ответа содержится слово "Google"
    }
}