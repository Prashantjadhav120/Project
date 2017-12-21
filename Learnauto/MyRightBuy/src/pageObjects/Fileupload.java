package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fileupload {
	
	
	public static WebDriver driver;
	public static WebElement element=null;
	
	public static WebElement upload_file(WebDriver driver)
	{
		
		driver.findElement(By.xpath(".//*[@id='profile_pic_10']")).sendKeys("c:\\images.png");
		
		return element;
	}
	

}
