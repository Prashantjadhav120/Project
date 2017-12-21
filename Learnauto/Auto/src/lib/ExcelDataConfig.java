package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	
	
	public ExcelDataConfig(String excelpath) throws Exception
	{
		
		try {
			File src=new File(excelpath);
     
			FileInputStream fs=new FileInputStream(src);
			
			 wb=new XSSFWorkbook(fs);
			
			 sheet1=wb.getSheetAt(0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public String getdata(int shno,int row,int col)
	
	{
		

		String data = sheet1.getRow(shno).getCell(row).getStringCellValue();
	
		return data;
		
		
	}
}
