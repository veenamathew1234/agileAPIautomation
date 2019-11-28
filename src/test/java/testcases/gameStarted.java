package testcases;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import files.reusableMethods;
import payload.gameStartedPay;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import resources.gameStartedRes;

public class gameStarted {
	
	@Test
	public void post_gameStarted() throws IOException{
		
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();
			
		given().
			headers("Cookie",reusableMethods.getCookieData()).
			headers("Content-Type","application/json").
			body(gameStartedPay.getGameStartedBody()).
		when().
			post(gameStartedRes.getGameStartedResource()).
		then().
			assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
	
//	@Test
//	public void getcookie(){
//		URLConnection connection = new URL("http://google.com").openConnection();
//		List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
//			
//			
//			
//			
//		
//	}
	}
}
