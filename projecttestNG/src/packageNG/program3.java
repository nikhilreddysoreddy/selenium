package packageNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program3 {
  @Test
  public void opening() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	  ChromeDriver d=new ChromeDriver();
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement a=d.findElement(By.id("searchDropdownBox"));
	  List<WebElement>b=a.findElements(By.tagName("option"));
	  for(int i=0;i<b.size();i++) {
		  System.out.println(b.get(i).getText());
		  System.out.println(d.getTitle());
		  b.get(i).click();
	  }
	  
  }
}
