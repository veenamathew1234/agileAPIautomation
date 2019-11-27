package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.gameRes;

public class game {
	

  @Test
  public void getGame() throws IOException {
	  //reusableMethods.getCookieData();
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  Response res= given().
	  when().
	  get(gameRes.getResource())
	  .then().
	  assertThat().
	  statusCode(200).
	  extract().response();
	  JsonPath js=reusableMethods.rawtoJson(res);
	  System.out.println(js.toString());
  }
}
