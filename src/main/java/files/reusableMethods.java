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
		
		String cookiedata="s%3AofLEsyS-v8o4xWke2d7eKEwvPmNGf8tj.g860vcDB0a7b6HEq4i8C%2FwkpkXNAbggZTq9z4W1aMW8";
		return cookiedata;
		
	}
	
}
