package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_Page {
	
	public static WebDriver driver;
	
	private static WebElement element  = null;
	public static WebElement Get_Text(WebDriver driver){
	String textread =  driver.findElement(By.xpath("html/body/div[1]/div/div[2]/aside[1]/div[1]/h3")).getText();
	System.out.println("This is correct text : " + textread);
	return element;
		
	}
	
	public static WebElement Click_Registration(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menu-item-374']"));
		return element;
		
	}
	public static WebElement Read_Service_label(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='post-49']/header/h1"));
		return element;
    }
	
	public static WebElement FName_Display(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[1]/div[1]/label"));
		return element;
	}
	
	public static WebElement LName_Display(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[1]/div[1]/div/label"));
		return element;
	}
	
	public static WebElement MarStatus_Display(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div"));
		return element;
		
	}
	
	public static WebElement Hobby_Display(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/label"));
		return element;
	}

	public static WebElement Country_Display(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[4]/div/label"));
		return element;
	}
	
	public static WebElement Date_Of_Birth (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[5]/div/label"));
		return element;
	}
	
	public static WebElement Phon (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[6]/div/label"));
		return element;
	}
	
	public static WebElement UserName (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[7]/div/label"));
		return element;
	}
	
	public static WebElement Email (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[8]/div/label"));
		return element;
	}
	
	public static WebElement Your_Profile_Picture (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[9]/div/label"));
		return element;
	}
	
	public static WebElement About_Your_self (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[10]/div/label"));
		return element;
	}
	
	public static WebElement Password(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[11]/div/label"));
		return element;
	}
	public static WebElement Confirm_Password(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[12]/div/label"));
		return element;
	}
	
	public static WebElement Single(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/label[1]"));
		return element;
	}
	public static WebElement Married(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/label[2]"));
		return element;
	}
	public static WebElement Divorced(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/label[3]"));
		return element;
	}
	
	public static WebElement Dance(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/label[1]"));
		return element;
	}
	public static WebElement Reading(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/label[2]"));
		return element;
	}
	public static WebElement Cricket(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/label[3]"));
		return element;
	}
	
	
	public static WebElement DispalyAllLabels(WebDriver driver)
	{
		
		
		  boolean firstname=Registration_Page.FName_Display(driver).isDisplayed();
		    System.out.println("TC4 is Pass"+firstname);
		    
		    boolean lastname=Registration_Page.FName_Display(driver).isDisplayed();
		    System.out.println("TC5 is Pass:" +lastname);
		    
		    boolean Mstatus=Registration_Page.MarStatus_Display(driver).isDisplayed();
		    System.out.println("TC6 is Pass:" +Mstatus);
		    
		    boolean hobby=Registration_Page.Hobby_Display(driver).isDisplayed();
		    System.out.println("TC9 is Pass:" +hobby);
		    
		    boolean Country=Registration_Page.Country_Display(driver).isDisplayed();
		    System.out.println("TC10 is Pass:" +Country);
		    
		    boolean DOB=Registration_Page.Date_Of_Birth(driver).isDisplayed();
		    System.out.println("TC11 is Pass:" +DOB);
		    
		    boolean phon=Registration_Page.Phon(driver).isDisplayed();
		    System.out.println("TC12 is Pass:" +phon);
		    
		    boolean user=Registration_Page.UserName(driver).isDisplayed();
		    System.out.println("TC13 is Pass:" +user);
		    
		    boolean email=Registration_Page.Email(driver).isDisplayed();
		    System.out.println("TC14 is Pass:" +email);
		    
		    boolean picture=Registration_Page.Your_Profile_Picture(driver).isDisplayed();
		    System.out.println("TC15 is Pass:" +picture);
		    
		    boolean urself=Registration_Page.About_Your_self(driver).isDisplayed();
		    System.out.println("TC16 is Pass:" +urself);
		    
		    boolean password=Registration_Page.Password(driver).isDisplayed();
		    System.out.println("TC17 is Pass:" +password);
		    
		    boolean confirmpassword=Registration_Page.Phon(driver).isDisplayed();
		    System.out.println("TC18 is Pass:" +confirmpassword);
		  
		    boolean Single=Registration_Page.Single(driver).isDisplayed();
		    System.out.println("TC19 is Pass:" +Single);
		    
		    boolean Married=Registration_Page.Married(driver).isDisplayed();
		    System.out.println("TC20 is Pass:" +Married);
		    
		    boolean 
		    Divorced =Registration_Page.Divorced(driver).isDisplayed();
		    System.out.println("TC21 is Pass:" +Divorced);
		    
		    boolean Dance=Registration_Page.Dance(driver).isDisplayed();
		    System.out.println("TC22 is Pass:" +Dance);
		    
		    boolean Reading=Registration_Page.Reading(driver).isDisplayed();
		    System.out.println("TC23 is Pass:" +Reading);
		    
		    boolean Cricket=Registration_Page.Cricket(driver).isDisplayed();
		    System.out.println("TC24 is Pass:" +Cricket);
		    
		    return element;
		
	}
	
	
	
	
	
	
	

}
