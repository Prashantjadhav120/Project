package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Exceldata;
import pageObjects.Fileupload;
import pageObjects.Page_Open_Correct;
import pageObjects.Registration_Page;
import pageObjects.dslist_buttons;

public class Home_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = null;
		
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		
		Registration_Page.Get_Text(driver);
		System.out.println("TC1 is passed");
		Registration_Page.Click_Registration(driver).click();
		System.out.println("TC2 is passed");
		String name = Registration_Page.Read_Service_label(driver).getText();
	    System.out.println( "TC3 is passed :" +name);
	    
	    //Registration_Page.DispalyAllLabels(driver);
	   
	     Exceldata.readdata(driver);
	   
	    // Fileupload.upload_file(driver);
	    
	   //  dslist_buttons.ddlist_buttons(driver);
	    
		
	
		
		
		
		

	}

}
