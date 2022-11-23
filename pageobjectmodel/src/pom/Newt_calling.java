package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Newt_calling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		New_tours_reg a1 =new New_tours_reg(d);
		Thread.sleep(3000);
		a1.fname();
		a1.lname();
		a1.phone();
		a1.email();
		a1.country();

	}

}
