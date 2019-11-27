package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class updatePhase {
  @Test
  public void putUpdatePhase() throws IOException {
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given()
			  	.body(payload.updatePhasePay.getPayload())
			  	.headers("Cookie", "agilesim_stg=s%3Ao1o5l-hu4mZq_S-MhM1HP7DrSEtVYI-t.3wxgDOn%2FEv2sxna2jtkE652soeS3lcTRUSmNJNJjWoA")
			  	.headers("Content-Type", "application/json")
			  	.when()
			  	.put(resources.updatePhaseRes.getResource())
			  	.then()
			  	.assertThat()
			  	.statusCode(200);
  }
}
