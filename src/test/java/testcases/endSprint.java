package testcases;

import static io.restassured.RestAssured.given;
import resources.endSprintRes;
import java.io.IOException;

import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class endSprint {
  @Test
  public void postEndSprint() throws IOException {
	  
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(payload.endSprintPay.getPayload())
			  	.headers("Cookie",reusableMethods.getCookieData())
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.post(endSprintRes.getResource())
			  	.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
			  	
  }
}
