package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class game {
	
	Properties prop=new Properties();
	@BeforeTest
	public void getGlobalData() throws IOException
	{
		
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"/env.properties");
		prop.load(fs);
		
	}
  @Test
  public void getGame() {
	  RestAssured.baseURI=prop.getProperty("HOST");
	  given().
	  when().
	  get("/game").
	  
	  
	  
  }
}
