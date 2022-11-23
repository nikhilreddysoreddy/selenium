package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		
		//music
		WebElement music=d.findElement(By.id("ui-id-9"));
		music.click();
		Thread.sleep(3000);
		
		//jazz
		WebElement jazz=d.findElement(By.id("ui-id-13"));
		jazz.click();
		Thread.sleep(3000);
		
		//modern
		WebElement modern=d.findElement(By.id("ui-id-16"));
		modern.click();
		Thread.sleep(3000);
		
		Actions act=new Actions(d);
		act.moveToElement(music).moveToElement(jazz).moveToElement(modern).build().perform();
		
		/*d.findElement(By.id("ui-id-9")).click();
		Thread.sleep(3000);
		d.findElement(By.id("ui-id-13")).click();
		d.findElement(By.id("ui-id-16")).click();*/
	}

}
