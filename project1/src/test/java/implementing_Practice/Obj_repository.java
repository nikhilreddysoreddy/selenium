package implementing_Practice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Obj_repository {
	public String get_uname() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\eclipse-workspace\\project1\\src\\test\\java\\implementing_Practice\\p2.properties");
		Properties p1=new Properties();
		p1.load(f);
		String x=p1.getProperty("username");
		return x;
		
	}
	public String get_pword() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\eclipse-workspace\\project1\\src\\test\\java\\implementing_Practice\\p2.properties");
		Properties p1=new Properties();
		p1.load(f);
		String x=p1.getProperty("password");
		return x;
		
	}
	

}
