package property_List;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New_t_proper {
	String uname,pass;
	WebDriver d;
	@Given("opening app")
	public void opening_app() throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\eclipse-workspace\\project1\\src\\test\\java\\property_List\\p2.properties");
		Properties p2=new Properties();
		p2.load(f);
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		
		d.get(p2.getProperty("url"));
		d.manage().window().maximize();
		Thread.sleep(2000);
		uname=p2.getProperty("username");
		pass=p2.getProperty("password");
	}

	@When("specify credentials")
	public void specify_credentials() throws InterruptedException {
		d.findElement(By.name("userName")).sendKeys(uname);
		
		d.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
	}

	@Then("Submition button")
	public void submition_button() {
	    d.findElement(By.name("submit")).click();
	}

	@And("close the new tours Application")
	public void close_the_new_tours_application() {
	    d.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
