package implementing_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_links_into_xl {
	WebDriver d;
	
	@Given("opening Amazon website")
	public void opening_amazon_website() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.amazon.in/");
	    d.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("Capture links get title url")
	public void capture_links_get_title_url() throws InterruptedException {
	    WebElement links=d.findElement(By.id("nav-main"));
	    List<WebElement>links2=links.findElements(By.tagName("a"));
	    System.out.println(links2.size());
	    for(int i=0;i<=links2.size();i++) {
	    	links2.get(i).click();
	    	Thread.sleep(2000);
	    	 System.out.println(d.getTitle());
	 	     System.out.println(d.getCurrentUrl());
	 	     d.navigate().back();
	 	    links=d.findElement(By.id("nav-main"));
		    links2=links.findElements(By.tagName("a"));
	    }
	    
	}

	@Then("store text title url into excel")
	public void store_text_title_url_into_excel() throws IOException, InterruptedException {
	    FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\Amazon_links.xlsx");
	    XSSFWorkbook wb =new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Row r;
	    Cell c;
	    WebElement links=d.findElement(By.id("nav-main"));
	    List<WebElement>links2=links.findElements(By.tagName("a"));
	    for(int i=0;i<links2.size();i++) {
	    	links2.get(i).click();
	    	Thread.sleep(2000);
	    	r=ws.createRow(i);
	    	r.createCell(0).setCellValue(links2.get(i).getText());
	    	r.createCell(1).setCellValue(d.getTitle());
	    	r.createCell(2).setCellValue(d.getCurrentUrl());
	    	d.navigate().back();
	    	links=d.findElement(By.id("nav-main"));
	    	
		    links2=links.findElements(By.tagName("a"));
	    	
	    	
	    }
	    FileOutputStream f2=new FileOutputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\Amazon_links.xlsx");
	    wb.write(f2);
	    f2.close();
	    
	}

	@Then("capture the screenchot")
	public void capture_the_screenchot() throws IOException {
	    File x=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(x, new File("C:\\Users\\nikhilreddy\\OneDrive\\Pictures\\Screenshots\\new18.png"));
	}

	@And("close the window")
	public void close_the_window() {
	    d.close();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
