package api.specifications;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

    public static RequestSpecification requestSpec(String url) {
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .build();
    }

    public static ResponseSpecification responseSpec() {
        return responseSpec(200);
    }

    public static ResponseSpecification responseSpec(int statusCode) {
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .build();
    }

    public static void installSpec(RequestSpecification request, ResponseSpecification response) {
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

}
