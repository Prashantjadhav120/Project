package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws Exception {
	
		File src=new File("D://test.xlsx");
		
		FileInputStream fs=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
		

	}

}
