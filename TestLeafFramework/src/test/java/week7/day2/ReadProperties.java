package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
		
		Properties pros = new Properties();
		
		pros.load(file);
		
		String username = pros.getProperty("username");
		String password = pros.getProperty("password");
		System.out.println("The username is :" + username);
		System.out.println("The password is :" + password );
		pros.setProperty("username2", "democsr");
		String username2 = pros.getProperty("username2");
		System.out.println("The username2 is :" + username2);
		
		
	}

}
