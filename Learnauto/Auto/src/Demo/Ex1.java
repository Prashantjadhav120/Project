package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex1 {

	public static void main(String[] args) throws Exception {
		
		File src=new File("D://test.xlsx");
		
	    FileInputStream fs=new FileInputStream(src);
	    
	    XSSFWorkbook wb=new XSSFWorkbook(fs);
	    
	    XSSFSheet sh1=wb.getSheetAt(0);
	    
	    
	    String data=sh1.getRow(0).getCell(0).getStringCellValue();
	    String data1=sh1.getRow(0).getCell(1).getStringCellValue();
	    
	    System.out.println(data);
	    
	    System.out.println(data1);
	    
	    
	    
	    
		
		

	}

}
