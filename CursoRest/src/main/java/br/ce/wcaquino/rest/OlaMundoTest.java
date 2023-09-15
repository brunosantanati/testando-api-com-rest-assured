package br.ce.wcaquino.rest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class OlaMundoTest {
	
	@Test
	public void testOlaMundo() {
		Response response = request(Method.GET, "http://restapi.wcaquino.me/ola");
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue(response.statusCode() == 200);
		Assert.assertTrue("O status code deveria ser 200", response.statusCode() == 200);
		Assert.assertEquals(200, response.statusCode());
		
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
	}
	
	@Test
	public void devoConhecerOutrasFormasRestAssured() {
		//Forma 1 - mais verbosa
		Response response = request(Method.GET, "http://restapi.wcaquino.me/ola");		
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
		
		//Forma 2 - mais sucinta
		get("http://restapi.wcaquino.me/ola").then().statusCode(200);
		
		//Forma 3 - meio termo em tamanho, porém mais clara
		given()
		.when()
			.get("http://restapi.wcaquino.me/ola")
		.then()
			.assertThat() //Linha opcional, apenas para ficar mais claro
			.statusCode(200);
	}

}
