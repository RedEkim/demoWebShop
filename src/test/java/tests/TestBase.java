package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

public class TestBase {
    String email = "а@fd.com",
            password = "123456";

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://demowebshop.tricentis.com";
        Configuration.baseUrl = "https://demowebshop.tricentis.com";
    }
}
