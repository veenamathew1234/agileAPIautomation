package testcases;

import java.io.IOException;
import payload.updatePhasePay;
import org.testng.annotations.Test;
import resources.updatePhaseRes; 
import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class updatePhase {
  @Test
  public void putUpdatePhase() throws IOException {
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(updatePhasePay.getPayload())
			  	.headers("Cookie",reusableMethods.getCookieData())
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.put(updatePhaseRes.getResource())
			  	.then()
			  	.assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
  }
}
