package com.specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.builder.ResponseSpecBuilder;
import org.apache.http.HttpStatus;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import java.util.concurrent.TimeUnit;


public class Specification {
    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .setAccept("application/json")
                .build();
    }
    public static ResponseSpecification responseSpecification () {
        return new ResponseSpecBuilder()
                .log(LogDetail.STATUS)
                .expectContentType("application/json")
        .expectStatusCode(HttpStatus.SC_OK)
                .expectResponseTime(lessThanOrEqualTo(3L), TimeUnit.SECONDS)
                .build();

    }
}
