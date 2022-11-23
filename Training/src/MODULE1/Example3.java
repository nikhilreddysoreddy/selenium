package MODULE1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.linkText("Gmail")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.navigate().back();
		d.navigate().forward();
		
		
		
		
		

	}

}
