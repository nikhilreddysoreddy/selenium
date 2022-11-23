package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.amazon./");
			d.findElement(By.tagName("Gmail")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
