package br.ce.wcaquino.rest;

import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GeralTest {

    // Teste usando atributos estáticos
    @Test
    public void usarAtributosEstaticos() {
        RestAssured.baseURI = "http://restapi.wcaquino.me";
        RestAssured.port = 80;
        RestAssured.basePath = "/v2";

        given()
            .log().all()
        .when()
            .get("/users")
        .then()
            .statusCode(200);
    }

}
