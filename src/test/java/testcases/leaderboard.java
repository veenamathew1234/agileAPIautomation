package testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import resources.leaderboardRes;

public class leaderboard {
	
	@Test
	public void get_leaderboard() throws IOException{
		
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();
		
		given().
			headers("Cookie",reusableMethods.getCookieData()).
			headers("Content-Type","application/json").
		when().
			get(leaderboardRes.getleadre()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
	}

}
