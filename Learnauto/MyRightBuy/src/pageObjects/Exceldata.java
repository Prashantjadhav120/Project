package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exceldata {
	
public static WebDriver driver;
	
	private static WebElement element  = null;
	
	FileInputStream fis=null;
	
	public static  WebElement readdata(WebDriver driver)
	{
	 
	{
	
	try {
		File src=new File("D://test.xlsx");
	    FileInputStream fis= new FileInputStream(src);//ERROR
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sh1=wb.getSheetAt(0);
	   String str=sh1.getRow(0).getCell(0).getStringCellValue();
	   String lname=sh1.getRow(0).getCell(1).getStringCellValue();
   //double mobno=sh1.getRow(0).getCell(2).getNumericCellValue();
	  // String mobno=sh1.getRow(0).getCell(2).getStringCellValue();
	
	String uname=sh1.getRow(0).getCell(3).getStringCellValue();
	String email=sh1.getRow(0).getCell(4).getStringCellValue();
	
    String pwd=sh1.getRow(0).getCell(5).getStringCellValue();
	String conpwd=sh1.getRow(0).getCell(6).getStringCellValue();

	
	
	driver.findElement(By.xpath(".//*[@id='name_3_firstname']")).sendKeys(str);
	driver.findElement(By.xpath(".//*[@id='name_3_lastname']")).sendKeys(lname);
	//driver.findElement(By.xpath(".//*[@id='phone_9']")).sendKeys(String.valueOf(mobno));
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(uname);
	driver.findElement(By.xpath(".//*[@id='email_1']")).sendKeys(email);
    driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys(pwd);
	driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys(conpwd);
	} catch (FileNotFoundException fe){
	    fe.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	return element ;
	}	
	
}