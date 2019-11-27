package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class reusableMethods {
	

	public static String getDataBeforeTest() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/env.properties");
		prop.load(file);
		String host=prop.getProperty("HOST");
		return host;
		
	}
	
	public static String getCookieData(){
		
		String cookiedata="agilesim_stg=s%3AzQVy5jv3zki7daUmjrwyD5wnp5KtOT7g.DsJo%2FHhfk5OGKrEos3NXmG%2F7szAPQ24953CJiC5f%2Bqw";
		return cookiedata;
		
	}
	
}
