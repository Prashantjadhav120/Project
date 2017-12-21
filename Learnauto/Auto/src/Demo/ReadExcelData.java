package Demo;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		
		
		ExcelDataConfig ex=new ExcelDataConfig("D://test.xlsx");
		
		System.out.println(ex.getdata(0,1,0));
	
		 }

}
