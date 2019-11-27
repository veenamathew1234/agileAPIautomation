package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import files.reusableMethods;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import payload.actionEndPointPay;
import resources.actionRes;

import static io.restassured.RestAssured.given;

import java.io.IOException;

public class actionEndPoint {
		
	@Test
	public void post_actionEndPoint() throws IOException{
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();
		
		Response resp=given().
			headers("Cookie",reusableMethods.getCookieData()).
			headers("Content-Type","application/json").
			pathParam("action-option-name","team-lunch").
			body(actionEndPointPay.getActionPay()).
		when().
			post(actionRes.getActionRes()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body().extract().response();
		String st=resp.asString();
		JsonPath js= new JsonPath(st);
		System.out.println("actionoption id :"+js.get("actionResponse.actionOptionId"));
		
	}

}
