package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RExcel {

	public static void main(String[] args) throws Exception {
		
		
		File src=new File("D:\\test.xlsx");
		
	FileInputStream fs=new FileInputStream(src);
	
	XSSFWorkbook b=new XSSFWorkbook(fs);
	
	XSSFSheet sh1=b.getSheetAt(0);
	
	
	String data=sh1.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
	
	
		

	}

}
