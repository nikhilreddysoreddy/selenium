package MODULE1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class formfilling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		d.manage().window().maximize();
		d.findElement(By.className(" mr-sm-2 form-control")).sendKeys("Nikhil");
		Thread.sleep(3000);
		d.findElement(By.id("lastName")).sendKeys("Reddy");
		Thread.sleep(3000);
		d.findElement(By.id("userEmail")).sendKeys("nikhil@google.com");
		Thread.sleep(3000);
		d.findElement(By.id("userNumber")).sendKeys("1123456789");
		Thread.sleep(3000);
		d.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		/*Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")).click();*/
		Thread.sleep(3000);
		d.findElement(By.id("currentAddress")).sendKeys("penukonda Anantapur");
		/*d.findElement(By.linkText("REGISTER")).click();
		d.navigate().back();
		boolean b=d.findElement(By.linkText("REGISTER")).isSelected();
		System.out.println(b);*/
	}

}
