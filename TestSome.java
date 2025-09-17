package dataDrivenExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestSome {

	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		FileInputStream data = new FileInputStream("C:\\Users\\karthikmo\\eclipse-workspace\\maveric\\Test-data\\Book1.xlsx");
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(data);
		XSSFSheet sheet = xssfWorkbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String string = cell.toString();
		//System.out.println(string);
	
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				XSSFCell cell2 = row2.getCell(j);
				String answer = cell2.toString();
				System.out.println("Answer - "+answer);
			}
			
		}
		
		xssfWorkbook.close();
	}
}
