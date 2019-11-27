package testcases;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import files.reusableMethods;
import payload.choosePrdPay;
import payload.gameStartedPay;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import resources.choosePrdRes;
import resources.gameStartedRes;

public class choosePrd {
	
	@Test
	public void post_choosePrd() throws IOException{
		
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();
			
		given().
			headers("Cookie",reusableMethods.getCookieData()).
			headers("Content-Type","application/json").
			body(choosePrdPay.getchoosePrdBody()).
		when().
			post(choosePrdRes.choosePrdResource()).
		then().
			assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();

	}
}
