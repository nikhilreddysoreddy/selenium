package grid_package2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Example1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL(nodeurl), cap);
		//driver.close();
		
		//System.setProperty("webdiver.chrome.driver", "c://chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("manual testing");
		Thread.sleep(2000);
		
		driver.close();


	}

}
