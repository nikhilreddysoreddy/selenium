package example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Readingdata {
	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream f=new FileInputStream("C:\\Users\\nikhilreddy\\OneDrive\\Documents\\r11.xlsx");
	@SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Row r=null;
	Cell c=null;
	Iterator<Row>row=ws.iterator();
	while(row.hasNext())
	{
		r=row.next();
		Iterator<Cell>cell=r.iterator();
		System.out.println();
		while(cell.hasNext())
		{
			c=cell.next();
			if(c.getCellType()==c.CELL_TYPE_NUMERIC) {
				System.out.print(c.getNumericCellValue());
			}
			else if(c.getCellType()==c.CELL_TYPE_STRING) {
				System.out.print(c.getStringCellValue());
			}
		}
	}
	}
}
