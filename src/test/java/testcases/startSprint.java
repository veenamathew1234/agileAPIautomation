package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class startSprint {
  @Test
  public void postStartSprint() throws IOException {
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(payload.startSprintPay.getPayload())
			  	.headers("Cookie", "agilesim_stg=s%3Ao1o5l-hu4mZq_S-MhM1HP7DrSEtVYI-t.3wxgDOn%2FEv2sxna2jtkE652soeS3lcTRUSmNJNJjWoA")
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.post(resources.startSprintRes.getResource())
			  	.then()
			  	.assertThat()
			  	.statusCode(200);
  }
}
