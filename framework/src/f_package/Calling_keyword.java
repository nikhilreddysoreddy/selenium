package f_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Calling_keyword {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		key_word obj=new key_word();
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\Downloads\\keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		r=ws.getRow(2);
		Iterator<Row> row=ws.iterator();
		while(row.hasNext()) {
			r=row.next();
			r=ws.getRow(2);
			String s1=r.getCell(2).getStringCellValue();
			if(s1.equals("Opening_Browser")) {
				obj.opening_browser();
			}
			else if(s1.equals("Navite")) {
				obj.navigate();
			}
			else if(s1.equals("User_Name")) {
				obj.usernameenter();
			}
			else if(s1.equals("Password")) {
				obj.passwordenter();
			}
			else if(s1.equals("Click")) {
				obj.click();
			}
			else if(s1.equals("Close")) {
				obj.close();
			}
		}

	}

}
