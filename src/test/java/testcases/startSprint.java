package testcases;

import java.io.IOException;
import resources.startSprintRes;
import org.testng.annotations.Test;
import payload.startSprintPay;
import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class startSprint {
  @Test
  public void postStartSprint() throws IOException {
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(startSprintPay.getPayload())
			  	.headers("Cookie",reusableMethods.getCookieData())
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.post(startSprintRes.getResource())
			  	.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
  }
}
