package DataDriven;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		ExcelDataConfig excel=new ExcelDataConfig("D:\\test.xlsx");
		
		System.out.println(excel.getdata(0, 0, 0));

	}

}
