package MODULE1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		//d.findElement(By.id("searchDropdownBox")).click();
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<=b.size()-1;i++)
		{
			System.out.println(b.get(i).getText());
			System.out.println(d.getTitle());
			b.get(i).click();
			/*Thread.sleep(3000);
			d.navigate().back();
			d.get("https://www.amazon.com");
			//d.findElement(By.id("searchDropdownBox")).click();
			a=d.findElement(By.id("searchDropdownBox"));
			b=a.findElements(By.tagName("option"));*/
			
		}
		
	}

}
