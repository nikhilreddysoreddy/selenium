package packageNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {
	WebDriver d;
  @Test(priority=1)
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
  }
  @Test(priority=4)
  public void title() {
	  System.out.println(d.getTitle());
  }
  @Test(priority=2)
  public void url() {
	  System.out.println(d.getCurrentUrl());
//	  searchDropdownBox
//	  option
  }
  @Test(priority=3)
  public void drop() {
	  WebElement drop=d.findElement(By.id("searchDropdownBox"));
	  List<WebElement>a=drop.findElements(By.tagName("option"));
	  for(int i=0;i<a.size();i++) {
		  System.out.println(a.get(i).getText());
		  System.out.println(d.getTitle());
		  a.get(i).click();
		  
		  
	  }
	  
  }
  @Test(priority=5)
  public void close2() throws InterruptedException {
	  Thread.sleep(3000);
	  d.close();
  }
}
