package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrm {
	WebDriver d;
	By username=By.name("userName");
	By password=By.name("password");
	//By signin=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	 
	orangehrm(WebDriver d)
	{
		this.d=d;
	}
	public void uname() 
	{
		d.findElement(username).sendKeys("Admin");
	}
	public void pass()
	{
		d.findElement(password).sendKeys("admin123");
	}
	/*public void sign()
	{
		d.findElement(signin).click();
	}
*/
	}


