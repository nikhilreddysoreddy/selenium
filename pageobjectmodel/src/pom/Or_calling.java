package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Or_calling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		orangehrm a1 =new orangehrm(d);
		Thread.sleep(3000);
		a1.uname();
		a1.pass();
		//a1.sign();
		

	}

}
