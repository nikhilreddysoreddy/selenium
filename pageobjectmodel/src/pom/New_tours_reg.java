package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class New_tours_reg {
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	By phone=By.name("phone");
	By email=By.name("userName");
	By country=By.name("country");
	New_tours_reg(WebDriver d) {
		 this.d=d;
		 
	 }
	 public void fname() 
		{
			d.findElement(fname).sendKeys("nikhil");
		}
		public void lname()
		{
			d.findElement(lname).sendKeys("reddy");
		}
		public void phone()
		{
			d.findElement(phone).sendKeys("176384123");
		}
		public void email()
		{
			d.findElement(email).sendKeys("admin123@gmail.com");
		}
		public void country() {
			d.findElement(country).sendKeys("india");
		}
		

}
