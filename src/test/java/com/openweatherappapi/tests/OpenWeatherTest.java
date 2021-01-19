package com.openweatherappapi.tests;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class OpenWeatherTest {

	@Test(priority = 1, description = "Nagative Scenario with Invalid API Key")

	public void currentWeatherData() {
		RestAssured.baseURI = "https://api.openweathermap.org";

		// Login with sessionID scenario

		// Get Weatherdata by City Name
		given().log().all().pathParam("id", "95aa1d905f2de09565408b8a6af3bd75j").pathParam("city", "johannesburg")
				.when().get("/data/2.5/weather?q={city}&appid={id}").then().log().all();
	}

	@Test(priority = 2)
	public void getWeatherHourlyData() {
		RestAssured.baseURI = "https://api.openweathermap.org";
		given().log().all().pathParam("id", "95aa1d905f2de09565408b8a6af3bd75").pathParam("lat", "28.0436")
				.pathParam("lon", "-26.2023").pathParam("al", "alerts").when()
				.get("/data/2.5/onecall?lat={lat}&lon={lon}&exclude={al}&appid={id}").then().log().all();

	}
}
