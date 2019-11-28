package testcases;

import static io.restassured.RestAssured.given;
import resources.setPrioritiesRes;
import java.io.IOException;
import payload.setPrioritiesPay;
import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class setPriorities {
  @Test
  public void postSetPriorities() throws IOException {
	  
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(setPrioritiesPay.getPayload())
			  	.headers("Cookie",reusableMethods.getCookieData())
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.post(setPrioritiesRes.getResource())
			  	.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
  }
}
