package MODULE1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Harrypotter");
		d.findElement(By.id("nav-search-submit-button")).click();
		d.close();
		
		
	}

}
