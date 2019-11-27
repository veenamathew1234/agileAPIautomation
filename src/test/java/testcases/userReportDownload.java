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
import resources.gameRes;

public class userReportDownload {
	

  @Test
  public void getUserReportDownload() throws IOException {
	  //reusableMethods.getCookieData();
	  RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	  given().
	  when().
	  get(resources.userReportDownloadRes.getResource()).
	  then().
	  assertThat().
	  statusCode(200);
  }
}
