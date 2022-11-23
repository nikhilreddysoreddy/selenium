package MODULE1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement a=d.findElement(By.name("country"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<=b.size();i++)
		{
			System.out.println(b.get(i).getText());
			
		}
		File a1=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(a1, new File("C:\\Users\\nikhilreddy\\OneDrive\\Pictures\\Screenshots\\train.png"));
	}

}
