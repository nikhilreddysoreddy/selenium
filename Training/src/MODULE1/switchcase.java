package MODULE1;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser: ");
		String browser=sc.nextLine();
		sc.close();
		switch(browser) {
		case "chrome" : 
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.amazon.com");
			Thread.sleep(3000);
			d.manage().window().maximize();
			break;
		case "firefox" :
			//System.setProperty("webdriver.firefox.driver", "c://firefoxdriver.exe");
			FirefoxDriver d1=new FirefoxDriver();
			d1.get("https://www.amazon.com");
			Thread.sleep(3000);
			d1.manage().window().maximize();
			break;
		default :
			System.out.println("Browser not available");
		}
		
		
	}

}
