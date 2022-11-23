package MODULE1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.name("firstName")).sendKeys("nikhil");
		d.findElement(By.name("lastName")).sendKeys("939095");
		Thread.sleep(4000);
		d.findElement(By.name("submit")).click();
		
		
		
		
		

	}

}
