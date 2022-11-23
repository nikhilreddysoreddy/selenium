package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class itera_site {
	WebDriver d;
  @BeforeTest
  public void opening() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get(" https://itera-qa.azurewebsites.net/home/automation");
	  d.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
  }
  @Test
  public void form_filling() throws InterruptedException {
	  d.findElement(By.id("name")).sendKeys("Nikhil");
	  d.findElement(By.id("phone")).sendKeys("9559595995");
	  d.findElement(By.id("email")).sendKeys("nikhil@98");
	  d.findElement(By.id("password")).sendKeys("nikhil9876");

	  d.findElement(By.id("address")).sendKeys("Bangalore, BTM Latout 2lane, Atidhi recidency");
	  Thread.sleep(2000);
  }
  @Test
  public void submit() throws InterruptedException {
	  d.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  
  }
  @AfterTest
  public void close1() {
	  d.close();
  }
}
