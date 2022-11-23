package f_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_capture {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Documents\\new_tours_links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		@SuppressWarnings("unused")
		Cell c=null;
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
		WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement>b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(b.get(i).getText());
			b.get(i).click();
			r.createCell(1).setCellValue(d.getTitle());
			r.createCell(2).setCellValue(d.getCurrentUrl());
			//System.out.println(b.get(i).isSelected());
			Thread.sleep(2000);
			d.navigate().back();
			
			a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			b=a.findElements(By.tagName("a"));
			
		}
		FileOutputStream f2=new FileOutputStream("C:\\Users\\nikhilreddy\\OneDrive\\Documents\\new_tours_links.xlsx");
		wb.write(f2);
		f2.close();
		wb.close();
		

	}

}
