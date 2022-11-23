package exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comparing_links {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Row r=null;
		Cell c=null;
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\linkNames.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheet("Sheet1");
			
			
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			
			WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			List<WebElement>b=a.findElements(By.tagName("a"));
			System.out.println(b.size());
			for(int i=0;i<b.size();i++) {
				System.out.println(b.get(i).getText());
				r=ws.getRow(i);
				String e_url=r.getCell(1).getStringCellValue();
				b.get(i).click();
				Thread.sleep(2000);
				String a_url=d.getCurrentUrl();
				
				r=ws.createRow(i);
				r.createCell(2).setCellValue(a_url);
				d.navigate().back();
				
				a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				b=a.findElements(By.tagName("a"));
				if(e_url.equals(a_url)) {
					r.createCell(3).setCellValue("pass");
					
				}
				else {
					r.createCell(3).setCellValue("pass");
				}
				
			}
			FileOutputStream f2=new FileOutputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\linkNames.xlsx");
			wb.write(f2);
			f2.close();
		}
		catch(Exception e){
			System.out.println(e);
			r.createCell(3).setCellValue("link not found");
		}
			
		}
	

}
