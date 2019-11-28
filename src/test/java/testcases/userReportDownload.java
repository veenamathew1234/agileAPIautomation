package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import resources.userReportDownloadRes;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.gameRes;

public class userReportDownload {
	
	@Test
	public void getUserReportDownload() throws IOException {
	
	RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	given().
		headers("Cookie",reusableMethods.getCookieData()).
		headers("Content-Type", "application/json").
	when().
	get(userReportDownloadRes.getResource()).
	then().
	assertThat().
	statusCode(200).log().body();
	}
}
