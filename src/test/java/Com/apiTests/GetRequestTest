import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matchers;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.apache.http.HttpStatus;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;



public class GetRequestTest {
    private RequestSpecification requestSpecification() {
        return RestAssured.given()
                .baseUri("https://reqres.in");
    }

    @Test
    @DisplayName("Тестирование запроса GET с проверкой status code = 200")
    public void getRequestCheckStatusCode() {
        RestAssured.given()
                .spec(requestSpecification())
                .get("/api/users/2")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    @DisplayName("Тестирование запроса GET с проверкой key/value по полям id, email, first_name, last_name")
    public void getRequestCheckResponseJsonBody() {
        RestAssured.given()
                .spec(requestSpecification())
                .get("/api/users/2")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data.id", Matchers.is(2))
                .body("data.email", Matchers.is("janet.weaver@reqres.in"))
                .body("data.first_name", Matchers.is("Janet"))
                .body("data.last_name", Matchers.is("Weaver"));
    }

}

    private ResponseSpecification responseSpecificationSC_OK() {
        return RestAssured.expect()
                .statusCode(HttpStatus.SC_OK);  // Проверка статус-кода 200
    }
    @Test
    @DisplayName("Тестирование запроса Get c валидацией ответа по json схеме")
    public void getRequestCheckResponseWithJsonSchema() {
     RestAssured.given()
                    .spec(requestSpecification())
                    .get("/api/users/2")
                    .then()
                    .spec(responseSpecificationSC_OK())
                    .assertThat()
                    .body(matchesJsonSchemaInClasspath("SchemaUsersById.json"));
    }

}
