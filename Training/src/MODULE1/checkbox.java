package MODULE1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		WebElement a=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>b=a.findElements(By.tagName("input"));
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getAttribute("value"));
						
		}
	}
	

}
