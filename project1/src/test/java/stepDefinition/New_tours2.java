package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New_tours2 {
	WebDriver d;
	@Given("user is in new tours application")
	public void user_is_in_new_tours_application() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	}

	@When("^user needs to enter (.*) and (.*)$")
	public void user_needs_to_enter_username_and_password(String username,String password) {
		d.findElement(By.name("userName")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(password);
		
	}

	@Then("user clicks on signup button")
	public void user_clicks_on_signup_button() {
		System.out.println("Clicking button");
	}

	@And("user navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("In application home page");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
