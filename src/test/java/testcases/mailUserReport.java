package testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import payload.mailUserReportPay;
import resources.leaderboardRes;
import resources.mailUserReportRes;

public class mailUserReport {
	
	@Test
	public void post_mailUserReport() throws IOException{
		
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();
		
		given().
			headers("Cookie",reusableMethods.getCookieData()).
			headers("Content-Type","application/json").
			body(mailUserReportPay.mailUserReport()).
		when().
			post(mailUserReportRes.getmailuserreportres()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
	}

}
