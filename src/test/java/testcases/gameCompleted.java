package testcases;

import static io.restassured.RestAssured.given;
import resources.gameCompletedRes;
import java.io.IOException;

import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class gameCompleted {
  @Test
  public void postGameCompleted() throws IOException {
	  
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(payload.gameCompletedPay.getPayload())
			  	.headers("Cookie",reusableMethods.getCookieData())
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.post(gameCompletedRes.getResource())
			  	.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
  }
}
