package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;

public class Dez_learn {
	WebDriver d;
	@Given("opening dezlearn application")
	public void opening_dezlearn_application() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("^user capture url and title")
	public void user_capture_url_and_title() throws InterruptedException {
	    System.out.println(d.getCurrentUrl());
	    System.out.println(d.getTitle());
	    Thread.sleep(2000);
	}

	@Then("user clicks on alert button")
	public void user_clicks_on_alert_button() throws InterruptedException {
		d.findElement(By.id("s_alert1")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
	}

	@And("user captures screenshot")
	public void user_captures_screnshot() throws IOException, InterruptedException {
		File x=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		com.google.common.io.Files.copy(x,new File("C:\\Users\\nikhilreddy\\OneDrive\\Pictures\\Screenshots\\a74.png"));
		Thread.sleep(2000);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
