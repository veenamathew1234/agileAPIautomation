package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class reusableMethods {
	

	public static String getDataBeforeTest() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/env.properties");
		prop.load(file);
		String host=prop.getProperty("HOST");
		return host;
		
	}
	
	public static void getCookieData() throws MalformedURLException, IOException{
		
		//String cookiedata="s%3AofLEsyS-v8o4xWke2d7eKEwvPmNGf8tj.g860vcDB0a7b6HEq4i8C%2FwkpkXNAbggZTq9z4W1aMW8";
		URLConnection connection = new URL("http://google.com").openConnection();
		List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
		
		for(int i=0;i<cookies.size();i++)
			System.out.println(cookies.get(i));
		
		//return cookiedata;
		
	}
	public static JsonPath rawtoJson(Response res)
	{
		
		  String responseString=res.asString();  
		  JsonPath json=new JsonPath(responseString);
		  return json;
	}
	
}
