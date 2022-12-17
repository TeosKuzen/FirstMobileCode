package api.guest;

import api.config.ConfigReader;
import api.specifications.Specifications;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Guest {

    private static String URL = ConfigReader.restAssuredConfig.baseURL();

    @BeforeAll
    public static void setFilter() {

        RestAssured.filters(new AllureRestAssured());
    }

    @Test
    @Description("Создать карту с номером - c9107bee-cead-41e9-98f4-4769ddb430f6")
    @Story("API")
    public void successCreateAnonymousCard() {

        String deviceId = "c9107bee-cead-41e9-98f4-4769ddb430f6";

        ResponseCreateAnonymousCard responseCreateAnonymousCard = postCreateAnonymousCard(deviceId);

        Assertions.assertNull(responseCreateAnonymousCard.error);

    }

    public ResponseCreateAnonymousCard postCreateAnonymousCard(String deviceId) {

        Specifications.installSpec(Specifications.requestSpec(URL), Specifications.responseSpec());

        BodyCreateAnonymousCard bodyCreateAnonymousCard = new BodyCreateAnonymousCard();
        bodyCreateAnonymousCard.device_id = deviceId;

        ResponseCreateAnonymousCard response = RestAssured.given()
                .when()
                .body(bodyCreateAnonymousCard)
                .contentType(ContentType.JSON)
                .post("/guest/createAnonymousCard")
                .then().log().all()
                .extract().as(ResponseCreateAnonymousCard.class);

        return response;
    }

    @Data
    private static class BodyCreateAnonymousCard {
        private String device_id;
    }

    @Data
    private static class ResponseCreateAnonymousCard {
        private String number;
        private String phone;
        private String fullName;
        private String email;
        private String token;
        private String[] error;
    }
}
