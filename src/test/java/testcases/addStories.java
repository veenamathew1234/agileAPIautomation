package testcases;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import files.reusableMethods;
import payload.addStoriesPay;
import payload.choosePrdPay;
import payload.gameStartedPay;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import payload.addStoriesPay;
import resources.addStoriesRes;
import resources.choosePrdRes;
import resources.gameStartedRes;

public class addStories {
	
	@Test
	public void post_addStories() throws IOException{
		
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();

		given().
			headers("Cookie",reusableMethods.getCookieData()).
			headers("Content-Type","application/json").
			body(addStoriesPay.addStories()).
		when().
			post(addStoriesRes.addStoriesResource()).
		then().
			assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();

	}
}
