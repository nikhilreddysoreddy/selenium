package classsandobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_chrome {
	WebDriver d;
	public void openbrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d= new ChromeDriver();
		
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}
	public void gettitle() {
		
		System.out.println(d.getTitle());
	}
	public void getcurrenturl() {
		System.out.println(d.getCurrentUrl());
	}
	public void dropexe() {
		//d.findElement(By.id("searchDropdownBox")).click();
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<=b.size()-1;i++)
		{
			System.out.println(b.get(i).getText());
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		amazon_chrome a1=new amazon_chrome();
		a1.openbrowser();
		a1.dropexe();

	}

}
