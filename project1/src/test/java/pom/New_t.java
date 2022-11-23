package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class New_t {
	WebDriver d;
	
	By uname=By.name("userName");
	By password=By.name("password");
	
	New_t(WebDriver d){
		this.d=d;
	}
	
	public void opening_site() {
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}
	public void giving_credentials(String uname,String password) throws InterruptedException {
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	public void click() throws InterruptedException {
		d.findElement(By.name("submit"));
		Thread.sleep(2000);
	}
	public void close1() {
		d.close();
	}
	
	
	

}
