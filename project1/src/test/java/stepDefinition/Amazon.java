package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {
	WebDriver d;
	@Given("opening browser")
	public void opening_browser() {
	    System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.amazon.in/");
	    d.manage().window().maximize();
	}

	@When("clicks on dropdown")
	public void clicks_on_dropdown() throws InterruptedException {
	    WebElement drop=d.findElement(By.id("searchDropdownBox"));
	    List<WebElement>drop2=drop.findElements(By.tagName("option"));
	    for(int i=0;i<drop2.size();i++) {
	    	System.out.println(drop2.get(i).getText());
	    	drop2.get(i).click();
	    	Thread.sleep(1000);
	    }
	}

	@Then("displays dropdown elements")
	public void displays_dropdown_elements() throws InterruptedException {
		System.out.println("Above are dropdown elements");
		Thread.sleep(2000);
	}

	@And("close the page")
	public void close_the_page() {
	    d.close();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
