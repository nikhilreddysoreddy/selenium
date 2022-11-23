package MODULE1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/checkboxradio/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		d.findElement(By.xpath("/html/body/div/fieldset[2]/label[1]/span[1]")).click();
		d.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]/span[1]")).click();
		WebElement a=d.findElement(By.xpath("/html/body/div/fieldset[2]"));
		List<WebElement>b=a.findElements(By.tagName("label"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {	
			System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getText());
		}
	}

}
