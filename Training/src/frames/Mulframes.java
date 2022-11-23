package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mulframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/nested-iframes-example/");
		d.manage().window().maximize();
		d.switchTo().frame("parent_iframe");
		d.findElement(By.id("u_5_5")).click();
		WebElement t1=d.findElement(By.id("processing"));
		System.out.println(t1.getText());
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		WebElement t2=d.findElement(By.id("processing"));
		System.out.println(t2.getText());
		Thread.sleep(2000);
		d.close();
	}

}
