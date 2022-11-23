package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/checkboxes");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement a=d.findElement(By.id("checkboxes"));
		List<WebElement>b=a.findElements(By.tagName("input"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getAttribute("value"));
		}

	}

}
