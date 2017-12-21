package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelData {

	
	public static void main(String[] args) throws Exception {
		
	File src=new File("D://test.");
	
	FileInputStream fs=new FileInputStream(src);
	
	XSSFWorkbook b=new XSSFWorkbook(fs);
	
      
	
	
		
	}

}
