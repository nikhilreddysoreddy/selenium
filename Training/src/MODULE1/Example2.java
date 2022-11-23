package MODULE1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		//d.findElement(By.LinkText("Gmail")).click();
		//d.navigate().back();
		//d.navigate().forward();
		d.close();
		
		
		
	}

}
