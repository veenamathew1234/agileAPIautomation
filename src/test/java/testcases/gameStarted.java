package testcases;
import java.io.IOException;
import files.reusableMethods;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class gameStarted {
	
	@Test
	public void get_gameStarted() throws IOException{
		
		RestAssured.baseURI=reusableMethods.getDataBeforeTest();
	
		given().
			header("Cookie",reusableMethods.getCookieData()).
			
			
		
	}

}
