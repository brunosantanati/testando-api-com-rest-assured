package br.ce.wcaquino.rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundo {

	public static void main(String[] args) {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		//Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me:80/ola");
		//Response response = RestAssured.request(Method.GET, "http://50.116.38.228:80/ola");
		System.out.println(response.getBody().asString().equals("Ola Mundo!"));
		System.out.println(response.statusCode() == 200);
		
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
		//validacao.statusCode(201); //AssertionError -> Expected status code <201> but was <200>
	}

}
