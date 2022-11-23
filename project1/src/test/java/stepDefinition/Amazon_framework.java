package stepDefinition;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_framework {
	WebDriver d;
	WebElement a,b;
	@Given("open the website")
	public void open_the_website() {
	    
	    System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	}

	@When("capture links table")
	public void capture_links_table() {
	    WebElement b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    List<WebElement>a=b.findElements(By.tagName("a"));
	    System.out.println(a.size());
	    for(int i=0;i<a.size();i++) {
	    	System.out.println(a.get(i).getText());
	    }
	}

	@Then("click each link and capture")
	public void click_each_link_and_capture() throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\maven_frame.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Row r=null; 
	    Cell c=null;
	    WebElement b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    List<WebElement>a=b.findElements(By.tagName("a"));
	    for(int i=0;i<a.size();i++) {
			r=ws.createRow(i);
			r.createCell(0).setCellValue(a.get(i).getText());
			a.get(i).click();
			r.createCell(1).setCellValue(d.getTitle());
			r.createCell(2).setCellValue(d.getCurrentUrl());
			//System.out.println(b.get(i).isSelected());
			Thread.sleep(2000);
			d.navigate().back();
			
			b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			a=b.findElements(By.tagName("a"));
			
		}
	    FileOutputStream f2=new FileOutputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\maven_frame.xlsx");
		wb.write(f2);
		f2.close();
		wb.close();
	}

	@And("close the website")
	public void close_the_website() {
	    d.close();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
