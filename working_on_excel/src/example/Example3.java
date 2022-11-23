package example;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\r12.xlsx ");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("write");
		Row r=null;
		@SuppressWarnings("unused")
		Cell c=null;
		r=ws.createRow(2);
		r.createCell(1).setCellValue("manual testing");
		r=ws.createRow(3);
		r.createCell(2).setCellValue("selenium");
		r=ws.createRow(4);
		r.createCell(3).setCellValue("Automation testing");
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\nikhilreddy\\OneDrive\\Desktop\\r12.xlsx");
		wb.write(f1);
		f1.close();

	}

}
