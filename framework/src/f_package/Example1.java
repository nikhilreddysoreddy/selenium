package f_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\eclipse-workspace\\framework\\src\\f_package\\p1.properties");
		Properties p1=new Properties();
		p1.load(f);
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		//fetching url from propertylist
		d.get(p1.getProperty("url"));
		d.manage().window().maximize();
		
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(p1.getProperty("username"));
		
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(p1.getProperty("password"));
		

	}

}
