package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	 XSSFWorkbook wb;
	 XSSFSheet sh1;
	
	public  ExcelDataConfig(String path) throws Exception
	{
		
	 try {
		File src=new File(path);
		 
		 FileInputStream fs=new FileInputStream(src);
		 
		 wb=new XSSFWorkbook(fs);
		 
		 
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	 
}
	
	
	public String getdata(int sh,int row,int col)
	
	{
		
		sh1=wb.getSheetAt(0);
		
		
		String getdate=sh1.getRow(sh).getCell(col).getStringCellValue();
		return getdata(0, 0, 0);
	}
}
