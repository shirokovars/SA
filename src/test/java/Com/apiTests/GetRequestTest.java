import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetRequestTest {
    @Test
    @DisplayName("Тестирование запроса GET с проверкой status code = 200")
    public void getRequestCheckStatusCode() {
        RestAssured.given()
                .spec(requestSpecification())
                .get("/api/users/2")
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    @DisplayName("Тестирование запроса GET с проверкой key/value по полям id, email, first_name, last_name")
    public void getRequestCheckResponseJsonBody() {
        RestAssured.given()
                .spec(requestSpecification())
                .get("/api/users/2")
                .then
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data.id", Matchers.is(2))
                .body("data.email", Matchers.is("janet.weaver@reqres.in"))
                .body("data.first_name", Matchers.is("Janet"))
                .body("data.last_name", Matchers.is("Weaver"));

    }

}
