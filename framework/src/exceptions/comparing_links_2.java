package exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comparing_links_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Row r = null;
		
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\latestone.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheet("Sheet1");
			
			
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			Thread.sleep(2000);
			r=ws.getRow(0);
			r.createCell(2).setCellValue("Actual URL");
			r.createCell(3).setCellValue("Test Result");
			
			WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			List<WebElement>b=a.findElements(By.tagName("a"));
			System.out.println(b.size());
			for(int i=0;i<b.size();i++) {
				System.out.println(b.get(i).getText());
				r=ws.getRow(i+1);
				String e_url=r.getCell(1).getStringCellValue();
				
				b.get(i).click();
	
				Thread.sleep(2000);
				String a_url=d.getCurrentUrl();	
//				r=ws.createRow(i+1);
				r.createCell(2).setCellValue(a_url);
				d.navigate().back();
				
				a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				b=a.findElements(By.tagName("a"));
				if(!e_url.equalsIgnoreCase(a_url)) {
					r.createCell(3).setCellValue("fail");
					
				}
				else {
					r.createCell(3).setCellValue("pass");
				}
			
				
			}
			FileOutputStream f2=new FileOutputStream("C:\\\\Users\\\\nikhilreddy\\\\OneDrive\\\\Desktop\\\\latestone.xlsx");
			wb.write(f2);
			f2.close();
			f.close();
			wb.close();
		}
		catch(Exception e){
			System.out.println(e);
//			r.createCell(3).setCellValue("link not found");
		}
			
		}

}
