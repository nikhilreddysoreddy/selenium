package f_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class key_word {
	WebDriver d;
	public void opening_browser() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		
	}
	public void navigate() {
		d.manage().window().maximize();
	}
	public void usernameenter() {
		d.findElement(By.name("userName")).sendKeys("nikhil");
	}
	public void passwordenter() {
		d.findElement(By.name("password")).sendKeys("98776");
	}
	public void click() {
		d.findElement(By.name("submit")).click();
	}
	public void close() {
		d.close();
	}

}
