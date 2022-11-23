package alertsconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt1{
	WebDriver d;
	public void opening_browser() {
		System.setProperty("webriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void url() {
		System.out.println(d.getCurrentUrl());
	}
	public void  alert_message() throws InterruptedException {
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement b=d.findElement(By.id("confirmResult"));
		System.out.println(b.getText());
		
	}
	public static void main(String[] arg) throws InterruptedException{
		alt1 a=new alt1();
		a.opening_browser();
		a.title();
		a.url();
		a.alert_message();
	}
}
