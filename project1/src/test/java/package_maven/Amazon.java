package package_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>drop2=drop.findElements(By.tagName("option"));
		
		System.out.println(drop2.size());
		
		for(int i=0;i<drop2.size();i++) {
			System.out.println(drop2.get(i).getText());
			drop2.get(i).click();
			Thread.sleep(1000);
			
			//System.out.println(d.getCurrentUrl());
			drop=d.findElement(By.id("searchDropdownBox"));
			drop2=drop.findElements(By.tagName("option"));
			
		
		}
		

	}

}
